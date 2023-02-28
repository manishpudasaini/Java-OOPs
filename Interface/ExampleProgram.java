package Interface;

class ExampleProgram implements Example{
   public void output(){
        System.out.println("ExampleProgram method");
    }

    public static void main(String[] args) {
        ExampleProgram ep = new ExampleProgram();
        ep.output();
    }

}
