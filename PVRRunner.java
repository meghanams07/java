class PVRRunner {

    public static void main(String[] args) {

        PVR p1 = new PVR("PVR Cinemas","Orion Mall","Bangalore",8,1200,"Leo","6 PM",250,"IMAX",true,true,"Dolby Atmos","Recliner","Tamil","Action",160,"U/A","Online","PVR Ltd",true);

        PVR p2 = new PVR("PVR Cinemas","Forum Mall","Bangalore",6,900,"Jailer","7 PM",220,"4DX",true,true,"Dolby Atmos","Premium","Tamil","Action",150,"U/A","Online","PVR Ltd",true);

        PVR p3 = new PVR("PVR Cinemas","Garuda Mall","Bangalore",5,800,"Master","5 PM",200,"2D",true,true,"Dolby","Standard","Tamil","Action",155,"U/A","Online","PVR Ltd",true);

        PVR p4 = new PVR("PVR Cinemas","Phoenix Mall","Chennai",7,1000,"Vikram","9 PM",240,"IMAX",true,true,"Dolby Atmos","Recliner","Tamil","Action",170,"U/A","Online","PVR Ltd",true);

        PVR p5 = new PVR("PVR Cinemas","Express Avenue","Chennai",6,850,"KGF","8 PM",230,"4DX",true,true,"Dolby","Premium","Kannada","Action",165,"U/A","Online","PVR Ltd",true);

        PVR p6 = new PVR("PVR Cinemas","Inorbit Mall","Hyderabad",5,750,"Pushpa","6 PM",210,"2D",true,true,"Dolby","Standard","Telugu","Action",160,"U/A","Online","PVR Ltd",true);

        PVR p7 = new PVR("PVR Cinemas","Forum Mall","Hyderabad",6,850,"RRR","9 PM",260,"IMAX",true,true,"Dolby Atmos","Recliner","Telugu","Action",180,"U/A","Online","PVR Ltd",true);

        PVR p8 = new PVR("PVR Cinemas","Lulu Mall","Kochi",5,700,"Minnal Murali","5 PM",200,"2D",true,true,"Dolby","Standard","Malayalam","Action",150,"U/A","Online","PVR Ltd",true);

        PVR p9 = new PVR("PVR Cinemas","City Centre","Kolkata",6,850,"Pathaan","8 PM",250,"IMAX",true,true,"Dolby Atmos","Premium","Hindi","Action",160,"U/A","Online","PVR Ltd",true);

        PVR p10 = new PVR("PVR Cinemas","Select Citywalk","Delhi",8,1200,"Jawan","7 PM",270,"IMAX",true,true,"Dolby Atmos","Recliner","Hindi","Action",165,"U/A","Online","PVR Ltd",true);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();
        p8.display();
        p9.display();
        p10.display();
    }
}