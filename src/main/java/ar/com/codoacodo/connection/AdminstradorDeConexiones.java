package ar.com.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdminstradorDeConexiones {
	public static Connection getConnection() {
		/*String url = "jdbc:mysql://127.0.0.1:3306/codo-a-codo?serverTimeZone=UTC&userSSL=FALSE";// antes del signo de preg va el nombre de la base a la que nos queremos conectar
		String username = "root";
		String password = "root";
		
		String driverName = "com.mysql.cj.jdbc.Driver"; */
		String url = System.getenv("DATASOURCE_URL");
		String user = System.getenv("DATASOURCE_USERNAME");
		String password = System.getenv("DATASOURCE_PASSWORD");
		String driverName = System.getenv("DATASOURCE_DRIVER");
		
		Connection con = null;
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, username, password);
			return con;
		}catch(Exception e) {
			e.printStackTrace();// se que paso o por que falló
		}
		return con;
	}
	
	
	public static void main(String[] args) {
		Connection con = AdminstradorDeConexiones.getConnection();
		if(con != null) {
			
			System.out.println("Conexión OK");
			
		}else {
			System.out.println("Conexión fail");
		}
	}

}
