package Constructors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(20,15);
		
		
		Complex c2 = new Complex(c1);
		
		Complex c3 = c2;
		
		if(c1.equals(c2)) {
			System.out.println("c1 equals c2");
		}else {
			System.out.println("c1 NOT equals c2");
		}
		
		if(c1==c2) {
			System.out.println("c1==c2");
		}else {
			System.out.println("c1 != c2");
		}
		
		System.out.println(c2);
		
		if(c3==c2) {
			System.out.println("c3==c2");
		}else {
			System.out.println("c3 != c2");
		}

	}

}
