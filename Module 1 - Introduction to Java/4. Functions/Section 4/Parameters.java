public class Parameters {
    public static void main (String [] args) {
        measureArea(4.5, 8.3);
        measureArea(8.5, 8.3);
        measureArea(9.3, 8.3);
        measureArea(7.8, 8.3);
        measureArea(8.3, 8.3);
    }

    public static void measureArea(double length, double width) {
        double area = length * width;
        System.out.println("The length is: " + length + ". The width is: " + width + ". So the area is: " + area);
    }
}
