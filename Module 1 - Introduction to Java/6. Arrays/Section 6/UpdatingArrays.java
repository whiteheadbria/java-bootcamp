import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macciato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu)); //toString method takes array as an arugment and return a string copy we can store. No need for loops

        String[] newMenu = new String[5];

        //runs through every item in old menu

        for(int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
