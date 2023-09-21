package basics;

/**
 * StringClass
 */
public class StringClass {

    public static void main(String[] args) {
        
    
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "Welcome";

    String n1 = new String("Hello");
    String n2 = new String("Hello");
    String n3 = new String("Welcome");

    //test results
    System.out.println(s1 == s2);
    System.out.println(s1 == n2);
    System.out.println(s1 == n1);
    System.out.println(s1 == n3);
    System.out.println(s3 == n3);

    System.out.println(s1.equals(n2));
    System.out.println(s3.equalsIgnoreCase(n3));

    //methods
    //string is an array of characters
    String test = "This is java";
    System.out.println(test.length());
    System.out.println(test.charAt(11));
    System.out.println(test.toLowerCase());
    System.out.println(test.toUpperCase());
    System.out.println(test.concat("string"));
    System.out.println(test.contains("java"));
    System.out.println(test.indexOf("j"));
    System.out.println(test.substring(0));


    // Using StringBuilder to reverse the string
    StringBuilder reversed = new StringBuilder(test);
    reversed = reversed.reverse();
    
    System.out.println("Original string: " + test);
    System.out.println("Reversed string: " + reversed.toString());
    }
}