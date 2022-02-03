package Part_1;

import lombok.*;

/**
 * Added lombok to classpath
 * **/
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int departmentId;
    private String departmentName;
    private String location;
}
