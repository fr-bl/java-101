public class Variablen {
	public static void main(String[] args) {
		// Aufgabe 1
		int age = Integer.parseInt(
			System.console().readLine("Enter your age: ")
		);
		System.out.println("You are " + age + " years old\n");
		
		//Aufgabe 2
		String name = System.console().readLine("Enter your name: ");
		System.out.println("Your name is " + name + "\n");
		
		// Aufgabe 3
		age = age + 1;
		System.out.println("You will become " + age + " years old");
		
		age = age * 2;
		System.out.println("That's half as old as " + age + " years old");
		
		age = 99;
		System.out.println("Someday you might be " + age + " years old");
	}
}
