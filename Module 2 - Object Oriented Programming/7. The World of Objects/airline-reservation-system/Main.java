import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person briona = new Person();
        briona.name = "Briona";
        briona.nationality = "American";
        briona.dateOfBirth = "01/21/1998";
        briona.passport = new String[] {briona.name, briona.nationality, briona.dateOfBirth};
        briona.seatNumber  = 44;

        System.out.println(briona.name);
        System.out.println(briona.nationality);
        System.out.println(briona.dateOfBirth);
        System.out.println(Arrays.toString(briona.passport));
        System.out.println(briona.seatNumber);



      
      
      
    }
  
  
}
