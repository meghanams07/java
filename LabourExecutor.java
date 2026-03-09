class LabourExecutor{
    public static void main(String[] args){

        Labour labour=new Labour();
        labour.name="Ravi";
        labour.salary=18000;

        System.out.println("Labour name is :"+labour.name);
        System.out.println("Salary is :"+labour.salary);

        String idProofs[]={"Aadhar","PAN","VoterID","DrivingLicense"};
        System.out.println("ID proofs are :");

        for(String id:idProofs){
            System.out.println(id);
        }
    }
}