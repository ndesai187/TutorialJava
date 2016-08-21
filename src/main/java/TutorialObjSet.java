import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Nirav on 21/08/16.
 */
public class TutorialObjSet {

    public static void createSet(){
        UsersList ul1 = new UsersList(1, "Kamlesh", "India");
        UsersList ul2 = new UsersList(2, "Poonam", "India");
        UsersList ul3 = new UsersList(3, "Pooja", "India");
        UsersList ul4 = new UsersList(2, "Poonam", "India");

        System.out.println(ul1);

        Set<UsersList> tset1 = new LinkedHashSet<>();

        tset1.add(ul1);
        tset1.add(ul2);
        tset1.add(ul3);
        tset1.add(ul4);

        System.out.println(tset1);
        System.out.println("Size of the set is : " + tset1.size());




    }

}
