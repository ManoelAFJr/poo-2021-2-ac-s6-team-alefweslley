import java.util.ArrayList;
import java.util.List;

public class Bm8 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        int i = 1;
        int result = 0;
        
        while (true) {
            result = i++ * 3;
            if (result > 100) {
                break;
            }
            numbers.add(result);
        }

        System.out.println(numbers);
    }
}
