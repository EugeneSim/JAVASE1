package inheritance.constructor;

public class Department {
    String dname;
    int did;

    public Department(String dname, int did) {
        this.dname = dname;
        this.did = did;
    }

    @Override
    public String toString() {
        return "Department : dname=" + dname + ", did=" + did;
    }

}
