package refactor.AOP;

public class Client {
	public static void main(String args[]){
		GreetingProxy gp = new GreetingProxy(new GreetImpl());
		gp.sayHello("name");
		
		Greeting greeting = new JDKDynamicProxy(new GreetImpl()).getProxy();
		greeting.sayHello("JDK");
	}
}
