package exercise;

import java.util.Scanner;
import java.util.ArrayDeque;

public class drunkardDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayDeque<Card> deck1 = new ArrayDeque<>();
        ArrayDeque<Card> deck2 = new ArrayDeque<>();

        for (int j=0; j<5; j++) {
            deck1.add(new Card(in.nextInt()));
        }

        for (int j=0; j<5; j++) {
            deck2.add(new Card(in.nextInt()));
        }

        int i=0;
        while(i<106) {
            i++;
            Card card1 = deck1.pop();
            //System.out.print(card1 + " ");

            Card card2 = deck2.pop();
            //System.out.println(card2);

            if (card1.compareTo(card2) > 0) {
                deck1.add(card1);
                deck1.add(card2);
                if (deck2.size()==0) {System.out.print("first " + i); return;}
            } else {
                deck2.add(card1);
                deck2.add(card2);
                if (deck1.size()==0) {System.out.print("second " + i); return;}
            }
        }
        System.out.print("botva");
    }
}

