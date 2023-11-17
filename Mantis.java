package inheritance;

//import inheritance.*;
import java.util.Scanner;

public class Mantis extends Land_Animal {

    public Mantis(){

        Scanner mantScanner = new Scanner(System.in);

        System.out.print("Please enter the name of the mantis\nm> ");
        this.name = mantScanner.nextLine();

        System.out.print("Please enter the age of the mantis\nm> ");
        this.age = mantScanner.nextInt();

        System.out.print("Please enter the weight of the mantis\nm> ");
        this.weight = mantScanner.nextInt();

    this.legs = 6;
    this.hunger = 0;
    }
    // the Scanner mantScanner is not closed on purpose, because otherwise, the scanner in Main.java would not work anymore.
}
