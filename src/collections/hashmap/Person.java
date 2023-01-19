package collections.hashmap;

import java.util.Objects;

public class Person {

    private String cnp;
    private String name;


    public Person(){

    }

    public Person(String cnp) {
        this.cnp = cnp;
    }

    public Person(String cnp, String name) {
        this.cnp = cnp;
        this.name = name;

    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
//         System.out.println("In equals method for person: " + this.toString());
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
       Person person = (Person) o;
//        return Objects.equals(this.cnp, person.cnp);
        return this.cnp.equals(person.cnp);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(this.cnp);
        System.out.println("In hash method for person: " + this.toString() + ", hash: " + hash);
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cnp='" + cnp + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
