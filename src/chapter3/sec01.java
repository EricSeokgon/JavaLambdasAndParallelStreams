package chapter3;

import java.util.ArrayList;
import java.util.List;

public class sec01 {
    private List<Person> getPersonsLessThan20Years(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() < 20) {
                result.add(person);
            }
        }
        return result;
    }

    private List<Person> getPersonsByAgeRange(List<Person> persons, int from, int to) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= from && person.getAge() <= to) {
                result.add(person);
            }
        }
        return result;
    }

}
