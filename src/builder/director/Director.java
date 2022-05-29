package builder.director;

import builder.builder.IBuilder;
import builder.parts.ControlPanel;
import builder.parts.Engine;

public class Director {
    IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public void builderSpacialStation() {
        this.builder.setEngine(Engine.GAS);
        this.builder.setNumberPassengers(10);
        this.builder.setControlPanel(new ControlPanel(1.1, "Remote"));
        this.builder.setFuelTank(400);
    }

    public void builderSpacialRocket() {
        this.builder.setEngine(Engine.HYDROGEN);
        this.builder.setNumberPassengers(6);
        this.builder.setControlPanel(new ControlPanel(2.0, "Physical"));
        this.builder.setFuelTank(200);
    }
}
