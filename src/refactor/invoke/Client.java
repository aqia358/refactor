package refactor.invoke;

public class Client {
	public static void main(String args[]){
		System.out.println("Hello");
		Father f = new StudyInvoctionHandler(new Son()).proxy();
		f.hello();
	}
}
