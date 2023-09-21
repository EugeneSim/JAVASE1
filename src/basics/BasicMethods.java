package basics;

/**
 * BasicMethods
 */
public class BasicMethods {
        // return type
        // primitive type or object type or void ( no return value)
        // if not void the last statement that is executed will be the 

        //void 
        void sayHello() {
            System.out.println("Hello");
        }

        //define class method
        static void welcome() {
            System.out.println("Welcome");
        }

        //non void method
        int add (int n1, int n2) {
            System.out.println("In the add method");
            return(n1+n2);
        }
        public static void main(String[] args) {
        BasicMethods basicMethods = new BasicMethods();
        //calling the instance method
        basicMethods.sayHello();
        
        System.out.println(basicMethods.add(87, 13));
        int res = basicMethods.add(87 , 13);
        System.out.println("Result of addition: " + res);

        // calling the class method
        BasicMethods.welcome();
        }
    
}