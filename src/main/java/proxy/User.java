package proxy;

public class User {
    private String id;
    private int age;

    public User(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
