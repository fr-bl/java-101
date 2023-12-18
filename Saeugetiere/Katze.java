public class Katze extends Saeugetier{

    public Katze(String name, int alter){
        super(name, alter);
    }
    
    
    public void kommuniziert(){
        System.out.println(name + ": " + "Miauu :3");
    }
}
