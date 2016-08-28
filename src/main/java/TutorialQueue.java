import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Nirav on 28/08/16.
 */
public class TutorialQueue {

    public static void runExample(){

        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

        q1.add(4);
        q1.add(50000);
        q1.add(500);
        System.out.println(q1.size());

        try {
            q1.add(200);
        } catch (IllegalStateException ise){
            System.out.println("Queue has reached it's limit. This item cannot be added");
        }

        for(Integer i : q1){
            System.out.println("The current element is " + i);
        }

        System.out.println("The first element in the queue is : " + q1.element());
        System.out.println("\n=====Running Queue example with offer/peel/peek=====\n");

        Queue<String> q2 = new ArrayBlockingQueue<String>(3);

        q2.offer("Nirav");
        q2.offer("Desai");
        q2.offer("Kamlesh");
        q2.offer("Vadodara");

        for(String s1 : q2){
            System.out.println("The current element is : " + s1);
        }

        System.out.println("this is what we found while peeking : " + q2.peek());



    }
}
