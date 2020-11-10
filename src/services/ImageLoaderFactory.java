package services;

public class ImageLoaderFactory{
    String s;
    public static void create(String s){
            ImageLoader.load(s);
    }
}
