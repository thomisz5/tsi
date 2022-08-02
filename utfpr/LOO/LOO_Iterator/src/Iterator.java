import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            alist.add(i);
        }
        System.out.println("before: " + alist);

        for (Integer i : alist) {
            if (i == 4) {
                alist.remove(i);
            }
        }
        System.out.println("after :" + alist);

    }
}
