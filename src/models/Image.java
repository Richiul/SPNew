package models;

import services.ImageLoaderFactory;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
    String url;
    public Image(String u) {
        url = u;
        ImageLoaderFactory.create("JPG");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println("Image with url: "+url);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }


}
