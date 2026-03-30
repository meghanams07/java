class UserAccount {

    private int userId;
    private String userName;
    private String email;
    private String password;
    private String phone;
    private String accountType;
    private String createdDate;

    public void setUserId(int userId){
        this.userId = userId;
    }

    public int getUserId(){
        return this.userId;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setCreatedDate(String createdDate){
        this.createdDate = createdDate;
    }

    public String getCreatedDate(){
        return this.createdDate;
    }
}