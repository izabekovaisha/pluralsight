package com.pluralsight.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        /*List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                matchingPeople.add(person);
            }
        }*/

        List<Person> matchingPeople = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) ||
                        person.getLastName().equalsIgnoreCase(searchName))
                .collect(Collectors.toCollection(ArrayList::new));


        System.out.println("People with matching name:");
        for (Person person : matchingPeople) {
            System.out.println(person.getFirstName() + " " + person.getLastName());

        }

        OptionalDouble averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average();
        if (averageAge.isPresent()) {
            System.out.println("Average age: " + averageAge.getAsDouble());
        } else {
            System.out.println("No people in the list.");
        }

        OptionalInt oldestAge = people.stream()
                .mapToInt(Person::getAge)
                .max();
        if (oldestAge.isPresent()) {
            System.out.println("Oldest person's age: " + oldestAge.getAsInt());
        } else {
            System.out.println("No people in the list.");
        }

        OptionalInt youngestAge = people.stream()
                .mapToInt(Person::getAge)
                .min();
        if (youngestAge.isPresent()) {
            System.out.println("Youngest person's age: " + youngestAge.getAsInt());
        } else {
            System.out.println("No people in the list.");
        }

        /*double averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);*/

        /*int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);*/

        /*int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);*/
    }

    private static List<Person> createPeopleList() {
       return Arrays.asList(
        new Person("John", "Doe", 25));
        new Person("Jane", "Smith", 30));
        new Person("Michael", "Johnson", 35));
       new Person("Emily", "Brown", 22));
        new Person("David", "Miller", 40));
        new Person("Sarah", "Davis", 28));
        people.add(new Person("Daniel", "Anderson", 33));
        people.add(new Person("Jessica", "Wilson", 27));
        people.add(new Person("Matthew", "Martinez", 31));
        people.add(new Person("Olivia", "Taylor", 29));
        );
    }
}
    /*private static double calculateAverageAge(List<Person> people) {
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return (double) totalAge / people.size();
    }*/



    /*private static int findOldestAge(List<Person> people) {
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }

    private static int findYoungestAge(List<Person> people) {
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }
}*/