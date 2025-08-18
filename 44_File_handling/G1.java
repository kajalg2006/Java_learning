import java.io.File;

class G1 {
    public static void main(String[] args) {
        File file = new File("D:\movies\mohan.txt");

        boolean flag = file.exists();

        System.out.println("E:/movies/mohan.txt exists?: " + flag);
    }
}


// G1.java:5: error: illegal escape character
//         File file = new File("E:\movie\mohan.txt");
//                                  ^
// G1.java:5: error: illegal escape character
//         File file = new File("E:\movie\mohan.txt");
//                                        ^
// 2