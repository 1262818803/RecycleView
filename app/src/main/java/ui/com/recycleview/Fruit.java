package ui.com.recycleview;

/**
 * Created by asus on 2018/6/26.
 */
//ListView适配器的适配类型
public class Fruit {
    private String name;
    private  int imageId;

    public Fruit(String name, int imageId) {
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
