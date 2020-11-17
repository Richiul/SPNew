//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package models;

public interface Visitor {
    void visit(Section var1);

    void visit(Paragraph var1);

    void visit(ImageProxy var1);

    void visit(Image var1);

    void visit(Table var1);

    void visit(Book var1);
}
