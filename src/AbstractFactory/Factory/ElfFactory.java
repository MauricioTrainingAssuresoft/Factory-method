package AbstractFactory.Factory;

import AbstractFactory.Products.*;

public class ElfFactory implements IAbstractFactory{
    @Override
    public IRace createRace() {
        return new Elf();
    }

    @Override
    public IRaceCity createRaceCity() {
        return new ElfCity();
    }

    @Override
    public IRaceHouse createRaceHouse() {
        return new ElfHouse();
    }
}
