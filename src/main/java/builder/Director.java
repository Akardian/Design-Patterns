package builder;

public class Director {
    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(HouseBuilder builder){
        this.builder = builder;
    }

    public void makeHouse(){
        builder.reset();

        builder.buildWalls();
        builder.buildRoof();
        builder.buildWindows();
        builder.buildDoors();
        builder.buildGarage();
    }
}
