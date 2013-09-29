package refactor.factory;

public abstract class AttributeDescriptor {
	protected AttributeDescriptor(){
		
	}
	public static AttributeDescriptor forInteger(){
		return new IntegerDescriptor();
	}
	public static AttributeDescriptor forBoolean(){
		return new BooleanDescriptor();
	}
	public static AttributeDescriptor forReference(){
		return new ReferenceDescriptor();
	}
	public void sayHello(){
	}
	public static void main(String[] args) {
		AttributeDescriptor a = AttributeDescriptor.forInteger();
		a.sayHello();
	}
}
