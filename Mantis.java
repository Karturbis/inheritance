//package inheritance;

import inheritance.*;
import java.util.Scanner;

public class Mantis extends Land_Animal {

    public Mantis(){

        Scanner mantScanner = new Scanner(System.in);

        System.out.print("Please enter the name of the mantis\nk> ");
        this.name = mantScanner.nextLine();

        System.out.print("Please enter the age of the mantis\nk> ");
        this.age = mantScanner.nextInt();

        System.out.print("Please enter the weight of the mantis\nk> ");
        this.weight = mantScanner.nextInt();

    this.legs = 6;
    this.hunger = 0;
    }
    
}
