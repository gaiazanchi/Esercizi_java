public class Team {

    public String teamName;
    public Programmer p1 = new Programmer();
    public Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.println("Team name: " + teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }

}
