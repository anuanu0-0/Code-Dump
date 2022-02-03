package Part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;


/**
 * Added lombok to classpath
 * **/
@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    private double salary;
    private LocalDate dateOfJoining;
    
}
