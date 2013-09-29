package refactor.factory.method;

public class NewBike extends TransportFactory{
	public NewBike(){
		System.out.println("take bike");
	}
	@Override
	protected TransportFactory create() {
		return new NewBike();
	}
}
