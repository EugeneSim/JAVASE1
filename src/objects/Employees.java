package objects;

public class Employees {
    int eid;
    String ename;
    String dept;
    float sal;
    static int count;

    // default constructor, always created for all classes, if no other constructor
    // is declared

    static {
        count = 0;
        System.out.println("Static block called");
    }

    Employees() {
        System.out.println("Default constructor called " + (++count));

    }

    // All args constructor
    public Employees(int eid, String ename, String dept, float sal) {
        this.eid = eid;
        this.ename = ename;
        this.dept = dept;
        this.sal = sal;
        System.out.println("All args constructor called" + (++count));
    }

    public Employees(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
        System.out.println("Overloaded constructor called" + (++count));
    }

    @Override
    public String toString() {
        return "Employees [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", sal=" + sal + "]";
    }

}