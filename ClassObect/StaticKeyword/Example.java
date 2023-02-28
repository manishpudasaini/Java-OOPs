package ClassObect.StaticKeyword;

public class Example {
    static int a;
    Example(int a){
        this.a=a;
    }

    public static int number() {
        a = a + 1;
        return a;
    }

}
