import lambdainaction.chap10.Apple;

import java.util.List;

import static sun.util.locale.LocaleMatcher.filter;

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
        List<Apple> inventory=new List<Apple>() ;
        List<Apple> redApples =
                filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));

        Thread t = new Thread(() -> System.out.println("Hello worldss"));

    }
}
