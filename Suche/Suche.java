public class Suche{

    //Implementierung der Methode binaereSuche()
    public static boolean binaereSuche(int[] array, int links, int rechts, int object){
     
    }


    //iterative Implementierung der Methode binaereSucheIterativ()
	/*public static boolean binaereSucheIterativ(int[] array, int object){
		
	}*/

    public static void main(String[] args){
        int[] array = {1, 5, 8, 9, 10, 14, 15, 18, 19};
		
		System.out.println(binaereSuche(array, 0, array.length-1, 14));
		System.out.println(binaereSuche(array, 0, array.length-1, 13));
    }
}