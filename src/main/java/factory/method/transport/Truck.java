package factory.method.transport;

import factory.method.Transport;

public class Truck implements Transport {

    @Override
    public int deliver() {
        System.out.println("Deliver goods with a Truck!");
        return 0;
    }
}
