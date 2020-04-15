package domain;
/**
 * Містить реалізацію методів та метод для відображення результатів
 * @author IT-Service
 * @see Employee
 */
public class Artist extends Employee {
    /**
     * Встановлює значення полів, аргумента і результат
     * @param skiils - значеня для ініціалізації поля
     * @param name - значеня для ініціалізації поля
     * @param jobTitle - значеня для ініціалізації поля
     * @param level - значеня для ініціалізації поля
     * @param dept - значеня для ініціалізації поля
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * Ініціалізатор
     * @param skiils - навички, вміння
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Ініціалізатор
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * Метод для виводу значень та метод для отримання значення поля
     * @return Skiils
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    
    private String[] skiils;
    /**
     * Отримання значення значення поля
     * @return s
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Встановлення нових вмінь
     * @param skills - значення поля
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * Отримання листа з вмінь
     * @return skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
