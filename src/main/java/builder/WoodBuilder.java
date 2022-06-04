package builder;

public class WoodBuilder implements HouseBuilder{
    private WoodHouse house;

    public WoodBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        house = new WoodHouse();
    }

    @Override
    public void buildWalls(){
        house.setWalls(4);
    }

    @Override
    public void buildDoors(){
        house.setDoors(1);
    }

    @Override
    public void buildWindows(){
        house.setWindows(6);
    }

    @Override
    public void buildRoof(){
        house.setRoof(1);
    }

    @Override
    public void buildGarage(){
        house.setGarage(1);
    }

    public WoodHouse getResult(){
        WoodHouse house = this.house;
        this.reset();
        return house;
    }
}
