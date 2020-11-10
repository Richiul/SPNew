package models;

public class ImageProxy implements  Element{
    String url;
    Image realImage;
    public ImageProxy(String u) {
        url = u;
    }
    public Image loadImage(){
        if(realImage==null){
            realImage=new Image(url);
        }
        return realImage;
    }
    public void print() {
        realImage=loadImage();
        realImage.print();
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}