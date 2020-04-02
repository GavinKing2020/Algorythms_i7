import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Queue_Dequeue_Huawei {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        Deque<String> linkedDeque = new LinkedList<>();

        /*are preffered for queue and stacks*/
        /* faster than stack as used as stack and linkedList when used as queue*/
        Deque<String> arrayDeque = new ArrayDeque<>();
        /* based on Array*/
        Queue<String> priorityQueue = new PriorityQueue<>();
        Queue<String> blockingQueue = new LinkedBlockingDeque<>();

        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("b");

        for(String s : priorityQueue){
            System.out.println(s);
        }

         while (priorityQueue.size() != 0 ) {
             System.out.println(priorityQueue.remove());
         }

    }
}
