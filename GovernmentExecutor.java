class GovernmentExecutor {
    public static void main(String[] args) {

        Government govt = new Government();

        govt.addExam("UPSC");
        govt.addExam("SSC");
        govt.addExam("Bank PO");
        govt.addExam("Railway Exams");
        govt.addExam("TNPSC");
        govt.addExam("KPSC");
        govt.addExam("Defence Exams");
        govt.addExam("NDA");
        govt.addExam("CDS");

        govt.getExams();

        System.out.println();

        int index = 2;
        String exam = govt.getExamByIndex(index);
        if (exam != null) {
            System.out.println("The exam at index " + index + " is " + exam);
        }

        String examName = "UPSC";
        int i = govt.getIndexByExamName(examName);
        System.out.println("The exam " + examName + " is at index " + i);
    }
}