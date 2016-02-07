package animal;

import java.util.Objects;

/**
 * Created by maheshkumar on 12 January 2016.
 */


//public class Animal
//Converting to abstract class

public abstract class Animal
{
    private int age;

    public Animal(int age)
    {
        this.age = age ;
        System.out.println("An animal has been created!");
    }

    public void doSomething(String thing)
    {
        System.out.println("I'm doing " + thing);
    }
    //Overriding methods

    public void sleep()
    {
        System.out.println("An animal is sleeping");
    }

//    public void test()
//    {
//        System.out.println("Testing what happens");
//    }


//    public void eat()
//    {
//        System.out.println("An animal is eating");
//    }

    //Changing to abstract method ( basic necessity for abstract class )
    public abstract void eat();

    public int getAge()
    {
        return this.age;
    }

    public static void main(String[] args)
    {
        //When abstracted you cannot call the super class directly.
        //Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat(7);
        //Make the age private so that they cannot be accessed directly by the instance
        //System.out.println(d.age);
        //Optimal way is to create a getter
        System.out.println(d.getAge());
        d.ruff();
        c.meow();
        //System.out.println(c.age);
//        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        c.sleep();
        d.sleep();

        //Casting
        Object dog = new Dog();
        //dog has properties of object but can't use the methods/variables of the Dog Class
        Dog realDog = (Dog) dog;
        //Since we have casted that it is of the form (Dog), realDog has the property of both the object and the dog class


        Object str = "est";
//        String realS ;
//        realS has ony the property of String in this case.
//        String realS = (String) str;
//        realS has propery of both the object and the string.
//        realS.getBytes();

        //What happens if...
        //Animal o = new Dog();
        //Compiler won't complain because the dog is an animal. The object won't have access to child class

        //What happens when...
        Dog doggy = new Dog();
        if ( doggy instanceof Animal )
        {
            Animal animal = (Animal) doggy;
//            animal.test();
            //Note: Although we typecast to type animal we don't lose the essence of the dog.
            //It does not matter what doggy was before, we just now gurantee, animal is going to have all the animal methods since we casted it to animal. Overridden methods are preserved in casting.

            animal.sleep();
        }
        doggy.sleep();


    }
}
