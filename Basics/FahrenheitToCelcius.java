import java.util.*;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit :");
        float fahren=input.nextFloat();
        float celcius=(fahren-32)*5/9;
        System.out.println("Temperature is converted to celcius !");
        System.out.println(celcius);

    }
}
