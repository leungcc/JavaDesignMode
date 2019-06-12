public class Mocha extends Decorator {
    private String description = "加了摩卡！";
    private Beverage beverage = null;
    private int price = 36; //摩卡价钱

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + '\n' +description ;
    }

    public double getPrice() {
        return beverage.getPrice() + price;
    }
}

