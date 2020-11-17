//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package models;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private String title;
    private ArrayList<Element> content = new ArrayList();
    private ArrayList<Author> authors = new ArrayList();

    public Book(String title) {
        this.title = title;
    }

    public void addContent(Element elm) {
        this.content.add(elm);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void print() {
        System.out.println("models.Book title: " + this.title);
        this.printAuthors();
        Iterator var1 = this.content.iterator();

        while(var1.hasNext()) {
            Element i = (Element)var1.next();
            i.print();
        }

    }

    private void printAuthors() {
        Iterator var1 = this.authors.iterator();

        while(var1.hasNext()) {
            Author i = (Author)var1.next();
            i.print();
        }

    }

    public void accept(Visitor v) {
        v.visit(this);
        Iterator var2 = this.content.iterator();

        while(var2.hasNext()) {
            Element i = (Element)var2.next();
            i.accept(v);
        }

    }
}
