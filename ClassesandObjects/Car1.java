public class Car1 {
    int noofwheels;
    String color;
    float maxSpeed;
    float currentfuelInlitres;

    // Car1() {
    // this.currentfuelInlitres = currentfuelInlitres;

    // }

    void drive() {
        if (currentfuelInlitres == 0) {
            System.out.println("Car is out of fuel");
        } else
            System.out.println("Car is driving");
    }
    // this=current object

    void addFuel(float currentfuelInlitres) {
        this.currentfuelInlitres += currentfuelInlitres;
        System.out.println("Adding fuel");
    }
}
