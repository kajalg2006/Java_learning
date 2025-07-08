import java.util.Arrays;

public class W {
    public static void main(String[] args) {
         Employee[] x = {
            new Employee("ketak", 8),
            new Employee("hitesh", 15),
            new Employee("sarvan", 10),
            new Employee("giyan", 17),
            new Employee("mangesh", 7),
            new Employee("ninja", 12)
        };

        for(Employee next: x){
            System.out.print(next+    "   ");
        }
              
        Arrays.sort(x, new AgeDscSort());
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(Employee next : x)
            System.out.print(next + "  #  ");

    }
}
