package testpackages;
import objects.Employees;

import java.util.ArrayList;

public class CreatEmployee {
    public static void main(String[] args) {
        Employees employees = new Employees(100, "john", "Sales", 5673.55F);
        Employees emp = new Employees(101, "David");
        Employees e = new Employees();
        Employees e1 = new Employees();
        Employees e2 = new Employees();

        ArrayList<Employees> empl = new ArrayList<>();
        empl.add(new Employees(100, "John", "Sales", 5556.5f));
        empl.add(new Employees(101, "Jill", "Mktg", 5556.5f));
        empl.add(new Employees(102, "Jane", "IT", 5556.5f));

        // Print Array List
        for (Employees x : empl) {
            System.out.println(x.toString());
        }
    }
}
