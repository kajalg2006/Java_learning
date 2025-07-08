import java.util.Comparator;

class AgeAscSort implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.age.compareTo(b.age);
    }
} 