class A {
    private int a = 10;
    int b = 20;              // default
    protected int c = 30;
    public int d = 40;

    public void show() {
        System.out.println("private: " + a);
        System.out.println("default: " + b);
        System.out.println("protected: " + c);
        System.out.println("public: " + d);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // System.out.println(obj.a);  // ❌ private - can't access
        System.out.println(obj.b);     // ✅ default - same package
        System.out.println(obj.c);     // ✅ protected - same package
        System.out.println(obj.d);     // ✅ public
    }
}
