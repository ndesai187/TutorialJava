import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Nirav on 20/08/16.
 */
public class TutorialSet {


    public static  void createSet() {

        Set<String> hset1 = new LinkedHashSet<String>();

        hset1.add("Nirav");
        hset1.add("Kamlesh");
        hset1.add("Desai");
        hset1.add("Vadodara");
        hset1.add("Singapore");
        System.out.println(hset1);

        Set<String> tset1 = new TreeSet<String>();

        tset1.add("Bela");
        tset1.add("Kamlesh");
        tset1.add("Desai");
        tset1.add("Vadodara");
        tset1.add("India");
        System.out.println(tset1);

        createIntersection(hset1, tset1);
        createDifference(hset1,tset1);

    }

    public static void createIntersection(Set set1, Set set2){
        Set<String> Inter = new TreeSet<String>(set1);
        System.out.println(Inter);

        Inter.retainAll(set2);
        System.out.println(Inter);

    }

    public static void createDifference(Set set1, Set set2){
        Set<String> diff = new TreeSet<String>(set2);
        System.out.println(diff);

        diff.removeAll(set1);
        System.out.println(diff);
    }

}