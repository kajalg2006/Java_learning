import java.util.TreeSet;

class Z {
    public static void main(String[] args) {
        TreeSet<User1> set = new TreeSet<User1>();

        set.add(new User1("om", 12));
        set.add(new User1("raj", 8));
        set.add(new User1("golu", 14));
        set.add(new User1("vivek", 9));
        set.add(new User1("ram", 10));

        System.out.println(set);
    }
}