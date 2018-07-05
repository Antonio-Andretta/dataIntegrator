package testes;

import java.sql.Connection;
import java.sql.SQLException;

import org.hsqldb.jdbc.JDBCPool;

import connectors.ConnectionPool;

public class TestConnector {

	/**
	 * @param args
	 */
	
	String CmdSql = "";
	static Connection CoSql = null;
	static Connection CoOEd = null;
	static Connection CoMSq = null;
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	
		String cStrCnx = "";
		String cUser   = "";
		String cPass   = "";	
		
		/* Progress */ 
		           	
		cStrCnx = "jdbc:Datadirect:Openedge://172.18.1.168:3501;databaseName=toios";
		cUser   = "aandretta";
		cPass   = "Focus2020*4";
		 
		CoOEd = new  ConnectionPool("OPENEDGE", cStrCnx, cUser, cPass).getConnection();
		
		/* SQL */
		cStrCnx = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST = 172.18.16.217)(PORT=1521))(ADDRESS = (PROTOCOL=tcp)(HOST = 172.18.16.218)(PORT=1521))(ADDRESS=(PROTOCOL=tcp)(HOST = 172.18.16.219)(PORT=1521))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=NCSSYS)))" ;
		cUser   = "ncs";
		cPass   = "ncs123";
		
		CoSql = new ConnectionPool("ORACLE", cStrCnx, cUser , cPass).getConnection();
		
		/* HSQLDB */
		cStrCnx = "jdbc:hsqldb:hsql://localhost/loja-virtual" ;
		cUser   = "SA";
		cPass   = "";
		CoMSq   =  new ConnectionPool("HSQLDB", cStrCnx, "ncs" , "ncs123").getConnection();
		
		
		if (CoOEd != null) {
			System.out.println("Conectei OpenEdge!!!");	
			
		} ;
		
		if (CoSql != null) { 
			System.out.println("Conectei Sql!!!");	
		} ;
		
		if (CoMSq != null) { 
			System.out.println("Conectei MySql!!!");
		} ;
		
		
	}

	
	
	
}
