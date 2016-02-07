/**
 * Created by maheshkumar on 1/1/16.
 */
public class Car
{
    //Instance Variables
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Dodge";

    double maxFuel = 16; //Full Tank
    double currentFuel = 8; //Half Tank
    double mpg = 26.4; //Miles per Gallon

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar= 6;

    public Car()
    {

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn )
    {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    // Getters and Setters

    public int getMaxSpeed()
    {
        return this.maxSpeed ;
    }

    public void setMaxSpeed(int newMaxSpeed)
    {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed()
    {
        return this.minSpeed ;
    }

    public double getWeight()
    {
        return this.weight ;
    }

    public boolean getIsTheCarOn()
    {
        return isTheCarOn ;
    }




    //Instance Methods
    public void printVariables()
    {
        System.out.println("This is the maximum speed: " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar()
    {
        condition = 'C';
    }

//    public void upgradeMinSpeed()
//    {
//        minSpeed = maxSpeed ;
//        maxSpeed = maxSpeed + 1;
//    }

    public void upgradeMaxSpeed()
    {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn()
    {
//        numberOfPeopleInCar = numberOfPeopleInCar + 1;
//        numberOfPeopleInCar++;
        if ( numberOfPeopleInCar < maxNumberOfPeopleInCar)
        {
            numberOfPeopleInCar += 1 ;
            System.out.println("Someone got in");
        }
        else
        {
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + numberOfPeopleInCar);
        }

    }

    public void getOut()
    {
        if(numberOfPeopleInCar >= 0)
        {
            numberOfPeopleInCar-- ;
        }
        else
        {
            System.out.println("No one is in the car");
        }
    }

    public double howManyMilesTillOutOfGas()
    {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp()
    {
        return maxFuel * mpg;
    }

    public void turnTheCarOn()
    {
        if(!isTheCarOn)
        {
            isTheCarOn = true ;
        }
        else
        {
            System.out.println("The car is already on!");
        }
    }

    public static void main(String[] args) {
//        Car familyCar = new Car();
//        System.out.println("Family's Car:");
//        familyCar.printVariables();
//        Car aliceCar = familyCar;
//        familyCar.wreckCar();
//        familyCar.upgradeMinSpeed();
//        System.out.println("Alices's Car:");
//        aliceCar.printVariables();


//        Car birthdayPresent = new Car(500, 5000.545, true);
//        System.out.println("Birthday Car v1");
//        birthdayPresent.printVariables();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas()  );
//        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
//        System.out.println("Birthday Car v2");
//        birthdayPresent.printVariables();
//        birthdayPresent.getOut();
//        System.out.println("Birthday Car v3");
//        birthdayPresent.printVariables();

//        System.out.print("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();

        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.printVariables();

    }
}
