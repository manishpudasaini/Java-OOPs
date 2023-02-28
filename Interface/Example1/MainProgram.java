package Interface.Example1;

public class MainProgram {
    public static void main(String[] args) {
        Dog d = new Dog("Dog");
        d.eat();
        d.makeSound();
        d.gameName("plays football");
        d.sleep();

        System.out.println();

        Animal l = new Lion("Lion");
        l.eat();
        l.makeSound();
        l.sleep();

    }

}
