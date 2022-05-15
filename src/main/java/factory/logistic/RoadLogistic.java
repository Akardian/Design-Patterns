package factory.logistic;

import factory.Logistics;
import factory.Transport;
import factory.transport.Truck;

public class RoadLogistic extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
