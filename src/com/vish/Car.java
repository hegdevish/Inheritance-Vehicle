package com.vish;

public class Car extends Vehicle{

    private int horsepower;
    private int gears;
    private int doors;
    private boolean isManual;

    private int currentGear;

    public Car(String name, int engine, int wheels, int price, int speed, int horsepower, int gears, int doors, boolean isManual){
        super(name, engine, 4, price, speed);
        this.doors = doors;
        this.gears = gears;
        this.horsepower = horsepower;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println(("Car.setCurrentGear(): Changed to " + this.currentGear + " gear."));
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " and direction "+ direction);
    }
}
