public class Competition {
    public static void main(String[] args) {

        System.out.println("---------------");

        Team teamA = new Team();
        teamA.teamName = "Crazy Ones";
        teamA.p1.name = "Gaia";
        teamA.p1.yearsOfExperience = 0;
        teamA.p1.programmingLanguage = "Java";
        teamA.p2.name = "Angela";
        teamA.p2.yearsOfExperience = 5;
        teamA.p2.programmingLanguage = "Javascript";

        Team teamB = new Team();
        teamB.teamName = "Good ones";
        teamB.p1.name = "Matteo";
        teamB.p1.yearsOfExperience = 2;
        teamB.p1.programmingLanguage = "C++";
        teamB.p2.name = "Mario";
        teamB.p2.yearsOfExperience = 3;
        teamB.p2.programmingLanguage = "C";

        teamA.printTeamDetails();

        System.out.println("---------------");

        teamB.printTeamDetails();

        System.out.println("---------------");

    }
}
