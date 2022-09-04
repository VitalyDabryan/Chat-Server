import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomThread {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Integer> numbers = new ArrayList<>();
                int k;
                for (int i = 0; i <= 10; i++) {
                    k = (int) (Math.random() * 10);
                    numbers.add(k);
                  System.out.println(numbers);
                }
                int max = Collections.max(numbers);
                System.out.println("Max found: " + max);
            }
//            maxFromList.run();

        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Integer> numbers1 = new ArrayList<>();
                try {
                    for (int i = 0; i <= 10; i++) {
                        Thread.sleep(100);
                        int k = (int) (Math.random() * 10);
                        numbers1.add(k);
                        if (k == 5) numbers1.remove(1);
                        System.out.println(numbers1);
                    }
                }
                catch(InterruptedException e){
                            System.out.println("Hyu");;
                        }
                    }
        });
        thread1.start();
        thread2.start();
    }
}
