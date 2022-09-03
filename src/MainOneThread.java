import java.util.*;

public class MainOneThread extends Thread{

    public static void main(String[] args) throws InterruptedException{

        long start = System.currentTimeMillis();
        int i;
        int j = 10000000;

        List<Integer> numbers = new ArrayList<>();
        List<Integer> unsorted = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

            for (i = 0; i <= 10000000; i++, j--) {
                numbers.add(i);
                unsorted.add(j);
                list.add(i);
            }
            int max = Collections.max(numbers);
            System.out.println("Max found: " + max);
            Collections.sort(unsorted);
            System.out.println("List is sorted now");
            while (list.size() != 0) {
                list.remove(list.size() - 1);
            }
            System.out.println("List cleared");

            long end = System.currentTimeMillis();

            System.out.println("Total time: " + (end - start) + " ms");

    }
}