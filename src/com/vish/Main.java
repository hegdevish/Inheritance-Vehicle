package com.vish;

public class Main {

    public static void main(String[] args) {
	// Code for changing gears and velocity of Audi Quattro
        Quattro quattro = new Quattro(24);
        quattro.steer(45);
        quattro.accelerate(70);
        quattro.steer(-35);
        quattro.accelerate(-65);
    }
}
