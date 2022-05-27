package AbstractFactory.Factory;

import AbstractFactory.Products.IRace;
import AbstractFactory.Products.IRaceCity;
import AbstractFactory.Products.IRaceHouse;

public interface IAbstractFactory {
    IRace createRace();
    IRaceCity createRaceCity();
    IRaceHouse createRaceHouse();
}
