package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList
        // is part of the java util
        // no size is defined
        // Generics based
        // cannot work with primitive types

        // Declare an ArrayList of String type
        ArrayList<String> students = new ArrayList<>();
        // Adding elements to ArrayList
        students.add("Jim");
        students.add("Jane");
        students.add("John");
        students.add("Alex");
        students.add("David");
        students.add("Bill");
        // print elements in ArrayList
        for (String string : students) {
            System.out.println(string);
        }
        System.out.println(students.size());
        System.out.println(students.get(0));
        students.set(0, "Simon");
        System.out.println(students.get(0));

        students.set(0, students.get(0).toUpperCase());
        System.out.println(students.get(0));

        System.out.println(students.indexOf("SIMONXX"));

        students.remove(0);
        for (String string : students) {
            System.out.println(string);
        }

        students.replaceAll(s -> s.toUpperCase());
        for (String string : students) {
            System.out.println(string);
        }
        ArrayList<Integer> count = new ArrayList<>();
        count.add(10);
        count.add(20);
        count.add(30);

        count.replaceAll(c -> c * 2);
        for (Integer integer : count) {
            System.out.println(integer);
        }

    }
}
