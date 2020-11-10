package models;

public class Table  implements Element{
    String title;
    public Table(String s){ title=s; }
    public void print(){
        System.out.println("models.Table with title: "+title);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
