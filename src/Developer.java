public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}
