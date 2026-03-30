class DmatAccount {

    private int accountId;
    private String holderName;
    private String brokerName;
    private String accountType;
    private String balance;
    private String openedDate;
    private String panNumber;
    private String status;
    private String nominee;

    public void setAccountId(int accountId){
        this.accountId = accountId;
    }

    public int getAccountId(){
        return this.accountId;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public String getHolderName(){
        return this.holderName;
    }

    public void setBrokerName(String brokerName){
        this.brokerName = brokerName;
    }

    public String getBrokerName(){
        return this.brokerName;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setBalance(String balance){
        this.balance = balance;
    }

    public String getBalance(){
        return this.balance;
    }

    public void setOpenedDate(String openedDate){
        this.openedDate = openedDate;
    }

    public String getOpenedDate(){
        return this.openedDate;
    }

    public void setPanNumber(String panNumber){
        this.panNumber = panNumber;
    }

    public String getPanNumber(){
        return this.panNumber;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

    public void setNominee(String nominee){
        this.nominee = nominee;
    }

    public String getNominee(){
        return this.nominee;
    }
}