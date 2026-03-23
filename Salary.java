class Salary {
    double baseSalary;
    double bonus;

    Salary(double baseSalary, double bonus) {
        System.out.println("Salary constructor");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public void showSalaryDetails() {
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (baseSalary + bonus));
    }
}