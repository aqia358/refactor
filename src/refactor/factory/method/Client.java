package refactor.factory.method;

public class Client {

	public static void main(String[] args) {
		TransportFactory t = new NewCar();
		t.dajiangyou();
		TransportFactory t2 = new NewBike();
		t2.dajiangyou();
	}

}
