package Abstract.Example1;

public abstract class Pet extends Animal{
    Pet(){

    }
    Pet(String type){
        super(type);    //calling animal class constructor with single parameter
    }
    abstract void gameName(String name);

}
