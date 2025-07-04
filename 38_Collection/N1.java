import java.util.HashSet;

class N1 {
    public static void main(String[] args) {

        HashSet<Student1> set = new HashSet<Student1>();

        set.add(new Student1("om", 12));
        set.add(new Student1("raj", 8));
        set.add(new Student1("om", 12));
        set.add(new Student1("vivek", 9));
        set.add(new Student1("om", 12));

        System.out.println(set);
    }
}