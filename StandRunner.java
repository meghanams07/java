class StandRunner {

    public static void main(String[] args) {

        Stand s1 = new Stand("Laptop Stand","Desk","Metal","Black",15,20,1.5,1200,"Zebronics","Zebronics Ltd","India","Laptop",true,true,"Matte","Rectangular","High",2,"Box",true);

        Stand s2 = new Stand("Mobile Stand","Desk","Plastic","White",10,12,0.5,300,"Portronics","Portronics Ltd","India","Mobile",true,false,"Glossy","Rectangular","Medium",1,"Packet",true);

        Stand s3 = new Stand("TV Stand","Floor","Wood","Brown",120,80,15,5000,"Sony","Sony Corp","Japan","Television",false,false,"Matte","Square","High",3,"Box",true);

        Stand s4 = new Stand("Speaker Stand","Floor","Metal","Black",100,30,8,2500,"JBL","JBL Ltd","USA","Speaker",false,true,"Matte","Round","High",2,"Box",true);

        Stand s5 = new Stand("Book Stand","Desk","Wood","Brown",25,30,2,900,"Classmate","ITC Ltd","India","Books",true,false,"Matte","Rectangular","Medium",1,"Box",true);

        Stand s6 = new Stand("Camera Stand","Tripod","Metal","Black",150,40,3,3200,"Canon","Canon Inc","Japan","Camera",true,true,"Matte","Tripod","High",2,"Box",true);

        Stand s7 = new Stand("Mic Stand","Floor","Metal","Black",140,30,4,2100,"Shure","Shure Inc","USA","Microphone",false,true,"Matte","Round","High",2,"Box",true);

        Stand s8 = new Stand("Tablet Stand","Desk","Plastic","Grey",18,20,1,700,"Logitech","Logitech Ltd","Switzerland","Tablet",true,true,"Matte","Rectangular","Medium",1,"Box",true);

        Stand s9 = new Stand("Monitor Stand","Desk","Metal","Black",12,45,3,1800,"Dell","Dell Inc","USA","Monitor",false,false,"Matte","Rectangular","High",2,"Box",true);

        Stand s10 = new Stand("Display Stand","Floor","Metal","Silver",170,60,10,4500,"Ikea","Ikea Ltd","Sweden","Display",false,true,"Matte","Rectangular","High",3,"Box",true);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
        s8.display();
        s9.display();
        s10.display();
    }
}