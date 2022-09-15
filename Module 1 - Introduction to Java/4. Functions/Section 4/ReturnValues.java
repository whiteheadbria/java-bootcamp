public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureArea(4.5, 8.3);
        double measure2 = measureArea(8.5, 8.3);
        double measure3 = measureArea(9.3, 8.3);
        double measure4 = measureArea(7.8, 8.3);
        double measure5 = measureArea(8.3, 8.3);

        stringPrinter(4.5, 8.3, measure1);
        stringPrinter(8.5, 8.3, measure2);
        stringPrinter(9.3, 8.3, measure3);
        stringPrinter(7.8, 8.3, measure4);
        stringPrinter(8.3, 8.3, measure5);

    }

    public static double measureArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void stringPrinter(double length, double width, double area) {
        System.out.println("When the length of a rectangle is: " + length + " and the width is: " + width + " the area is: " + area);

    }
}