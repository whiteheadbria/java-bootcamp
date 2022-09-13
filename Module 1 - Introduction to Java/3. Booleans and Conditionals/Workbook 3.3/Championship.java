public class Championship {
    public static void main(String[] args) {

        int hamilton = 850;    //hamilton points
        int valterri = 500;    //valterri points

        int margin = hamilton - valterri;   //amount of points by which hamilton scored over valterri;


        //if hamilton wins by a margin of 300 points:
        if (margin > 300) {
            System.out.println("Hamilton takes the championship!");
        }

        else if (margin >= 0) {//Hamilton wins by a margin of any points: 
            System.out.println("In second place, Hamilton!");
        }


        else if (margin >= -100) { //loses within 100 points
        System.out.println("In Third place, Hamilton!");
        }

        else {
            System.out.println("In fourth place, Hamilton");
        }
            
        
    }
}