package it.develhope;

public class Employee {

    //instance variables
    public String name;
    public String surname;
    public String address;

    //constructor method che assegna le instance variables
    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    //method per returnare i dettagli dell'impiegato
    public String getEmployeeDetails(){
        return "This is an employee. Name: " + this.name + " Surname: " + this.surname + " Address: " + this.address;
    }

}
