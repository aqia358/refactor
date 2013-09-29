package refactor.factory.method;

public abstract class TransportFactory {
	
	protected TransportFactory car;
	protected abstract TransportFactory create();
	
	public void dajiangyou(){
		car = create();
		System.out.println("打酱油去");
	}
}
