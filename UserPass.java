package permanencia;

import java.sql.Connection;
import java.sql.DriverManager;


public class UserPass {
     private static final String DB_URL = "jdbc:MySQL://localhost/carrera";
	private static final String username = "root";
	private static final String password = "Admin";
	
	public Connection conectarBDMySQL() {
		try {
                        
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, username, password);
			return conn;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Connection conectarBDSQLite() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:carrera.db");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

    /**
     * @return the username
     */
    public static String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public static String getPassword() {
        return password;
    }
	
}


