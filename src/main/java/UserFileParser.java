import factory.*;

public class UserFileParser {
    private ICreator creator;
    Logger logger = Logger.getInstance();

    public UserFileParser(ICreator creator){
        this.creator = creator;
    }
    public String getUsers(String path) {
        logger.debug();
        IDataDriver dataDriver = this.creator.createDatadriver();
        return dataDriver.read(path);
    }
}
