import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private final Integer eId;
    private final String eName;
    Employee(Integer eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                '}';
    }

    public Integer geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }
}

public class WescoMain {
    public static void main(String[] args) {
        System.out.println("Hello");

        //Employee - id, name
        //name.lenght > 4
        //id > 2 digits >99
        //Capital casing
        //Sort by name ascending
        //List
        Employee e1 = new Employee(1, "Test1");
        Employee e2 = new Employee(100, "Adam");
        Employee e3 = new Employee(102, "Batman");
        Employee e4 = new Employee(10, "Chris");
        Employee e5 = new Employee(1012, "someName");

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5);
        List<String> filteredList =
                employeeList.stream()
                        .filter(employee -> employee.geteName().length() > 4 && employee.geteId() > 99)
                        .sorted(Comparator.comparingInt(Employee::geteId))
                        .map(w -> w.geteName().toUpperCase())
                        .collect(Collectors.toList());

        System.out.println(filteredList);

    }
}

//java -jar app.jar fc-app-refresh