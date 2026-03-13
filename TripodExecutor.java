class TripodExecutor {

    public static void main(String[] args) {

        Tripod t1  = new Tripod("Digitek");
        Tripod t2  = new Tripod("Digitek","DTR550");
        Tripod t3  = new Tripod("Digitek","DTR550","Aluminum");
        Tripod t4  = new Tripod("Digitek","DTR550","Aluminum",160);
        Tripod t5  = new Tripod("Digitek","DTR550","Aluminum",160,45);
        Tripod t6  = new Tripod("Digitek","DTR550","Aluminum",160,45,2200);
        Tripod t7  = new Tripod("Digitek","DTR550","Aluminum",160,45,2200,true);
        Tripod t8  = new Tripod("Digitek","DTR550","Aluminum",160,45,2200,true,true);
        Tripod t9  = new Tripod("Digitek","DTR550","Aluminum",160,45,2200,true,true,1.2);
        Tripod t10 = new Tripod("Digitek","DTR550","Aluminum",160,45,2200,true,true,1.2,true);
        Tripod t11 = new Tripod("Digitek","DTR550","Aluminum",160,45,2200,true,true,1.2,true,true);
        Tripod t12 = new Tripod("Digitek","DTR550","Aluminum",160,45,2200,true,true,1.2,true,true,true);

    }
}