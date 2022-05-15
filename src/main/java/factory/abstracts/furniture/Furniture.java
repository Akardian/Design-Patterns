package factory.abstracts.furniture;

import factory.abstracts.products.chair.Chair;
import factory.abstracts.products.sofa.Sofa;

public interface Furniture {

    Chair createChair();
    Sofa createSofa();
}
