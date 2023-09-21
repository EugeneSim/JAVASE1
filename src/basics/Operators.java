package basics;

/**
 * Operators
 */
public class Operators {

    public static void main(String[] args) {
        int i = 10; int j = 20;
        //Addition
        System.out.println(i + j);
        System.out.println( i + " added to " + j + " is " + (i+j));
        //Subtraction
        System.out.println(i - j);
        System.out.println( i + " minus " + j + " is " + (i-j));
        //Multiply
        System.out.println(i * j);
        System.out.println( i + " multiply by " + j + " is " + (i*j));
        //Division
        System.out.println(i / j);
        System.out.println( i + " divided by " + j + " is " + (i/j));
        //Remainder
        System.out.println(i % j);
        System.out.println( (i%j)+ " is the remainder of " + j + " and " + i);

        //Concatinating Strings
        String fname="Bill";
        String lname="Gates";
        String fullname = fname + lname;
        System.out.println(fullname);
    }
}