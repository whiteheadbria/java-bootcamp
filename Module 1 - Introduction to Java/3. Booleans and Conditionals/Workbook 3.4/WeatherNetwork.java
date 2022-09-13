public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 75;  

        String forecast = "The forcast is FREEZING! Stay home!";

        if (temp >= -15 && temp < 0 ) {
            System.out.println(forecast);
        }

        else if (temp >= 0 && temp <= 10) {

        System.out.println("The forecast is Chilly. Wear a coat!");
        }

        else {

        System.out.println("It's warm, go outside");
    }
}
}