package ru.mirea.pr1;

public class Ball {
    private String name;
    private double x=0, y=0;
    public Ball(String n, double xn, double yn){
        name=n;
        x=xn;
        y=yn;
    }

    public void setName(String n) { name=n; };

    public String getName() { return(name); };

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
        return name + " @ (" + x + ", " + y + ")";
    }

}

