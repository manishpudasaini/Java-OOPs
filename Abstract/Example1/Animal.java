package Abstract.Example1;

public abstract class Animal {
    private String type;

    Animal(){

    }

    Animal(String type){
      this.type=type;
    }
    public String getType() {
        return type;
    }

   abstract void eat();
   abstract void makeSound();

   public void sleep(){
       System.out.println(this.type+" Sleep at night");
   }
}
