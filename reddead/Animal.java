package reddead;

public abstract class Animal {
    // we know that we won't crate an instance of animal
    public String color;
    public int hp;
    public String name;
    public int aggro;
    public int attack;


    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }


    public abstract void move();
    public abstract void eat();
    public abstract void makeNoise();


}
