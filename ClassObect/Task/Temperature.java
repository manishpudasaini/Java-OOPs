package ClassObect.Task;

public class Temperature {
    float temperature;


    public Temperature(float temperature){
        this.temperature = temperature;
    }

    public void celciusToFehrenheit(){
     double fehrenheit=(temperature*(1.8))+32;
     System.out.println("Temperature in fehrenheit::"+fehrenheit+"F");
    }
    public void fehrenheitToCelcius(){
        double celcius = (temperature-32)*(0.5556);
        System.out.println("Temperature in celcius::"+celcius+"C");
    }


}
