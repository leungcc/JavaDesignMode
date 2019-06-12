public class Milk extends Decorator {
    private String description = "加了牛奶！";
    private Beverage beverage = null;
    private int price = 20; //牛奶价钱

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + '\n' +description ;
    }

    public double getPrice() {
        return beverage.getPrice() + price;
    }
}

