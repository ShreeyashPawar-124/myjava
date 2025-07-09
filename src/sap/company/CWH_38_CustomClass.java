package sap.company;

class Employee{     // Create a new custom class
    int id;         // Attributes of class
    String name;    // Attributes of class
    int salary;     // Attributes of class
    public void getDetails(){                       // Method of Custom Class
        System.out.println(id+". "+name);
    }
    public void getSalary(){                       // Another Method of Custom Class
        System.out.println("Salary of "+name+" is "+salary);
    }
}
public class CWH_38_CustomClass {
    public static void main(String[] args) {
        Employee johny = new Employee();       // instantiating a new object of class Employee
        johny.id = 102;                        // Setting attributes for object johny
        johny.salary = 50000;
        johny.name = "Johny Sins";
        Employee harry = new Employee();       // instantiating another new object of class Employee
        harry.id = 101;                        // Setting attributes for object harry
        harry.salary = 30000;
        harry.name = "Coder Harry";
        harry.getDetails();                    // calling Method to get values(Attributes) inside the methods
        johny.getDetails();
        johny.getSalary();
    }
}
