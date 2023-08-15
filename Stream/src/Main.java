import java.util.ArrayList;
import java.util.Comparator;
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

        // Question 2: Using the Stream API, how can you find the product with the highest price?
        Comparator<Product> maxProduct = (firstProduct,secondProduct) -> Double.compare(firstProduct.getPrice(),secondProduct.getPrice());
       Product maxPriceProduct =  productList.stream().max(maxProduct).orElse(null);
        System.out.println("product with max price  s" + maxPriceProduct.price);

        double price = productList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toList()).get(0).getPrice();
        System.out.println("max price "  + price);

        /** Question: You have a list of Product objects, each containing a name and a price.
         How can you use the Stream API to find the names of the top N products with the highest prices? */

       List<String> names =  productList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).map(name-> name.getName()).limit(2).collect(Collectors.toList());
        System.out.println(names.toString());

      /*
            Question: You have a list of Product objects, each containing a name and a price.
             How can you use the Stream API to calculate the total price of all products whose names contain the letter "a"?
         */
        double a = productList.stream().filter(product -> product.getName().contains("a")).mapToDouble(product -> product.getPrice()).sum();
        System.out.println(a);



    }
}