import java.util.concurrent.TimeUnit;

public class Image {
    String url;
    Image(String u) {
        url = u;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println("Image with url: "+url);
    }

}
