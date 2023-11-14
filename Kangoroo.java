package inheritance;

import java.util.Scanner;

public class Kangoroo extends Land_Animal
{   
    public Kangoroo(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the kangoroo");
        this.name = input.nextLine();

        System.out.println("Please enter the age of the kangoroo");
        this.age = input.nextInt();

        System.out.println("Please enter the weight of the kangoroo");
        this.weight = input.nextInt();
        
        input.close();

    this.legs = 2;
    this.hunger = 0;
    }
    
}