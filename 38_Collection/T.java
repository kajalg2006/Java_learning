import java.util.HashSet;

class T {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<User>();

        set.add(new User("raju", 12));
        set.add(new User("ram", 8));
        set.add(new User("golu", 12));
        set.add(new User("mohan", 12));
        set.add(new User("hanmo", 12));
        set.add(new User("hamno", 12));

        System.out.println(set);

        User user = new User("hamno", 12);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(set.contains(user));
    }    
}
