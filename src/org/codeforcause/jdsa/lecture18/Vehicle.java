package org.codeforcause.jdsa.lecture18;

public class Vehicle {
    private int doors;
    int wheels;

    public void start() {
        System.out.println("Start like a generic Vehicle");
    }

    Vehicle() {
        this.wheels = 2;
        this.doors = 0;
    }

    Vehicle(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.doors);
    }
}
