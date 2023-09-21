package Abstraction;

public interface InterfaceDemo {
    int test = 10;

    // Abstract methods
    void sayHello();

    int add(int x, int y);

    default void test() {
        System.out.println("Default method invoked");
    }

    static void testStatic() {
        System.out.println("Static method invoked");
    }
}