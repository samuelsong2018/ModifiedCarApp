package me.samuel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	ArrayList<Car> cars = new ArrayList<>();

	while(true){
	    //This part prompts user for input.
        System.out.println("Enter a make and model: ");

        //c is the variable.
        Car c = new Car();
        String make = scan.next();
        c.setMake(make);
        String model = scan.next();
        c.setModel(model);

        //Clear out the buffer.
        scan.nextLine();

        //Add the car to the arrayList.
        cars.add(c);

        System.out.println("Do you want to enter another car? (y/n)");
        if (scan.nextLine().equalsIgnoreCase("n")){
            //'Break' exits while loop.
            break;
        }
    }

    //prints out cars
    for(Car eachCar: cars){
        System.out.println(eachCar.display());
    }
        System.out.println("Goodbye!");
    }
}
