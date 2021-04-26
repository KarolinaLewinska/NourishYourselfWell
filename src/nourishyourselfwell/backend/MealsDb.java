package nourishyourselfwell.backend;

import java.sql.*;
import java.util.ArrayList;
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
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = 
                    conn.prepareStatement("{call dbo.displayMeals(?)}");
            ps.setString(1, mealDate);
            ResultSet rs = ps.executeQuery();
            
            if (!rs.isBeforeFirst()) { 
                JOptionPane.showMessageDialog(null, "Brak danych w bazie o podanej dacie" 
                    , "Brak danych", JOptionPane.INFORMATION_MESSAGE);
            }
            
            while(mealsTable.getRowCount() > 0) 
                ((DefaultTableModel) mealsTable.getModel()).removeRow(0);
            
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
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Błąd " + exc.getMessage(),
                "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList showMealsDate() {
        ArrayList<Meal> meals = new ArrayList();        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.showMealsDate}");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) 
                meals.add(new Meal(rs.getDate("mealDate")));
            conn.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania dat spożytych posiłków " 
                + e.getMessage(), "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return meals;
    }
    
    public void addMeal(String mealDate, String mealType, String mealName, 
            String mealHour, String calories) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.addMeal(?,?,?,?,?)}"); 
            cs.setString(1, mealDate);
            cs.setString(2, mealType);
            cs.setString(3, mealName);
            cs.setString(4, mealHour);
            cs.setString(5, calories);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Pomyślnie dodano dane o posiłku: " 
                +mealName+ ".", "Zapis udany", JOptionPane.INFORMATION_MESSAGE);
        
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu danych " 
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
                    "nourishYourselfAdmin", "admin12"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.deleteMeal(?)}"); 
            cs.setInt(1, idRow);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Pomyślnie usunięto dane o posiłku" 
                , "Usunięto dane", JOptionPane.INFORMATION_MESSAGE);
            
            while(mealsTable.getRowCount() > 0) 
                ((DefaultTableModel) mealsTable.getModel()).removeRow(0);
             
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu danych " 
                + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }         
    } 
    
    public void updateMeal() {
        if (mealsTable.isEditing())
            mealsTable.getCellEditor().stopCellEditing();
        
        DefaultTableModel tModel = (DefaultTableModel) mealsTable.getModel();
        int selectedRow = mealsTable.getSelectedRow();
        int mealIdRow = (int) mealsTable.getModel().getValueAt(selectedRow, 0);
        String mealDateRow = mealsTable.getModel().getValueAt(selectedRow, 1).toString();
        String mealTypeRow = mealsTable.getModel().getValueAt(selectedRow, 2).toString();
        String mealNameRow = mealsTable.getModel().getValueAt(selectedRow, 3).toString();
        String mealHourRow = mealsTable.getModel().getValueAt(selectedRow, 4).toString();
        String mealCaloriesRow = mealsTable.getModel().getValueAt(selectedRow, 5).toString();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
           CallableStatement cs = 
                    conn.prepareCall("{call dbo.updateMeal(?,?,?,?,?,?)}"); 
            cs.setInt(1, mealIdRow);
            cs.setString(2, mealDateRow);
            cs.setString(3, mealTypeRow);
            cs.setString(4, mealNameRow);
            cs.setString(5, mealHourRow);
            cs.setString(6, mealCaloriesRow);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Pomyślnie zaktualizowano dane o posiłku: "
                +mealNameRow+"", "Zaktualizowano dane", JOptionPane.INFORMATION_MESSAGE);
        
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu danych " 
                + exc.getMessage(), "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
