package InnerClass;

/**
 * OuterClass
 */
public class OuterClass {

    private int outerAge;

    public OuterClass(int outerAge) {
        this.outerAge = outerAge;
    }

    class InnerClass{
        private int innerAge;

        public InnerClass(int innerAge) {
            this.innerAge = innerAge;
        }
        
        void show() {
            System.out.println(outerAge);
            System.out.println(innerAge);
        }

        public InnerClass createInnerClass(int innerData) {
            return new InnerClass(innerData);
        }
    }
}