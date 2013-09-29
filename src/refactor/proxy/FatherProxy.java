package refactor.proxy;

public class FatherProxy implements Father{
	private FatherImpl father;
	public FatherProxy(FatherImpl father){
		this.father = father;
	}
	public void work(){
		before();
		father.work();
		after();
	}
	public void before(){
		System.out.println("eating full");
	}
	public void after(){
		System.out.println("have a rest");
	}
}
