public class WorkSchedule {
    public static void main(String[] args) {
        int day = 7;   //3rd day of the week...
        boolean holiday = false;
         
        if (holiday==true) {
            System.out.println("Whoohoo, no work!");
        } 

        else if (day >= 6 && day <= 7) {
            System.out.println("It's the weekend, no work!");
        }
        
        else {
            System.out.println("Wake up at 7:00 :(");
        }

        }

    }
