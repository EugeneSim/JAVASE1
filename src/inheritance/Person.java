package inheritance;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public boolean equals(Object obj) {

        if (getClass() != obj.getClass() || obj == null) {
            return false;
        }

        Person otherPerson = (Person) obj;
        return age == otherPerson.age && name.equalsIgnoreCase(otherPerson.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Alex", 35);
        Person p3 = new Person("Alex", 45);
        Person p4 = p1;
        Parent parent = new Parent();

        System.out.println(parent.equals(p1));

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p2.equals(p3));

        // hashcode is used to check the equivalence of objects
        /*
         * System.out.println(p1.hashCode());
         * System.out.println(p2.hashCode());
         * System.out.println(p3.hashCode());
         * System.out.println(p4.hashCode());
         * 
         * System.out.println(p1 == p2);
         * System.out.println(p1 == p4); // will be true as the same memory is shared
         */

    }
}
