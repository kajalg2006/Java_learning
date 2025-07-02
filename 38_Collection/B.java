import java.util.LinkedList;
class B {
    public static void main(String[] args) {
        //as a Queue
        LinkedList<String> list  = new  LinkedList<String>();

        list.offer("mohan");
        list.offer("raj");
        list.offer("mukund");
        list.offer("neelesh");
        list.offer("ratan");

        System.out.println(list);

        
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        
        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        System.out.println(list);
    }
}
