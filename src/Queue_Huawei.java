import java.util.*;

public class Queue_Huawei {

    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Queue queue2 = new PriorityQueue<>();
        queue.add("1");
        queue.offer("3");
        queue.add("2");

        List list = (List) queue;
        Collections.sort(list);

        while (queue.size() > 0){
            System.out.println(queue.poll());
        }
    }
}
