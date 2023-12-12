import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person [] persons = new Person[3];
        persons[0] = new Person("Ivan1");
        persons[1] = new Person("Ivan2");
        persons[2] = new Person("Ivan3");
        Person[] newPeople = addPerson(persons, new Person("Ivan4"));

        for (Person person: newPeople){
            person.sayHello();
        }
    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPerson = Arrays.copyOf(people, people.length + 1);
        newPerson[people.length] = person;
        return newPerson;
    }

}
