class University{
	Student students[] = new Student[5];
	int index;
	
	public boolean addStudent(Student student){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isCourseValid = false;
		
		int id = student.getStudentId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = student.getStudentName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String course = student.getCourse();
		if(course != null && !course.isEmpty()){
			isCourseValid = true;
		}
		
		if(isIdValid && isNameValid && isCourseValid){
			if(index < students.length){
				this.students[index++] = student;
				isAdded = true;
			}else{
				System.out.println("University Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Student s : students){
			if(s != null){
				System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getCourse());
			}
		}
	}
}