package factory.transport;

import factory.Transport;

public class Ship implements Transport {

    @Override
    public int deliver() {
        System.out.println("Deliver goods with a Ship!");
        return 1;
    }
}
