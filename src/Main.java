public class Main {
    public static void main(String[] args) {
        UserFileParser parse = new UserFileParser();
        System.out.println(parse.getUsersCsv("/path/files/Csv/file.csv"));
        System.out.println(parse.getUsersXml("/path/files/Csv/file.xml"));
    }
}
