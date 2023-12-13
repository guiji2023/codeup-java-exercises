package reddead;

public class Eagle extends Animal implements CanFly, Skinnable {
    public Eagle(String color, String name) {
        super(color, name);
        this.attack = 15;
        this.aggro = 10;
        this.hp = 200;

    }
    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void skin() {

    }
    // Because we are going to create an instance of Eagle,
    //Thus, it is not abstract

}
