package exersices;
import java.util.Scanner;

public class ex4class {
    public static int rec4(int t/*текущая сумма*/, int s/*искомая сумма*/, int k/*оставшиеся разряды*/, int r/*старший разряд?*/) {
        if(t==s||(t+9*k==s)) return 1;    //не перибираем, дальше могут быть только 0/9
        if(t>s||(t+9*k<s)) return 0;    //не перебираем, если сумма уже больше/макс. сумма меньше
        if(k==0) return 0;   //больше нет разрядов
        else {
            int m=0;    //число совпадений
            for(int i = 9; i>=r; i--) m+= rec4(t+i, s, k-1, 0);
            return(m);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        if(s==0) System.out.println("result 0"); else
        //for(int i = 9; i>0; i--) {System.out.print(i); m+= rec4(i, s, k-1);} //перебор цифр 9-1 в старшем разряде
        System.out.println("result " + rec4(0, s, k, 1));
    }
}


