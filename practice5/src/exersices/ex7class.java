package exersices;

import java.util.Scanner;

public class ex7class {

    public static void simpleMultiple(int n, int min, int d){
        if (d>min) {System.out.print(" " + n); return;};
        if (n%d==0) {
            n=n/d;
            while (n%d==0) n=n/d;
            System.out.print(" " + d);
        }
        if (n!=1) simpleMultiple(n, n/d, d+1); else return;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(1);
        simpleMultiple(n, n, 2);
    }
}
