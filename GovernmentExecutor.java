class GovernmentExecutor {
    public static void main(String[] args) {
        Government gov = new Government();

        gov.addExam("UPSC");
        gov.addExam("KPSC");
        gov.addExam("SSC");
        gov.addExam("Banking");
        gov.addExam("Railway");
        gov.addExam("NEET");
        gov.addExam("JEE");
        gov.addExam("CDS");
        gov.addExam("NDA");

        gov.displayExams();

        System.out.println("\nGet Exam by Index:");
        gov.getString(2);

        System.out.println("\nGet Index by Name:");
        gov.getIndex("KPSC");

        System.out.println("\nUpdate Exam:");
        gov.updateExam("SSC", "SSC-CGL");
        gov.displayExams();

        System.out.println("\nDelete Exam:");
        gov.deleteExam("Banking");
        gov.displayExams();
    }
}