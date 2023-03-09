import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        for (int i = 0; i <=50 ; i++) {
            list.add(random.nextInt(1,100));
            System.out.print(" "+list.get(i));
        }
        ArrayList<Integer>list2 = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)%2==0){
                list1.add(i);
            } else if (list.get(i)%2==1) {
                list2.add(i);
            }
        }
        System.out.println("\n~~~~jup~~~~"+list1);
        System.out.println("~~~~tak~~~~"+list2);
    }
}