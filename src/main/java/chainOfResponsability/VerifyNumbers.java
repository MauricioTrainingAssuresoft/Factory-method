package chainOfResponsability;

public class VerifyNumbers extends HandlerData {
    private String numbers;

    public VerifyNumbers(String numbers) {
        this.numbers = numbers;
    }

    public ShowData dataValidation(DataEntry data) {
        String regx = "[0-9]*";
        if(!numbers.matches(regx)){ data.replaceData("numbers", "0"); }
        return super.dataValidation(data);
    }
}
