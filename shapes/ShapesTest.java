package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Quadrilateral myShape;


     myShape = new Square(5.0);



        System.out.println("The area of the square is " + myShape.getArea());
        System.out.println("The area of the perimeter is " + myShape.getPerimeter());




        myShape = new Rectangle(5.0, 4.0);

        System.out.println("The area of the square is " + myShape.getArea());
        System.out.println("The area of the perimeter is " + myShape.getPerimeter());

    }
}
