package learn_jdbc;

import java.sql.SQLException;

public class controller {
    private model model;
    private View view;
    
    public controller(model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void run() {
        boolean running = true;
        
        while (running) {
            view.showMenu();
            int choice = view.getChoice();
            
            try {
                switch (choice) {
                    case 1:
                        model.insert(view.getRollNumber(), view.getName());
                        view.showInsertSuccess();
                        break;
                    case 2:
                        model.select(view.getRollNumber());
                        break;
                    case 3:
                        model.update(view.getRollNumber(), view.getName());
                        view.showUpdateSuccess();
                        break;
                    case 4:
                        model.delete(view.getRollNumber());
                        System.out.println("Student deleted successfully");
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (SQLException e) {
                System.out.println("SQL error encountered");
                e.printStackTrace();
            }
        }
        
        try {
            model.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}