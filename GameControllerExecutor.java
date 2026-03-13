class GameControllerExecutor {

    public static void main(String[] args) {

        GameController g1  = new GameController("Sony");
        GameController g2  = new GameController("Sony","DualSense");
        GameController g3  = new GameController("Sony","DualSense","PlayStation");
        GameController g4  = new GameController("Sony","DualSense","PlayStation",true);
        GameController g5  = new GameController("Sony","DualSense","PlayStation",true,14);
        GameController g6  = new GameController("Sony","DualSense","PlayStation",true,14,6500);
        GameController g7  = new GameController("Sony","DualSense","PlayStation",true,14,6500,true);
        GameController g8  = new GameController("Sony","DualSense","PlayStation",true,14,6500,true,true);
        GameController g9  = new GameController("Sony","DualSense","PlayStation",true,14,6500,true,true,"Bluetooth");
        GameController g10 = new GameController("Sony","DualSense","PlayStation",true,14,6500,true,true,"Bluetooth",0.28);
        GameController g11 = new GameController("Sony","DualSense","PlayStation",true,14,6500,true,true,"Bluetooth",0.28,true);
        GameController g12 = new GameController("Sony","DualSense","PlayStation",true,14,6500,true,true,"Bluetooth",0.28,true,true);

    }
}