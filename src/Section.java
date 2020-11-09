import java.util.Vector;

public class Section implements Element{
    String title;
    Vector<Element> content = new Vector<Element>();

    public Section(String s){
        title=s;
    }
    public void add(Element elm){
        content.add(elm);
    }
    public void remove(Element elm){
        content.remove(elm);
    }

    public void get(int i) {
        content.get(i);
    }

    public Element getElement(int index){

        return content.get(index);
    }
    public void print(){
        System.out.println(this.title);
        for(Element i: content){
            i.print();
        }
    }
}
