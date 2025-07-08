import java.util.Arrays;
import java.util.Comparator;

class Y {
    public static void main(String[] args) {
        Employee[] x = {
            new Employee("ketak", 8),
            new Employee("hitesh", 15),
            new Employee("sarvan", 10),
            new Employee("giyan", 17),
            new Employee("mangesh", 7),
            new Employee("ninja", 12)
        };

        for(Employee next : x)
            System.out.print(next + "  #  ");
            
        Comparator comp = new AgeDscSort();
        Arrays.sort(x, comp);
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(Employee next : x)
            System.out.print(next + "  #  ");

        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        Employee w = new Employee("indra", 13);
        System.out.println(Arrays.binarySearch(x, w, comp));

    }
}