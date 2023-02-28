package Interface.Example1;

public class Lion implements Animal{
    private String type;
    Lion(String type){
        this.type=type;
    }
    @Override
    public void eat() {
        System.out.println(this.type+ " eats rabbit");
    }

    @Override
    public void makeSound() {
        System.out.println(this.type+ " Roar..");
    }
}
