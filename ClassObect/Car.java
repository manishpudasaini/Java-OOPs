package ClassObect;

import java.sql.SQLOutput;

public class Car {
    int carNumber;
    String carName;
    String carColor;
    float distance ;

    public void acceleration(){
        float speed = distance/60;
        System.out.println("Speed of a car is::"+" "+speed+" "+"per second");
    }
    public void display(){
        System.out.println("Car number::"+" "+carNumber);
        System.out.println("Car name::"+" "+carName);
        System.out.println("Car color::"+" "+carColor);

    }
}
