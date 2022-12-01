public class CompetionRules {
    private static CompetionRules rules;

    private CompetionRules(){}

    public static CompetionRules printRules(){
        String competitionRule1 = "Do not copy and paste from StackOverflow!";
        String competitionRule2 = "Learn every day!";
        String competitionRule3 = "Be the best team!";

        System.out.println("Rules: ");
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
        return rules;
    }
}
