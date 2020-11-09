import java.util.Vector;

public class Book{
    String title;
    Vector<Element> content=new Vector<Element>();
    private Vector<Author> authors = new Vector<>();

    public Book(String s) {

        title=s;
    }

    public void addContent(Element s) {
        content.add(s);
    }

    public void addAuthor(Author a) {
        authors.add(a);
    }

    public void print() {
        System.out.println("Book name: " + title);
        for(Author i: authors){
            i.print();
        }
        for(Element i: content){
            i.print();
        }
    }
}
