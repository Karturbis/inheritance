package inheritance;
public class Animal
{
    protected int weight;
    protected int age;
    protected String name;
    protected int hunger;    

    
    public void eat()
    {
        this.hunger -=1;
        if (hunger < 0)
        {
            this.weight += 1;
            this.hunger = 0;
            System.out.println(this.name + " ate too much, do not feed it until it did some sports, otherwise it will get fat");
        }
        else
        {
        if (this.hunger > 80)
        {
            this.weight -=1;
            System.out.println(this.name + " is very hungry, please feed it again!");
        }
        else
        {
            System.out.println(this.name + " is now less hungry");  
        }
        }
    }
    
    public void print_data()
    {
        System.out.println("weight: " + this.weight + "\nage: " + this.age + "\nname: " + this.name + "\nhunger: " + this.hunger);    
    }
}