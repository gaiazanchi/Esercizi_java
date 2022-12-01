public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        programmer1.name = "Gaia";
        programmer1.age = 21;
        programmer1.wearsGlasses = true;

        programmer1.drinkCoffe();
        programmer1.printDetails();

        Programmer programmer2 = new Programmer();
        programmer2.name = "Enzo";
        programmer2.age = 31;
        programmer2.wearsGlasses = false;

        programmer2.printDetails();
        programmer2.hasGlasses();

    }
}
