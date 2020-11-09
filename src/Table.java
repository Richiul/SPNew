public class Table  implements Element{
    String title;
    public Table(String s){ title=s; }
    public void print(){
        System.out.println("Table with title: "+title);
    }

}
