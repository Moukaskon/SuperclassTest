public class Developer {
    private String name;
    private int id;
    private String programmingLanguage;

    public Developer(String name, int id, String programmingLanguage) {
        this.name = name;
        this.id = id;
        this.programmingLanguage = programmingLanguage;
    }

    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

