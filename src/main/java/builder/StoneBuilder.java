package builder;

public class StoneBuilder implements HouseBuilder{
    private StoneHouse house;

    public StoneBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        house = new StoneHouse();
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

    public StoneHouse getResult(){
        StoneHouse house = this.house;
        this.reset();
        return house;
    }
}
