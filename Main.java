package inheritance;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Kangoroo kangoroo = null;

        Scanner input = new Scanner(System.in); // opens a scanner so console input can be read.

        System.out.print("Choose what you want to do,your options are:\ncreate a new Kangoroo by entering 'k'\nor quit by entering 'q'\n> ");

        String option = input.nextLine(); // reads the input and saves it into option

        
        

        while (option.equals("q") == false) {

            switch (option) {

                case "k":
                    kangoroo = new Kangoroo();
                    break;

                case "q":
                    System.exit(0);
                    break;

                case "h":
                    System.out.println("help");
                    break;

                case "r":

                    if(kangoroo != null){ // checks if a kangoroo has been created
                        kangoroo.run();
                    }
                    else{
                        System.out.println("You have to create a kangoroo first.");
                    }
                    break;

                default:
                    System.out.println("The input could not be processed, please try again.");
                    break;

            }

            System.out.print("> ");
            option = input.nextLine();
            
        }

        input.close();
    }
}
