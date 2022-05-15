package factory.method.logistic;

import factory.method.Logistics;
import factory.method.Transport;
import factory.method.transport.Ship;

public class SeaLogistic extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
