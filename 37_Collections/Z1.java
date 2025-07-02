import java.util.ArrayList;

class Z1 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<Student2>();
        
        Student2 a = new Student2("jay", 23);
        Student2 b = new Student2("raghav", 18);
        Student2 c = new Student2("golu", 9);
        Student2 d = new Student2("vikramaditya", 12);
        Student2 e = new Student2("om", 17);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println(list);
        
        Student2 x = new Student2("raghav", 18);
        System.out.println(list.remove(x));
        
    }
}
