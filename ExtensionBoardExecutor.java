class ExtensionBoardExecutor {

    public static void main(String[] args) {

        ExtensionBoard eb1  = new ExtensionBoard("Havells");
        ExtensionBoard eb2  = new ExtensionBoard("Havells","PowerSafe");
        ExtensionBoard eb3  = new ExtensionBoard("Havells","PowerSafe",4);
        ExtensionBoard eb4  = new ExtensionBoard("Havells","PowerSafe",4,"Standard");
        ExtensionBoard eb5  = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200);
        ExtensionBoard eb6  = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200,3);
        ExtensionBoard eb7  = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200,3,true);
        ExtensionBoard eb8  = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200,3,true,true);
        ExtensionBoard eb9  = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200,3,true,true,"White");
        ExtensionBoard eb10 = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200,3,true,true,"White",0.9);
        ExtensionBoard eb11 = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200,3,true,true,"White",0.9,true);
        ExtensionBoard eb12 = new ExtensionBoard("Havells","PowerSafe",4,"Standard",1200,3,true,true,"White",0.9,true,true);

    }
}