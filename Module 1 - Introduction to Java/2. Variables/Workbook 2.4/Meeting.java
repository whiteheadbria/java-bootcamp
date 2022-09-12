public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        int roundedSales = (int)sales;

        double profit = 18562.18; 
        int roundedProfit = (int)profit;

        double refunds = 688.78; 
        int roundedRefunds = (int)refunds;

        double shipping = 1233.57; 
        int roundedShipping = (int)shipping;

        System.out.println("This month, we made $" + roundedSales + " in sales");

        System.out.println("Factoring in costs, we made $" + roundedProfit + " in profits");

        System.out.println("The refunds are at a low $" + roundedRefunds + ". This is a good sign!");

        System.out.println("Shipping costs were high. We paid $" + roundedShipping + " in shipping");


    }
}