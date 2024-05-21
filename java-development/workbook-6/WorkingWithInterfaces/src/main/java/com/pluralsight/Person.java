package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ", " + age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int lastNameComparison = this.lastName.compareTo(otherPerson.lastName);

        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        int firstNameComparison = this.firstName.compareTo(otherPerson.firstName);

        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return Integer.compare(this.age, otherPerson.age);
    }
}
