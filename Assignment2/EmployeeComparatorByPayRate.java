import java.util.Comparator;

public class EmployeeComparatorByPayRate implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        double k = (a.getPayRate() - b.getPayRate());
        if (k > 0) return 1;
        else if (k < 0) return -1;
        else return 0;
    }
}