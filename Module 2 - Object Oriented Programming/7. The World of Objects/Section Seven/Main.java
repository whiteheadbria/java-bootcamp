public class Main {
    public static void main (String[] args) {
        Car jeep = new Car("Jeep", 30000, 2022, "Slate Grey"); //Java creates an object of the car class
        Car bronco = new Car("Bronco", 32000, 2022, "Area 51");

        System.out.println("This " + jeep.make + " is worth $" + jeep.price + ". It was manufactured in " + jeep.year + " and the color of the Jeep is " + jeep.color);
        System.out.println("This " + bronco.make + " is worth $" + bronco.price + ". It was manufactured in " + bronco.year + " and the color of the Bronco is " + bronco.color);

    }
}