package inheritance;

import java.util.Scanner;

public class Kangoroo extends Land_Animal
{   
    public Kangoroo(){

        Scanner kangScanner = new Scanner(System.in);

        System.out.println("Please enter the name of the kangoroo");
        this.name = kangScanner.nextLine();

        System.out.println("Please enter the age of the kangoroo");
        this.age = kangScanner.nextInt();

        System.out.println("Please enter the weight of the kangoroo");
        this.weight = kangScanner.nextInt();

    this.legs = 2;
    this.hunger = 0;
    }
    
}