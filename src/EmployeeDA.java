import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDA {
    private HashMap<String, Employee> employees;

    public EmployeeDA() throws FileNotFoundException {
        try (Scanner employeeFile = new Scanner(new FileReader("src/emp.csv"))) {
            employees = new HashMap<>();
            while (employeeFile.hasNextLine()) {
                String line = employeeFile.nextLine();
                String[] empInfo = line.split(",");
                String empNo = empInfo[0].trim();
                Employee employee = new Employee(empNo, empInfo[1].trim(), empInfo[2].trim());
                employees.put(empNo, employee);
            }
        }
    }

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }
}
