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
public class ObjectIterable implements Iterable<String>{
    private List<String> url1 = new LinkedList<String>();

    private class urlIterator implements Iterator<String>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < url1.size();
        }

        @Override
        public String next() {
            try {
                URL url2 = new URL(url1.get(index));
                BufferedReader br1 = new BufferedReader(new InputStreamReader(url2.openStream()));

                StringBuilder sb1 = new StringBuilder();


            } catch (Exception e) {
                e.printStackTrace();
            }
            index++;
        }
    }


    public  ObjectIterable(){
        url1.add("https://www.facebook.com");

    }

    @Override
    public Iterator<String> iterator() {
        return url1.iterator();
    }
}
