public class Main {
    public static void main (String[] args) {
        Car jeep = new Car(); //Java creates an object of the car class

        jeep.make = "Jeep";
        jeep.price = 30000;
        jeep.year = 2022;
        jeep.color = "Slate Grey";

        Car bronco = new Car();
        bronco.make = "Bronco";
        bronco.price = 32000;
        bronco.year = 2022;
        bronco.color = "Area 51";

        System.out.println("This " + jeep.make + " is worth $" + jeep.price + ". It was manufactured in " + jeep.year + " and the color of the Jeep is " + jeep.color);
        System.out.println("This " + bronco.make + " is worth $" + bronco.price + ". It was manufactured in " + bronco.year + " and the color of the Bronco is " + bronco.color);

    }
}