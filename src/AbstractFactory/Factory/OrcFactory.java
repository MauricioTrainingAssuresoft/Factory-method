package AbstractFactory.Factory;

import AbstractFactory.Products.*;

public class OrcFactory implements IAbstractFactory{
    @Override
    public IRace createRace() {
        return new Orc();
    }

    @Override
    public IRaceCity createRaceCity() {
        return new OrcCity();
    }

    @Override
    public IRaceHouse createRaceHouse() {
        return new OrcHouse();
    }
}
