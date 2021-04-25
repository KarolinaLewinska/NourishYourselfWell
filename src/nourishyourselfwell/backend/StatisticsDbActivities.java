package nourishyourselfwell.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StatisticsDbActivities {
    
    public StatisticsDbActivities (JTextField activityStatisticTF) {

    }
    
    public ArrayList selectMostBurntCalories() {
        ArrayList<Activity> activities = new ArrayList();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            
            PreparedStatement ps = conn.prepareStatement("{call dbo.mostBurntCaloriesStatistics}");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                activities.add(new Activity(rs.getInt("calories")));
            }
            conn.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                    + e.getMessage(),
                    "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return activities;
    }
    
    public ArrayList selectFavouriteActivity() {
        ArrayList<Activity> activities = new ArrayList();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            
            PreparedStatement ps = conn.prepareStatement("{call dbo.favouriteActivityStatistics}");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                activities.add(new Activity(rs.getString("activityType")));
            }
            conn.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                    + e.getMessage(),
                    "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return activities;
    } 
    
    public ArrayList selectAverageBurntCalories() {
        ArrayList<Activity> activities = new ArrayList();
        
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            
            PreparedStatement ps = conn.prepareStatement("{call dbo.averageBurntCaloriesStatistics}");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                activities.add(new Activity(rs.getInt("average")));
            }
            conn.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                    + e.getMessage(),
                    "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
        return activities;
    }
    
    public void selectSumOfBurntCaloriesByDate(String activityDate, JTextField textField) {
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "admin12"); 
            
            PreparedStatement ps = conn.prepareStatement("{call dbo.sumOfBurntCaloriesByDateStatistics(?)}");
            ps.setString(1, activityDate);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                textField.setText(rs.getString("sum"));
            }
            conn.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas wyświetlania statystyki " 
                    + e.getMessage(),
                    "Błąd wyświetlania danych", JOptionPane.ERROR_MESSAGE);
        }
    }
}
