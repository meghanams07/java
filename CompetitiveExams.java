class CompetitiveExams {
    private String exams[] = new String[9];
    int index;
    public boolean addExam(String exam){
        boolean isValid = false;
//Create Or ADD .
        if(exam != null && !exam.isEmpty()){
            if(index < exams.length){
                exams[index] = exam;
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
//Read
    public void displayExams(){
        System.out.println("\n--- Government Competitive Exams ---");
        for(String exam : exams){
            if(exam != null){
                System.out.println(exam);
            }
        }
    }
    //Functionlity Of Read
    public String getString(int index){
        String exam=null;
        if(index<exams.length){
            exam=exams[index];
            System.out.println(exam);
            index++;
        }else System.out.println("Invalid");
        return exam;
}
//Functionality Of Read
public  int getIndex(String exam){
    int index=0;
    for(String compete:exams){
        if(compete==exam){
            System.out.println(index);
            return index;
        }
        index++;
    }
    System.out.println("Invalid");
    return 0;
}
  //Update
public boolean updateExam(String existingExam,String updatedExam){
    boolean isUpdated=false;
for(int index=0;index<exams.length;index++) { //Only Updation can be  done using for loop Statement.
 //If We Use for Each it remains till that method or scope.
    if(exams[index] == existingExam){
        exams[index] =updatedExam;
        isUpdated=true;
    }
    }
    if(isUpdated==false){
        System.out.println("App Name is Not Found");
    }
    return isUpdated;
}
public boolean deleteExam(String exam){//ssc
    boolean isFound=false;
    int i=0;
for(int index=0;index<exams.length;index++){
if(exams[index].equals(exam)){
     i=index;
    System.out.println(i);
    isFound=true;
    break;
}}
if(isFound==true){
for(int j=i;j<exams.length-1;j++){
exams[j]=exams[j+1];
}
exams[exams.length-1]=null;
}
return isFound;
}
}

