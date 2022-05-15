package factory.method.logistic;

import factory.method.Logistics;
import factory.method.Transport;
import factory.method.transport.Truck;

public class RoadLogistic extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
