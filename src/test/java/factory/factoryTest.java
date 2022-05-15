package factory;

import factory.logistic.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class factoryTest {

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