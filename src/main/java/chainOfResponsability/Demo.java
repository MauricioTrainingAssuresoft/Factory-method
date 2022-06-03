package chainOfResponsability;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        HashMap<String, String> dataEntrace = new HashMap<>();
        dataEntrace.put("email", "user@gmail.com");
        dataEntrace.put("numbers", "98398");
        dataEntrace.put("date", "22/01/2000");
        DataEntry data = new DataEntry(dataEntrace);
        ISanatize email = new VerifyEmail(dataEntrace.get("email"));
        ISanatize numbers = new VerifyNumbers(dataEntrace.get("numbers"));
        ISanatize date = new VerifyDate(dataEntrace.get("date"));
        email.setNext(numbers);
        numbers.setNext(date);
        ShowData showData = email.dataValidation(data);

        System.out.println(showData.getEmail());
        System.out.println(showData.getNumbers());
        System.out.println(showData.getDate());
    }
}
