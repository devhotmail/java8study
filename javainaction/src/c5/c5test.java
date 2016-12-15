package c5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by lsg on 14/12/2016.
 */
public class c5test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 2, 3, 4, 5);
        //Optional<Integer> min = numbers.stream() .reduce(Integer::min);
        Optional<Integer> min = numbers.stream().re .reduce((x,y)->x<y?x:y);

        System.out.println(min);

    }
}
