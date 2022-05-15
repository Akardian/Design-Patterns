package factory.abstracts.products.sofa;

public class ModernSofa implements Sofa {

    @Override
    public boolean hasSpace() {
        return false;
    }

    @Override
    public int sitOn() {
        System.out.println("Sit on modern sofa");
        return 2;
    }
}
