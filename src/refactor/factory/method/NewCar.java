package refactor.factory.method;

public class NewCar extends TransportFactory{
	
	public NewCar(){
		System.out.println("drive car");
	}
	@Override
	protected TransportFactory create() {
		return new NewCar();
	}
}
