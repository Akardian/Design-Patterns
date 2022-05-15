package factory.abstracts.products.chair;

public class VictorianChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public int sitOn() {
        System.out.println("Sit on victorian chair");
        return 1;
    }
}
