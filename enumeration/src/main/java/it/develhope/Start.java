package it.develhope;

public class Start {

    public static void main(String[] args) {

        for (Months value : Months.values()) {
            System.out.println(value);

            if(value.toString().endsWith("Y")){
                System.out.println("It ends with y");
            }else{
                System.out.println("It doesn't end with y");
            }

        }

    }

}
