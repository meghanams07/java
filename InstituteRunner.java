class InstituteRunner{
	public static void main(String[] args){
		
		Institute institute = new Institute();

		Course c1 = new Course();
		c1.setCourseId(1); c1.setCourseName("Course1"); c1.setDuration("3 Months");
		institute.addCourse(c1);

		Course c2 = new Course();
		c2.setCourseId(2); c2.setCourseName("Course2"); c2.setDuration("6 Months");
		institute.addCourse(c2);

		Course c3 = new Course();
		c3.setCourseId(3); c3.setCourseName("Course3"); c3.setDuration("1 Year");
		institute.addCourse(c3);

		Course c4 = new Course();
		c4.setCourseId(4); c4.setCourseName("Course4"); c4.setDuration("2 Months");
		institute.addCourse(c4);

		Course c5 = new Course();
		c5.setCourseId(5); c5.setCourseName("Course5"); c5.setDuration("4 Months");
		institute.addCourse(c5);

		Course c6 = new Course();
		c6.setCourseId(6); c6.setCourseName("Course6"); c6.setDuration("3 Months");
		institute.addCourse(c6);

		Course c7 = new Course();
		c7.setCourseId(7); c7.setCourseName("Course7"); c7.setDuration("6 Months");
		institute.addCourse(c7);

		Course c8 = new Course();
		c8.setCourseId(8); c8.setCourseName("Course8"); c8.setDuration("1 Year");
		institute.addCourse(c8);

		Course c9 = new Course();
		c9.setCourseId(9); c9.setCourseName("Course9"); c9.setDuration("2 Months");
		institute.addCourse(c9);

		Course c10 = new Course();
		c10.setCourseId(10); c10.setCourseName("Course10"); c10.setDuration("4 Months");
		institute.addCourse(c10);

		Course c11 = new Course();
		c11.setCourseId(11); c11.setCourseName("Course11"); c11.setDuration("3 Months");
		institute.addCourse(c11);

		Course c12 = new Course();
		c12.setCourseId(12); c12.setCourseName("Course12"); c12.setDuration("6 Months");
		institute.addCourse(c12);

		Course c13 = new Course();
		c13.setCourseId(13); c13.setCourseName("Course13"); c13.setDuration("1 Year");
		institute.addCourse(c13);

		Course c14 = new Course();
		c14.setCourseId(14); c14.setCourseName("Course14"); c14.setDuration("2 Months");
		institute.addCourse(c14);

		Course c15 = new Course();
		c15.setCourseId(15); c15.setCourseName("Course15"); c15.setDuration("4 Months");
		institute.addCourse(c15);

		Course c16 = new Course();
		c16.setCourseId(16); c16.setCourseName("Course16"); c16.setDuration("3 Months");
		institute.addCourse(c16);

		Course c17 = new Course();
		c17.setCourseId(17); c17.setCourseName("Course17"); c17.setDuration("6 Months");
		institute.addCourse(c17);

		Course c18 = new Course();
		c18.setCourseId(18); c18.setCourseName("Course18"); c18.setDuration("1 Year");
		institute.addCourse(c18);

		Course c19 = new Course();
		c19.setCourseId(19); c19.setCourseName("Course19"); c19.setDuration("2 Months");
		institute.addCourse(c19);

		institute.getDetails();
	}
}