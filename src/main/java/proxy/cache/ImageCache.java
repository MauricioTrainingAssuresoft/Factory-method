package proxy.cache;

import proxy.Image;

import java.util.HashMap;

public class ImageCache implements IImageProvider {
    private IImageProvider imageProvider;
    private HashMap<String, Image> popularImageCached;
    private Image imageCached;

    public ImageCache(ImageProvider imageProvider) {
        this.imageProvider = imageProvider;
    }

    @Override
    public HashMap<String, Image> getPopularImages() {
        if (popularImageCached == null){
            popularImageCached = imageProvider.getPopularImages();
        }
       return popularImageCached;
    }

    @Override
    public Image getImage(String imageId) {
        if (imageCached == null){
            imageCached = imageProvider.getImage(imageId);
        }
        return imageCached;
    }

}
