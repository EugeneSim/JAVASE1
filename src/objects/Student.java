package objects;

/**
 * Student
 */
public class Student {
    //instance variables
    String name;
    int age;
    int grade;
    boolean isMale;

    float marksInMath;
    float marksInEnglish;
    static String School = "Any School";

    float totalMarks() {
        return marksInEnglish + marksInMath;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jim";
        student.age =   13;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.isMale);
        System.out.println(student.grade);
        System.out.println(student.marksInMath);
        System.out.println(student.marksInMath);
    }

}