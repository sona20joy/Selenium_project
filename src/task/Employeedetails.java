package task;
	class Member {
    String name;
    int age;
    double salary;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specification;

    void display() {
        printDetails();
        System.out.println("Specification: " + specification);
    }
}

class Manager extends Member {
    String department;

    void display() {
        printDetails();
        System.out.println("Department: " + department);
    }
}	

public class Employeedetails {

	public static void main(String[] args) {
		Employee e = new Employee();
        e.name = "Sona";
        e.age = 25;
        e.salary = 30000;
        e.specification = "Java Developer";

        System.out.println("Employee Details");
        e.display();

        System.out.println();

        Manager m = new Manager();
        m.name = "Joy";
        m.age = 40;
        m.salary = 60000;
        m.department = "IT";

        System.out.println("Manager Details");
        m.display();
    }

		

	

}

