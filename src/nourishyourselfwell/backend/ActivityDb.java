package nourishyourselfwell.backend;

import java.sql.*;
import javax.swing.*;

public class ActivityDb {
    private JTextArea activitiesTA; 
    public ActivityDb (JTextArea activitiesTA) {
        this.activitiesTA = activitiesTA;
    }
    
    public void showActivities(String activityDate) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.displayActivities(?)}");
            ps.setString(1, activityDate);
            ResultSet rs = ps.executeQuery();
           while(rs.next()) {
               activitiesTA.append(rs.getDate("activityDate")+ " | " 
                       +rs.getString("activityType")+ " | "
                       +rs.getString("startTime") + " | " + rs.getString("duration")+ " | " + rs.getString("calories") +"\n"
               );
           }
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(),
                    "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addActivity(String activityDate, String activityType, String startTime, String duration, String calories) {
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
            JOptionPane.showMessageDialog(null, "Pomyślnie dodano aktywność fizyczną: " +activityType+ "." 
            , "Zapis udany", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu " + exc.getMessage(),
                    "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
