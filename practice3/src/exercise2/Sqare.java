package exercise2;

class Square extends Rectangle {

    public Square() {
        this.filled = false;
        this.color = "blue";
        this.length = 1;
        this.width = 1;
    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    this.filled = false;
    this.color = "blue";
    }

    public Square(boolean filled, double side, double width, double length, String color) {
        this.width = side;
        this.length = side;
        this.filled = filled;
        this.color = color;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: Square, side: " + this.getSide() +", color = " + this.getColor();
    }
}

