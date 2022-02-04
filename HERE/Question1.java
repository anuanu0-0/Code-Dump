package HERE;

import java.util.HashMap;

class Salary {
    HashMap<String, Integer> empList;
    Salary() {
        empList = new HashMap<>();
    }

    public int totalSalary() {
        return empList.values().stream().mapToInt(Integer::intValue).sum();
    }

    public String getSalary(String designation) {
        if(empList.containsKey(designation)) {
            return "salary is " + empList.get(designation);
        }
        return "no designation match";
    }

    public void updateSalary(String designation, int newSalary) {
        empList.put(designation, newSalary);
    }
}

public class Source {
    public static void main(String[] args) throws Exception{
        Salary obj = new Salary();
        obj.empList.put("CEO", 20000);
        obj.empList.put("DEV", 5000);

        System.out.println(obj.totalSalary());
        obj.updateSalary("DEV", 6000);
        System.out.println(obj.getSalary("DEV"));
    }
}
