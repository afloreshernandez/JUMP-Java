package Polymorphism;

public class App {
	
	public static void main(String[] args) {
		
		Pet pet = new Pet();
		System.out.println(pet.speak());
		
		pet = new Cat();
		System.out.println(pet.speak());
		
		pet = new Dog();
		System.out.println(pet.speak());
		
		if(pet instanceof Cat) {
			System.out.println("pet is instance of cat");
		}
		
		if(pet instanceof Dog) {
			System.out.println("pet is instance of dog");
		}
	}

}
