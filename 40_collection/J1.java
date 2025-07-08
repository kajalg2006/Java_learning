import java.util.PriorityQueue;

class J1 {
    public static void main(String[] args) {
        PriorityQueue<User> users = new PriorityQueue<User>();

        users.offer(new User("ketak", 8));
        users.offer(new User("hitesh", 15));
        users.offer(new User("sarvan", 10));
        users.offer(new User("giyan", 17));
        users.offer(new User("giyan", 7));
        users.offer(new User("ninja", 12));

        System.out.println(users.poll());
        System.out.println(users.poll());
        System.out.println(users.poll());
        System.out.println(users.poll());
        System.out.println(users.poll());
        System.out.println(users.poll());
    }    
}