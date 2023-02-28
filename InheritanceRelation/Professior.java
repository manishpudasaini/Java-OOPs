package InheritanceRelation;

public class Professior {
    String profname;
   public Professior(String profname){
         this.profname=profname;
    }

    public void teach(){
       Book b =new Book("Java");
        System.out.println("Professor teaches"+b.name);
    }




}
