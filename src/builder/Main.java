package builder;

import builder.builder.SpacialRocketBuilder;
import builder.builder.SpacialStationBuilder;
import builder.director.Director;
import builder.products.SpacialRocket;
import builder.products.SpacialStation;

public class Main {
    public static void main(String[] args) {
        SpacialRocketBuilder spacialRocketBuilder = new SpacialRocketBuilder();
        Director buildRocket = new Director(spacialRocketBuilder);
        buildRocket.builderSpacialRocket();
        SpacialRocket spacialRocket = spacialRocketBuilder.getSpacecraft();
        System.out.println("**Building SPACIAL ROCKET**");
        System.out.println("Engine: " + spacialRocket.getEngine());
        System.out.println("Control Panel " + spacialRocket.getControlPanel().getType());
        System.out.println("Control Panel version: " + spacialRocket.getControlPanel().getVersion());
        System.out.println("Tank fuel " + spacialRocket.getFuelTank() + " c.c");
        System.out.println("Number of passenger " + spacialRocket.getNumberPassengers());
        System.out.println("==========================================");

        SpacialStationBuilder spacialStationBuilder = new SpacialStationBuilder();
        Director buildStationSpacial = new Director(spacialStationBuilder);
        buildStationSpacial.builderSpacialStation();
        SpacialStation spacialStation = spacialStationBuilder.getSpacecraft();
        System.out.println("**Building SPACIAL STATION**");
        System.out.println("Engine: " + spacialStation.getEngine());
        System.out.println("Control Panel " + spacialStation.getControlPanel().getType());
        System.out.println("Control Panel version: " + spacialStation.getControlPanel().getVersion());
        System.out.println("Tank fuel " + spacialStation.getFuelTank() + " c.c");
        System.out.println("Number of passenger " + spacialStation.getNumberPassengers());
    }
}
