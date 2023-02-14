package fr.doranco.swing.model;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public final class EcoleDataSource {
	
	 private static EcoleDataSource INSTANCE = null;

	  
	  private EcoleDataSource() {}

	  
	    public synchronized static EcoleDataSource getInstance()
	    {
	        if (INSTANCE == null)
	            INSTANCE = new EcoleDataSource();
	        return INSTANCE;
	    }
	    
	    public  Connection getConnexion() throws Exception{
	    	InputStream input = new FileInputStream("src/main/resources/application.properties");
			Properties prop = new Properties();
			prop.load(input);
			Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("login"),
					prop.getProperty("password"));
			return connection;
	    }

}
