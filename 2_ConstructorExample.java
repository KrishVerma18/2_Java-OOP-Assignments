public class Student {
    String name;
    int rollNo;

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Krish", 101);
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
    }
}
