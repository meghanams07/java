class Government {
    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String exam){
        boolean isValid = false;
        if(exam != null && !exam.isEmpty()){
            if(index < competitiveExamNames.length){
                competitiveExamNames[index] = exam;
                index++;
                isValid = true;
            } else {
                System.out.println("Exam list is full");
            }
        } else {
            System.out.println(exam + " Not Valid");
        }
        return isValid;
    }

    public void displayExams(){
        System.out.println("\n--- Government Competitive Exams ---");
        for(String exam : competitiveExamNames){
            if(exam != null){
                System.out.println(exam);
            }
        }
    }

    public String getString(int index){
        String exam = null;
        if(index < competitiveExamNames.length){
            exam = competitiveExamNames[index];
            System.out.println(exam);
            index++;
        } else System.out.println("Invalid");
        return exam;
    }

    public int getIndex(String exam){
        int index = 0;
        for(String e : competitiveExamNames){
            if(e == exam){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateExam(String existingExam, String updatedExam){
        boolean isUpdated = false;
        for(int index = 0; index < competitiveExamNames.length; index++){
            if(competitiveExamNames[index] == existingExam){
                competitiveExamNames[index] = updatedExam;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Exam Not Found");
        }
        return isUpdated;
    }

    public boolean deleteExam(String exam){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < competitiveExamNames.length; index++){
            if(competitiveExamNames[index].equals(exam)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < competitiveExamNames.length - 1; j++){
                competitiveExamNames[j] = competitiveExamNames[j + 1];
            }
            competitiveExamNames[competitiveExamNames.length - 1] = null;
        }
        return isFound;
    }
}