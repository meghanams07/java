class AirConditionerExecutor{
    public static void main(String[] args){

        AirConditioner ac=new AirConditioner();
        ac.brand="LG";
        ac.model="DualCool";
        ac.price=45000;
        ac.type="Split";
        ac.weight=32;
        ac.warranty=5;
        ac.working=true;

        System.out.println("Brand :"+ac.brand);
        System.out.println("Model :"+ac.model);
        System.out.println("Price :"+ac.price);
        System.out.println("Type :"+ac.type);
        System.out.println("Weight :"+ac.weight);
        System.out.println("Warranty :"+ac.warranty);
        System.out.println("Working :"+ac.working);

        String colors[]={"White","Silver","Grey"};
        System.out.println("Colors are :");

        for(String color:colors){
            System.out.println(color);
        }
    }
}