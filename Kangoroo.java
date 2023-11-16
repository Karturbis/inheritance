package inheritance;

import java.util.Scanner;

public class Kangoroo extends Land_Animal
{   
    public Kangoroo(){

        Scanner kangScanner = new Scanner(System.in);

        System.out.print("Please enter the name of the kangoroo\n> ");
        this.name = kangScanner.nextLine();

        System.out.print("Please enter the age of the kangoroo\n> ");
        this.age = kangScanner.nextInt();

        System.out.print("Please enter the weight of the kangoroo\n> ");
        this.weight = kangScanner.nextInt();

    this.legs = 2;
    this.hunger = 0;
    }
    // the Scanner kangScanner is not closed on purpose, because otherwise, the scanner in Main.java would not work anymore.
}