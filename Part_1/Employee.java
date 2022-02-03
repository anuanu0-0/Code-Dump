package Part_1;

import lombok.*;

import java.time.LocalDate;


/**
 * Added lombok to classpath
 * **/
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    private Double salary;
    private LocalDate dateOfJoining;
}
