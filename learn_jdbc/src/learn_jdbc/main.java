
package learn_jdbc;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/cws";
        String name="root";
        String password ="suhail";
        
        try {
            model model = new model(url, name, password);
            View view = new View();
            controller controller = new controller(model, view);
            
            controller.run();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL error encountered");
            e.printStackTrace();
        }
    }
}
