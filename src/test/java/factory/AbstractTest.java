package factory;

import factory.abstracts.Application;
import factory.abstracts.furniture.ModernFurniture;
import factory.abstracts.furniture.VictorianFurniture;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractTest {

    @Test
    @DisplayName("Victorian furniture")
    void victorian(){
        Application app = new Application(new VictorianFurniture());

        assertAll(
                () ->assertEquals( app.Chair().sitOn(), 1),
                () -> assertEquals(app.Sofa().sitOn(),0)
        );
    }

    @Test
    @DisplayName("Modern furniture")
    void modern(){
        Application app = new Application(new ModernFurniture());

        assertAll(
                () ->assertEquals( app.Chair().sitOn(), 3),
                () -> assertEquals(app.Sofa().sitOn(),2)
        );
    }
}