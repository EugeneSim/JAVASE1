package typecast;

public class NarrowingCast {
    public static void main(String[] args) {
        shortNarrowCast();
        intNarrowCast();
        longNarrowCast();
        floatNarrowCast();
        doubleNarrowCast();
    }

    static void shortNarrowCast() {
        short s = 65;
        byte b = (byte) s;
        char c = (char) s;
        System.out.println(s + " " + b + " " + c);
    }

    static void intNarrowCast() {
        int i = 65;
        short s = (short) i;
        byte b = (byte) i;
        char c = (char) i;
        System.out.println(i + " " + s + " " + b + " " + c);
    }

    static void longNarrowCast() {
        long l = 65;
        int i = (int) l;
        short s = (short) l;
        byte b = (byte) l;
        char c = (char) l;
        System.out.println(l + " " + i + " " + s + " " + b + " " + c);
    }

    static void floatNarrowCast() {
        float f = 65.0f;
        long l = (long) f;
        int i = (int) f;
        short s = (short) f;
        byte b = (byte) f;
        char c = (char) f;
        System.out.println(f + " " + l + " " + i + " " + s + " " + b + " " + c);
    }

    static void doubleNarrowCast() {
        double d = 65.5;
        float f = (float) d;
        long l = (long) d;
        int i = (int) d;
        short s = (short) d;
        byte b = (byte) d;
        char c = (char) d;
        System.out.println(d + " " + f + " " + l + " " + i + " " + s + " " + b + " " + c);
    }

}