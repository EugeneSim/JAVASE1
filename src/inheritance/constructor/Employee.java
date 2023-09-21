package inheritance.constructor;

public class Employee extends Department {
    String ename;
    int eid;

    public Employee(String dname, int did, String ename, int eid) {
        super(dname, did); // mandatory and should be the first line of code in the constructor of child
                           // class
        this.ename = ename;
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee : ename="
                + ename
                + ": eid="
                + eid
                + "\n"
                + "Department : dname=" + dname + ", did=" + did;
    }

}
