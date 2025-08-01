class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound(); // Calls Dog's version (runtime polymorphism)
    }
}
