package learn_jdbc;

import java.sql.*;

public class model {
    private Connection con;
    private Statement st;
    
    public model(String url, String name, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection(url, name, password);
        this.st = con.createStatement();
    }
    
    // Your original methods (unchanged)
    public void insert(int roll, String name) throws SQLException {
        String query="INSERT INTO STUDENT(ROLL,NAME) VALUES ("+roll+",'"+name+"')";
        st.executeUpdate(query);
    }
    
    public void select(int roll) throws SQLException {
        String query = "SELECT * FROM STUDENT WHERE ROLL = " + roll;
        ResultSet rs = st.executeQuery(query);
        if(rs.next()){
            int r=rs.getInt("ROLL");
            String name=rs.getString("NAME");
            System.out.println("Student Found: Roll = " + r + ", Name = " + name);
        }
        else{
            System.out.println("No student found with roll number :"+roll );
        }
        rs.close();
    }
    
    public void update(int roll, String newName) throws SQLException {
        String query = "UPDATE STUDENT SET NAME = '" + newName + "' WHERE ROLL = " + roll;
        st.executeUpdate(query);
    }
    
    public void delete(int roll) throws SQLException {
        String query ="DELETE FROM STUDENT WHERE ROLL="+roll;
        st.executeUpdate(query);
    }
    
    public void close() throws SQLException {
        st.close();
        con.close();
    }
}