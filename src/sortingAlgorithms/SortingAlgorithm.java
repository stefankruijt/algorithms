package sortingAlgorithms;

import models.Person;
import java.util.ArrayList;

public interface SortingAlgorithm {
    public ArrayList<Person> sort(ArrayList<Person> persons);
    public String getName();
}
