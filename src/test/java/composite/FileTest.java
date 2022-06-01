package composite;

import static org.junit.Assert.*;

public class FileTest {

    @org.junit.Test
    public void getFile() {
        IDirectory familyPhoto = new File("photo.jpg");
        String result =  familyPhoto.getFile();
        assertTrue(result.length() > 0);
    }
}