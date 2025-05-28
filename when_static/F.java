class Student6 {
    String name ;
    int age ;

    static int maxage=20 ;
    public static void main(String[] args) {
        Student6 a = new Student6();
        a.name= "nishu";
        a.age= 22;
        Student6 b = new Student6();
        b.name= "kaju";
        b.age= 12;
        Student6 c = new Student6();
        c.name= "anshika";
        c.age= 17;

        a.showinfo();
        b.showinfo();
        c.showinfo();


    }

    void showinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(maxage);
    }
}
