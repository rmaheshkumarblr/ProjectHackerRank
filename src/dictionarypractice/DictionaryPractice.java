package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maheshkumar on 1/10/16.
 */
public class DictionaryPractice
{
    public static void main(String[] args)
    {
        //English to Spanish Dictionary

        // < Key Type, Value Type >
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miércoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sábado");
        englSpanDictionary.put("Sunday","Domingo");

        //Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        //Print out all keys
        System.out.println(englSpanDictionary.keySet());
        //Print out all values
        System.out.println(englSpanDictionary.values());
        //Print out size
        System.out.println(englSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Ham", false);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Butter",Boolean.FALSE);
        shoppingList.put("Egg",true);

        System.out.println(shoppingList.keySet());
        System.out.println(shoppingList.values());

        //Key - Value Paris Print Out
        System.out.println(shoppingList.toString());

        //Remove an element from dictionary
        shoppingList.remove("Egg");
        System.out.println(shoppingList.toString());

        //Change the value
        shoppingList.replace("Butter",Boolean.TRUE);
        System.out.println(shoppingList.toString());

        //Print key and value of a single element
        System.out.println(shoppingList.get("Butter").toString());
        //Clear the dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        //Is empty ?
        System.out.println(shoppingList.isEmpty());


    }
}
