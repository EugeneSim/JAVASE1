package inheritance;

public class Driver {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.greet();

        Child child = new Child();
        child.childMethod();
        child.greet();

    }
}