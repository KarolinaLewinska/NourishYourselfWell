package nourishyourselfwell.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StatisticsDb {
    private JTextField mostCaloricTF;
    
    public StatisticsDb (JTextField mostCaloricTF) {
        this.mostCaloricTF = mostCaloricTF;
    }
    /*public void mostCaloricMeal() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(
            "jdbc:sqlserver://localhost;databaseName=NourishYourselfWell", 
                    "nourishYourselfAdmin", "Kropek1221"); 
            PreparedStatement ps = conn.prepareStatement("{call dbo.showMostCaloricMeal}");
            ResultSet rs = ps.executeQuery();
            mostCaloricTF.setText(rs.getString("maxCalories"));
            
            conn.close();
          
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(null, "Błąd " + exc.getMessage(),
                    "Błąd aplikacji", JOptionPane.ERROR_MESSAGE);
        }
    } 
    */
    
}
