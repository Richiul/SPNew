import javax.naming.Context;

public class AlignRight implements AlignStrategy{

    public void render(Paragraph p, Context c){
        p.text="++++++++++"+p.text;
    }
}
