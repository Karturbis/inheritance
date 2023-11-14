package inheritance;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose what you want to do,\nto create a new kangoroo, ernter 'k': ");

        String option = input.nextLine();

        if(option.toLowerCase().equals("k")){

            System.out.println("Please enter the name of the kangoroo");
            String name = input.nextLine();

            System.out.println("Please enter the age of the kangoroo");
            int age = input.nextInt();

            System.out.println("Please enter the weight of the kangoroo");
            int weight = input.nextInt();

            Kangoroo kangoroo = new Kangoroo(weight, age, name);

            kangoroo.run();
        }

        input.close();
        
    }

    
}
