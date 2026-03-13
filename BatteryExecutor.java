class BatteryExecutor {

    public static void main(String[] args) {

        Battery b1  = new Battery("Duracell");
        Battery b2  = new Battery("Duracell","Ultra");
        Battery b3  = new Battery("Duracell","Ultra",5000);
        Battery b4  = new Battery("Duracell","Ultra",5000,"Lithium");
        Battery b5  = new Battery("Duracell","Ultra",5000,"Lithium",3.7);
        Battery b6  = new Battery("Duracell","Ultra",5000,"Lithium",3.7,1200);
        Battery b7  = new Battery("Duracell","Ultra",5000,"Lithium",3.7,1200,true);
        Battery b8  = new Battery("Duracell","Ultra",5000,"Lithium",3.7,1200,true,800);
        Battery b9  = new Battery("Duracell","Ultra",5000,"Lithium",3.7,1200,true,800,0.25);
        Battery b10 = new Battery("Duracell","Ultra",5000,"Lithium",3.7,1200,true,800,0.25,true);
        Battery b11 = new Battery("Duracell","Ultra",5000,"Lithium",3.7,1200,true,800,0.25,true,true);
        Battery b12 = new Battery("Duracell","Ultra",5000,"Lithium",3.7,1200,true,800,0.25,true,true,true);

    }
}