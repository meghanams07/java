class MapRunner {

    public static void main(String[] args) {

        Map m1 = new Map("World Map","Political","World","Global","English","1:50000000","National Geographic","Paper","Multicolor",2020,500,100,70,"Poster",true,true,"Education","Mercator",1,true);

        Map m2 = new Map("India Map","Political","Asia","India","English","1:20000000","Survey of India","Paper","Multicolor",2019,300,80,60,"Poster",true,true,"Education","Mercator",1,true);

        Map m3 = new Map("Asia Map","Political","Asia","Various","English","1:30000000","Oxford","Paper","Multicolor",2021,350,90,65,"Poster",true,true,"Education","Mercator",1,true);

        Map m4 = new Map("Europe Map","Political","Europe","Various","English","1:25000000","Oxford","Paper","Multicolor",2021,360,90,65,"Poster",true,true,"Education","Mercator",1,true);

        Map m5 = new Map("Africa Map","Political","Africa","Various","English","1:30000000","Oxford","Paper","Multicolor",2020,340,85,60,"Poster",true,true,"Education","Mercator",1,true);

        Map m6 = new Map("USA Map","Political","North America","USA","English","1:20000000","Rand McNally","Paper","Multicolor",2018,320,80,60,"Poster",true,true,"Education","Mercator",1,true);

        Map m7 = new Map("Australia Map","Political","Australia","Australia","English","1:15000000","Oxford","Paper","Multicolor",2019,300,75,55,"Poster",true,true,"Education","Mercator",1,true);

        Map m8 = new Map("City Map","Tourist","Asia","India","English","1:50000","Local Publisher","Paper","Color",2022,150,40,30,"Folded",false,true,"Navigation","Mercator",2,true);

        Map m9 = new Map("Road Map","Transport","Asia","India","English","1:1000000","Survey of India","Paper","Color",2021,250,70,50,"Folded",true,true,"Travel","Mercator",2,true);

        Map m10 = new Map("Historical Map","Historical","World","Global","English","1:60000000","History Press","Paper","Sepia",2017,400,95,70,"Poster",true,false,"Research","Mercator",1,true);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
        m6.display();
        m7.display();
        m8.display();
        m9.display();
        m10.display();
    }
}