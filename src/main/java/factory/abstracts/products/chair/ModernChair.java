package factory.abstracts.products.chair;

public class ModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public int sitOn() {
        System.out.println("Sit on modern Chair");
        return 3;
    }
}
