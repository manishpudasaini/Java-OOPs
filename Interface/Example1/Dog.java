package Interface.Example1;

import ClassObect.Car;

public class Dog implements Animal,Pet {
    private String type;
    Dog(String type){
        //Animal.super.type="Dog";
        this.type=type;

    }
    @Override
    public void eat() {
        System.out.println(this.type+" eats meat");
    }

    @Override
    public void makeSound() {
        System.out.println(this.type+" Bark....");
    }

    @Override
    public void gameName(String name) {
        System.out.println(this.type+" "+name);
    }
}
