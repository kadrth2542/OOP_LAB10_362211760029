public class Employee {
    //attributes
    private String emp_id;
    private String name;
    private String position;
    private String email;
    private double salary;
    //constructor

    public Employee(String emp_id, String name, String position, String email, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
    }

    //getter

    public String getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }


    //tostring
    @Override
    public String toString() {
        return "Employee{" +
                "emp_id='" + emp_id + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}