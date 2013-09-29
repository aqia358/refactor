package refactor.factory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBFactory db = new MySQLDB();
		db.connect();
	}

}
