import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedListPerso li = new LinkedListPerso();
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            li.add(i);
       
        }
        for (int j = 10; j < 20; j++) {
            li.add(j);
        }
        //add linked list to array list
        for (int i = 0; i < ((Collection<Integer>) li).size(); i++) {
            al.add(((List<Integer>) li).get(i));
        }
        //print array list
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        //change the value of i to see the difference
     
       

    }
}
