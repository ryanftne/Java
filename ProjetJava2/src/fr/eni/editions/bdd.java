package fr.eni.editions;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jdi.connect.spi.Connection;

public class bdd {
	private String user="root";
	 private String password="";
	 private String url= "jdbc:mysql://localhost/projetjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	 private java.sql.Connection cnx ;
	 private java.sql.Statement stm;
	 
	 
	 public bdd() {		 
	 
	try
	{
		
		
		this.cnx = DriverManager.getConnection(url,user,password);
		System.out.println("Etat de la connexion");
		System.out.println(cnx.isClosed()?"fermé":"ouvert");
		this.stm = this.cnx.createStatement();	

		
	}
	catch (SQLException e){
		System.out.println("Eurreur");
		e.printStackTrace();
	}
	
}
}