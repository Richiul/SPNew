//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package models;

public class ImageProxy implements Element {
    private String name;
    Image realImage = null;

    public ImageProxy(String name) {
        this.name = name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print() {
        if (this.realImage == null) {
            this.realImage = new Image(this.name);
        }

        this.realImage.print();
    }
}
