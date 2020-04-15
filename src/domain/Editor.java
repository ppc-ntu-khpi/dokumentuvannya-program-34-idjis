package domain;
/**
 * Містить реалізацію методів та метод для відображення результатів
 * @author IT-Service
 * @see Artist
 */
public class Editor extends Artist {
    /**
     * Встановлює значення полів, аргументів
     * @param electronicEditing - значення для ініціалізації поля
     * @param skiils - значення для ініціалізації поля
     * @param name - значення для ініціалізації поля
     * @param jobTitle - значення для ініціалізації поля
     * @param level - значення для ініціалізації поля
     * @param dept - значення для ініціалізації поля
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Ініціалізатор
     * @param electronicEditing - значення поля True, False
     * @param skiils - навички, вміння
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Ініціалізатор
     * @param electronicEditing
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Ініціалізатор
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Виводить значення та повертає
     * @return s
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
    }
    
    private boolean electronicEditing;
    /**
     * Отримання налаштувань
     * @return electronicEditing
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Встановлення налаштувань
     * @param electronic - значення поля True, False
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
