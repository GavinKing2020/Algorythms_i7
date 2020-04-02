import javafx.scene.layout.Priority;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueue_Huawei {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue();

        new Thread() {
            @Override
            public void run() {
                try {
                    /* take will wait until queue will be filled in*/
                    System.out.println(queue.take());
                    System.out.println(queue.take());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                /* add call nofity for queue*/
                queue.add("this is a string");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
//                System.out.println("Thread #3");
                queue.add("third thread");
            }
        }.start();

    }

}
