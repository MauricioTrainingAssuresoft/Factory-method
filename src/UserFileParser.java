import factory.*;

public class UserFileParser {
    private ICreator creator;
    public UserFileParser(ICreator creator){
        this.creator = creator;
    }
    public String getUsers(String path) {
        IDataDriver dataDriver = this.creator.createDatadriver();
        return dataDriver.read(path);
    }
}
