class Student4 {

    String name;
    int age;

    static int maxage =20;// This is will create memory only once at the time of loading the class 

    public static void main(String[] args) {
        Student4 a = new Student4();
        a.name = "mohan";
        a.age = 14;
        //a.maxage = 20;
        
        Student4 b = new Student4();
        b.name = "dinesh";
        b.age = 18;
        //a.maxage = 20;
        
        Student4 c = new Student4();
        c.name = "om";
        c.age = 9;
        //a.maxage = 20;

        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(maxage);
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(maxage);
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(maxage);

    }
}
