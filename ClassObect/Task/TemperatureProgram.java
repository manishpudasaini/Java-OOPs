package ClassObect.Task;

import java.util.Scanner;

public class TemperatureProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature::");

        float temp = sc.nextFloat();

        Temperature tp=new Temperature(temp);

        System.out.println("Enter 1.To find Fehrenheit 2. To find Celcius::");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                tp.celciusToFehrenheit();
                break;

            case 2:
                tp.fehrenheitToCelcius();
                break;

            default:
                System.out.println("Invalid choice. Please enter correct number");
                break;
        }

//        tp.celciusToFehrenheit();
//        tp.fehrenheitToCelcius();
    }

}
