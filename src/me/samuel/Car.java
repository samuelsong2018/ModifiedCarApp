package me.samuel;

public class Car extends Vehicle {

    //This is the display method, using the same variables from the Vehicle class.
    public String display(){
        return String.format("This is a %s %s.", this.getMake(), this.getModel());
    }
}