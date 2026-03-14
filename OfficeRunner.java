class OfficeRunner {

    public static void main(String[] args) {

        Office o1 = new Office("Head Office","Google","MG Road","Bangalore","India",500,10,"Rahul","Corporate","IT Park",2000,5,true,true,"9-6","Airtel","CCTV",2005,"9876543210",true);

        Office o2 = new Office("Branch Office","Microsoft","Whitefield","Bangalore","India",400,8,"Anita","Corporate","IT Park",1800,4,true,true,"9-6","Jio","Biometric",2008,"9876543211",true);

        Office o3 = new Office("Regional Office","Amazon","Electronic City","Bangalore","India",600,12,"Kiran","Corporate","Tech Park",2500,6,true,true,"9-6","Airtel","CCTV",2010,"9876543212",true);

        Office o4 = new Office("Sales Office","Flipkart","BTM","Bangalore","India",300,6,"Meera","Sales","Commercial",1200,3,true,false,"9-6","Jio","Biometric",2012,"9876543213",true);

        Office o5 = new Office("Support Office","Infosys","Mysore Road","Bangalore","India",350,7,"Arjun","Support","Tech Park",1500,4,true,true,"9-6","BSNL","CCTV",2011,"9876543214",true);

        Office o6 = new Office("Development Office","TCS","Koramangala","Bangalore","India",450,9,"Priya","Development","IT Park",1900,5,true,true,"9-6","Airtel","Biometric",2009,"9876543215",true);

        Office o7 = new Office("Consulting Office","Wipro","Marathahalli","Bangalore","India",320,5,"Vijay","Consulting","Commercial",1300,3,true,false,"9-6","Jio","CCTV",2013,"9876543216",true);

        Office o8 = new Office("HR Office","Accenture","Indiranagar","Bangalore","India",280,4,"Sneha","HR","Corporate",1100,2,true,true,"9-6","Airtel","Biometric",2014,"9876543217",true);

        Office o9 = new Office("Finance Office","IBM","Yelahanka","Bangalore","India",260,5,"Ravi","Finance","Corporate",1000,2,true,false,"9-6","BSNL","CCTV",2015,"9876543218",true);

        Office o10 = new Office("Research Office","Intel","Hebbal","Bangalore","India",500,10,"Lakshmi","Research","Tech Park",2200,5,true,true,"9-6","Airtel","Biometric",2007,"9876543219",true);

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