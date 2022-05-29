package builder.builder;

import builder.parts.ControlPanel;
import builder.parts.Engine;

public interface IBuilder {
    void setNumberPassengers(int passengers);
    void setEngine(Engine engine);
    void setControlPanel(ControlPanel controlPanel);
    void setFuelTank(double fuelTank);
}
