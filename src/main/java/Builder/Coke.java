package Builder;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 5.0f;
    }
    @Override
    public String name() {
        return "Builder.Coke Cola";
    }
}
