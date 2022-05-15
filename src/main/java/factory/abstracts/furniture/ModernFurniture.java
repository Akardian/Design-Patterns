package factory.abstracts.furniture;

import factory.abstracts.products.chair.Chair;
import factory.abstracts.products.chair.ModernChair;
import factory.abstracts.products.sofa.ModernSofa;
import factory.abstracts.products.sofa.Sofa;

public class ModernFurniture implements Furniture{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
