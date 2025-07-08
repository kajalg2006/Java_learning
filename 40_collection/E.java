import java.util.Iterator;
import java.util.PriorityQueue;

class E {
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


        Iterator<String> itr = queue.iterator();

        // for( ; itr.hasNext(); ) {
        //     System.out.println(itr.next());
        // }

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}