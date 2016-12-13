package lambdainaction.chap10;

import java.util.*;

/**
 * Created by lsg on 2016/12/13.
 * surface ADD
 */
public class CollectorIntroduce {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green",150)
        ,new Apple("green",150),
                new Apple("yellow",290));

Optional.ofNullable(groupByFunction(list)).ifPresent(System.out::println);
    }
    private static Map<String,List<Apple>> groupByFunction(List<Apple> apples){
        Map<String,List<Apple>> map = new HashMap<>();
        apples.stream().forEach(a -> {
            List<Apple> colorList = Optional.ofNullable(map.get(a.getColor())).orElseGet(() -> {
                List<Apple> list = new ArrayList<>();
                map.put(a.getColor(), list);
                return list;
            });colorList.add(a);

        });
        return map;
    }
}
