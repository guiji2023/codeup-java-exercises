package shapes;

public class Square extends Rectangle{

    protected double side;
    public Square (double side){

        super(side, side);
        this.side = side;

    }

    @Override
    public double getArea(){
        System.out.println("GetArea in Square Class is called");

        return this.side * this.side;
    }
    @Override
    public double getPerimeter(){
        System.out.println("GetPerimeter in Square Class is called");
        return this.side * 4;
    }
}
