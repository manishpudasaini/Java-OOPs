package Abstract.Example1;

public class MainMethodProgram {
    public static void main(String[] args) {
        lion l = new lion("Lion");
        Dog d = new Dog("Dog");

        l.eat();
        l.sleep();
        l.makeSound();


        d.eat();
        d.makeSound();
        d.gameName("Plays football");
        d.sleep();

    }
}
