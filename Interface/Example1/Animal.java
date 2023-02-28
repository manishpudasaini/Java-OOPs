package Interface.Example1;

public interface Animal {
    String type="Animal";   //final static variable

//  Animal(){ //consructor are not allowed
//
//  }
    void eat();
    void makeSound();

    default void sleep(){

        System.out.println("Sleep after eating");
    }

    static void description(){

    }

}
