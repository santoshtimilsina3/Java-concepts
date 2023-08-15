import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


        //Write code using the Stream API to filter the productList and get a list of products with a price greater than $1000?
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1200));
        productList.add(new Product("Phone", 800));
        productList.add(new Product("Tablet", 500));
        productList.add(new Product("icma", 1500));

        List<Product> product1000price = productList.stream().filter(product -> product.price >1000).collect(Collectors.toList());
        product1000price.forEach(product -> System.out.println(product.price));


    }
}