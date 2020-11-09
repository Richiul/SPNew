public class Paragraph implements Element{
    String text;
    public Paragraph(String s){
        text=s;
    }
    public void print(){
        System.out.println("Paragraph: "+text);
    }
    public void setAlignStrategy(AlignStrategy a){
        a.render(this,null);
    }
}
