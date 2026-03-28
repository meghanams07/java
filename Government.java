class Government {
    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String exam) {
        boolean isAdded = false;

        if (exam != null && !exam.isEmpty()) {
            if (index < competitiveExamNames.length) {
                competitiveExamNames[index++] = exam;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(exam + " is invalid exam");
        }
        return isAdded;
    }

    public void getExams() {
        for (String e : competitiveExamNames) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public String getExamByIndex(int index) {
        if (index < competitiveExamNames.length && competitiveExamNames[index] != null) {
            return competitiveExamNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByExamName(String examName) {
        for (int i = 0; i < competitiveExamNames.length; i++) {
            if (competitiveExamNames[i] != null && competitiveExamNames[i].equals(examName)) {
                return i;
            }
        }
        System.out.println("invalid exam " + examName);
        return -1;
    }
}