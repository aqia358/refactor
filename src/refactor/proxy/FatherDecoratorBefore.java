package refactor.proxy;

public class FatherDecoratorBefore extends FatherDecorator{
	public FatherDecoratorBefore(Father father){
		super(father);
	}
	public void work(){
		before();
		super.work();
	}
	public void before(){
		System.out.println("eating full");
	}
}
