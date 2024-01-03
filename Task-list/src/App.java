import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> Songs = new ArrayList<>();
        Songs.add("Sotak Ynadene-Mohammed Abdu");
        Songs.add("Dastour-Mohammed Abdu");
        Songs.add("Bent AlNoor-Mohammed Abdu");
        Songs.add("Shabeh ElReeh-Mohammed Abdu");
        Songs.add("Hayya Maaee-Mohammed Abdu");
        Songs.add("AlAmakin-Mohammed Abdu");
        Songs.add("Makoo Fakah-Mohammed Abdu");
        Songs.remove(2);
        for(String S:Songs){
            System.out.println(S);
        }
    }
}
