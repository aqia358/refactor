package refactor.AOP;

public class GreetImpl implements Greeting{
	public void sayHello(String name){
		this.before();
		System.out.println("Hello ! "+ name);
		this.after();
	}
	public void before(){
		System.out.println("Before");
	}
	public void after(){
		System.out.println("After");
	}
}
