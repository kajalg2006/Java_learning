import java.util.HashSet;

class L1 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("om", 12));
        set.add(new Student("raj", 8));
        set.add(new Student("golu", 14));
        set.add(new Student("vivek", 9));
        set.add(new Student("ram", 10));

        System.out.println(set);
        
        Student y = new Student("golu", 14);
        System.out.println(set.remove(y));
        
        System.out.println(set);
    }
}