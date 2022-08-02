import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            alist.add(i);
        }
        System.out.println("before:" + alist);

        Iterator<Integer> it = alist.iterator();

        while (it.hasNext()) {
            Integer currentInt = it.next();
            if (currentInt==4){
                it.remove();
            }
        }
        System.out.println("after"+ alist);
    }
}