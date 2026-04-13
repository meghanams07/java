class Company{
	Employee employees[] = new Employee[5];
	int index;
	
	public boolean addEmployee(Employee employee){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isDeptValid = false;
		
		int id = employee.getEmpId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = employee.getEmpName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String dept = employee.getDepartment();
		if(dept != null && !dept.isEmpty()){
			isDeptValid = true;
		}
		
		if(isIdValid && isNameValid && isDeptValid){
			if(index < employees.length){
				this.employees[index++] = employee;
				isAdded = true;
			}else{
				System.out.println("Company Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Employee e : employees){
			if(e != null){
				System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getDepartment());
			}
		}
	}
}