public class SteamedMilk extends Beverage{

    public SteamedMilk(Beverage drink){
        b = drink;
    }

    @Override
    public double cost() {
        return b.cost() + 0.10;
    }
}
