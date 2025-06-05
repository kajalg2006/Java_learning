import java.io.FileNotFoundException;
import java.io.FileReader;

class Y2{
    Y2() throws FileNotFoundException{
    FileReader fe= new FileReader("abc.txt");
   }
}
class D extends Y2{
    // D() {
    //     try{

    //         super();
    //     }catch(Exception e){

    //     }
    // }
// niche wala code just red underline hatane ke lie lagaya hai baki upar wala chalega
     D() throws FileNotFoundException{
        super();
    }
public static void main(String[] args) throws FileNotFoundException {
       
        System.out.println("A");

       D a = new D();

        System.out.println("B");
    }

}

// D.java:13: error: call to super must be first statement in constructor
//             super();
//                  ^
// 1 error