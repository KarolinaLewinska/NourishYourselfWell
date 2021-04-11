package nourishyourselfwell.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
               activitiesTA.append(rs.getDate("activityDate")+ "  " 
                       +rs.getString("activityType")+ "  "
                       +rs.getString("startTime") + "  " + rs.getString("duration")+ "  " + rs.getString("calories") +"\n"
               );
           }
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(),
                    "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
