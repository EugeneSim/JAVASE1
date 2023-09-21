package basics;

/**
 * StringBuilder
 */
public class StringBuilder {

    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello World");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append(" of Java");
        System.out.println(sb);
        sb.insert(7, " to ");
        System.out.println(sb);
        System.out.println(sb.reverse());
    
    }
}