class Google {
    GoogleAccount acc;

    public boolean createAccount(GoogleAccount acc){
        if(acc.getId()>0 && acc.getName()!=null && !acc.getName().isEmpty()
           && acc.getEmail()!=null && !acc.getEmail().isEmpty()){
           this.acc = acc;
           return true;
        }
        return false;
    }

    public void getDetails(){
        if(acc!=null){
            System.out.println(acc.getId());
            System.out.println(acc.getName());
            System.out.println(acc.getEmail());
        }
    }
}