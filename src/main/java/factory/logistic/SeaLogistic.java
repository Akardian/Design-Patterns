package factory.logistic;

import factory.Logistics;
import factory.Transport;
import factory.transport.Ship;

public class SeaLogistic extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
