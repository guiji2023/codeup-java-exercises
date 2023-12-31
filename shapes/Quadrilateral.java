package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length, width;
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void  setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
