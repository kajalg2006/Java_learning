class W {
    public static void main(String[] args) {
        BB[] a = {new X1(), new X2(), new X3()};
        System.out.println(a);
    }    
}

interface BB {  }

class X1 implements BB {  } 
class X2 implements BB {  } 
class X3 implements BB {  }