class CompetitiveExamsExecutor {
    public static void main(String[] args) {
        CompetitiveExams exams = new CompetitiveExams();
        // ADD exams
        exams.addExam("UPSC");
        exams.addExam("KPSC");
        exams.addExam("SSC");
        exams.addExam("Banking");
        exams.addExam("Railway");
        // DISPLAY
        exams.displayExams();
        // GET by index
        System.out.println("\nGet Exam by Index:");
        exams.getString(2);  // SSC
        // GET index by exam name
        System.out.println("\nGet Index by Exam Name:");
        exams.getIndex("KPSC");
        // UPDATE
        System.out.println("\nUpdate Exam:");
        exams.updateExam("SSC", "SSC-CGL");
        exams.displayExams();
        // DELETE
        System.out.println("\nDelete Exam:");
        exams.deleteExam("Banking");
        exams.displayExams();
    }
}