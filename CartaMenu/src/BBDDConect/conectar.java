package BBDDConect;

import java.sql.*;

public class conectar {
	
	
	public static void main(String[] args){
		try{
			//entorno sql
			Class.forName("com.mysql.jdbc.Driver");
			Connection conx=DriverManager.getConnection("jdbc:mysql://localhost:3306/vagones", "root", "123456");
			Statement stmt= conx.createStatement();
			
			/*mostrar("estaciones");
			
			System.out.println("Introduzco:");
			try{
				stmt.executeUpdate("INSERT INTO estaciones VALUES (765,\"werwwwa\")");
			}catch (SQLException e){
				System.out.println("No metes");
			}
			
			mostrar("estaciones");
			
			System.out.println("Quito: ");
			try{
				stmt.executeUpdate("DELETE FROM estaciones WHERE IdEstacion=765");
			}catch (SQLException e){
				System.out.println("No QUITAS");
			}
			
			mostrar("estaciones");
			*/
			//cerrar flujos
			
			System.out.println("---------------------------");
			mostrar("vagones");
			try{
				stmt.executeUpdate("Insert into vagones values ("+newId()+",100,\"preferente\")");
			}catch (SQLException e){
				System.out.println("No insert ["+e.getMessage()+"]");
			}
			
			mostrar("vagones");
			
			stmt.close();
			conx.close();
		}catch (ClassNotFoundException e){
			System.out.println(e);
		}catch (SQLException e){
			System.out.println(e);
		}
	}
	
	public static void mostrar(String tabla){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conx;
			conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/vagones", "root", "123456");
			Statement stmt= conx.createStatement();
		
			String sql="SELECT * FROM "+tabla;
			ResultSet res= stmt.executeQuery(sql);
			while(res.next()){
				System.out.println("ID:"+res.getObject(1)+" --- capacidad:"+res.getObject(2)+" --- C:"+res.getObject(3));
			}
		
			res.close();
			stmt.close();
			conx.close();
		}catch (ClassNotFoundException e){
			System.out.println(e);
		}catch (SQLException e){
			System.out.println(e);
		}
	}
public static int newId(){
		int a=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conx;
			conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/vagones", "root", "123456");
			Statement stmt= conx.createStatement();
			
			String sql="SELECT max(idvagon) FROM vagones";
			ResultSet res= stmt.executeQuery(sql);
			res.next();
			a=res.getInt(1)+1;
		
			res.close();
			stmt.close();
			conx.close();
		}catch (ClassNotFoundException e){
			System.out.println(e);
		}catch (SQLException e){
			System.out.println(e);
		}
		return a;
	}
}
