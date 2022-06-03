package chainOfResponsability;

import java.util.HashMap;

public class DataEntry {
    HashMap<String,String > dataEntrace = new HashMap<>();

    public DataEntry(HashMap<String, String> dataEntrace) {
        this.dataEntrace = dataEntrace;
    }

    public HashMap<String, String> getDataEntrace() {
        return dataEntrace;
    }

    public String replaceData(String replace, String value){
        dataEntrace.replace(replace, value);
        return "Replacement data";
    }
}
