package observer;

public class User {
    private String name;
    private String email;
    private String urlPinteresrPhoto;
    private String phone;

    public User(String name, String email, String urlPinteresrPhoto, String phone) {
        this.name = name;
        this.email = email;
        this.urlPinteresrPhoto = urlPinteresrPhoto;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUrlPinteresrPhoto() {
        return urlPinteresrPhoto;
    }

    public String getPhone() {
        return phone;
    }
}
