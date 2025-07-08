import java.util.Comparator;

class AgeDscSort implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return b.age.compareTo(a.age);
    }
}