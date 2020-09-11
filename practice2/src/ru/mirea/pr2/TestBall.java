package ru.mirea.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(10, 15);
        System.out.println(b.toString());
        b.move(1, 2);
        System.out.println(b.toString());
    }

}
