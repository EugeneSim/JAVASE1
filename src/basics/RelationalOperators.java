package basics;

/**
 * RelationalOperators
 */
public class RelationalOperators {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1 < n2);
        System.out.println(n1 > n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);

        String s1 = "something";
        String s2 = "anything";

        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
        System.out.println(s1.equals(s2));
        System.out.println(!(s1.equals(s2)));

    }
}