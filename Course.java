class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        System.out.println("Course constructor");
        this.courseName = courseName;
        this.duration = duration;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}