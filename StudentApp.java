package be.intecbrussel.opdrachten.opdracht3;

import java.util.*;

public class StudentApp {

    public static void main(String[] args) {

        Person student1 = new Person("Muteba Gizenga", "Male", new ArrayList<Integer>());
        Person student2 = new Person("Galahad Woehor", "Male", new ArrayList<Integer>());
        Person student3 = new Person("Fusui Kure", "Female", new ArrayList<Integer>());

        Map<String, Person> studentMap = new HashMap<>();
        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);

        Person muteba = studentMap.get("Muteba Gizenga");
        System.out.println(muteba);
        System.out.println("-----");

        Collection<Person> allStudents = studentMap.values();
        allStudents.forEach(System.out::println);
        System.out.println("-----");

        Set<String> studentNames = studentMap.keySet();
        studentNames.forEach(System.out::println);
        System.out.println("-----");

        studentMap.forEach((key, value) -> System.out.println("Key: " + key + " - " + value));
    }
}
