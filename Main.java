package inheritance;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Kangoroo kangoroo = null;

        ArrayList<String> commands = new ArrayList<String>();
        commands.add("'h' for help");
        commands.add("'k' to create a kangoroo");
        commands.add("'r' to run");
        commands.add("'f' to feed");
        commands.add("'p' to print out data");
        commands.add("'q' to quit the program");


        Scanner input = new Scanner(System.in); // opens a scanner so console input can be read.

        String option = "h"; // sets the option to h in at the first run, to display all options

        
        

        while (option.equals("q") == false) {

            switch (option) {

                case "k":
                    kangoroo = new Kangoroo();
                    break;

                case "q":
                    System.exit(0);
                    break;

                case "h":
                    for(String i : commands) {
                        System.out.println("You can press " + i);
                    }
                    break;

                case "r":
                    kang_checker("run");
                    break;

                case "f":
                    if(kangoroo != null){
                        kangoroo.feed();
                    }
                    else{
                        System.out.println("You have to create a kangoroo first.");
                    }
                    break;

                case "p":
                    if(kangoroo != null){
                        kangoroo.print_data();
                    }
                    else{
                        System.out.println("You have to create a kangoroo first.");
                    }
                    break;
                    

                case "":
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
