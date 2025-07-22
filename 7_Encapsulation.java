public class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Krish");

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}
