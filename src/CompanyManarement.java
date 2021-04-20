import java.util.List;

public class CompanyManarement {
    public static void main (String[] args) {
        //Create instance
        EmployeeDAOImpl dao = EmployeeDAOImpl.getInstance();

        //display
        displayAllEmp(dao);
        //add new employee
        addNewEmp(dao);

    }
    private static void addNewEmp(EmployeeDAOImpl dao){
        Employee myEmp = new Employee(emp_id"",name"");
        dao.addEmp(myEmp);
    }
    private static void displayAllEmp(EmployeeDAOImpl dao){
        List<Employee> emp = dao.getAllEmp();
        System.out.println("Emplpyee Data : ");
        for (Employee e :emp){
            System.out.println(e.toString());
        }
    }
}