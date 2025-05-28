class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name= name;
         this.age= age;
    }
}

class Q1 {
    public static void main(String[] args) {
        Student x =  new Student("kajal", 20);

        System.out.println(x.name);
        System.out.println(x.age);

        Student y = new Student("nishu",22);
        System.out.println(y.name);
        System.out.println(y.age);
    }
}
