public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id; // Refers to current class variables
        this.name = name;
        this.display(); // Calls current class method
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name);
    }

    Student() {
        this(101, "Default"); // Calls another constructor
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(202, "Krish");
    }
}
