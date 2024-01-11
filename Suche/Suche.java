public class Suche {

    //Implementierung der Methode binaereSuche()
    public static boolean binaereSuche(int[] array, int links, int rechts, int object){
        if (links > rechts) {
            return false;
        }

        int mitte = (rechts + links) / 2;

        if (object == array[mitte]) {
            return true;
        } else if (object < array[mitte]) {
            return binaereSuche(array, links, mitte-1, object);
        } else {
            return binaereSuche(array, mitte+1, rechts, object);
        }
    }

    //iterative Implementierung der Methode binaereSucheIterativ()
	public static boolean binaereSucheIterativ(int[] array, int object){
        int links = 0;
		int rechts = array.length - 1;
        int mitte;

        while (links <= rechts) {
            mitte = (rechts + links) / 2;
            if (object == array[mitte]) {
                return true;
            } else if (object < array[mitte]) {
                rechts = mitte - 1;
            } else {
                links = mitte + 1;
            }
        }
        return false;
	}

    public static void main(String[] args){
        int[] array = {1, 5, 8, 9, 10, 14, 15, 18, 19};
		
		System.out.println(binaereSuche(array, 0, array.length-1, 14));
		System.out.println(binaereSuche(array, 0, array.length-1, 13));
    
		System.out.println(binaereSucheIterativ(array, 14));
		System.out.println(binaereSucheIterativ(array, 13));
    }
}