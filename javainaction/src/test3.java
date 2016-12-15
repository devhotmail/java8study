import lambdainaction.chap10.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by gaolei on 2016/12/12.
 * t3.1
 * surface update test3
 * surface 3.2
 * surface 3.3
 *mac 3.4
 */
public class test3 {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        Comparator<Apple> c = Comparator.comparing(Apple::getWeight);


        List<String> str = Arrays.asList("a","b","A","B");
        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        inventory.sort(c);
        System.out.println();
        /*error List<Integer> int1 = Arrays.asList(new Integer(4),new Integer(2),new Integer(1));
        int1.sort((s1, s2) -> s1.compare(s2));*/
       /* Function<String,Apple>
        Runnable c1 = () -> System.out.println("ccccc");
        c1.run();*/
       /* List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

        Consumer<Apple> appleConsumer = (Apple a) -> {
            System.out.println(a.getWeight());
        };

        System.out.println(appleConsumer);
        List<Apple> greenApples =
                filter(inventory, (Apple a) -> "green".equals(a.getColor()));*/


    }

    interface ApplePredicate{
        public boolean test(Apple a);
    }
        public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
            List<Apple> result = new ArrayList<>();
            for(Apple apple : inventory){
                if(p.test(apple)){
                    result.add(apple);
                }
            }
            return result;
        }
}
