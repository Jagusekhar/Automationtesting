package Java;

public class Overloadmainmethod {

	public static void main(String[] args) {

		System.out.println("Method 1");
		main ("Jagu");
		main(10);
		main(11,12);
	}

	public static void main(String args) {

		System.out.println("Method 2");
		
	}
	public static void main(int a) {

		System.out.println("Method 3");
		
	}
	public static void main(int a, int b) {

		System.out.println("Method 4");
		
	}

}

//Is it possible to overload main method?
//Yes, you can overload main method in Java. But the program doesn't execute the overloaded main method when you run your program, you have to call the overloaded main method from the actual main method.

