class CollegeRunner {
    public static void main(String[] args) {

        College c = new College();

        Student s = new Student();
        s.setId(101);
        s.setName("Nilav");
        s.setCourse("CSE");

        System.out.println(c.admitStudent(s));
        c.getDetails();
    }
}