package refactor.factory;

public abstract class DBFactory {
	protected DBFactory db;
	protected abstract DBFactory connect();
	
	public void create(){
		db = connect();
		System.out.println("DB CREATE");
	}
	public void retrive(){
		System.out.println("DB RETRIVE");
	}
	public void update(){
		System.out.println("DB UPDATE");
	}
	public void delete(){
		System.out.println("DB DELETE");
	}
}
