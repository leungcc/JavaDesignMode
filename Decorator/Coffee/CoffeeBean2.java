public class CoffeeBean2 implements Beverage{

    @Override
    public String getDescription() {
        return "第二种咖啡豆！";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
