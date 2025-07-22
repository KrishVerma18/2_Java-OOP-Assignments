class Animal {
    String type = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }

    void display() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super(); // Calls Animal constructor
        System.out.println("Dog constructor");
    }

    void showType() {
        System.out.println(super.type); // Access parent variable
    }

    void display() {
        super.display(); // Call parent method
        System.out.println("This is a dog");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.showType();
        d.display();
    }
}
