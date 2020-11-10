package models;

public class BookStatistics implements Visitor{
    int imageC=0;
    int tableC=0;
    int paragraphC=0;
    int sectionC=0;
    public void visit(Section s) {
        sectionC++;
    }

    public void visit(Paragraph p) {
        paragraphC++;
    }

    public void visit(ImageProxy ip) {
        imageC++;
    }

    public void visit(Image i) {
        imageC++;
    }

    public void visit(Table t) {
        tableC++;
    }
    public void printStatistics(){
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: "+imageC);
        System.out.println("*** Number of tables: "+tableC);
        System.out.println("*** Number of paragraphs: "+paragraphC);
        System.out.println("*** Number of sections: "+sectionC);
    }
}
