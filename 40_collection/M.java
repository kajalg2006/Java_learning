import java.util.Collections;
import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("ketak", 8));
        list.add(new Employee("hitesh", 15));
        list.add(new Employee("sarvan", 10));
        list.add(new Employee("giyan", 17));
        list.add(new Employee("giyan", 7));
        list.add(new Employee("ninja", 12));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}


// 1 error