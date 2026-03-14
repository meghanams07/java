class OrganizerRunner {

    public static void main(String[] args) {

        Organizer o1 = new Organizer("Skybags","Travel Organizer","Fabric","Black",5,20,30,0.8,1200,"Travel","Skybags Ltd","India","Rectangular",true,true,"Zip","Modern",2,"Box",true);

        Organizer o2 = new Organizer("American Tourister","Bag Organizer","Fabric","Blue",6,22,32,0.9,1400,"Travel","Samsonite","USA","Rectangular",true,true,"Zip","Classic",2,"Box",true);

        Organizer o3 = new Organizer("AmazonBasics","Desk Organizer","Plastic","White",4,15,25,0.5,600,"Office","Amazon","USA","Square",true,false,"Open","Modern",1,"Box",true);

        Organizer o4 = new Organizer("Ikea","Drawer Organizer","Plastic","Grey",5,10,30,0.6,700,"Home","Ikea","Sweden","Rectangular",false,false,"Open","Minimal",1,"Box",true);

        Organizer o5 = new Organizer("Wildcraft","Travel Organizer","Fabric","Green",6,24,34,1.0,1500,"Travel","Wildcraft","India","Rectangular",true,true,"Zip","Modern",2,"Box",true);

        Organizer o6 = new Organizer("Classmate","Stationery Organizer","Plastic","Blue",4,12,20,0.4,500,"School","ITC","India","Rectangular",true,false,"Zip","Simple",1,"Box",true);

        Organizer o7 = new Organizer("HP","Cable Organizer","Fabric","Black",3,8,18,0.3,450,"Electronics","HP","USA","Rectangular",true,true,"Zip","Modern",1,"Box",true);

        Organizer o8 = new Organizer("Boat","Accessory Organizer","Fabric","Grey",4,10,22,0.5,650,"Electronics","Boat","India","Rectangular",true,true,"Zip","Modern",1,"Box",true);

        Organizer o9 = new Organizer("Nike","Gym Organizer","Fabric","Black",5,18,28,0.7,1100,"Gym","Nike","USA","Rectangular",true,true,"Zip","Sport",2,"Box",true);

        Organizer o10 = new Organizer("Adidas","Sports Organizer","Fabric","Red",5,19,29,0.7,1150,"Gym","Adidas","Germany","Rectangular",true,true,"Zip","Sport",2,"Box",true);

        o1.display();
        o2.display();
        o3.display();
        o4.display();
        o5.display();
        o6.display();
        o7.display();
        o8.display();
        o9.display();
        o10.display();
    }
} 
