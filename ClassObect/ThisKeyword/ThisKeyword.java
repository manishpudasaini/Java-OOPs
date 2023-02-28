package ClassObect.ThisKeyword;

public class ThisKeyword {
    int a;
    int b;
    ThisKeyword (int a){
        this.a=a;
    }

    ThisKeyword(int a,int b){

    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword(5);
        System.out.println(tk.a); //ans=5
    }
}
