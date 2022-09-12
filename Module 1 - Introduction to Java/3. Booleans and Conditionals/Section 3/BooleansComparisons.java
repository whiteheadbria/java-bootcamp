public class BooleansComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(chemistryGrade >= englishGrade);
        System.out.println(biologyGrade == englishGrade);

        double sales = 37.55;
        double costs = 5.55;

        System.out.println(sales > costs);

        String sentence1 = "Have a great day";
        String sentence2 = "Have a great day";
        System.out.println(sentence1.equals(sentence2));
    }
    
}
