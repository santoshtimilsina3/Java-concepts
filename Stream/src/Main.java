import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(5, 12, 3, 8, 20, 7, 15));
       Long finalSum  = integerList.stream().mapToLong(data -> Long.valueOf(data)).sum();
        System.out.println(finalSum);
    }
}