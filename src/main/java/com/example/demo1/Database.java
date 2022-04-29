package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

class Database {
    private static Database single_instance = null;
    private List<Person> persons = new ArrayList<>();

    private Database() {
        makeData();
    }

    public void makeData() {
        persons.add(new Person("John", "555-555-5555"));
        persons.add(new Person("Mary", "555-555-5556"));
        persons.add(new Person("Bob", "555-555-5557"));
        persons.add(new Person("Jane", "555-555-5558"));
        persons.add(new Person("Joe", "555-555-5559"));
        persons.add(new Person("Jack", "555-555-5560"));
        persons.add(new Person("Jill", "555-555-5561"));
        persons.add(new Person("Anna", "555-555-5562"));
    }

    public List<Person> getPersonList() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public static Database getInstance() {
        if (single_instance == null)
            single_instance = new Database();
        return single_instance;
    }
}
