package AbstractFactory;

import AbstractFactory.Factory.ElfFactory;
import AbstractFactory.Factory.IAbstractFactory;
import AbstractFactory.Factory.OrcFactory;

public class Demo {
    public static void main(String[] args) {
        IAbstractFactory abstractFactoryOrc = new OrcFactory();
        Client application = new Client(abstractFactoryOrc);
        application.Race();
        application.buildCity();
        application.RaceHouse();
        System.out.println("==========================================");

        IAbstractFactory abstractFactoryElf = new ElfFactory();
        Client elf = new Client(abstractFactoryElf);
        elf.Race();
        elf.buildCity();
        elf.RaceHouse();
    }
}
