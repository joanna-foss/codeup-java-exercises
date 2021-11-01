import java.util.Arrays;

public class ArraysExercises {
    public static String addPerson(String[] array, String person){
        String[] copyOf = Arrays.copyOf(array, array.length + 1);
        copyOf[copyOf.length - 1] = person;
        return Arrays.toString(copyOf);
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); //this returns the object's location in memory. Must use toString to get the actual array value.
        Person person1 = new Person("Jimmy");
        Person person2 = new Person("Caroline");
        Person person3 = new Person("Pete");

        String person1name = person1.getName();
        String person2name = person2.getName();
        String person3name = person3.getName();

        String[] people = {person1name, person2name, person3name};
        System.out.println(Arrays.toString(people));

        System.out.println(addPerson(people, "Bianca"));

//        String firstPerson = Arrays.toString(new String[]{people[0]});
//        System.out.println(firstPerson);

        //{Person person1 = new Person("John"), Person person2 = new Person("whatever")}
    }
}
