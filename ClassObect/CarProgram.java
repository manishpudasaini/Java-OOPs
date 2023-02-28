package ClassObect;

import java.util.Scanner;

public class CarProgram {
    public static void main(String[] args) {


    Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car number::");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the car brand name::");
        String name = sc.nextLine();

        System.out.println("Enter the car color::");
        String color = sc.nextLine();

        System.out.println("Enter distance travel to check speed::");
        float distance = sc.nextFloat();

        car.carNumber=number;
        car.carName=name;
        car.carColor=color;
        car.distance=distance;

        car.display();

        car.acceleration();



    }
}
