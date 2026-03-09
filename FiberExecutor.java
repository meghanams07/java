class FiberExecutor{
    public static void main(String[] args){

        Fiber fiber = new Fiber();
        fiber.name="OpticFiber";
        fiber.length=120;

        System.out.println("Fiber name is :"+fiber.name);
        System.out.println("Fiber length is :"+fiber.length);

        String vendors[]={"Airtel","Jio","BSNL","ACT"};
        System.out.println("Vendors are :");
        for(String vendor:vendors){
            System.out.println(vendor);
        }
    }
}