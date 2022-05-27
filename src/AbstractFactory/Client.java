package AbstractFactory;

import AbstractFactory.Factory.IAbstractFactory;

public class Client {
    IAbstractFactory abstractFactory;

    public Client(IAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void Race() {
        System.out.println("Create " + abstractFactory.createRace());
    }

    public void RaceHouse(){
        System.out.println("Create " + abstractFactory.createRaceHouse());
    }

    public void buildCity(){
        System.out.println("Create " +  abstractFactory.createRaceCity());
    }
}
