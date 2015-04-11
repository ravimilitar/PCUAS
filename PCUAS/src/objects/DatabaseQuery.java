package objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JOptionPane;

public class DatabaseQuery {
	private String url = "jdbc:sqlserver://m7e5o8osds.database.windows.net:1433;"
			+ "database=pcuasdb;"
			+ "user=pcuasdb_server@m7e5o8osds;"
			+ "password=Pcuas1234!;"
			+ "encrypt=true;"
			+ "hostNameInCertificate=*.database.windows.net;"
			+ "loginTimeout=30";
	private String username = "user=pcuasdb_server@m7e5o8osds";
	private String password = "Pcuas1234!";
	
	private String tablename;
	
	
	public DatabaseQuery(String tablename){
		this.tablename = tablename;
		
	}
	
	private ArrayList<Properties> toArrayList(ResultSet results) throws SQLException{
		ArrayList<Properties> resultList = new ArrayList<Properties>();
		
		while(results.next()){
			Properties p = new Properties();
			ResultSetMetaData columns = results.getMetaData();
			
			
			for(int i=1; i<=columns.getColumnCount(); i++){
				p.setProperty(columns.getColumnLabel(i), results.getString(i));
			}
			
			resultList.add(p);
		}
		
		return resultList;
	}
	
	public ArrayList<Properties> select(String selectClause){
		try{
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			
			
			Statement statement = connection.createStatement();
			
			String sqlQuery = "SELECT "+selectClause+" FROM dbo."+tablename;
			System.out.println(sqlQuery);
			
			ResultSet results = statement.executeQuery(sqlQuery);
			ArrayList<Properties> resultList = this.toArrayList(results);
			connection.close();
			
			return resultList;
			
		}catch(Exception e){
			
			System.out.println("DatabaseQuery.select(String): " + e.getMessage());
			return null;
		}
	}
	
	public ArrayList<Properties> select(String selectClause, String whereClause){
		
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			
			
			Statement statement = connection.createStatement();
			
			String sqlQuery = "SELECT "+selectClause+" FROM dbo."+tablename+" WHERE "+whereClause;
			System.out.println(sqlQuery);
			
			ResultSet results = statement.executeQuery(sqlQuery);
			ArrayList<Properties> resultList = this.toArrayList(results);
			connection.close();
			
			return resultList;
			
		}catch(Exception e){
			
			System.out.println("DatabaseQuery.select(String,String): " + e.getMessage());
			return null;
		}
		
	}

	public ArrayList<Properties> select(String selectClause, String whereClause, String orderbyClause){
		
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			
			
			Statement statement = connection.createStatement();
			
			String sqlQuery = "SELECT "+selectClause
					+ " FROM " + tablename
					+ " WHERE " + whereClause 
					+ " ORDER BY " + orderbyClause;
			System.out.println(sqlQuery);
			
			ResultSet results = statement.executeQuery(sqlQuery);
			ArrayList<Properties> resultList = this.toArrayList(results);
			connection.close();
			
			return resultList;
			
		}catch(Exception e){
			
			System.out.println("DatabaseQuery.select(String,String,String): " + e.getMessage());
			return null;
		}
	}
	
	public boolean insert(String values){
		try{
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			String sqlQuery = "INSERT INTO "+tablename+" VALUES  "+values;
			System.out.println(sqlQuery);
			
			statement.executeUpdate(sqlQuery);
			
			connection.close();
			
			return true;
			
		}catch(Exception e){
			
			System.out.println("DatabaseQuery.insert(String): "+e.getMessage());
			return false;
		}
	}
	
	public boolean insert(String properties, String values){
		try{
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			String sqlQuery = "INSERT INTO "+tablename+" "+properties+" VALUES  "+values;
			System.out.println(sqlQuery);
			
			statement.executeUpdate(sqlQuery);
			
			connection.close();
			
			return true;
			
		}catch(Exception e){
			
			System.out.println("DatabaseQuery.insert(String,String): "+e.getMessage());
			return false;
		}
	}
	
	public boolean update(String setClause, String whereClause){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			String sqlQuery = "UPDATE "+tablename+" SET "+setClause+" WHERE "+whereClause;
			System.out.println(sqlQuery);
			
			statement.executeUpdate(sqlQuery);
			
			connection.close();
			
			return true;
		}catch(Exception e){
			System.out.println("DatabaseQuery.update(String,String): "+e.getMessage());
			return false;
		}
	}
	
	public boolean delete(String whereClause){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			String sqlQuery = "DELETE FROM "+tablename+" WHERE "+whereClause;
			
			statement.executeUpdate(sqlQuery);
			
			connection.close();
			
			return true;
		}catch(Exception e){
			System.out.println("DatabaseQuery.delete(String): "+e.getMessage());
			return false;
		}
	}

}
