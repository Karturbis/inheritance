package inheritance;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        
        System.out.println("This program is written by Karturbis, visit 'https://github.com/karturbis/inheritance'\nfor more info.");
        System.out.println("This is the first working version of the programm, please note, if you create a new animal,\nall animals of the same type will be deleted.");

        Kangoroo kangoroo = null;
        Mantis mantis = null;

        ArrayList<String> commands = new ArrayList<String>();
        commands.add("'h' for help");
        commands.add("'n' to create a animal");
        commands.add("'r' to run");
        commands.add("'j' to jump");
        commands.add("'f' to feed");
        commands.add("'p' to print out data");
        commands.add("'q' to quit the program");


        Scanner input = new Scanner(System.in); // opens a scanner so console input can be read.

        String[] optionStrings = {"h", "none"}; // sets the first option to h at the first run, to display all options

        while (optionStrings[0].equals("q") == false) {

            switch (optionStrings[1]) {

                case "m":
                case "mantis":
                    switch (optionStrings[0]) {
                        case "n":
                        case "new":
                        case "spawn":
                            mantis = new Mantis();
                            break;
                        case "r":
                        case "run":
                            if(mantis != null){
                                mantis.run();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a mantis first.");
                            }
                            break;
                        
                        case "j":
                        case "jump":
                            if(mantis != null){
                                mantis.jump();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a mantis first.");
                            }
                            break;
                        
                        case "f":
                        case "feed":
                            if(mantis != null){
                                mantis.feed();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a mantis first.");
                            }
                            break;

                        case "p":
                        case "print":
                        case "data":
                            if(mantis != null){
                                mantis.print_data();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a mantis first.");
                            }
                            break;

                        case "":
                            break;

                        default:
                            System.out.println("The input could not be processed, enter 'h' for help.");
                            break;
                    }
                    break;


                case "k":
                case "kang":
                case "kangoroo":
                    switch (optionStrings[0]) {
                        case "n":
                        case "new":
                        case "spawn":
                            kangoroo = new Kangoroo();
                            break;
                        case "r":
                        case "run":
                            if(kangoroo != null){
                                kangoroo.run();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a kangoroo first.");
                            }
                            break;

                        case "j":
                        case "jump":
                            if(kangoroo != null){
                                kangoroo.jump();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a kangoroo first.");
                            }
                            break;
                        
                        case "f":
                        case "feed":
                            if(kangoroo != null){
                                kangoroo.feed();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a kangoroo first.");
                            }
                            break;

                        case "p":
                        case "print":
                        case "data":
                            if(kangoroo != null){
                                kangoroo.print_data();
                            }
                            else{
                                System.out.println("Please use 'new' command to create a kangoroo first.");
                            }
                            break;

                        case "":
                            break;

                        default:
                            System.out.println("The input could not be processed, enter 'h' for help.");
                            break;
                    }
                    break;

                    case "none":
                        switch (optionStrings[0]) {
                            
                            case "q":
                            case "quit":
                            case "exit":
                                System.exit(0);
                                break;

                            case "h":
                            case "help":
                            case "?":
                                for(String i : commands) {
                                    System.out.println("You can enter " + i);
                                }
                                break;

                            case "":
                                break;

                            default:
                                System.out.println("The input could not be processed, enter 'h' for help.");
                                break;
                        }

            
            }

            System.out.print(">> ");
            String[] optionStringstmp = input.nextLine().toLowerCase().split(" ");
            if(optionStringstmp.length < 2){
                String[] x = {optionStringstmp[0], "none"}; // used help variable x, because curly brackets are only allowed on array initialisations.
                optionStrings = x;
            }
            else{
                optionStrings = optionStringstmp;
            }
        }

        input.close();
    }
}