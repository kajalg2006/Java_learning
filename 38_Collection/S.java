import java.util.HashSet;

class S {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<User>();

        set.add(new User("om", 12));
        set.add(new User("raj", 8));
        set.add(new User("om", 12));
        set.add(new User("vivek", 9));
        set.add(new User("om", 12));

        System.out.println(set);
    }
}
