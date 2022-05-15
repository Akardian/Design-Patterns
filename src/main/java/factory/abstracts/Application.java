package factory.abstracts;

import factory.abstracts.furniture.Furniture;
import factory.abstracts.products.chair.Chair;
import factory.abstracts.products.sofa.Sofa;

public class Application {
    private Chair chair;
    private Sofa sofa;

    public Application(Furniture factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public Chair Chair() {
        return chair;
    }

    public Sofa Sofa(){
        return sofa;
    }
}
