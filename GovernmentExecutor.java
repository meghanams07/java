class GovernmentExecutor {
    public static void main(String[] args) {

        GovernmentExamManager manager = new GovernmentExamManager();

        manager.addExam("UPSC Civil Services");
        manager.addExam("SSC CGL");
        manager.addExam("SSC CHSL");
        manager.addExam("IBPS PO");
        manager.addExam("IBPS Clerk");
        manager.addExam("RRB NTPC");
        manager.addExam("RRB Group D");
        manager.addExam("State PSC");
        manager.addExam("Defence Exams");

        manager.getExams();
    }
}