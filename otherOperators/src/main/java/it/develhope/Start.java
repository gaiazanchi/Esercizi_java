package it.develhope;

public class Start {

    public static void main(String[] args) {

        int a = 15;
        a+=5; // a=20
        a-=4; // a=16

        int b =a; // b=16;
        b++; //b=17

        //% è il resto della divisione fra 2 interi, se vale 0 significa che il numero è pari altrimenti che è dispari
        if(b%2 == 0){
            System.out.println("b is an even number");
        }else{
            System.out.println("b is an odd number");
        }

        // b*(b+1)=17*18 che sarà divisibile per 3 poichè 18 lo è
        if((b*(b+1))%3 == 0){
            System.out.println("b*(b+1) è divisibile per 3");
        }else{
            System.out.println("b*(b+1) non è divisibile per 3");
        }

    }

}
