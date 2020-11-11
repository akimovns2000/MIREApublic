package exercise;

public class Card implements Comparable<Card>{
    private int number;

    public Card(int num){
        if (num<=9 & num>=0) number=num;
        else number=9;
    }

    @Override
    public String toString() {
        return "" + number ;
    }

    public int getNumber(){return number;}

    public int compareTo(Card s) {
        if (number==0 & s.number==9) return 1;
        if (number==9 & s.number==0) return -1;
        return (number-s.number);
    }
}
