package decorator;

import java.util.prefs.Preferences;

public class Name implements IProvider{
    private String name;


    public Name(String name) {
        this.name = name;
    }

    @Override
    public String getName() {

        return this.name;
    }
}
