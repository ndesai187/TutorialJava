import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by Nirav on 28/08/16.
 */
public class ObjectIterable {

    public static void runIteration() {

        URLLibrary ulib = new URLLibrary();

        for (String html : ulib) {
            System.out.println(html.length());
            System.out.println(html);
        }

    }

}
