import java.util.ArrayList;
import java.util.List;

public class Team <T extends Employee>{
    private Manager manager;
    private List<T> listEmployees;


    public Team(Manager manager) {
        this.manager = manager;
        this.listEmployees = new ArrayList<>();
    }
    public void addEmployee(T employee) {
        listEmployees.add(employee);
    }
    @Override
    public String toString() {
        return "Team{" +
                "manager=" + manager +
                ", listEmployees=" + listEmployees +
                "}\n";
    }
}
