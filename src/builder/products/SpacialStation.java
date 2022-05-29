package builder.products;

import builder.parts.ControlPanel;
import builder.parts.Engine;

public class SpacialStation {
    private Engine engine;
    private int numberPassengers;
    private ControlPanel controlPanel;
    private double fuelTank = 0;

    public SpacialStation(Engine engine, int numberPassengers, ControlPanel controlPanel, double fuelTank) {
        this.engine = engine;
        this.numberPassengers = numberPassengers;
        this.controlPanel = controlPanel;
        this.fuelTank = fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public double getFuelTank() {
        return fuelTank;
    }
}


