import java.util.Arrays;

public class Main {
    public static void main (String[] args) {

        String[] parts ={"tires", "keys"};

        Car jeep = new Car("Jeep", 30000, 2022, "Slate Grey", parts); //Java creates an object of the car class
        Car bronco = new Car("Bronco", 32000, 2022, "Area 51", parts);
        Car jeep2 = new Car(jeep);
        jeep2.setColor("Jet Black");
        jeep2.setParts(new String[] {"tires", "filter"}); // return new String[] {"1", "2", ...}


        System.out.println(Arrays.toString(jeep2.getParts()));

     }
}