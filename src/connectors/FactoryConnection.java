package connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.ddtek.jdbc.openedge.*;

public class FactoryConnection {

	Connection conn = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public Connection getConnectionOpenEdge() {
		// Configuração dos parâmetros de conexão

		String serverName = "172.18.1.168";
		String portNumber = "3501"; // Porta TCP padr�o do toios sql
		String databaseName = "toios";

		// Configura��o dos par�metros de autentica��o
		String user = "aandretta";
		String password = "Focus2020*4";

		Connection xcon = null;
		String cUrl = null;

		// jdbc:Datadirect:Openedge://<server>:<port3501>;databaseName=toios
		cUrl = "jdbc:Datadirect:Openedge://" 
		        + serverName 
		        + ":" 
		        + portNumber
				+ ";databaseName=" 
		        + databaseName;
		;

		try {

			// System.out.println("tentar carregar classe");
			// Class.forName ("com.ddtek.jdbc.openedge.OpenEdgeDriver");
			// System.out.println("url: " + cUrl);

			// Insntaciando classe para o Driver OpenEdge

			Class Op = null;

			Op.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver", 
					   true, 
					   this.getClass().getClassLoader());

			xcon = DriverManager.getConnection(cUrl, user, password);

		} catch (SQLException errorOe) {

			System.out.println(errorOe);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		return xcon;

	}

	public Connection getConnectionSql() {

		// Configuração dos parâmetros de conexão
		String serverName = "(DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST = 172.18.16.217)(PORT=1521))(ADDRESS = (PROTOCOL=tcp)(HOST = 172.18.16.218)(PORT=1521))(ADDRESS=(PROTOCOL=tcp)(HOST = 172.18.16.219)(PORT=1521))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=NCSDES)))";
		// String portNumber = "1521"; // Porta TCP padr�o do Oracle
		// String databaseName = "NCSSYS";

		// Configuração dos parâmetros de autenticação
		String user = "ncs";
		String password = "ncs";

		Connection xcon = null;

		// System.out.println("Vou Conectar");

		try {

			// String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber
			// + ":" + databaseName;

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@" + serverName;

			xcon = DriverManager.getConnection(url, user, password);

			// System.out.println("Conexao montada");

		} catch (Exception e) {
			System.out.println(e);
		}

		return xcon;

	}
	
	public Connection getConnectionMySql() {

		// Configuração dos parâmetros de conexão
		 String serverName = "Localhost";
		 String portNumber = "3306"; // Porta TCP padr�o do Oracle
		 String databaseName = "dit001";

		// Configuração dos parâmetros de autenticação
		String user = "root";
		String password = "";

		Connection xcon = null;

		// System.out.println("Vou Conectar");

		try {

			// String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber
			// + ":" + databaseName;

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				/* jdbc:mysql://localhost:3306/dit001 */
			String url = "jdbc:mysql://" 
					   + serverName
					   + ":"
					   + portNumber 
					   + "/" 
					   + databaseName;

			xcon = DriverManager.getConnection(url, user, password);

			// System.out.println("Conexao montada");

		} catch (Exception e) {
			System.out.println(e);
		}

		return xcon;

	}


}
