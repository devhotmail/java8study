package lambdainaction.chap10;

/**
 * Created by lsg on 2016/12/13.
 */
public class Apple {
        String color;
        int weight;

    public Apple( int weight,String color) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.getColor();
    }
}
