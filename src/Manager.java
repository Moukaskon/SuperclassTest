public class Manager {
    private String name;
    private int id;
    private String department;

    public Manager(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
