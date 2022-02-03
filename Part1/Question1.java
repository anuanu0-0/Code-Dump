package Part1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        // Populate the table
        // Test data
        Department account  = new Department(401, "ACCOUNT", "Jharkhand");
        Department hr  = new Department(402, "HR", "Bangalore");
        Department ops  = new Department(403, "OP", "Delhi");
        Department tech  = new Department(404, "TECH", "Dehradun");

        List<Employee> employees = Arrays.asList(   new Employee(2, "Tanya", "Verma", "asdasdasl772gmail.com", hr, 99.6 ,LocalDate.of(2000, 12, 21)),
                                                    new Employee(3, "jackson", "Rawat", "asdasd@gmail.com", ops, 95450.0, LocalDate.of(2000, 12, 15)),
                                                    new Employee(4, "anupam", "Rawat", "asdafaf@gmail.com", hr,968550.0, LocalDate.of(2000, 12, 17)),
                                                    new Employee(5, "pranjal", "Rawat", "tnaknsd@gmail.com", account, 95816810.0, LocalDate.of(2000, 12, 18)),
                                                    new Employee(6, "Anshu", "Rawat", "rasdasdul772gmail.com", hr, 91215150.0, LocalDate.of(2000, 12, 19)),
                                                    new Employee(7, "test0 ", "Rawat", "adasd772gmail.com", ops, 951510.0, LocalDate.of(2000, 12, 10)),
                                                    new Employee(8, "test1", "Rawat", "rahul772gmail.com", account, 91518180.0, LocalDate.of(2000, 12, 17)),
                                                    new Employee(9, "test2", "Rawat", "rahul7ad72gmail.com", tech, 992510.0, LocalDate.of(2000, 12, 19)),
                                                    new Employee(10, "test3", "Rawat", "rahul77das2gmail.com", ops, 9151810.0, LocalDate.of(2000, 1, 20)),
                                                    new Employee(11, "test4", "Rawat", "rahul77asd2gmail.com", account,952190.0, LocalDate.of(2000, 2, 21)),
                                                    new Employee(12, "test5", "Rawat", "rahuldas772gmail.com", tech, 662690.0, LocalDate.of(2000, 4, 12)),
                                                    new Employee(13, "test6", "Rawat", "rahul77da2dgmail.com", tech, 1589290.0, LocalDate.of(2000, 2, 3)),
                                                    new Employee(14, "test7", "Rawat", "rahul77das2gmail.com", account, 8181290.0, LocalDate.of(2000, 11, 3)),
                                                    new Employee(15, "test8", "Rawat", "rahul7das72gmail.com", hr,2189190.0, LocalDate.of(2000, 6, 3)),
                                                    new Employee(16, "test9", "Rawat", "rahul77asd2gmail.com", ops, 881890.0, LocalDate.of(2000, 12, 3)));


        /**
         *  Query 1 : Find department with highest count of employees
         * */

        // Populate the employee count map
        Map<String, Integer> employeeCount = new HashMap<>();
        for(Employee employee: employees) {
            String departmentName = employee.getDepartment().getDepartmentName();
            int currentCount = 1;
            if(employeeCount.containsKey(departmentName)) {
                currentCount = employeeCount.get(departmentName) + 1;
            }

            employeeCount.put(departmentName, currentCount);
        }

        // Print department with highest count of employee
        Map.Entry<String, Integer> maxEntry = employeeCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Part1.Department with highest count of people ");
        System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());


        /**
         * Query 2 : Find out the senior most employee from each department
         * **/

        // Populate the senior Employees  map
        Map<Department, Employee> seniorEmployees = new HashMap<>();
        for(Employee employee: employees) {
            Department department = employee.getDepartment();
            if(seniorEmployees.containsKey(department)) {
                // Compare the dates and store the min date
                LocalDate storedDate = seniorEmployees.get(department).getDateOfJoining();
                LocalDate currentDate = employee.getDateOfJoining();
                if(currentDate.isBefore(storedDate)) {
                    seniorEmployees.put(department, employee);
                }
            } else {
                seniorEmployees.put(department, employee);
            }
        }
        // Print out the values
        System.out.println("Senior most employees of each department ");
        seniorEmployees.values().stream().forEach(System.out::println);


        /**
         * Query 3 : Sorting employee names, department name wise.
         * **/
        Map<String, String> employeesMapSorted = new HashMap<>();
        for(Employee employee : employees) {
            String employeeName = employee.getFirstName() + employee.getLastName();
            employeesMapSorted.put(employeeName, employee.getDepartment().getDepartmentName());
        }

        employeesMapSorted.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Sorted employees w.r.t department name");
        System.out.println(employeesMapSorted);

    }
}
