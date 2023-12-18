import java.util.Random;

public class Methoden {
	public static void main(String[] args) {
		helloFreddi();
		printIsAdult(16);
		System.out.println("Dass ich erwachsen bin, ist " + isAdult(16));
		System.out.println("4 + 4 = " + mult2(4));
		System.out.println("Meine Note ist " + generateMark());
		System.out.println("Ich habe " + generateMark(1, 15) + " Punkte");
		System.out.println("Meine Note ist " + generateMark(1, 6, "Freddi"));
	}
	
	public static void helloFreddi() {
		System.out.println("Hello Freddi!");
	}
	
	public static void printIsAdult(int age) {
		if (age >= 18) {
			System.out.println("Person ist erwachsen.");
		} else {
			System.out.println("Person ist minderjährig.");
		}
	}
	
	public static boolean isAdult(int age) {
		return age >= 18;
	}
	
	public static float mult2(float num) {
		return num * 2;
	}
	
	public static int generateMark() {
		return generateMark(1, 6);
	}
	
	public static int generateMark(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}
	
	public static int generateMark(int min, int max, String name) {
		int hash = 0;
		
		for (int i = 0; i < name.length(); i++) {
            hash += name.codePointAt(i);
        }
        
        return hash % (max - min) + min;
	}
}
