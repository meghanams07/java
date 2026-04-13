class College {

    Student student;

    public boolean admitStudent(Student student) {

        if (student.getId() > 0 && student.getName() != null && !student.getName().isEmpty() &&
            student.getCourse() != null && !student.getCourse().isEmpty()) {

            this.student = student;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (student != null) {
            System.out.println(student.getId());
            System.out.println(student.getName());
            System.out.println(student.getCourse());
        }
    }
}