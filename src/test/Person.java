package test;

public class Person {
	private String name;
	
	private String phone;
	private String car;
	private String house;
	
	public Person(String name, String phone, String house, String car){
		this.name = name;
		this.phone = phone;
		this.house = house;
		this.car = car;
	}
	public Person(String name){
		this(name, null, null, null);
	}
	public Person(String name, String phone){
		this(name, phone, null, null);
	}
	public Person(String name, String phone, String car){
		this(name, phone, car, null);
	}
}
