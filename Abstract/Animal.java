package Abstract;

abstract class Animal {
    abstract void sound();
    void live(){
        System.out.println("Live in a home");
    }

}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Lion extends Animal{
    @Override
    void sound() {
        System.out.println("Lion roar");
    }
}

class AnimalProgram{
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l  = new Lion();
        d.sound();
        l.sound();
        d.live();
    }
}

