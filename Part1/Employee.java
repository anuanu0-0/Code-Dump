package Part1;

import lombok.*;

import java.time.LocalDate;


/**
 * Added lombok to classpath
 * **/
@Data
@NoArgsConstructor
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
