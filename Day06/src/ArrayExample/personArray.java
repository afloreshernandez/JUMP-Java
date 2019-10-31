package ArrayExample;

import java.util.Scanner;

public class personArray { // array ogf objects

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,inpStr; 
		int age; 
		String gender;
		
	    Person[] persons = new Person[3];
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i=0; i < persons.length; i++) {
			System.out.println("Enter name:");
			name = scanner.next();
			System.out.println("Enter age:");
			age = scanner.nextInt();
			System.out.println("Enter gender:");
			gender = scanner.next();
			
			persons[i] = new Person();
			
			persons[i].setName (name );
			persons[i].setAge ( age );
			persons[i].setGender(gender );
					
		 
			
		}
		
		//persons[i].findOldest();
		//persons[i].findYoungest();
		//int maxIndex = 0;
		int maxIndex = findOldest(persons);
		int minIndex = findYoungest(persons);
		
		
		System.out.println("Oldest: " + persons[maxIndex].toString());
		System.out.println("Youngest: " + persons[minIndex].toString());
		printAll(persons);

	}
	
	public static int findOldest(Person[] persons) {
		int maxIndex = 0;
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getAge() > persons[maxIndex].getAge()) {
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
	
	public static int findYoungest(Person[] persons) {
		
		int minIndex = 0;
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getAge() < persons[minIndex].getAge()) {
				minIndex = i;
			}
		}
		
		return minIndex;
		
	}
	
	public static void printAll(Person[] persons) { //foreach statement
		for(Person p : persons) {
			System.out.println(p.toString());
		}
	}

}
