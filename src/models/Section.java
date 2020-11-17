//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package models;

import java.util.ArrayList;
import java.util.Iterator;

public class Section implements Element {
    protected String sectionTitle;
    protected ArrayList<Element> content = new ArrayList();

    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public int add(Element elm) {
        this.content.add(elm);
        return this.content.indexOf(elm);
    }

    public void accept(Visitor v) {
        v.visit(this);
        Iterator var2 = this.content.iterator();

        while(var2.hasNext()) {
            Element i = (Element)var2.next();
            i.accept(v);
        }

    }

    public void remove(Element elm) {
        this.content.remove(elm);
    }

    public Element getElement(int index) {
        return (Element)this.content.get(index);
    }

    public void print() {
        System.out.println("models.Section: " + this.sectionTitle);
        Iterator var1 = this.content.iterator();

        while(var1.hasNext()) {
            Element i = (Element)var1.next();
            i.print();
        }

    }
}
