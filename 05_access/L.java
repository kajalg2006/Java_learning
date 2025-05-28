class student1 extends pen{
  public static void main(String[] args) {
    student1  x = new student1();
     x.write();
  }
}

class pen{
    void write() {
        System.out.println("write some thing");
    }
}


//       Pen
//        ^  
//        |  
//        | IS-A 
//        |  
//      Student
