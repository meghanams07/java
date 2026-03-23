class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        System.out.println("Employee constructor");
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}