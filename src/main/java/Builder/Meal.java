package Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Builder.Item : " + item.name());
            System.out.print(", Builder.Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
