class EmployeeSalary extends Salary {
    EmployeeSalary(double baseSalary, double bonus) {
        super(baseSalary, bonus);
        System.out.println("EmployeeSalary constructor");
    }
}