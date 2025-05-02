import java.util.*;

public class Car {
    int noofWheels;
    int noofDoors;
    int maxspeed;
    String name;

    public Car(int noofWheels, int noofDoors, int maxspeed, String name, String modelno, String company) {
        this.noofWheels = noofWheels;
        this.noofDoors = noofDoors;
        this.maxspeed = maxspeed;
        this.name = name;
        this.modelno = modelno;
        this.company = company;
    }

    String modelno;
    String company;

    public String toString() {
        return "My car name is " + name + " and it has " + noofWheels + " wheels and " + noofDoors
                + " doors. It has a max speed of " + maxspeed + " km/h. The model number is " + modelno
                + " and the company is " + company;
    }

    public static void main(String[] args) {
        Car Swift = new Car(4, 4, 120, "Swift", "ZDI", "Maruti Suzuki");
        System.out.println(Swift);
        // this will print car@ with its hash code

    }

}
