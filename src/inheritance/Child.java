package inheritance;

public class Child extends Parent {
    public Child() {
        System.out.println("Hello from Child class constructor");
    }

    public void childMethod() {
        System.out.println("Child Method called");
    }

    @Override
    public void greet() {
        System.out.println("Hello from greet method in Child");
    }

}