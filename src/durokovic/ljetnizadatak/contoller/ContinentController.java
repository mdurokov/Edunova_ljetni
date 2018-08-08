
package durokovic.ljetnizadatak.contoller;

import durokovic.ljetnizadatak.model.Continent;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Mata
 */
public class ContinentController {
    //  DECLARING VARIABLES
    private Connection conn;

    
    //  CONSTRUCTOR
    public ContinentController() throws Exception {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("src/durokovic/ljetnizadatak/properties/database.properties"));
            
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            String db = props.getProperty("db");
            
            conn = DriverManager.getConnection(db, user, password);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //  CRUD METHODS
    public List<Continent> getAllContinents() throws Exception{
        List<Continent> continent = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from continents");
            
            while (rs.next()){
                Continent tempContinent = convertRowToContinents(rs);
                continent.add(tempContinent);
            }
            return continent;
        } finally {
           close(stmt, rs);
        }
    }
    
    public void addContinent(String name, String recordName, int latitude, int longitude, int zoom) throws SQLException{
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("insert into continents (name, recordName, latitude, longitude, zoom) values (?,?,?,?,?);");
            
            stmt.setString(1, name);
            stmt.setString(2, recordName);
            stmt.setInt(3, latitude);
            stmt.setInt(4, longitude);
            stmt.setInt(5, zoom);
            
            stmt.executeUpdate();
        } finally {
            close(stmt);
        }
    }
    
    public void updateContinent(int id, String name, String recordName, int latitude, int longitude, int zoom) throws SQLException{
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("update continents set name=?, recordName=?, latitude=?, longitude=?, zoom=? where id=?;");
            
            stmt.setString(1, name);
            stmt.setString(2, recordName);
            stmt.setInt(3, latitude);
            stmt.setInt(4, longitude);
            stmt.setInt(5, zoom);
            stmt.setInt(6, id);

            stmt.executeUpdate();
            
        }finally {
            close(stmt);
        }           
    }
    
    public void deleteContinent(int id) throws SQLException{
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("delete from continents where id = ?;");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } finally {
            close(stmt);
        }
    }
    //  END METHODS
    
    
    //  HELPER METHODS
    //      CLOSE HELPER
    private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {

        if (myRs != null) {
                myRs.close();
        }

        if (myStmt != null) {

        }

        if (myConn != null) {
                myConn.close();
        }
    }

    private void close(Statement myStmt, ResultSet myRs) throws SQLException {
        close(null, myStmt, myRs);		
    }

    private void close(Statement myStmt) throws SQLException {
        close(null, myStmt, null);		
    }
    //      END CLOSE HELPER
    
    //      HELPER CONVERT
    private Continent convertRowToContinents(ResultSet rs) throws SQLException{
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String recordName = rs.getString("recordName");
        int latitude = rs.getInt("latitude");
        int longitude = rs.getInt("longitude");
        int zoom = rs.getInt("zoom");
        
        Continent tempContinent = new Continent(id, name, recordName, latitude, longitude, zoom);
        return tempContinent;
    }
    //  END HELPER METHODS
    
    public static void main(String[] args) throws Exception {
        ContinentController continentController = new ContinentController();
        System.out.println(continentController.getAllContinents());
        
    }
    
    
}
