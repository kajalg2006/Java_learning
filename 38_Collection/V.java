import java.util.LinkedHashSet;

class V {
     public static void main(String[] args) {
        LinkedHashSet<User> set = new LinkedHashSet<User>();

        set.add(new User("om", 12));
        set.add(new User("raj", 8));
        set.add(new User("ganesh", 9));
        set.add(new User("vivek", 7));
        set.add(new User("sumit", 15));

        System.out.println(set);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        User user = new User("ganesh", 9);
        System.out.println(set.remove(user));

        System.out.println(set);
    }
}
