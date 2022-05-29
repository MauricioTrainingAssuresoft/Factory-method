package builder.parts;

public class ControlPanel {
    private double version;
    private String type;

    public ControlPanel(double version, String type) {
        this.version = version;
        this.type = type;
    }

    public double getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }
}
