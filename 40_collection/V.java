import java.util.Arrays;

class V {
    public static void main(String[] args) {
        Employee[] x = {
            new Employee("ketak", 8),
            new Employee("hitesh", 15),
            new Employee("sarvan", 10),
            new Employee("giyan", 17),
            new Employee("giyan", 7),
            new Employee("ninja", 12)
        };

          for(Employee next : x)
            System.out.print(next + "  #  ");
            
        Arrays.sort(x);
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(Employee next : x)
            System.out.print(next + "  #  ");
    }
}

// ketak - 8  #  hitesh - 15  #  sarvan - 10  #  giyan - 17  #  giyan - 7  #  ninja - 12  #  Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1041)
//         at V.main(V.java:17)
