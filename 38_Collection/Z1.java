 import java.util.TreeSet;

class Z1 {
    public static void main(String[] args) {
        TreeSet<User2> set = new TreeSet<User2>();

        set.add(new User2("om", 12));
        set.add(new User2("raj", 8));
        set.add(new User2("golu", 14));
        set.add(new User2("vivek", 9));
        set.add(new User2("mayank", 10));

        System.out.println(set);
    }
}
