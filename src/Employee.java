public class Employee {
    private String empNo;
    private String lastName;
    private String firstName;

    private Double Salary;

    public Employee(String empNo, String lastName, String firstName) {
        this.empNo = empNo;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




}
