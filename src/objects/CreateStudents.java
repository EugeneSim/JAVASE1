package objects;

import objects.Student;

public class CreateStudents {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 24;
        s1.isMale = false;
        s1.grade = 3;
        s1.marksInEnglish = 55.5f;
        s1.marksInMath = 89.2f;

        // Create the second student
        Student s2 = new Student();
        s2.name = "Jack";
        s2.age = 17;
        s2.isMale = true;
        s2.grade = 4;
        s2.marksInEnglish = 60.9f;
        s2.marksInMath = 58.1f;

        // Print student data
        System.out.println(s1.name + " is " + s1.age + " years of age, " + (s1.isMale ? "Male" : "Female") + " and has scored " + s1.marksInEnglish + " in English and " + s1.marksInMath + " marks in Math." + Student.School);
        System.out.println(s2.name + " is " + s2.age + " years of age, " + (s2.isMale ? "Male" : "Female") + " and has scored " + s2.marksInEnglish + " in English and " + s2.marksInMath + " marks in Math." + Student.School);

        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[1].name = "xyz";
        students[1].age = 14;
        students[1].grade = 4;
        students[1].isMale = true;

    }
}
