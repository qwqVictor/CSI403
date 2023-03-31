import java.util.Comparator;

public class EmployeeComparatorByName implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }
}