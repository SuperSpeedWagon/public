public abstract class Beverage {
    protected Beverage b;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
