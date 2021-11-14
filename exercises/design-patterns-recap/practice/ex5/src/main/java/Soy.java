public class Soy extends Beverage{

    public Soy(Beverage drink){
        b = drink;
    }

    @Override
    public double cost() {
        return b.cost() + 0.15;
    }
}
