import java.util.ArrayList;
import java.util.PriorityQueue;

class H {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.offer(78);
        queue.offer(23);
        queue.offer(54);
        queue.offer(12);
        queue.offer(67);
        queue.offer(39);
        queue.offer(54);

        ArrayList<Integer> list = new ArrayList<Integer>(queue);   
        
        System.out.println(queue);
        System.out.println(list);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(queue);
        System.out.println(list);
    }
}