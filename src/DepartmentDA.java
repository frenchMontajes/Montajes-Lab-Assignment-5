import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DepartmentDA {
    private HashMap<String, Department> deptMap;
    private EmployeeDA employeeDA;

    public DepartmentDA() throws FileNotFoundException {
        this.employeeDA = new EmployeeDA();
        try (Scanner departmentFile = new Scanner(new FileReader("C:\\Users\\frenc\\IdeaProjects\\ShoolActivities\\LabAssignment5\\src\\dep.csv"))) {
            deptMap = new HashMap<>();
            while (departmentFile.hasNextLine()) {
                String line = departmentFile.nextLine();
                String[] depInfo = line.split(",");
                Department department = new Department();
                department.setDepCode(depInfo[0].trim());
                department.setDepName(depInfo[1].trim());

                readDeptEmp(department);
                print(department);

                deptMap.put(department.getDepCode(), department);
            }
        }
    }

    private void readDeptEmp(Department department) throws FileNotFoundException {
        try (Scanner deptEmpFile = new Scanner(new FileReader("C:\\Users\\frenc\\IdeaProjects\\ShoolActivities\\LabAssignment5\\src\\deptemp.csv"))) {
            while (deptEmpFile.hasNextLine()) {
                String line = deptEmpFile.nextLine();
                String[] deptEmpInfo = line.split(",");
                if (deptEmpInfo[0].trim().equals(department.getDepCode())) {
                    String empNo = deptEmpInfo[1].trim();
                    Employee employee = employeeDA.getEmployees().get(empNo);
                    if (employee != null) {
                        employee.setSalary(Double.parseDouble(deptEmpInfo[2]));
                        department.getEmployees().put(empNo, employee);
                        department.setDepTotalSalary(department.getDepTotalSalary() + employee.getSalary());
                    }
                }
            }
        }
    }

    public void print(Department department) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Department Code: " + department.getDepCode());
        System.out.println("Department Name: " + department.getDepName());
        System.out.println("Department total Salary: " + df.format(department.getDepTotalSalary()));
        System.out.println("------------Details----------------");
        System.out.printf("%-10s %-20s %10s\n", "EmpNo", "EmployeeName", "Salary");
        for (Map.Entry<String, Employee> entryMap : department.getEmployees().entrySet()) {
            Employee employee = entryMap.getValue();
            System.out.printf("%-10s %-20s %10s\n", entryMap.getKey(),
                    employee.getLastName() + ", " + employee.getFirstName(), df.format(employee.getSalary()));
        }
        System.out.println();
    }

    public HashMap<String, Department> getDeptMap() {
        return deptMap;
    }

    public void setDeptMap(HashMap<String, Department> deptMap) {
        this.deptMap = deptMap;
    }
}