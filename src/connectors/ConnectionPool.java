package connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource;

import org.hsqldb.jdbc.JDBCPool;

import com.ddtek.jdbcx.openedge.OpenEdgeDataSource;

@SuppressWarnings("unused")
public class ConnectionPool {

	private DataSource dataSource;

	@SuppressWarnings({ "rawtypes", "static-access" })
	public ConnectionPool(String cType, String cUrl, String cUser, String cPass)
			throws SQLException {

		if (cType == "HSQL") {
			JDBCPool pool = new JDBCPool();
			pool.setUrl(cUrl);
			pool.setUser(cUser);
			pool.setPassword(cPass);
			this.dataSource = pool;
		}

		if (cType == "ORACLE") {
			OracleDataSource pool = new OracleDataSource();
			pool.setURL(cUrl);
			pool.setUser(cUser);
			pool.setPassword(cPass);
			this.dataSource = pool;
		}

		if (cType == "OPENEDGE") {

			Class op = null;

			try {
				op.forName("com.ddtek.jdbc.openedge.OpenEdgeDriver", true,
						this.getClass().getClassLoader());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DriverManager.getConnection(cUrl, cUser, cPass);
			OpenEdgeDataSource pool = new OpenEdgeDataSource();
		/*	pool.setConnectionLog(cUrl);*/
		 	pool.setDatabaseName("toios");
			pool.setServiceName("toios");
			pool.setPortNumber(3501);
			pool.setServerName("tdbsbcsvr068");
			pool.setUser(cUser);
			pool.setPassword(cPass); 
			pool.getConnection();
			
			
			this.dataSource = pool;

		}

	}

	public Connection getConnection() throws SQLException {
		if (dataSource != null) {

			Connection connection = dataSource.getConnection();
			return connection;
		} else {
			return null;
		}

	}

}
