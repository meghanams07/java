class CableExecutor {

    public static void main(String[] args) {

        Cable cb1  = new Cable("Anker");
        Cable cb2  = new Cable("Anker","Charging");
        Cable cb3  = new Cable("Anker","Charging","USB-C");
        Cable cb4  = new Cable("Anker","Charging","USB-C",1.0);
        Cable cb5  = new Cable("Anker","Charging","USB-C",1.0,500);
        Cable cb6  = new Cable("Anker","Charging","USB-C",1.0,500,true);
        Cable cb7  = new Cable("Anker","Charging","USB-C",1.0,500,true,true);
        Cable cb8  = new Cable("Anker","Charging","USB-C",1.0,500,true,true,"Black");
        Cable cb9  = new Cable("Anker","Charging","USB-C",1.0,500,true,true,"Black",0.1);
        Cable cb10 = new Cable("Anker","Charging","USB-C",1.0,500,true,true,"Black",0.1,true);
        Cable cb11 = new Cable("Anker","Charging","USB-C",1.0,500,true,true,"Black",0.1,true,true);
        Cable cb12 = new Cable("Anker","Charging","USB-C",1.0,500,true,true,"Black",0.1,true,true,true);

    }
}