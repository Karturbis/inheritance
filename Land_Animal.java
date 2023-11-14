package inheritance;


public class Land_Animal extends Animal
{
    protected int legs;
    
    protected void run()
    {
        if (this.hunger <=100)
        {
            System.out.println(this.name + " ran!");
            this.hunger +=1;
        }
        else
        {
            System.out.println(this.name + " is too hungry to run :(");
        }
    }
    
    public void jump()
    {
        if (this.hunger >=100)
        {
            System.out.println(this.name + " jumped!");
            this.hunger +=1;
        }
        else
        {
            System.out.println(this.name + " is too hungry to jump :(");
        }
        
    }
}