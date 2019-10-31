package Constructors;

public class Person {
	private String name;
	
	public Person() {                //initializing constructors
		setName("Unknown");
	}
	
	public Person(String name) {   //initializing constructors
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
