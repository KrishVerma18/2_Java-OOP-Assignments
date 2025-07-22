public class StaticKeyword {
    static int count = 0;  // static variable

    static {  // static block
        System.out.println("Static block runs first.");
    }

    StaticKeyword() {
        count++;
        System.out.println("Object created. Count: " + count);
    }

    static void showCount() {  // static method
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        StaticKeyword.showCount();  // called without object
    }
}
