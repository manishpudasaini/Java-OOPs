package InheritanceRelation;

public class Tu extends University{
    TuBranch branch = new TuBranch("Csit");
    Professior prof = new Professior("Ronaldo");

    public void info(){
        System.out.println("Tu branch::"+branch);
        System.out.println("Tu professor"+prof);

    }

}
