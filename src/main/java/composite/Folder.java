package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDirectory {
    private String name;
    private List<IDirectory> files = new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    @Override
    public String getFile() {
        String content = "";
        for (IDirectory file: files) {
            content += name + "\n --" + file.getFile()+ "\n";
        }
        return content;
    }

    public void addFile(IDirectory file){
        files.add(file);
    }
}
