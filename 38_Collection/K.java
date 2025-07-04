import java.util.HashSet;

class K {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();
        
        set.add(new Student("om", 12));
        set.add(new Student("raj", 8));
        set.add(new Student("golu", 14));
        set.add(new Student("vivek", 9));
        set.add(new Student("ram", 10));
    }
}
