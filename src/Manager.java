public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}
