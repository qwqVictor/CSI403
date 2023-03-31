public class Employee implements Comparable<Employee> {
    private String name;
    private double payRate;

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    @Override
    public int compareTo(Employee b) {
        return (new EmployeeComparatorByName()).compare(this, b);
    }
}