package Abstract;

class SquareArea extends Shape{
    Integer length=6;

    @Override
    void area() {
        double area=length*length;
      System.out.println("Area of square= "+area);
    }


}
