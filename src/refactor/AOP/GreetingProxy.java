package refactor.AOP;

public class GreetingProxy implements Greeting{
	private Greeting greeting;
	public GreetingProxy(Greeting greeting){
		this.greeting = greeting;
	}
	public void sayHello(String name){
		before();
		greeting.sayHello(name);
		after();
	}
	public void before(){
		System.out.println("Before");
	}
	public void after(){
		System.out.println("After");
	}
}
