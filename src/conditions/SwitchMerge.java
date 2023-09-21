package conditions;

/**
 * SwitchClass
 */
public class SwitchMerge {

    public static void main(String[] args) {

        int dow =6;

        switch (dow) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("Weekday");
            break;
        case 6:
        case 7:
            System.out.println("Weekend");
            break;
        }

    }
}