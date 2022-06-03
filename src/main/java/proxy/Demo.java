package proxy;

import proxy.cache.ImageCache;
import proxy.cache.ImageProvider;

public class Demo {
    public static void main(String[] args) {
        User adult = new User("1234",30);
        User minor = new User("345", 17);
        ImageProvider imageProvider = new ImageProvider();
        ImageCache proxy = new ImageCache(imageProvider);
        ImageLoader imageLoader = new ImageLoader(proxy);
        imageLoader.imageValidator(adult);
        System.out.println("..............................");
        imageLoader.imageValidator(minor);
    }
}

