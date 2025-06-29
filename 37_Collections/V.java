import java.util.ArrayList;

public class V {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student a = new Student("jay", 23);
        Student b = new Student("raghav", 18);
        Student c = new Student("golu", 9);
        Student d = new Student("vikramaditya", 12);
        Student e = new Student("om", 17);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println(list);

    }
}
