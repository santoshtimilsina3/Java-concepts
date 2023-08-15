import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //How would you use the Stream API to find the sum of all integers in the integerList?
        List<Integer> integerList = new ArrayList<>(List.of(5, 12, 3, 8, 20, 7, 15));
       Long finalSum  = integerList.stream().mapToLong(data -> Long.valueOf(data)).sum();
        System.out.println(finalSum);


        //What Stream API operation would you use to find the average age of the personList?

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 28));
        personList.add(new Person("Bob", 35));
        personList.add(new Person("Carol", 22));

        Double average = personList.stream().mapToDouble(data-> Double.parseDouble(String.valueOf(data.age))).average().getAsDouble();
        System.out.println(average);
    }
}