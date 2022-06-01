package composite;

public class File implements IDirectory {
    private String name;
    private String nameContent;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getFile() {
        return " |- " + name;
    }


}
