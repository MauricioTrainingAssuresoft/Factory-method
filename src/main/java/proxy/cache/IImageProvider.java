package proxy.cache;

import proxy.Image;

import java.util.HashMap;

public interface IImageProvider {
    HashMap<String, Image> getPopularImages();
    Image getImage(String imageId);
}
