package refactor.proxy;

public class FatherDecoratorAfter extends FatherDecorator{
	public FatherDecoratorAfter(Father father){
		super(father);
	}
	public void work(){
		super.work();
		after();
	}
	public void after(){
		System.out.println("have a rest");
	}
}
