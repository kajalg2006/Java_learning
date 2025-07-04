import java.util.HashSet;

class M {
    public static void main(String[] args) {
        HashSet<Student1> set = new HashSet<Student1>();

        set.add(new Student1("om", 12));
        set.add(new Student1("raj", 8));
        set.add(new Student1("golu", 14));
        set.add(new Student1("vivek", 9));
        set.add(new Student1("ram", 10));

        System.out.println(set);

        Student1 y = new Student1("golu", 14);
        System.out.println(set.contains(y));
    }
}
