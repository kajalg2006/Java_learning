public class O1 {
      public static void main(String[] args) {
        Employee1 x = new Employee1("hitesh", 32);
        Employee1 y = new Employee1("hitesh", 42);
        Student z = new Student("hitesh", 32);

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
    }   
}
