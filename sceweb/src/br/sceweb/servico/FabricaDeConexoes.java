package br.sceweb.servico;

import java.sql.DriverManager;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

public class FabricaDeConexoes {
	
	Logger logger = Logger.getLogger(FabricaDeConexoes.class);
	
	public Connection getConnection() {
		logger.info("Chamou a classe de conexões");
		String url = "jdbc:mysql://localhost/sceweb";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return (Connection) DriverManager.getConnection(url, "root", "");
		} 
		
		catch (Exception e) {
			logger.info("Exceção geral causa:" + e.getMessage());
			throw new RuntimeException(e);
		}
	}
}
