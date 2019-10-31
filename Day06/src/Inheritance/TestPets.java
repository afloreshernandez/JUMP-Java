package Inheritance;

public class TestPets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		System.out.println(myDog.speak());
		System.out.println(myDog.fetch());
		
		Cat myCat = new Cat();
		System.out.println(myCat.speak());
		System.out.println(myCat.meow());

	}

}
