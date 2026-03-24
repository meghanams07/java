class GovernmentExamManager {
    private String[] competitiveExamNames = new String[9];
    int index = 0;

    public boolean addExam(String examName) {
        boolean isAdded = false;

        if (examName != null && !examName.isEmpty()) {
            if (index < competitiveExamNames.length) {
                competitiveExamNames[index] = examName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Exam list is full");
            }
        } else {
            System.out.println("Invalid exam name");
        }

        return isAdded;
    }

    public void getExams() {
        for (String exam : competitiveExamNames) {
            if (exam != null) {
                System.out.println(exam);
            }
        }
    }
}

