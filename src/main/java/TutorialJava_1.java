
import java.util.*;

/**
 * Created by Nirav on 09/08/16.
 */
public class TutorialJava_1 {

    public static void main(String[] args) {

        System.out.println("------- Arraylist Practice -------\n");
        ArrayList<UsersList> al1 = new ArrayList<UsersList>();

        al1.add(new UsersList(123, "Nirav", "India"));
        System.out.println(al1.get(0).getName());

        System.out.println("------- Arraylist Practice ENDS-------\n");

        System.out.println("\n------- ArrayList vs Linkedlist Practice -------\n");

        List<UsersList> alist = new ArrayList<UsersList>();
        List<UsersList> llist = new LinkedList<UsersList>();
        UsersList ul1 = new UsersList(2, "Test", "SG");

        //this method will add object for 10k times as per params
        // start = index 0
        // last = simple add, witout index
        // mid = random position
        System.out.println("\n---Take 1--- adding elements");
        MeasureTime.calcTime("add", ul1, "start", alist, "arraylist" );
        MeasureTime.calcTime("add", ul1, "start", llist, "linkedlist" );

        System.out.println("\n---Take 2---removing from end");
        MeasureTime.calcTime("remove", ul1, "end", alist, "arraylist");
        MeasureTime.calcTime("remove", ul1, "end", llist, "linkedlist");

        System.out.println("\n---Take 3---refilling elements");
        MeasureTime.calcTime("add", ul1, "start", alist, "arraylist" );
        MeasureTime.calcTime("add", ul1, "start", llist, "linkedlist" );

        System.out.println("\n---Take 4---removing from start");
        MeasureTime.calcTime("remove", ul1, "start", alist, "arraylist");
        MeasureTime.calcTime("remove", ul1, "start", llist, "linkedlist");

        System.out.println("\n\n----------------------------");
        System.out.println("------- Map Practice -------");
        System.out.println("----------------------------\n");

        HashMap<Integer, String> hmp1= new HashMap<Integer,String>();
        LinkedHashMap<Integer, String> lhmp1 = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> tmp1 = new TreeMap<Integer, String>();

        System.out.println("Hashmap Test");
        testmap(hmp1);
        System.out.println("\n\nLinkedHashmap Test");
        testmap(lhmp1);
        System.out.println("\nTreemap Test");
        testmap(tmp1);

    }


    public  static void testmap(Map<Integer,String> map1){
        map1.put(10, "Lion");
        map1.put(2, "Tiger");
        map1.put(5, "Leopard");
        map1.put(17, "Elephant");
        map1.put(91, "Snake");
        map1.put(12, "Giraffe");
        map1.put(26, "Hippo");
        map1.put(13, "Crocodile");
        map1.put(61, "Fox");
        map1.put(77, "Dog");
        map1.put(57, "Cat");

        for (Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

