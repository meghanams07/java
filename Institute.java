class Institute{
	Course courses[] = new Course[5];
	int index;
	
	public boolean addCourse(Course course){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isDurationValid = false;
		
		int id = course.getCourseId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = course.getCourseName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		String dur = course.getDuration();
		if(dur != null && !dur.isEmpty()){
			isDurationValid = true;
		}
		
		if(isIdValid && isNameValid && isDurationValid){
			if(index < courses.length){
				this.courses[index++] = course;
				isAdded = true;
			}else{
				System.out.println("Institute Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Course c : courses){
			if(c != null){
				System.out.println(c.getCourseId()+" "+c.getCourseName()+" "+c.getDuration());
			}
		}
	}
}