//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package models;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import services.ImageLoaderFactory;

public class Image implements Element {
    private String imageName;

    public Image(String name) {
        this.imageName = name;

        try {
            TimeUnit.SECONDS.sleep(2L);
            ImageLoaderFactory.create(name);
        } catch (IOException | InterruptedException var3) {
            var3.printStackTrace();
        }

    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print() {
        System.out.println("models.Image with name: " + this.imageName);
    }
}
