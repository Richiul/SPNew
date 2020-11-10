package models;

public interface Visitor {
    public abstract void visit(Section s);
    public abstract void visit(Paragraph p );
    public abstract void visit(ImageProxy ip);
    public abstract void visit(Image i);
    public abstract void visit(Table t);
}
