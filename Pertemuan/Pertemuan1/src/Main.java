import id.ac.unmul.star.PrintHello;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        PrintHello.sayHello("Hermawan");
        // Integer varInteger = 10;
        // boolean testVar = (true & true);

        PrintHello ph = new PrintHello();
        ph.sayHello("Trigusni");


        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        int count = 0;
        while (count < 5)
        {
            System.out.println(count);
            count++;
        }
        
        List<String> beef = new ArrayList<>();
        beef.forEach();
    }
}