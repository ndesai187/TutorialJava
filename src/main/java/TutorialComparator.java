import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nirav on 21/08/16.
 */

class LengthCompare implements Comparator<String> {

        }

public class TutorialComparator {

    public static void runCompare(){

        List<String> llist1 = new LinkedList<String>();
        llist1.add("shark");
        llist1.add("tortoise");
        llist1.add("tuna");
        llist1.add("blue whale");
        llist1.add("octopus");
        llist1.add("eel");

        Collections.sort(llist1);

        for(String animal : llist1){
            System.out.println(animal);
        }

    }

}
