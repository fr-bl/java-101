public class Mensch extends Saeugetier{

    public Mensch(String name, int alter){
        super(name, alter);
    }
    
    
    public void kommuniziert(){
        System.out.println(name + ": " + "Moin, Servus, Moin");
    }
}
