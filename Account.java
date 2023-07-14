package HomeWork12;

import java.lang.reflect.Array;
import java.util.HashMap;

class Account <T>{


   Account (T id, int number) {
       System.out.println(id + " " + number);
    }

    public static void main(String[] args) {
    new Account("gsgsgsgs",11);
    new Account(123, 9);
    new Account( new Array[1], 2);
    new Account( new HashMap<>(), 18);
    }
}
