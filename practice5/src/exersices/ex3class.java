package exersices;
import java.util.Scanner;

public class ex3class {
    public static void rec3(int a, int b) {
        if (a > b) {
            System.out.print(a + " ");
            rec3(a - 1, b);
        } else if (a < b) {
            System.out.print(a + " ");
            rec3(a + 1, b);
        } else System.out.println(a);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        rec3(a, b);
    }
}

