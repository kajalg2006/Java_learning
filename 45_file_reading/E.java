import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class E {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("golu.txt");
            char[] arr = new char[4];
            int count = fr.read(arr);
            System.out.println(count);

            for(char next : arr)
                System.out.print(next+"-"); 
           fr.close();
        }catch(FileNotFoundException e){

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
