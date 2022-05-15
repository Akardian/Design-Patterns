package factory.transport;

import factory.Transport;

public class Truck implements Transport {

    @Override
    public int deliver() {
        System.out.println("Deliver goods with a Truck!");
        return 0;
    }
}
