class Elevator{

    static String companyName;
    static String modelName;
    static int capacityPersons;
    static int maxFloors;
    static double speed;
    static boolean hasEmergencyAlarm;
    static String elevatorType;

    public static boolean createElevator(String company,String model,int capacity,int floors,double speeds,boolean emergency,String type){

        boolean isElevatorCreated = false;
        boolean iscompanyValid = false;
        boolean ismodelValid = false;
        boolean iscapacityValid = false;
        boolean isfloorsValid = false;
        boolean isspeedValid = false;
        boolean isemergencyValid = false;
        boolean istypeValid = false;

        if(company != null && company.length() >= 3){
            companyName = company;
            iscompanyValid = true;
        }else{
            System.out.println("Company name is not valid");
        }

        if(model != null && model.length() >= 2){
            modelName = model;
            ismodelValid = true;
        }else{
            System.out.println("Model name is not valid");
        }

        if(capacity >= 2 && capacity <= 50){
            capacityPersons = capacity;
            iscapacityValid = true;
        }else{
            System.out.println("Capacity is not valid");
        }

        if(floors >= 1 && floors <= 200){
            maxFloors = floors;
            isfloorsValid = true;
        }else{
            System.out.println("Max floors is not valid");
        }

        if(speeds > 0.5 && speeds <= 20){
            speed = speeds;
            isspeedValid = true;
        }else{
            System.out.println("Speed is not valid");
        }

        if(emergency == true || emergency == false){
            hasEmergencyAlarm = emergency;
            isemergencyValid = true;
        }

        if(type != null && type.length() >= 3){
            elevatorType = type;
            istypeValid = true;
        }else{
            System.out.println("Elevator type is not valid");
        }

        if(iscompanyValid && ismodelValid && iscapacityValid && isfloorsValid && isspeedValid && isemergencyValid && istypeValid){

            isElevatorCreated = true;
        }

        return isElevatorCreated;
    };

    public static void getElevatorDetails(){

        System.out.println("Elevator Details are :");
        System.out.println("Company Name : " + companyName);
        System.out.println("Model Name : " + modelName);
        System.out.println("Capacity (Persons) : " + capacityPersons);
        System.out.println("Max Floors : " + maxFloors);
        System.out.println("Speed (m/s) : " + speed);
        System.out.println("Emergency Alarm : " + hasEmergencyAlarm);
        System.out.println("Elevator Type : " + elevatorType);
    };
}