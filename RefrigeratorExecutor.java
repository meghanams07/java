class RefrigeratorExecutor{
    public static void main(String[] refrigerator){

        boolean ref = Refrigerator.onOrOff();
        System.out.println(ref);

        Refrigerator.increaseCooling();  

        Refrigerator.decreaseCooling(); 
    }
}
