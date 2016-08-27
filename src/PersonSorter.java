import models.Person;
import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.RecursiveSelectionSort;
import sortingAlgorithms.SortingAlgorithm;

import java.util.ArrayList;

public class PersonSorter {

    public static void main(String[] args) {
        new PersonSorter(getPersonTestArrayList());
    }

    public PersonSorter(ArrayList<Person> persons) {
        testAlgorithm(new BubbleSort(), persons, 10000);
        testAlgorithm(new RecursiveSelectionSort(),  persons, 10000);
    }

    public void testAlgorithm(SortingAlgorithm algorithm, ArrayList<Person> testData, int testRuns) {
        long totalTestTime = 0;

        System.out.println("The persons in our list before sorting are: " + testData.toString());
        System.out.println("Tests will use sortingAlgorithm: " + algorithm.getName());

        for(int testRun = 0; testRun < testRuns; testRun++) {
            ArrayList<Person> data = (ArrayList<Person>) testData.clone();

            long startTime = System.nanoTime();
            algorithm.sort(data);
            long estimatedTime = System.nanoTime() - startTime;
            totalTestTime += estimatedTime;
        }

        System.out.println("Algorithm test is completed. Average time to sort: " + totalTestTime/testRuns + " nanoSeconds.");
    }

    private static ArrayList<Person> getPersonTestArrayList() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("a", 1));
        persons.add(new Person("b", 2));
        persons.add(new Person("c", 3));
        persons.add(new Person("d", 4));
        persons.add(new Person("e", 5));
        persons.add(new Person("f", 6));
        persons.add(new Person("g", 7));
        persons.add(new Person("h", 8));
        persons.add(new Person("i", 9));
        persons.add(new Person("j", 10));
        persons.add(new Person("k", 11));
        persons.add(new Person("l", 12));
        persons.add(new Person("m", 13));
        persons.add(new Person("n", 14));
        persons.add(new Person("o", 15));
        persons.add(new Person("p", 16));
        persons.add(new Person("q", 17));
        persons.add(new Person("r", 18));
        persons.add(new Person("s", 19));
        persons.add(new Person("t", 20));
        persons.add(new Person("u", 21));
        persons.add(new Person("v", 22));
        persons.add(new Person("w", 23));
        persons.add(new Person("x", 24));
        persons.add(new Person("y", 25));
        persons.add(new Person("z", 26));
        persons.add(new Person("aa", 26));
        persons.add(new Person("bb", 25));
        persons.add(new Person("cc", 24));
        persons.add(new Person("dd", 23));
        persons.add(new Person("ee", 22));
        persons.add(new Person("ff", 21));
        persons.add(new Person("gg", 20));
        persons.add(new Person("hh", 19));
        persons.add(new Person("ii", 18));
        persons.add(new Person("jj", 17));
        persons.add(new Person("kk", 16));
        persons.add(new Person("ll", 15));
        persons.add(new Person("mm", 14));
        persons.add(new Person("nn", 13));
        persons.add(new Person("oo", 12));
        persons.add(new Person("pp", 11));
        persons.add(new Person("qq", 10));
        persons.add(new Person("rr", 9));
        persons.add(new Person("ss", 8));
        persons.add(new Person("tt", 7));
        persons.add(new Person("uu", 6));
        persons.add(new Person("vv", 5));
        persons.add(new Person("ww", 4));
        persons.add(new Person("xx", 3));
        persons.add(new Person("yy", 2));
        persons.add(new Person("zz", 1));
        persons.add(new Person("aaa", 1));
        persons.add(new Person("bbb", 2));
        persons.add(new Person("ccc", 3));
        persons.add(new Person("ddd", 4));
        persons.add(new Person("eee", 5));
        persons.add(new Person("fff", 6));
        persons.add(new Person("ggg", 7));
        persons.add(new Person("hhh", 8));
        persons.add(new Person("iii", 9));
        persons.add(new Person("jjj", 10));
        persons.add(new Person("kkk", 11));
        persons.add(new Person("lll", 12));
        persons.add(new Person("mmm", 13));
        persons.add(new Person("nnn", 14));
        persons.add(new Person("ooo", 15));
        persons.add(new Person("ppp", 16));
        persons.add(new Person("qqq", 17));
        persons.add(new Person("rrr", 18));
        persons.add(new Person("sss", 19));
        persons.add(new Person("ttt", 20));
        persons.add(new Person("uuu", 21));
        persons.add(new Person("vvv", 22));
        persons.add(new Person("www", 23));
        persons.add(new Person("xxx", 24));
        persons.add(new Person("yyy", 25));
        persons.add(new Person("zzz", 26));
        persons.add(new Person("aaaa", 26));
        persons.add(new Person("bbbb", 25));
        persons.add(new Person("cccc", 24));
        persons.add(new Person("dddd", 23));
        persons.add(new Person("eeee", 22));
        persons.add(new Person("ffff", 21));
        persons.add(new Person("gggg", 20));
        persons.add(new Person("hhhh", 19));
        persons.add(new Person("iiii", 18));
        persons.add(new Person("jjjj", 17));
        persons.add(new Person("kkkk", 16));
        persons.add(new Person("llll", 15));
        persons.add(new Person("mmmm", 14));
        persons.add(new Person("nnnn", 13));
        persons.add(new Person("oooo", 12));
        persons.add(new Person("pppp", 11));
        persons.add(new Person("qqqq", 10));
        persons.add(new Person("rrrr", 9));
        persons.add(new Person("ssss", 8));
        persons.add(new Person("tttt", 7));
        persons.add(new Person("uuuu", 6));
        persons.add(new Person("vvvv", 5));
        persons.add(new Person("wwww", 4));
        persons.add(new Person("xxxx", 3));
        persons.add(new Person("yyyy", 2));
        persons.add(new Person("zzzz", 1));
        return persons;
    }
}