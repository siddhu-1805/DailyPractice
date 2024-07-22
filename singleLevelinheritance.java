class Employee {
    String empId;
    String designation;
    String name;
    double salary;
    Employee(){
        System.out.println("super class constructor");
    }
}
class Developer extends Employee{
    static final double workHours = 13.5;
    Developer(String empId,    String designation,    String name,double salary){
        System.out.println("sub class constructor");
        this.empId=empId;
        this.designation=designation;
        this.name=name;
        this.salary=salary;
    }
    public String displayDetails() {
        return "\nName: "+name+"\nDesignation: "+designation
                +"\nEmployee Id: "+empId+"\nSalary: "+salary
                +"\nWorkHours: "+workHours+"\n\n";
    }
}

public class MainClass3 {
public static void main(String[] args) {
    Developer developer1 =
            new Developer("TYP9001","Senior Software Engineer","Jagannath",200000);
    Developer developer2 =
            new Developer("HWL001", "VL-II Engineer", "Omprakash",2400000);
    System.out.println(developer1.displayDetails());
    System.out.println(developer2.displayDetails());
   
   
}
