package nourishyourselfwell.backend;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class StatisticsDbMeals {
    
    public StatisticsDbMeals (JTextField mealStatisticTF) {
        
    }
        
    public ArrayList selectMostCaloricMeal() {
        ArrayList<Meal> meals = new ArrayList();
        
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.mostCaloricMealStatistics}");
            ResultSet rs = ps.executeQuery();
            
             while(rs.next()) 
                meals.add(new Meal(rs.getInt("calories")));
            
             conn.close();
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                + exc.getMessage(), "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return meals;
    }
    
    public ArrayList selectFavouriteMeal() {
        ArrayList<Meal> meals = new ArrayList();
        
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.favouriteMealStatistics}");
            ResultSet rs = ps.executeQuery();
             
            while(rs.next()) 
                meals.add(new Meal(rs.getString("mealName")));
            conn.close();
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                + exc.getMessage(), "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return meals;
    }
    
    public ArrayList selectAverageMealCalories() {
        ArrayList<Meal> meals = new ArrayList();
        
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.averageMealCaloriesStatistics}");
            ResultSet rs = ps.executeQuery();
             
            while(rs.next()) 
                meals.add(new Meal(rs.getInt("average")));
            conn.close();
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                + exc.getMessage(), "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return meals;
    }
    
    public void selectSumOfCaloriesByDate(String mealDate, JTextField textField) {
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.sumOfCaloriesByDateStatistics(?)}");
            ps.setString(1, mealDate);
            ResultSet rs = ps.executeQuery();
             
            while(rs.next()) 
                textField.setText(rs.getString("sum"));
            conn.close();
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                + exc.getMessage(), "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
    }
}
