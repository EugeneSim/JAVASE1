package inheritance;

public class CastingObjects {
    public static void main(String[] args) {
        Parent parent = new Child(); // widening cast
        parent.greet();

        // Child child = new Parent(); // narrow cast not allowed without casting
        Child child = (Child) parent;
        child.greet();
        child.childMethod();
    }
}
