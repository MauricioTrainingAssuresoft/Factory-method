package chainOfResponsability;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyEmail extends HandlerData {
    private String email;

    public VerifyEmail(String email) {
        this.email = email;
    }

    @Override
    public ShowData dataValidation(DataEntry data) {
        String regx = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regx);
        Matcher match = pattern.matcher(email);
        if(!match.matches()){ data.replaceData("email", "");}
        return super.dataValidation(data);
    }
}
