package proxy;

import org.junit.Test;
import proxy.cache.ImageProvider;

import static org.junit.Assert.*;

public class ImageLoaderTest {

    @Test
    public void imageValidator() {
        User user = new User("123", 17);
        ImageProvider imageProvider = new ImageProvider();
        ImageLoader imageLoader = new ImageLoader(imageProvider);
        String result = imageLoader.imageValidator(user);
        assertTrue(result.length() > 0);
    }
}