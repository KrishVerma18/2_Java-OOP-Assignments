final class Animal {
    final int legs = 4;

    final void sound() {
        System.out.println("Animals make sound");
    }
}

// class Dog extends Animal { // Error: Cannot inherit from final class
//     void sound() { // Error: Cannot override final method
//         System.out.println("Dog barks");
//     }
// }

public class FinalKeyword {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("Legs: " + a.legs);
        a.sound();
    }
}
