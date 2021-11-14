public class Mocha extends Beverage {

    public Mocha(Beverage drink){
        b = drink;
    }

    @Override
    public double cost() {
        return b.cost() + 0.20;
    }
}
