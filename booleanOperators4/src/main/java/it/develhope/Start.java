package it.develhope;

public class Start {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 3;
        int d = 3;
        // d/5 --> 3/5=0 (divisione intera), 0 >= 3 vale true
        //c+b-c=b --> b/a = 3/1 = 3 e 3 == 3 vale true, !true vale false
        //false || true vale true
        System.out.println((d / c + 2) >= b || !(c + b - c / a == 3)); // result: true

        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;
        // !t vale true, f vale true, true&&true vale true
        //se uno dei due è true con OR automaticamente il risultato è true
        System.out.println((x * x - y * y / 2 != 12) || !t && f); // result: true

    }

}
