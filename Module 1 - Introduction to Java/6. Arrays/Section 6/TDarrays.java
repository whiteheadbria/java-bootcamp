import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = {
            {44, 45, 23, 11},
            {65, 64, 63, 62}, 
            {78, 79, 80, 81} 
        };

        for(int i = 0; i < grades.length; i++) {

            switch (i) {
                case 0: System.out.print("\tLewis: "); break;
                case 1: System.out.print("\tGeorge: "); break;
                case 2: System.out.print("\tCharles: "); break;
            }
            for(int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.print("\n");
    }
}

}