package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        //structura de tip cheie-valoare
        //key - person, value - job

        HashMap<Person, String> personJobs = new HashMap<>();

        System.out.println("Adding elements to hashmap");
        personJobs.put(new Person("123", "diana"), "programator");
        personJobs.put(new Person("234", "adi"), "analist");
        personJobs.put(new Person("456", "andreea"), "farmacist");
        personJobs.put(new Person("789", "marius"), "sudor");

        personJobs.put(new Person("123", "robert"), "researcher");
        System.out.println("Adding finished.");
        System.out.println();

        System.out.println("Start iterating map");
        for (Map.Entry<Person, String> entry : personJobs.entrySet()) {
            System.out.println("ENTRY: " + entry.getKey() + "=" + entry.getValue() + ", hash: " + entry.hashCode());
        }

        System.out.println("End iteration");


    }
}
