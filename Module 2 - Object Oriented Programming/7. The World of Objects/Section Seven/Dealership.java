import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership() {
        this.cars = new Car[3];
        System.out.println(Arrays.toString(this.cars));
    }

    public void setCar(Car car, int index) { //Set car recieves car object
        this.cars[index] = new Car(car); 
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);//Getter returns a copy of the object we're trying to access first
    }
}
