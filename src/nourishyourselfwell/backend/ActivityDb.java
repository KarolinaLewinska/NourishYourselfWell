package nourishyourselfwell.backend;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ActivityDb {
    private JTable activitiesTable; 
    public ActivityDb (JTable activitiesTable) {
        this.activitiesTable = activitiesTable;
    }
    
    public void showActivities(String activityDate) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            PreparedStatement ps = 
                    conn.prepareStatement("{call dbo.displayActivities(?)}");
            ps.setString(1, activityDate);
            ResultSet rs = ps.executeQuery();
            //muszę dodać komunikat jak nie ma w bazie wyników
            while(activitiesTable.getRowCount() > 0) {
                ((DefaultTableModel) activitiesTable.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while(rs.next()) {  
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {  
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) activitiesTable
                        .getModel()).insertRow(rs.getRow()-1,row);
            }
            rs.close();
            conn.close();
            activitiesTable.getColumnModel().getColumn(2)
                    .setCellRenderer(new WordWrapCellRenderer());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(),
                    "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addActivity(String activityDate, String activityType, 
            String startTime, String duration, String calories) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.addActivity(?,?,?,?,?)}"); 
            cs.setString(1, activityDate);
            cs.setString(2, activityType);
            cs.setString(3, startTime);
            cs.setString(4, duration);
            cs.setString(5, calories);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Pomyślnie dodano aktywność fizyczną: " 
                    +activityType+ ".", "Zapis udany", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu " 
                    + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
    }
}
