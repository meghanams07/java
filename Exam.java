class Exam {
    String subject;
    int maxMarks;

    Exam(String subject, int maxMarks) {
        System.out.println("Exam constructor");
        this.subject = subject;
        this.maxMarks = maxMarks;
    }

    public void showExamDetails() {
        System.out.println("Subject: " + subject);
        System.out.println("Max Marks: " + maxMarks);
    }
}