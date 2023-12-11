package shapes;

import util.Input;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Double.parseDouble(String.format("%.2f",Math.PI * radius * radius));
    }
    public double getCircumference(){
        return Double.parseDouble(String.format("%.2f", 2 * Math.PI * radius));
    }

    public String toString(){
        return "Circle Created, with the area of " + this.getArea() + " and the perimeter of " + this.getCircumference();
    }
}

class CircleApp{

    public static void main(String[] args) {


        Input input = new Input();
        int numCircles = 0;
        boolean isContinued = true;
        Circle circle;

        while (isContinued){
            System.out.println("Enter the radius with 2 decimals");
            double radius = input.getDouble();
            circle = new Circle(radius);
            double area = circle.getArea();
            double perimeter = circle.getCircumference();
            System.out.println(circle.toString());
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            numCircles ++;
            System.out.println("Would you like to create another circle? ");
            isContinued = input.yesNo();
        }

        System.out.println("You created " + numCircles + " circles.");


    }
}
