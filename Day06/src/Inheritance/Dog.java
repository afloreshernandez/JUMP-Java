package Inheritance;

public class Dog extends Pet{
	
	public Dog() {
		setName("Unknown Dog");
	}
	public String speak() {
		return "awww.";
	}
	public String fetch() {
		return "Yes, Master, Fetch I will.";
	}

}
