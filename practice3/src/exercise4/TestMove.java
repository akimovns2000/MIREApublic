package exercise4;

public class TestMove {
    public static void main(String[] args) {
    MovablePoint p1=new MovablePoint(0,0,2,1);
        System.out.println(p1);
        p1.moveDown();
        p1.moveRight();
        System.out.println(p1);
        MovableCircle c1=new MovableCircle(0,0,2,1, 5)  ;
        System.out.println(c1);
        c1.moveDown();
        c1.moveRight();
        System.out.println(c1);
        MovableRectangle r1=new MovableRectangle(0,0,2,2, 2, 1);
        System.out.println(r1);
        r1.moveDown();
        r1.moveRight();
        System.out.println(r1);
    }
}
