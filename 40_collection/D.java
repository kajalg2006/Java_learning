import java.util.PriorityQueue;

class D {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.offer("umesh");
        queue.offer("govind");
        queue.offer("sameer");
        queue.offer("raghav");
        queue.offer("jitendra");
        queue.offer("kamal");
        queue.offer("bimal");
        queue.offer("vineet");

        System.out.println(queue);
    }
}