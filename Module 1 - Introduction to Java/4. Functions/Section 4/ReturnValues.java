public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureArea(4.3, 2.2, "area");
        double measure2 = measureArea(3.2, 4.1, "perimeter");


        stringPrinter(4.3, 2.2, measure1, "area");
        stringPrinter(3.2, 4.1, measure2, "perimeter");


    }

    public static double measureArea(double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("length or width cannot be negative");
            System.exit(0);
        }

        switch(option) {
            case "area":return length * width;
            case "perimeter":return 2 * (length + width);
            default: return 404;
        }
    }

    public static void stringPrinter(double length, double width, double measure, String option) {
        System.out.println("When the length is " + length + " and the width is: " + width + " the " + option + " is: " + measure);

    }

    //stringPrinter recieves the String option aruguement as a parameter and it inserts it into a longer string 
}