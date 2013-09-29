package refactor.factory;

public class SQLServerDB extends DBFactory{
	@Override
	public DBFactory connect() {
		return new SQLServerDB();
	}
	public SQLServerDB(){
		System.out.println("get SQLServerDB connect");
	}
	public void create(){
		System.out.println("SQLServerDB CREATE");
	}
	public void retrive(){
		System.out.println("SQLServerDB RETRIVE");
	}
	public void update(){
		System.out.println("SQLServerDB UPDATE");
	}
	public void delete(){
		System.out.println("SQLServerDB DELETE");
	}
}
