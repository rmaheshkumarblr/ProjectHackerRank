package animal;

/**
 * Created by maheshkumar on 12 January 2016.
 */
public class Cat extends Animal
{
    public Cat(int age)
    {
        super(age);
        System.out.println("A cat has been created");
    }

    public void eat()
    {
        System.out.println("A cat is eating");
    }

    public void meow()
    {
        System.out.println("A cat meows!");
    }

    public void prance()
    {
        System.out.println("A cat is prancing");
    }
}
