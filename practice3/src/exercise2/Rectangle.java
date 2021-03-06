package exercise2;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width + this.length);
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, width: " + width + ", length = " + length + ", color = " + this.getColor();
    }
}

