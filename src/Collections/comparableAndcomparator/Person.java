package Collections.comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double height;

    public Person (String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("John", 21, 5.8),
                new Person("Smith", 23, 5.9),
                new Person("Alex", 22, 5.10)
                ));
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
    }
}
