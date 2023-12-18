public class Main{

    public static void main(String[] args){
        Saeugetier tier = new Saeugetier("Tier ohne Namen", 5);
        Katze katze = new Katze("Garfield", 3);
        Mensch mensch = new Mensch("John", 16);

        tier.kommuniziert();
        katze.kommuniziert();
        mensch.kommuniziert();
    }
}