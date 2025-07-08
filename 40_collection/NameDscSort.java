import java.util.Comparator;

public class NameDscSort implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return b.name.compareTo(a.name);
    }
} 