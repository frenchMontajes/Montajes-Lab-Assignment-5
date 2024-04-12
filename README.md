You are required to present a department report that accesses csv files. You must put the data on the domain composition of the objects.
## Class Diagram 
![image](https://github.com/frenchMontajes/Montajes-Lab-Assignment-5/assets/130640700/c5e34cbb-c6bb-4772-a5f7-d81f4d911fda)

## Csv Files
dep.csv contains the following

deptCode, deptName, location <br>
IT, Information Tech, 2nd floor <br>
HR, Human Resource, 3rd floor <br>
FNC, Finance, 4th floor <br>

The deptemp.csv is referenced to get the salary  of the employees per department:

deptCode, empNo, salary <br>
IT, E123, 30000 <br>
IT, E124, 45000 <br>
IT, E125, 51000 <br>
HR, E251, 66000 <br>
HR, E252, 25000 <br>
FNC, E370, 42000 <br>
FNC, E371, 29000 <br> 
FNC, E372, 37000 <br>

To get the details of the employee you must access the emp.csv:

empNo, lastName, firstName, job <br>
E123, Maxwell, John, Developer <br>
E124, Delos Reyes, Ernesto, Analyst <br>
E125, Ortiz, Manuel, Tester <br>
E251, Natividad, Lisa, HR Manager <br>
E252, Rosanto, Margareth, HR Specialist <br>
E370, Baldo, Jason, Team Leader <br>
E371, Hernandez, Timothy, Junior Accountant <br>
E372, Cruz, Ricardo, CPA <br>

You need to create objects that will handle the retrieval of the csv files to convert it into objects.  These are EmployeeDA and EmployeeDA objects.  This will be the execution of the sequence:

![Screenshot 2024-04-11 213731](https://github.com/kevinmlisboa/OOP_Lab-Assignment-5/assets/133233113/7f9c2883-6a16-4d73-b44f-fcf4de3a5576)

### This will be the sample generated report:
Department code: IT <br> 
Department name: Information Tech <br> 
Department total salary: 126,000.00 <br> 
---------------------Details ------------------------- <br>
EmpNo		 Employee Name	Salary <br> 
E123		Maxwell, John			30,000.00 <br>
E125		Ortiz, Manuel			51,000.00 <br>
E124		Delos Reyes, Ernesto		45,000.00 <br> 

Department code: HR <br>
Department name: Human Resource <br> 
Department total salary: 91,000.00 <br> 
---------------------Details ------------------------- <br>
EmpNo		 Employee Name	Salary <br> 
E252		Rosanto, Margareth		25,000.00 <br>
E251		Natividad, Lisa		66,000.00 <br>

Department code: FNC <br>
Department name: Finance <br>
Department total salary: 108,000.00 <br>
---------------------Details ------------------------- <br>
EmpNo		 Employee Name	Salary <br>
E370		Baldo, Jason			42,000.00 <br> 
E371		Hernandez, Timothy		29,000.00 <br>
E372		Cruz, Ricardo			37,000.00 <br>

## Instructions

- Do not alter the composition of the domain objects.
- Adhere to correct naming conventions for variables and objects.
- Utilize HashMap as the solution to the problem.
- Use the `department.setDepTotalSalary()` method to aggregate total salaries into the object.
- Stick to the provided design and disregard any unnecessary data in the CSV files.

