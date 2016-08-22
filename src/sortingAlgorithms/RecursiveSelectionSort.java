package sortingAlgorithms;

import models.Person;

import java.util.ArrayList;

public class RecursiveSelectionSort implements SortingAlgorithm {
    @Override
    public ArrayList<Person> sort(ArrayList<Person> persons) {
        ArrayList<Person> result = new ArrayList<>(persons.size());

        result = sortPersons(persons, result);

        return result;
    }

    @Override
    public String getName() {
        return "RecursiveSelectionSort";
    }

    public ArrayList<Person> sortPersons(ArrayList<Person> persons, ArrayList<Person> result) {
        Person youngestPerson = persons.get(0);
        for(int i=1; i<persons.size(); i++) {
            if(persons.get(i).getAge() < youngestPerson.getAge()) {
                youngestPerson = persons.get(i);
            }
        }
        result.add(persons.remove(persons.indexOf(youngestPerson)));

        if(persons.size() > 0) {
            sortPersons(persons, result);
        }
        return result;
    }
}