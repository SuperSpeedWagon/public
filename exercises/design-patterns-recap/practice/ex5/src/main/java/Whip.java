public class Whip extends Beverage{

    public Whip(Beverage drink){
        b = drink;
    }

    @Override
    public double cost() {
        return b.cost() + 0.10;
    }
}
