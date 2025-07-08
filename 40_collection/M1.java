import java.util.Collections;
import java.util.ArrayList;

class M1 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();

        list.add(new User("ketak", 8));
        list.add(new User("hitesh", 15));
        list.add(new User("sarvan", 10));
        list.add(new User("giyan", 17));
        list.add(new User("giyan", 7));
        list.add(new User("ninja", 12));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}