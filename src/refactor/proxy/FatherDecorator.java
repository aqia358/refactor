package refactor.proxy;

public abstract class FatherDecorator implements Father{
	protected Father father;
	public FatherDecorator(Father father){
		this.father = father;
	}
	public void work(){
		father.work();
	}
}
