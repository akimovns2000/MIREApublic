package ru.mirea.pr1;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball("Red",10, 15);
        System.out.println(b.toString());
        b.move(1, 2);
        b.setName("Blue");
        System.out.println(b.toString());
    }

}

