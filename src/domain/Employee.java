package domain;
/**
 * Містить реалізацію методів
 * @author IT-Service
 */
public class Employee {
    /**
     * Метод для виводу значень
     * @return значення полів
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * Ініціалізатор та виклик методу
     * @param name - значення для ініціалізації поля
     * @param jobTitle - значення для ініціалізації поля
     * @param level - значення для ініціалізації поля
     * @param dept - значення для ініціалізації поля
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Ініціалізатор
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * Встановлення значення JobTitle
     * @param job - робота
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * Отримання значення
     * @return jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Отримання значення
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Встановлення значення
     * @param level - рівень (поверх)
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * Отримання значення
     * @return level
     */
    public int getLevel() {
        return level;
    }
    /**
     * Отримання значення
     * @return dept
     */
    public String getDept() {
        return dept;
    }
    /**
     * Встановлення значення
     * @param dept - відділ в якому працює людина
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * Встановлення значення
     * @param name - ім'я людини
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
