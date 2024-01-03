import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(random.nextInt(100));
            if (arrayList.get(i) %2 == 0){
                System.out.println(arrayList.get(i));
            }
            if (arrayList.get(i) %1 == 0){
                System.out.println(arrayList.get(i));
            }
        }

        ArrayList<Integer> list = new ArrayList<>(arrayList);
        ArrayList<Integer> list1 = new ArrayList<>(arrayList);
    }
}