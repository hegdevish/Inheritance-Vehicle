package com.vish;

public class Vehicle {
    private String name;
    private int engine;
    private int wheels;
    private int price;
    private int speed;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int engine, int wheels, int price, int speed) {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
        this.price = price;
        this.speed = speed;

        currentDirection = 0;
        currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at speed " + velocity + " in the direction "+ direction+ " degrees.");

    }

    public String getName() {
        return name;
    }

    public int getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
