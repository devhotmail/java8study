package c4;

import java.util.Arrays;
import java.util.List;
/**
 * Created by lsg on 14/12/2016.
 */
public class c4main {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish(" pork", false, 800, Dish.Type.MEAT),
                new Dish(" beef", false, 700, Dish.Type.MEAT),
                new Dish(" chicken", true, 400, Dish.Type.MEAT),
                new Dish(" pizza", false, 550, Dish.Type.OTHER),
                new Dish(" prawns", false, 300, Dish.Type.FISH),
                new Dish(" salmon", false, 450, Dish.Type.FISH) );
     /*   menu.stream().reduce()
                .filter(Dish::isVegetarian)
                .findAny().ifPresent(Dish::getName);*/
//                .collect(toList());
//collect.forEach(System.out::print);
        /*Stream<Dish> stream = menu.stream();
        stream.map(dish -> dish.getName()+" fff ")
                .collect(toList()).forEach(System.out::print);*/
       /* menu.stream()
                .filter(x -> x.getType() == Dish.Type.MEAT)
                .limit(2) .collect(toList());*/

       //////

        /*String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);
        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<String> w1 = words.stream().map(w->w.split("")).flatMap(Arrays::stream)
                .distinct().collect(toList());*/
        System.out.println();
    }
}
