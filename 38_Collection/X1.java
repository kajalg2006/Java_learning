import java.util.TreeSet;

class X1 {
    public static void main(String[] args) {
        TreeSet<Employee1> set = new TreeSet<Employee1>();

        set.add(new Employee1("om", 12));
        set.add(new Employee1("raj", 8));
        set.add(new Employee1("golu", 14));
        set.add(new Employee1("vivek", 9));
        set.add(new Employee1("ram", 10));

        System.out.println(set);
    }
}