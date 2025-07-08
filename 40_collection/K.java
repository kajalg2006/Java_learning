import java.util.PriorityQueue;
import java.util.Comparator;
import java.io.Console;

class K {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.println("Press 1 for NameAscSort\n2 for NameDscSort");
        System.out.println("Press 3 for AgeAscSort\n4 for AgeDscSort");

        int inp = Integer.parseInt(con.readLine());

        Comparator<Employee> comp = null;

        switch(inp) {
            case 1:
                comp = new NameAscSort();
                break;
            case 2:
                comp = new NameDscSort();
                break;
            case 3:
                comp = new AgeAscSort();
                break;
            case 4:
                comp = new AgeDscSort();
                break;
            default:
                System.exit(0);
        }

        PriorityQueue<Employee> employees = new PriorityQueue<Employee>(comp);

        employees.offer(new Employee("ketak", 8));
        employees.offer(new Employee("hitesh", 15));
        employees.offer(new Employee("sarvan", 10));
        employees.offer(new Employee("giyan", 17));
        employees.offer(new Employee("giyan", 7));
        employees.offer(new Employee("ninja", 12));

        System.out.println(employees.poll());
        System.out.println(employees.poll()); 
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
    }    
}
