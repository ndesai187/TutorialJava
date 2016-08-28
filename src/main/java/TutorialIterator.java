import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nirav on 28/08/16.
 */
public class TutorialIterator implements Iterable<String>{
    public static void runExample(){

        List<String> llist1 = new LinkedList<String>();
        List<String> urls = new LinkedList<String>();


        llist1.add("Singapore");
        llist1.add("Malysia");
        llist1.add("Japan");
        llist1.add("India");

        Iterator<String> it1 = llist1.iterator();
        while(it1.hasNext()){
            System.out.println("The value of interator is : " + it1.next());
        }

        ObjectIterable obj1 = new ObjectIterable();

        for (String url : obj1) {
            System.out.println(url);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return null;

    }
}
