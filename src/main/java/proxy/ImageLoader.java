package proxy;


import proxy.cache.IImageProvider;

import java.util.HashMap;

public class ImageLoader {
    private IImageProvider api;
    HashMap<String, Image> list;
    public ImageLoader(IImageProvider imageProvider) {
        this.api = imageProvider;
    }

    public String imageValidator(User user){
        int underAge = 18;
        list = api.getPopularImages();
        for (Image image:list.values()) {
            if (user.getAge() <= underAge){
                if (image.classification=="minors"){
                    System.out.println("Rending for minors " + image.id + " Image name : " + image.title);
                }
            } else{ System.out.println("Rendering for adults : " + image.id + " Image name : "+ image.title); }
        }
        return "All ages validated";
    }
}
