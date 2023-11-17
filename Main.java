package inheritance;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Kangoroo kangoroo = null;
        Mantis mantis = null;        

        String ckf = "You have to create a kangoroo first."; // ckf stands for create knagoroo first

        ArrayList<String> commands = new ArrayList<String>();
        commands.add("'h' for help");
        commands.add("'n' to create a animal");
        commands.add("'r' to run");
        commands.add("'f' to feed");
        commands.add("'p' to print out data");
        commands.add("'q' to quit the program");


        Scanner input = new Scanner(System.in); // opens a scanner so console input can be read.

        String[] optionStrings = {"h"}; // sets the option to h in at the first run, to display all options

        while (optionStrings[0].equals("q") == false) {

            switch (optionStrings[0]) {

                case "n":
                case "new":
                case "animal":
                    spawner(optionStrings[1], kangoroo, mantis);
                    break;

                case "q":
                case "quit":
                case "exit":
                    System.exit(0);
                    break;

                case "h":
                case "help":
                case "?":
                    for(String i : commands) {
                        System.out.println("You can press " + i);
                    }
                    break;

                case "r":
                case "run":
                    if(kangoroo != null){
                        kangoroo.run();
                    }
                    else{
                        System.out.println(ckf);
                    }
                    break;
                    
                case "f":
                case "feed":
                    if(kangoroo != null){
                        kangoroo.feed();
                    }
                    else{
                        System.out.println(ckf);
                    }
                    break;

                case "p":
                case "print":
                case "data":
                    if(kangoroo != null){
                        kangoroo.print_data();
                    }
                    else{
                        System.out.println(ckf);
                    }
                    break;
                    

                case "":
                    break;

                default:
                    System.out.println("The input could not be processed, please try again.");
                    break;

            }

            System.out.print("> ");
            optionStrings = input.nextLine().toLowerCase().split(" ");

            System.out.println(optionStrings);
            
        }

        input.close();
    }

    public static void spawner(String species, Kangoroo kangoroo, Mantis mantis){
        
        Scanner spawnScanner = new Scanner(System.in);
        
        if(species.equals("kangoroo") || species.equals("kang") || species.equals("k")){
            kangoroo = new Kangoroo();
        }
        else if(species.equals("mantis") || species.equals("m")){
            mantis = new Mantis();
        }
        else{
            System.out.println("Please type in the type of animal you want to create\n: ");
            String input = spawnScanner.nextLine();
            spawner(input, kangoroo, mantis);
        }

    }

}
