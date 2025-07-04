import java.util.TreeSet;

class X {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>();

        set.add(new Student("om", 12));
        set.add(new Student("raj", 8));
        set.add(new Student("golu", 14));
        set.add(new Student("vivek", 9));
        set.add(new Student("ram", 10));

        System.out.println(set);
    }
}