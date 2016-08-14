
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nirav on 09/08/16.
 */
public class TutorialJava_1 {

    public static void main(String[] args) {

        int[] intArr = new int[2];
        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(intArr[0]);

        String[] array1 = new String[5];
        array1[0] = "Nirav";
        array1[4] = "Desai";
        System.out.println(array1.length);

        for (int i=0;i< array1.length;i++){
            System.out.print(array1[i] + " ");
        }

        System.out.print("\n\n");

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


    }
}

