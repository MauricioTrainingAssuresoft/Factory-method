package chainOfResponsability;

public class VerifyDate extends HandlerData {
    private String date;

    public VerifyDate(String date) {
        this.date = date;
    }

    public ShowData dataValidation(DataEntry data) {
        String regx = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
        String defaultName = "date";
        String defaultDate = "1999-01-01";
        if(!date.matches(regx)){ data.replaceData(defaultName, defaultDate);}
        return super.dataValidation(data);
    }
}
