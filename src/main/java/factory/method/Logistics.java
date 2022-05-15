package factory.method;

public abstract class Logistics {

    public int planDelivery() {
        Transport transport = createTransport();

        return transport.deliver();
    }

    public abstract Transport createTransport();
}
