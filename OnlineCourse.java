class OnlineCourse extends Course {
    OnlineCourse(String courseName, int duration) {
        super(courseName, duration);
        System.out.println("OnlineCourse constructor");
    }
}