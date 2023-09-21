package InnerClass;

/**
 * Driver
 */
public class Driver {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(20);
        outerClass.InnerClass inner = outerClass.createInnerClass(20);
        inner.show();
    }
}