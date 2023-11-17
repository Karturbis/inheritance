package inheritance;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Kangoroo kangoroo = null;
        Mantis mantis = null;        

        ArrayList<String> commands = new ArrayList<String>();
        commands.add("'h' for help");
        commands.add("'n' to create a animal");
        commands.add("'r' to run");
        commands.add("'f' to feed");
        commands.add("'p' to print out data");
        commands.add("'q' to quit the program");


        Scanner input = new Scanner(System.in); // opens a scanner so console input can be read.

        String[] optionStrings = {"h"}; // sets the first option to h at the first run, to display all options

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
                    run(optionStrings[1], kangoroo, mantis);
                    break;
                    
                case "f":
                case "feed":
                    feed(optionStrings[1], kangoroo, mantis);
                    break;

                case "p":
                case "print":
                case "data":
                    print(optionStrings[1], kangoroo, mantis);
                    break;
                    

                case "":
                    break;

                default:
                    System.out.println("The input could not be processed, enter 'h' for help.");
                    break;

            }

            System.out.print("> ");
            String[] optionStringstmp = input.nextLine().toLowerCase().split(" ");
            if(optionStringstmp.length < 2){
                String[] x = {optionStringstmp[0], "no_input_given"}; // used help variable x, because curly brackets are only allowed on array initialisations.
                optionStrings = x;
            }
            
        }

        input.close();
    }

    public static void spawner(String species, Kangoroo kangoroo, Mantis mantis){
        
        Scanner spawnScanner = new Scanner(System.in);
        
        if(speciesfunc(species, kangoroo, mantis).equals("kang")){
            kangoroo = new Kangoroo();
        }
        else if(speciesfunc(species, kangoroo, mantis).equals("mantis")){
            mantis = new Mantis();
        }
        else{
            System.out.print("Please specify ether 'kangoroo' or 'mantis'\n>");
            String input = spawnScanner.nextLine().toLowerCase();
            spawner(input, kangoroo, mantis);
        }
    }

    public static void run(String species, Kangoroo kangoroo, Mantis mantis){

        if(speciesfunc(species).equals("kang")  && kangoroo != null){
           kangoroo.run();
        }
        else if(speciesfunc(species).equals("mantis") && mantis != null){
           mantis.run();
        }
    }

    public static void feed(String species, Kangoroo kangoroo, Mantis mantis){

        if(speciesfunc(species).equals("kang")  && kangoroo != null){
           kangoroo.feed();
        }
        else if(speciesfunc(species).equals("mantis" && mantis != null)){
           mantis.feed();
        }
    }

    public static void print(String species, Kangoroo kangoroo, Mantis mantis){

        if(speciesfunc(species).equals("kang")  && kangoroo != null){
           kangoroo.print_data();
        }
        else if(speciesfunc(species).equals("mantis") && mantis != null){
           mantis.print_data();
        }
    }

    public static String speciesfunc(String species){
        if(species.equals("kangoroo") || species.equals("kang") || species.equals("k")){
            return "kang";
        }
        else if(species.equals("mantis") || species.equals("m")){
            return "mantis";
        }
        else{
            return "none";
        }
    }
}
