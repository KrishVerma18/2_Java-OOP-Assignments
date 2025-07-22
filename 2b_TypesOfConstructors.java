public class Student {
    String name;
    int roll;

    // Default Constructor
    Student() {
        System.out.println("Default Constructor called");
    }

    // No-arg Constructor
    Student(String n) {
        name = n;
        System.out.println("Name: " + name);
    }

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        roll = r;
        System.out.println("Name: " + name + ", Roll: " + roll);
    }

    // Copy Constructor (manual)
    Student(Student s) {
        name = s.name;
        roll = s.roll;
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Default
        Student s2 = new Student("Krish"); // No-arg
        Student s3 = new Student("Krish", 101); // Param
        Student s4 = new Student(s3); // Copy
        System.out.println("Copied: " + s4.name + ", " + s4.roll);
    }
}
