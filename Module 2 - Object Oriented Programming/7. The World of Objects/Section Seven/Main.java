//import java.util.Arrays;

public class Main {
    public static void main (String[] args) {

        Car[] cars = new Car[] {
            new Car("Jeep", 30000, 2022, "Slate Grey", new String[] {"tires", "keys"}), //Java creates an object of the car class
            new Car("Bronco", 32000, 2022, "Area 51", new String[] {"tires", "keys"}),
            new Car("Jeep", 30000, 2022, "Blue", new String[] {"tires", "filer"}),
        };



        Dealership dealership = new Dealership();
        for(int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        Car newCar = dealership.getCar(0);
        newCar.setColor("blue");
        System.out.println(dealership.getCar(0));

     }
}