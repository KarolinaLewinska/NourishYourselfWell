
package nourishyourselfwell.backend;
import java.sql.*;
import javax.swing.*;

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
               mealsTA.append(rs.getDate("mealDate")+ " | " 
                       +rs.getString("mealType")+ " | "
                       +rs.getString("mealName") + " | " + rs.getString("mealHour")+ " | " + rs.getString("calories") +"\n"
               );
           }
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd " + e.getMessage(),
                    "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addMeal(String mealDate, String mealType, String mealName, String mealHour, String calories) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            CallableStatement cs = 
                    conn.prepareCall("{call dbo.addMeal(?,?,?,?,?)}"); 
            //procedura stworzona w MSSM o nazwie dodajKlienta
            cs.setString(1, mealDate);
            cs.setString(2, mealType);
            cs.setString(3, mealName);
            cs.setString(4, mealHour);
            cs.setString(5, calories);
            cs.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Pomyślnie dodano posiłek: " +mealName+ "." 
            , "Zapis udany", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Wystąpił błąd podczas zapisu " + exc.getMessage(),
                    "Błąd zapisu", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
