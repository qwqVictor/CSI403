
/**
* Helper for testing purpose only
* @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
* @version 1.0
*/

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;


public class Helper {

    public static void start(String file) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            FileInputStream inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                Employee employee = new Employee(line[0], Double.parseDouble(line[1]));
                employees.add(employee);
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.err.println("File not found!");
            return;
        }

        ADTPriorityQueue<Employee> pqByName = new ADTPriorityQueue<Employee>(new EmployeeComparatorByName());
        ADTPriorityQueue<Employee> pqByPayRate = new ADTPriorityQueue<Employee>(new EmployeeComparatorByPayRate());

        for (Employee employee : employees) {
            pqByName.insert(employee);
            pqByPayRate.insert(employee);
        }
        
        System.out.println("By name: ");
        while (!pqByName.isEmpty()) {
            System.out.printf("  %s\n", pqByName.delete());
        }

        System.out.println("By pay rate: ");
        while (!pqByPayRate.isEmpty()) {
            System.out.printf("  %s\n", pqByPayRate.delete());
        }

        System.out.println("sort with name: ");
        pqByName.sort(employees);
        for (Employee employee : employees) {
            System.out.printf("  %s\n", employee);
        }
    }
}