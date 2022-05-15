package factory.abstracts.products.sofa;

public class VictorianSofa implements Sofa {

    @Override
    public boolean hasSpace() {
        return false;
    }

    @Override
    public int sitOn() {
        System.out.println("Sit on victorian sofa");
        return 0;
    }
}
