import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] passport = new String[3];
        Person person = new Person("Briona Whitehead", "American", "01/21/1998", 9, passport);
        if (person.applyPassport() == true) {
            person.setPassport();
        }

        System.out.println(person);

    }

}
