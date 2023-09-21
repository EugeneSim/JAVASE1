package Abstraction;

public class InterfaceImplement implements InterfaceDemo, InterfaceTwo {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    // concrete method
    @Override
    public int add(int x, int y) {
        return (x + y);
    }

    // concrete method
    void one() {
        System.out.println("Method in the class implementing interface");
    }

    public static void main(String[] args) {
        InterfaceImplement interfaceImplement = new InterfaceImplement();
        interfaceImplement.add(10, 20);
        interfaceImplement.greet();
    }

    @Override
    public void greet() {
        System.out.println("Method from interface two");
        System.out.println(InterfaceDemo.test);
    }

}
