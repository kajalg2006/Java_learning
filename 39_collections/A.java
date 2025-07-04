import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<User> set = new TreeSet<User>();

        set.add(new User("om", 12));
        set.add(new User("raj", 8));
        set.add(new User("golu", 14));
        set.add(new User("vivek", 9));
        set.add(new User("mayank", 10));

        System.out.println(set);
    }
}