package main.java.com.qa;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Integer answer;
        Car car = new Car("Ford", "Focus", 20, 93000);
        do {
            System.out.println("What would you like to do?\n 1 = Go for a drive\n2 = Repair your car\n3 = End");
            Mechanic daisy = new Mechanic( Math.round((Math.random()*10)) );
            answer = scan.nextInt();
            scan.nextLine();
            if (answer == 1) {
                car.startEngine(scan);
            } else if (answer == 2) {
                Double cost = daisy.fixCar(car);
                System.out.println("The total cost is: £" + cost);
            } else if (answer == 3) {
                System.out.println("OK, goodbye!");
            } else {
                System.out.println("That was not a valid input, please try again");
            }
        } while (answer != 3);
        scan.close();
    }
}
