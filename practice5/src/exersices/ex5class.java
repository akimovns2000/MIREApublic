package exersices;

import java.util.Scanner;

public class ex5class {
    public static void rec5(int n, int s){
        //System.out.println(n + " " + s);
        if (n<10) {System.out.println("result " + (n+s)); return;}
        rec5(n/10, s+n%10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int s = in.nextInt();
        rec5(n, 0);
    }
}
