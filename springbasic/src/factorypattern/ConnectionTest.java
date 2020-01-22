package factorypattern;
/*
 * ORACLE://127.0.0.1
 */
public class ConnectionTest {
	public static void main(String[] args) {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection db = factory.getConnection(args[0]);
		db.connect();


	}

}
