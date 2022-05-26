package factory;

public abstract class Creator {
    public abstract IDataDriver createDatadriver();
    public String getUser(){
        return "File Employees";
    }
}
