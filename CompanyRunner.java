class CompanyRunner{
	public static void main(String[] args){
		
		Company company = new Company();

		Employee e1 = new Employee();
		e1.setEmpId(1); e1.setEmpName("Emp1"); e1.setDepartment("HR");
		company.addEmployee(e1);

		Employee e2 = new Employee();
		e2.setEmpId(2); e2.setEmpName("Emp2"); e2.setDepartment("IT");
		company.addEmployee(e2);

		Employee e3 = new Employee();
		e3.setEmpId(3); e3.setEmpName("Emp3"); e3.setDepartment("Finance");
		company.addEmployee(e3);

		Employee e4 = new Employee();
		e4.setEmpId(4); e4.setEmpName("Emp4"); e4.setDepartment("Sales");
		company.addEmployee(e4);

		Employee e5 = new Employee();
		e5.setEmpId(5); e5.setEmpName("Emp5"); e5.setDepartment("HR");
		company.addEmployee(e5);

		Employee e6 = new Employee();
		e6.setEmpId(6); e6.setEmpName("Emp6"); e6.setDepartment("IT");
		company.addEmployee(e6);

		Employee e7 = new Employee();
		e7.setEmpId(7); e7.setEmpName("Emp7"); e7.setDepartment("Finance");
		company.addEmployee(e7);

		Employee e8 = new Employee();
		e8.setEmpId(8); e8.setEmpName("Emp8"); e8.setDepartment("Sales");
		company.addEmployee(e8);

		Employee e9 = new Employee();
		e9.setEmpId(9); e9.setEmpName("Emp9"); e9.setDepartment("HR");
		company.addEmployee(e9);

		Employee e10 = new Employee();
		e10.setEmpId(10); e10.setEmpName("Emp10"); e10.setDepartment("IT");
		company.addEmployee(e10);

		Employee e11 = new Employee();
		e11.setEmpId(11); e11.setEmpName("Emp11"); e11.setDepartment("Finance");
		company.addEmployee(e11);

		Employee e12 = new Employee();
		e12.setEmpId(12); e12.setEmpName("Emp12"); e12.setDepartment("Sales");
		company.addEmployee(e12);

		Employee e13 = new Employee();
		e13.setEmpId(13); e13.setEmpName("Emp13"); e13.setDepartment("HR");
		company.addEmployee(e13);

		Employee e14 = new Employee();
		e14.setEmpId(14); e14.setEmpName("Emp14"); e14.setDepartment("IT");
		company.addEmployee(e14);

		Employee e15 = new Employee();
		e15.setEmpId(15); e15.setEmpName("Emp15"); e15.setDepartment("Finance");
		company.addEmployee(e15);

		Employee e16 = new Employee();
		e16.setEmpId(16); e16.setEmpName("Emp16"); e16.setDepartment("Sales");
		company.addEmployee(e16);

		Employee e17 = new Employee();
		e17.setEmpId(17); e17.setEmpName("Emp17"); e17.setDepartment("HR");
		company.addEmployee(e17);

		Employee e18 = new Employee();
		e18.setEmpId(18); e18.setEmpName("Emp18"); e18.setDepartment("IT");
		company.addEmployee(e18);

		Employee e19 = new Employee();
		e19.setEmpId(19); e19.setEmpName("Emp19"); e19.setDepartment("Finance");
		company.addEmployee(e19);

		company.getDetails();
	}
}