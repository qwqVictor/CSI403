public class Employee implements Comparable<Employee> {
    private String name;
    private double payRate;

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the payRate
     */
    public double getPayRate() {
        return payRate;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.getName(), this.getPayRate());
    }

    @Override
    public int compareTo(Employee b) {
        return (new EmployeeComparatorByName()).compare(this, b);
    }
}