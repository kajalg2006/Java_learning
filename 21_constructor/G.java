class AA{
    AA(){

    }
}

 abstract class BB{
    BB(){

    }
}


 interface  CC{
//NA
//CC(){

//}
    
}

 enum DD{
    DD(){

    }
 }
public class G {
    public static void main(String[] args) {
        
        new AA();

        //new BB();

        // new CC();

        //new DD();

    }

}

// G.java:32: error: BB is abstract; cannot be instantiated
//         new BB();
//         ^
// G.java:36: error: enum types may not be instantiated
//         new DD();
//         ^
// 2 errors
