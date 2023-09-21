package inheritance;

public class Parent {
    protected int count = 10;

    public Parent() {
        System.out.println("Hello from parent class constructor");
    }

    public void greet() {
        System.out.println("Hello from greet method in Parent");
    }
}
