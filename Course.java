class Course{
	private int courseId;
	private String courseName;
	private String duration;
	
	public void setCourseId(int courseId){
		this.courseId = courseId;
	}
	
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	
	public void setDuration(String duration){
		this.duration = duration;
	}
	
	public int getCourseId(){
		return courseId;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public String getDuration(){
		return duration;
	}
}