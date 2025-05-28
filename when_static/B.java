class Student2 {

    String name;
    int age;

    public static void main(String[] args) {
        Student2 a = new Student2();
        a.name = "mohan";
        a.age = 14;

        Student2 b = new Student2();
        b.name = "dinesh";
        b.age = 18;

        Student2 c = new Student2();
        c.name = "om";
        c.age = 9;

        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(c.name);
        System.out.println(c.age);

    }
}
