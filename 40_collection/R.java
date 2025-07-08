import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class R {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("ketak", 8));
        list.add(new Employee("hitesh", 15));
        list.add(new Employee("sarvan", 10));
        list.add(new Employee("giyan", 17));
        list.add(new Employee("nobita", 7));
        list.add(new Employee("binja", 12));

        System.out.println(list);

        // Comparator<Employee> comp = new AgeDscSort();
        Comparator<Employee> comp = new AgeAscSort();
        // Comparator<Employee> comp = new NameAscSort();
        // Comparator<Employee> comp = new NameDscSort();
        Collections.sort(list, comp);

        System.out.println(list);
        

        Employee emp = new Employee("sarvan", 8);
        // Employee emp = new Employee("jagdeep", 9);
        System.out.println(Collections.binarySearch(list, emp, comp));
    }
}
