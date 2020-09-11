package ru.mirea.pr2;

public class Ball {
    private double x=0, y=0;
    public Ball(double xn, double yn){
        x=xn;
        y=yn;
    }

    public void setX(double xn){
        x=xn;
    };

    public double getX(){
        return(x);
    };

    public void setY(double yn){
        y=yn;
    };

    public double getY(){
        return(y);
    };

    public void setXY(double xn, double yn){
        x=xn;
        y=yn;
    };

    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }

    public String toString(){
        return "Ball @ (" + x + ", " + y + ")";
    }

}
