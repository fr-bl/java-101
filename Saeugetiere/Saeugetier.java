public class Saeugetier{

    String name;
    int alter;

    public Saeugetier(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public String getName(){
        return name;
    }

    public int getAlter(){
        return alter;
    }

    public void kommuniziert(){
        System.out.println(name + ": " + "?!$%$(/%$??!$%$(/%$?");
    }

}