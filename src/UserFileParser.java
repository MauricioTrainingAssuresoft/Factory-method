import factory.*;

public class UserFileParser {
    private Creator creator;
    public UserFileParser(Creator creator){
        this.creator = creator;
    }
    public String getUsers(String path) {
        IDataDriver dataDriver = this.creator.createDatadriver();
        return dataDriver.read(path);
    }
}
