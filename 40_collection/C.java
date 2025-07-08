import java.util.TreeMap;
import java.util.Comparator;

import java.util.Scanner;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for NameAscSort\n2 for NameDscSort");
        System.out.println("Press 3 for AgeAscSort\n4 for AgeDscSort");

        int value = sc.nextInt();

        sc.close();
        
        Comparator<Student> comp = null;

        if(value == 1) {
            comp = new NameAscSort();
        } else if(value == 2) {
            comp = new NameDscSort();
        } else if(value == 3) {
            comp = new AgeAscSort();
        } else if(value == 4) {
            comp = new AgeDscSort();
        } else {
            System.exit(0);
        }

        TreeMap<Student,College> map = new TreeMap<Student,College>(comp);
        
        map.put(new Student("mohan", 20), new College("Global"));
        map.put(new Student("vikram", 18), new College("SRIT"));
        map.put(new Student("suresh", 21), new College("HEC"));
        map.put(new Student("ranveer", 19), new College("JEC"));
        map.put(new Student("mukesh", 22), new College("GGITS"));
        map.put(new Student("suresh", 21), new College("GGCT"));

        System.out.println(map);
    }
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.age.compareTo(b.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.age.compareTo(a.age);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.name.compareTo(a.name);
    }
}