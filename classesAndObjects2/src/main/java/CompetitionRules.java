public class CompetitionRules {

    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    private CompetitionRules(){}

    private static CompetitionRules competitionRules = new CompetitionRules();

    public static CompetitionRules getInstance(){
        return competitionRules;
    }

    public static void printRules(){
        System.out.println(competitionRules.competitionRule1);
        System.out.println(competitionRules.competitionRule2);
        System.out.println(competitionRules.competitionRule3);
    }

}
