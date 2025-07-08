import java.util.PriorityQueue;

class User {
    String name;
    Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}


class I {
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


// Exception in thread "main" java.lang.ClassCastException: class User cannot be cast to class java.lang.Comparable (User is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:643)
//         at java.base/java.util.PriorityQueue.siftUp(PriorityQueue.java:639)
//         at java.base/java.util.PriorityQueue.offer(PriorityQueue.java:330)
//         at I.main(I.java:22)