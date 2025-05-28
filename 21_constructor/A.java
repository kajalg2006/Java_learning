class A{
    static int  y = 9 ;
     static void pro(){
        System.out.println("Hello");
     }

     public static void main(String[] args){
        System.out.println( y);

        pro();

       //  System.out.println(t);

       //info();
     }
}

// A.java:12: error: cannot find symbol
//           System.out.println(t);
//                              ^
//   symbol:   variable t
//   location: class A
// A.java:14: error: cannot find symbol
//          info();
//          ^
//   symbol:   method info()
//   location: class A
// 2 errors