import java.util.Arrays;

public class ReferenceTrap {
    public static void main (String[] args) {
        String[] staffLastYear = {"Lewis", "George", "Carlos"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Bria";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
