public class Exams {
    public static void main(String[] args) {
        
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        //Task 1: Create an array that stores 5 students: "Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"
        String[] drivers = {"Lewis", "George", "Charles", "Carlos", "Zhou"};
        System.out.println(drivers.length);
        

        for(int i = 0; i < drivers.length; i++) {
            System.out.println(drivers[i] + ", you will take seat " + i);
        }
        
        /**Task 2: Using a for loop, assign each student a seat according to their index in the array.
         
          for  ( ...) { 
              <student at index i>, you will take seat i
          }
         
         */
        //    
    }
}