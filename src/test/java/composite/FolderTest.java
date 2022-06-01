package composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class FolderTest {

    @Test
    public void getFileReturnString() {
        Folder image = new Folder("Images");
        String result =  image.getFile();
        assertTrue(result.length() > 0);
    }
}