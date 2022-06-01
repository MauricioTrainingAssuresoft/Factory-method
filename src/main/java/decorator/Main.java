package decorator;

public class Main {
    public static void main(String[] args) {
        Name name = new Name("Mauricio");
        Cursive cursive = new Cursive(name);
        Underline underline = new Underline(cursive);
        DarkMode darkMode = new DarkMode(underline);
        Bold bold = new Bold(darkMode);

        LightMode lightMode = new LightMode(underline);

        System.out.println(bold.getName());
        System.out.println(lightMode.getName());
    }
}
