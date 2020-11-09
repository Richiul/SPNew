public class Author {
    String name;
    String surname;
    public Author(String n, String s){

        name=n;
        surname=s;
    }
    public void print(){
        System.out.println(name+" "+surname);
    }
}
