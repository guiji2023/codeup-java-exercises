package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }
}
