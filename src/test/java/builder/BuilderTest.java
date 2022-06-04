package builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    @DisplayName("Build StoneHouse")
    void stoneHouse(){
        StoneBuilder builder = new StoneBuilder();
        Director director = new Director(builder);

        director.makeHouse();
        StoneHouse house = builder.getResult();

        assertAll(
                () ->assertEquals(house.getType(), "Stone"),
                () ->assertEquals(house.getWalls(), 4),
                () -> assertEquals(house.getDoors(),1)
        );
    }

    @Test
    @DisplayName("Build WoodHouse")
    void woodHouse(){
        WoodBuilder builder = new WoodBuilder();
        Director director = new Director(builder);

        director.makeHouse();
        WoodHouse house = builder.getResult();

        assertAll(
                () ->assertEquals(house.getType(), "Wood"),
                () ->assertEquals(house.getWalls(), 4),
                () -> assertEquals(house.getDoors(),1)
        );
    }
}
