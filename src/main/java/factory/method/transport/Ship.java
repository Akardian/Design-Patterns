package factory.method.transport;

import factory.method.Transport;

public class Ship implements Transport {

    @Override
    public int deliver() {
        System.out.println("Deliver goods with a Ship!");
        return 1;
    }
}
