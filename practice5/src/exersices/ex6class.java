package exersices;

import java.util.Scanner;

public class ex6class {
    public static void isSimple(int n, int min, int d){
            if (d>min||d==n) {System.out.println("YES"); return;}
            if (n%d==0) {System.out.println("NO"); return;}
            isSimple(n, n/d, d+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        isSimple(n, n, 2);
    }
}
