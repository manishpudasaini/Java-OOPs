package Abstract.Example1;

public class Dog extends Pet{
    Dog(){

    }

    Dog(String type){
        super(type);
    }

    @Override
    void eat() {
        System.out.println(getType()+" Eats meat");
    }

    @Override
    void makeSound() {
        System.out.println(getType()+" Bark");
    }

    @Override
    void gameName(String name) {
        System.out.println(getType()+" "+name);
    }
}
