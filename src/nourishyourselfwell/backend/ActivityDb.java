package nourishyourselfwell.backend;

import java.sql.*;
import java.util.ArrayList;
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
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = 
                    conn.prepareStatement("{call dbo.displayActivities(?)}");
            ps.setString(1, activityDate);
            ResultSet rs = ps.executeQuery();
            
            if (!rs.isBeforeFirst()) { 
                JOptionPane.showMessageDialog(null, "Dane o aktywności fizycznej z podaną datą nie istnieją" 
                    , "Brak danych", JOptionPane.INFORMATION_MESSAGE);
            }
            
            while(activitiesTable.getRowCount() > 0) {
                ((DefaultTableModel)activitiesTable.getModel()).removeRow(0);
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
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Błąd: " + exc.getMessage(),
                "Wystąpił błąd podczas wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList showActivitiesDate() {
        ArrayList<Activity> activities = new ArrayList();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.showActivitiesDate}");
            ResultSet rs = ps.executeQuery();
             
            while(rs.next()) 
                activities.add(new Activity(rs.getDate("activityDate")));
            conn.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania dat aktywności " 
                + e.getMessage(), "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return activities;
    }
    
    public void addActivity(String activityDate, String activityType, String startTime, String duration, String calories) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.addActivity(?,?,?,?,?)}"); 
            cs.setString(1, activityDate);
            cs.setString(2, activityType);
            cs.setString(3, startTime);
            cs.setString(4, duration);
            cs.setString(5, calories);
            cs.execute();
            conn.close();
            
            JOptionPane.showMessageDialog(null, "Pomyślnie dodano dane o aktywności fizycznej: " 
                +activityType, "Zapis udany", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu danych: " 
                + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteActivity() {
        int selectedRow = activitiesTable.getSelectedRow();
        int idRow = (int) activitiesTable.getModel().getValueAt(selectedRow, 0);
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.deleteActivity(?)}"); 
            cs.setInt(1, idRow);
            cs.execute();
            conn.close();
            
            JOptionPane.showMessageDialog(null, "Pomyślnie usunięto dane o aktywności fizycznej" 
                , "Usunięto dane", JOptionPane.INFORMATION_MESSAGE);
            
            while(activitiesTable.getRowCount() > 0) 
                ((DefaultTableModel) activitiesTable.getModel()).removeRow(0);
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu danych: " 
                + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void updateActivity() {
        if (activitiesTable.isEditing()) 
            activitiesTable.getCellEditor().stopCellEditing(); 
        
        int selectedRow = activitiesTable.getSelectedRow();
        int activityIdRow = (int) activitiesTable.getModel().getValueAt(selectedRow, 0);
        String activityDateRow = activitiesTable.getModel().getValueAt(selectedRow, 1).toString();
        String activityTypeRow = activitiesTable.getModel().getValueAt(selectedRow, 2).toString();
        String activityTimeRow = activitiesTable.getModel().getValueAt(selectedRow, 3).toString();
        String activityDurationRow = activitiesTable.getModel().getValueAt(selectedRow, 4).toString();
        String activityCaloriesRow = activitiesTable.getModel().getValueAt(selectedRow, 5).toString();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
           CallableStatement cs = 
                    conn.prepareCall("{call dbo.updateActivity(?,?,?,?,?,?)}"); 
            cs.setInt(1, activityIdRow);
            cs.setString(2, activityDateRow);
            cs.setString(3, activityTypeRow);
            cs.setString(4, activityTimeRow);
            cs.setString(5, activityDurationRow);
            cs.setString(6, activityCaloriesRow);
            cs.execute();
            conn.close();
            
            JOptionPane.showMessageDialog(null, "Pomyślnie zaktualizowano dane o aktywności: "
                +activityTypeRow, "Zaktualizowano dane", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu danych " 
                + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
    }
}

