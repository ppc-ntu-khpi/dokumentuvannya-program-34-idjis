package domain;
/**
 * Містить реалізацію матодів
 * @author IT-Service
 * @see Employee
 */
public class Manager extends Employee {
    /**
     * Ініціалізатор
     * @param employees - значення для ініціалізації поля
     * @param name - значення для ініціалізації поля
     * @param jobTitle - значення для ініціалізації поля
     * @param level - значення для ініціалізації поля
     * @param dept - значення для ініціалізації поля
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    /**
     * Вивід значення
     * @return Employees - значення поля
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /**
     * Ініціалізатор
     * @param employees - працівники 
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * Ініціалізатор
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    /**
     * Отримання значення
     * @return s - значення поля Name
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Встановелння значення
     * @param employees - працівники
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Повернення значення
     * @return employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
