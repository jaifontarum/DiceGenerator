package day29dice;

import java.sql.Connection;


public abstract class DBConnectionFactory {
	
	private String driverName="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/dicegenerator?autoReconnect=true&useSSL=false";
	private String username="root";
	private String password="root";
	
	public static DBConnectionFactory getInstance() {
		return new DBConnectionFactoryImpl();
	}
	public abstract Connection getConnection();
	
	public String getDriverName() {
		return driverName;
	}
	public String getUrl() {
		return url;
	}
	public String getUserName() {
		return username;
	}
	public String getPassword() {
		return password;
	}

}
