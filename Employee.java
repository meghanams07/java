class Employee{
	private int empId;
	private String empName;
	private String department;
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public int getEmpId(){
		return empId;
	}
	
	public String getEmpName(){
		return empName;
	}
	
	public String getDepartment(){
		return department;
	}
}