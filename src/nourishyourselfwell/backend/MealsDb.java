package nourishyourselfwell.backend;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MealsDb {
    private JTable mealsTable;
    public MealsDb (JTable mealsTable) {
        this.mealsTable = mealsTable;
    }
    
    public void showMeals(String mealDate) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            PreparedStatement ps = 
                    conn.prepareStatement("{call dbo.displayMeals(?)}");
            ps.setString(1, mealDate);
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Brak zapisanych posiłków z podaną datą!" 
                     , "Brak posiłków", JOptionPane.INFORMATION_MESSAGE);
            }
            while(mealsTable.getRowCount() > 0) {
                ((DefaultTableModel) mealsTable.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while(rs.next()) {  
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {  
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) mealsTable
                        .getModel()).insertRow(rs.getRow()-1,row);
            }
            rs.close();
            conn.close();
            mealsTable.getColumnModel().getColumn(3)
                    .setCellRenderer(new WordWrapCellRenderer());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(),
                    "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void addMeal(String mealDate, String mealType, String mealName, 
            String mealHour, String calories) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.addMeal(?,?,?,?,?)}"); 
           
            cs.setString(1, mealDate);
            cs.setString(2, mealType);
            cs.setString(3, mealName);
            cs.setString(4, mealHour);
            cs.setString(5, calories);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Pomyślnie dodano posiłek: " 
                    +mealName+ ".", "Zapis udany", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu " 
                    + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
    } 
    public void deleteMeal() {
        DefaultTableModel tModel = (DefaultTableModel) mealsTable.getModel();
        int selectedRow = mealsTable.getSelectedRow();
        int idRow = (int) mealsTable.getModel().getValueAt(selectedRow, 0);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.deleteMeal(?)}"); 
            cs.setInt(1, idRow);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Pomyślnie usunięto dane o posiłku " 
                    , "Usuń", JOptionPane.INFORMATION_MESSAGE);
            while(mealsTable.getRowCount() > 0) {
                ((DefaultTableModel) mealsTable.getModel()).removeRow(0);
            }
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu " 
                    + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
                
    }
    
}
