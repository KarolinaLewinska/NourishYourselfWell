
package nourishyourselfwell.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MealsDb {
    private JTextArea mealsTA; 
    public MealsDb (JTextArea mealsTA) {
        this.mealsTA = mealsTA;
    }
    
    public void showMeals(String mealDate) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.displayMeals(?)}");
            ps.setString(1, mealDate);
            ResultSet rs = ps.executeQuery();
           while(rs.next()) {
               mealsTA.append(rs.getDate("mealDate")+ "  " 
                       +rs.getString("mealType")+ "  "
                       +rs.getString("mealName") + "  " + rs.getString("mealHour")+ "  " + rs.getString("calories") +"\n"
               );
           }
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(),
                    "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
