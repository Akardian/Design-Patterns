package factory.abstracts.furniture;

import factory.abstracts.products.chair.Chair;
import factory.abstracts.products.chair.VictorianChair;
import factory.abstracts.products.sofa.Sofa;
import factory.abstracts.products.sofa.VictorianSofa;

public class VictorianFurniture implements Furniture{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
