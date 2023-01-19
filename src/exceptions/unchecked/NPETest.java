package exceptions.unchecked;

import collections.hashmap.Person;

public class NPETest {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setCnp("2345666");

        Person person2 = new Person();
        person2.setName("andreea");

        System.out.println(person2.equals(person1));

    }
}
