
import java.util.List;

/**
 * Created by Nirav on 14/08/16.
 */
public class MeasureTime {

    public static void calcTime(String op, UsersList ultemp, String pos, List<UsersList> list, String type){

        long start = System.currentTimeMillis();

        switch(op){
            case "add" : for(int i=0; i <= 1e5 ; i++){
                if (pos.equals("start") ){
                    list.add(0,ultemp);
                } else if(pos.equals("end")){
                    list.add(ultemp);
                }else{
                    list.add(400,ultemp);
                }
            }
                System.out.println("Total size is : " + list.size());
                break;

            case "remove" : for(int i=0; i <= 1e5 ; i++){
                if (pos.equals("start") ){
                    list.remove(0);
                } else if(pos.equals("end")){
                    list.remove(list.size()-1);
                }else{
                    list.remove(400);
                }
            }
                System.out.println("Total size is : " + list.size());
                break;


            default:
                System.out.println("Nothing to perform - default selected");
        }


        long end = System.currentTimeMillis();


        System.out.println(type + " statement took total " + (end-start) + " ms to execute");
    }

}
