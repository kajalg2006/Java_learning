import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class F {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("golu.txt");
            // text inside golu.txt: Golu is a good boy

            char[] arr = new char[4];

            int count = fr.read(arr);

            System.out.println(count);

            for(char next : arr)
                System.out.print(next+"-");
                
            System.out.println("\n-----------------");

           

            count = fr.read(arr);

            System.out.println(count);

            for(char next : arr)
                System.out.print(next+"-");

            System.out.println("\n-----------------");

            count = fr.read(arr);

            System.out.println(count);

            for(char next : arr)
                System.out.print(next+"-");

            System.out.println("\n-----------------");

            count = fr.read(arr);

            System.out.println(count);

            for(char next : arr)
                System.out.print(next+"-");

            System.out.println("\n-----------------");

            count = fr.read(arr);

            System.out.println(count);

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } 
    }
}