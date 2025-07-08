import java.util.PriorityQueue;

class User implements Comparable {
     String name;
    Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Object obj) {
        User a = this;
        User b = (User)obj;

        String nm1 = a.name;
        String nm2 = b.name;
        
        return nm1.compareTo(nm2);
    }
}


class J {
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