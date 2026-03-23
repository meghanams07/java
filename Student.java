class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        System.out.println("Student constructor");
        this.name = name;
        this.marks = marks;
    }

    public void showStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}