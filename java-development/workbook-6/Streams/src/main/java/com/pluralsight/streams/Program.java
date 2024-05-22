package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = createPeoplelist();

        System.out.println("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        List<Person> matchingPeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                matchingPeople.add(person);
            }
        }

        System.out.println("People with matching name: ");
        for (Person matchingPerson : matchingPeople) {
            System.out.println(matchingPerson.getFirstName() + " " + matchingPerson.getLastName());
        }

        double averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);

        int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    private static List<Person> createPeoplelist() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Zachary", "Branch", 30));
        people.add(new Person("Elias", "Bass", 18));
        people.add(new Person("Henry", "Pope", 54));
        people.add(new Person("Elroy", "Daugherty", 77));
        people.add(new Person("Sofia", "Branch", 32));
        people.add(new Person("Angela", "Baker", 25));
        people.add(new Person("Isiah", "Norman", 15));
        people.add(new Person("Rocco", "Vargas", 43));
        people.add(new Person("Judy", "Richardson", 64));
        people.add(new Person("Jamie", "Fuentes", 37));

        return people;
    }

    private static double calculateAverageAge(List<Person> people) {
        int totalAge = 0;

        for (Person person : people) {
            totalAge += person.getAge();
        }
        return (double) totalAge / people.size();
    }

    private static int findOldestAge(List<Person> people){
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }
    private static int findYoungestAge(List<Person> people){
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }
}


