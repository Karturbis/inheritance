package inheritance;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose what you want to do,your options are:\ncreate a new Kangoroo by entering 'k'\nor quit by entering 'q'");

        String option = input.nextLine();

        
        

        while (true) {

            switch (option) {

            case "k":
                Kangoroo kangoroo = new Kangoroo();
                break;

            case "q":
                System.exit(0);

            case "h":
                System.out.println("");
                break;

            default:
                System.out.println("The input could not be processed, please try again.");
                break;
            
        }

        input.close();
        
    }

}

}
