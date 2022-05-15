package factory;

import factory.method.Logistics;
import factory.method.logistic.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MethodTest {

    @Test
    @DisplayName("TruckDelivery")
    void truckDelivery(){
        Logistics truckLogistic = new RoadLogistic();


        assertEquals(truckLogistic.planDelivery(),0);
    }

    @Test
    @DisplayName("ShipDelivery")
    void ShipDelivery(){
        Logistics shipLogistic = new SeaLogistic();

        assertEquals(shipLogistic.planDelivery(), 1);
    }
}