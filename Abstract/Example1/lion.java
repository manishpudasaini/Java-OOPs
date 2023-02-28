package Abstract.Example1;

public class lion extends Animal{

    lion(){
    }

    lion(String type){
        super(type);
    }


    @Override
    void eat() {
        System.out.println(getType()+" Eats rabbit");
    }

    @Override
    void makeSound() {
        System.out.println(getType()+" Roars");
    }
}
