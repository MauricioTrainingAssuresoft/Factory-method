package chainOfResponsability;

public class ShowData {
    private String email;
    private String numbers;
    private String date;

    public ShowData(String email, String numbers, String date) {
        this.email = email;
        this.numbers = numbers;
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public String getNumbers() {
        return numbers;
    }

    public String getDate() {
        return date;
    }
}
