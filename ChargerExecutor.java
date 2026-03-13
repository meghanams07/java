class ChargerExecutor {

    public static void main(String[] args) {

        Charger c1  = new Charger("Samsung");
        Charger c2  = new Charger("Samsung","EP-TA800");
        Charger c3  = new Charger("Samsung","EP-TA800",25);
        Charger c4  = new Charger("Samsung","EP-TA800",25,"Wall");
        Charger c5  = new Charger("Samsung","EP-TA800",25,"Wall",1500);
        Charger c6  = new Charger("Samsung","EP-TA800",25,"Wall",1500,1);
        Charger c7  = new Charger("Samsung","EP-TA800",25,"Wall",1500,1,true);
        Charger c8  = new Charger("Samsung","EP-TA800",25,"Wall",1500,1,true,false);
        Charger c9  = new Charger("Samsung","EP-TA800",25,"Wall",1500,1,true,false,"USB-C");
        Charger c10 = new Charger("Samsung","EP-TA800",25,"Wall",1500,1,true,false,"USB-C",0.15);
        Charger c11 = new Charger("Samsung","EP-TA800",25,"Wall",1500,1,true,false,"USB-C",0.15,true);
        Charger c12 = new Charger("Samsung","EP-TA800",25,"Wall",1500,1,true,false,"USB-C",0.15,true,true);

    }
}