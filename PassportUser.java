class PassportUser {

    private int passportId;
    private String userName;
    private String nationality;
    private String passportNumber;
    private String issueDate;
    private String expiryDate;
    private String status;

    public void setPassportId(int passportId){
        this.passportId = passportId;
    }

    public int getPassportId(){
        return this.passportId;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public String getNationality(){
        return this.nationality;
    }

    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber(){
        return this.passportNumber;
    }

    public void setIssueDate(String issueDate){
        this.issueDate = issueDate;
    }

    public String getIssueDate(){
        return this.issueDate;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate(){
        return this.expiryDate;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}