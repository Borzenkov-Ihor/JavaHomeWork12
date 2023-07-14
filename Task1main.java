package HomeWork12;

import java.util.*;

//Создайте иерархию классов как делали на уроке, на подобии - Animal -> Dog ,
// далее создайте две коллекции и заполните из этими классами из вашей иерархи.
// Далее нужно создать метод который будет принимать любой ваш тип коллекции из вашей иерархии
// ( пример - ArrayList с Dog объектами, и Set c Animal объектами)

public class Task1main {
   public static void met(Collection<?> T){
               System.out.println(T);

    }


    public Task1main() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        list.add((Cat) new Cat("Валера"));
        list.add(new Cat("Djo"));
        list.add(new Cat("barsik"));

        Set<Animal> set = new HashSet<>();
        set.add(new Animal("Боб"));
        set.add(new Animal("biba"));
        set.add(new Animal("boba"));

        met(list);
        met(set);
    }
}
