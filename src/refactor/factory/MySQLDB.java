package refactor.factory;

public class MySQLDB extends DBFactory{
	@Override
	public DBFactory connect() {
		return new MySQLDB();
	}
	public MySQLDB(){
		System.out.println("get MySQLDB connect");
	}
	public void create(){
		System.out.println("MySQLDB CREATE");
	}
	public void retrive(){
		System.out.println("MySQLDB RETRIVE");
	}
	public void update(){
		System.out.println("MySQLDB UPDATE");
	}
	public void delete(){
		System.out.println("MySQLDB DELETE");
	}
}
