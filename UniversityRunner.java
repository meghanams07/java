class UniversityRunner{
	public static void main(String[] args){
		
		University uni = new University();

		Student s1 = new Student();
		s1.setStudentId(1); s1.setStudentName("Student1"); s1.setCourse("CSE");
		uni.addStudent(s1);

		Student s2 = new Student();
		s2.setStudentId(2); s2.setStudentName("Student2"); s2.setCourse("ISE");
		uni.addStudent(s2);

		Student s3 = new Student();
		s3.setStudentId(3); s3.setStudentName("Student3"); s3.setCourse("ECE");
		uni.addStudent(s3);

		Student s4 = new Student();
		s4.setStudentId(4); s4.setStudentName("Student4"); s4.setCourse("EEE");
		uni.addStudent(s4);

		Student s5 = new Student();
		s5.setStudentId(5); s5.setStudentName("Student5"); s5.setCourse("MECH");
		uni.addStudent(s5);

		Student s6 = new Student();
		s6.setStudentId(6); s6.setStudentName("Student6"); s6.setCourse("CSE");
		uni.addStudent(s6);

		Student s7 = new Student();
		s7.setStudentId(7); s7.setStudentName("Student7"); s7.setCourse("ISE");
		uni.addStudent(s7);

		Student s8 = new Student();
		s8.setStudentId(8); s8.setStudentName("Student8"); s8.setCourse("ECE");
		uni.addStudent(s8);

		Student s9 = new Student();
		s9.setStudentId(9); s9.setStudentName("Student9"); s9.setCourse("EEE");
		uni.addStudent(s9);

		Student s10 = new Student();
		s10.setStudentId(10); s10.setStudentName("Student10"); s10.setCourse("MECH");
		uni.addStudent(s10);

		Student s11 = new Student();
		s11.setStudentId(11); s11.setStudentName("Student11"); s11.setCourse("CSE");
		uni.addStudent(s11);

		Student s12 = new Student();
		s12.setStudentId(12); s12.setStudentName("Student12"); s12.setCourse("ISE");
		uni.addStudent(s12);

		Student s13 = new Student();
		s13.setStudentId(13); s13.setStudentName("Student13"); s13.setCourse("ECE");
		uni.addStudent(s13);

		Student s14 = new Student();
		s14.setStudentId(14); s14.setStudentName("Student14"); s14.setCourse("EEE");
		uni.addStudent(s14);

		Student s15 = new Student();
		s15.setStudentId(15); s15.setStudentName("Student15"); s15.setCourse("MECH");
		uni.addStudent(s15);

		Student s16 = new Student();
		s16.setStudentId(16); s16.setStudentName("Student16"); s16.setCourse("CSE");
		uni.addStudent(s16);

		Student s17 = new Student();
		s17.setStudentId(17); s17.setStudentName("Student17"); s17.setCourse("ISE");
		uni.addStudent(s17);

		Student s18 = new Student();
		s18.setStudentId(18); s18.setStudentName("Student18"); s18.setCourse("ECE");
		uni.addStudent(s18);

		Student s19 = new Student();
		s19.setStudentId(19); s19.setStudentName("Student19"); s19.setCourse("EEE");
		uni.addStudent(s19);

		uni.getDetails();
	}
}