public class O {
    public static void main(String[] args) {
        Employee x = new Employee("hitesh", 32);
        Employee y = new Employee("hitesh", 42);
        Student z = new Student("hitesh", 32);

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
    }
}
// true
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class Employee (Student and Employee are in unnamed module of loader 'app')
//         at Employee.equals(Employee.java:17)
//         at O.main(O.java:8)