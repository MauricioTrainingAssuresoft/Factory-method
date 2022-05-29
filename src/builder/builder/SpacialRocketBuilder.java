package builder.builder;

import builder.parts.ControlPanel;
import builder.parts.Engine;
import builder.products.SpacialRocket;
import builder.products.SpacialStation;

public class SpacialRocketBuilder implements IBuilder{

    private Engine engine;
    private int numberPassengers;
    private ControlPanel controlPanel;
    private double fuelTank;

    @Override
    public void setNumberPassengers(int passengers) {
        this.numberPassengers = passengers;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    @Override
    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public SpacialRocket getSpacecraft() {
        return new SpacialRocket(this.engine, this.numberPassengers, this.controlPanel, this.fuelTank);
    }
}
