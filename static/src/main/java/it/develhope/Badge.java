package it.develhope;

public class Badge {

    //instance variables
    private static int totalNumberOfEmployees;
    private final String badgeIdCode;
    public Employee employee;

    //method constructor che crea un badge per ogni impiegato
    public Badge(Employee employeeThatNeedsBadge){
        //aumento di uno il numero di impiegati dell'azienda
        Badge.keepTrackOfEmployeesNumber();
        //assegno alla instance variable employee quella inserita in input al metodo costruttore
        this.employee = employeeThatNeedsBadge;
        //assegno il badge id della classe Badge generandolo randomicamente con il metodo apposito
        this.badgeIdCode = this.generateBadgeIdCode();
    }

    //aumenta di uno gli impiegati, viene chiamata quando creo un nuovo badge e quindi assumo un impiegato
    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    //richiamata nel metodo costruttore crea un badge casuale per il nuovo impiegato
    private String generateBadgeIdCode(){
        //creo numero casuale con la classe Math
        int id = (int) Math.floor(Math.random()*1000);
        //returno la stringa stampata sul badge
        return id + this.employee.name + this.employee.surname + id;
    }

    //Mi fa vedere i dettagli del badge
    public void showBadgeDetails(){
        //stampo il numero di impiegati totali al momento
        System.out.println("The total number of employees is now " + Badge.totalNumberOfEmployees);
        //Stampo i dettagli personali dell'impiegato richiamando il metodo di Employee
        System.out.println(employee.getEmployeeDetails());
        //stampo il badge id dell'impiegato
        System.out.println("The badge id code of this employee is " + this.badgeIdCode);
        System.out.println("----------------------------------------");
    }

}
