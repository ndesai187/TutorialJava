import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nirav on 21/08/16.
 */

class LengthCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        int len1 = o1.length();
        int len2 = o2.length();

        if(len1 > len2) return 1;
        else if (len1 < len2) return -1;
        else return 0;
    }
}

class ReverseAlphaCompare implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class TutorialSort {

    public static void runCompare(){

        List<String> llist1 = new LinkedList<String>();
        llist1.add("shark");
        llist1.add("tortoise");
        llist1.add("tuna");
        llist1.add("blue whale");
        llist1.add("octopus");
        llist1.add("eel");
        llist1.add("whale");

        Collections.sort(llist1, new LengthCompare());

        for(String animal : llist1){
            System.out.println(animal);
        }

        System.out.println("\n--------- Sorting in reverse alphabetical order ----------\n");

        Collections.sort(llist1, new ReverseAlphaCompare());

        for(String animal : llist1){
            System.out.println(animal);
        }

    }

}
