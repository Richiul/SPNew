package services;

public interface ImageLoader {
    public static void load(String s){
        if(s=="BMP")
            BMPImageLoader.load(s);
        if(s=="JPG")
            JPGImageLoader.load(s);
    }
}
