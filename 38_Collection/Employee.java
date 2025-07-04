
class Employee {
   String name;
   int age;
   
   Employee(String name , int age){
    this.name=  name;
    this.age= age;
   }

    public String toString() {
        return name + " ~ " + age;
    }

    public boolean equals(Object obj){
        Employee a= this;
        Employee b = (Employee)obj;

        String nm1= a.name;
        String nm2 = b.name;

        return nm1.equals(nm2);
    }
}
// true
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class Employee (Student and Employee are in unnamed module of loader 'app')
//         at Employee.equals(Employee.java:17)
//         at O.main(O.java:8)