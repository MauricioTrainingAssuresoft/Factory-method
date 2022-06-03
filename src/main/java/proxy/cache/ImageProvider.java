package proxy.cache;
import proxy.Image;

import java.util.HashMap;

public class ImageProvider implements IImageProvider {
    private HashMap<String, Image> imageList = new HashMap<>(){{
        put("drink",new Image("q1w2e3","drink.jpg","minors"));
        put("food",new Image("r4t5y6","food.png","minors"));
        put("indoor",new Image("y6u7i8","indoor.jpg","minors"));
        put("object",new Image("y6t5r4","object.png","minors"));
        put("people",new Image("rr4e3w2","people.jpg","minors"));
        put("plant",new Image("o9p0y6","plant.jpeg","minors"));
        put("sky",new Image("e3r4r4","sky.jpg","minors"));
        put("adult",new Image("f4g5h6","adult.png","adults"));
        put("racy",new Image("b5n6m7","racy.jpg","adults"));
        put("gory",new Image("z1x2c3","gory.jpeg","adults"));
    }};
    @Override
    public HashMap<String, Image> getPopularImages() {
        return imageList;
    }

    @Override
    public Image getImage(String imageId) {
        return imageList.get(imageId);
    }

}
