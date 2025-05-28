class Student5 {
    String name;
    int age;

    static int maxage = 20;

    public static void main(String[] args) {
        Student5 a = new Student5();
        a.name = "kajal";
        a.age = 20;

        //a.maxage =40; 

        Student5 b = new Student5();
        b.name = "kajl";
        b.age = 0;

        //b.maxage =50; 
        
        System.out.println(a.name);
        System.out.println(a.age);
     //    System.out.println(a.maxage);
        System.out.println(b.name);
        System.out.println(b.age);
       // System.out.println(b.maxage);
        
    }

}
