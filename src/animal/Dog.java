package animal;

/**
 * Created by maheshkumar on 12 January 2016.
 */
public class Dog extends Animal
{
    public Dog()
    {
        super(15); // Referencing the constructor -- public Animal(int age)
        System.out.println("A dog has been created.");
    }

    //Since there is an abstract method implemented in the super class, It is compulsory to implement abstract class here in the subclass or it must have an abstract method too..
    //Option 1
    //public abstract void eat()
    //Option 2
    public void eat()
    {
        System.out.println("A dog is eating");
    }

    public void sleep()
    {
        System.out.println("A dog is sleeping");
    }

    public void test()
    {
        System.out.println("Testing what happens");
    }


    public void ruff()
    {
        System.out.println("The dog says ruff");
    }

    public void run()
    {
        System.out.println("A dog is running");
    }

}
