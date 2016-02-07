package user;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by maheshkumar on 28 January 2016.
 */
public class User
{
    String username;
    String password;
    int age;
    //Set is like an interface can't initialize directly
    Set<Integer> orderIDs;

    public User(String customeUserName, String customPassword , int customAge, Set<Integer> orderIDs)
    {
        this.username = customeUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

    public static void main(String[] args)
    {
        Set a = new HashSet();
        a.add(1212);
        User mahesh = new User("rmaheshkumarblr","password",10,a);
    }
}
