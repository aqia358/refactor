package refactor;

import refactor.Person;

public class PersonFactory {

	public Person createPoorPerson(String name){
		return new Person(name, null, null, null);
	}
	public Person createPersonWithPhone(String name, String phone){
		return new Person(name, phone, null, null);
	}
	public Person createPersonWithPhoneCar(String name, String phone, String car){
		return new Person(name, phone, null, car);
	}
	public Person createRichPerson(String name, String phone, String house, String car){
		return new Person(name, phone, house, car);
	}

}
