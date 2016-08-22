package sortingAlgorithms;

import models.Person;

import java.util.ArrayList;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public ArrayList<Person> sort(ArrayList<Person> persons) {
        for(int i=0; i<persons.size(); i++) {
            for(int j=0; j<persons.size() - 1 - i; j++) {
                if(persons.get(j).getAge() > persons.get(j+1).getAge()) {
                    Person person = persons.remove(j);
                    persons.add(j+1, person);
                }
            }
        }
        return persons;
    }

    @Override
    public String getName() {
        return "BubbleSort";
    }
}