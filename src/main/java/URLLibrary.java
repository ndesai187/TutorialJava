import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nirav on 11/09/16.
 */
public class URLLibrary implements Iterable<String>{

    private List<String> urls = new LinkedList<String>();

    private class URLIterator implements Iterator<String>{
        private int index = 0;


        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();

            try {
                URL url  = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while((line = br.readLine()) != null){
                    sb.append(line);
                    sb.append("\n");
                }

                br.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            index++;

            return sb.toString();
        }

        @Override
        public void remove() {

        }
    }

    public URLLibrary(){
        urls.add("https://www.google.com.sg/");
        urls.add("https://www.facebook.com/");
        urls.add("https://accounts.google.com/Login#identifier");
    }

    @Override
    public Iterator<String> iterator() {
        return new URLIterator();
    }
}
