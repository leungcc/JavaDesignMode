public class CoffeeBean1 implements Beverage {
    @Override
    public String getDescription() {
        return "第一种咖啡豆！";
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
