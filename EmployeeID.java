class EmployeeID {
    int id;
    String department;

    EmployeeID(int id, String department) {
        System.out.println("EmployeeID constructor");
        this.id = id;
        this.department = department;
    }

    public void showEmployeeIDDetails() {
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}