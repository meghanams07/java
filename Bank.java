class Bank {

    private int bankId;
    private String bankName;
    private String branch;
    private String ifscCode;
    private String accountType;
    private double balance;
    private String customerName;

    public void setBankId(int bankId){
        this.bankId = bankId;
    }

    public int getBankId(){
        return this.bankId;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public String getBranch(){
        return this.branch;
    }

    public void setIfscCode(String ifscCode){
        this.ifscCode = ifscCode;
    }

    public String getIfscCode(){
        return this.ifscCode;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }
}