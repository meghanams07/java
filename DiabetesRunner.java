class DiabetesRunner {

    public static void main(String[] args) {

        Diabetes d1 = new Diabetes("Ravi",45,"Male","Type 2",180,120,200,"Fatigue","Medication","Metformin","Dr. Kumar","Apollo","Bangalore","India",75,170,"Low Sugar",false,2020,true);

        Diabetes d2 = new Diabetes("Priya",50,"Female","Type 2",190,130,210,"Thirst","Medication","Insulin","Dr. Sharma","Fortis","Delhi","India",70,165,"Low Carb",true,2019,false);

        Diabetes d3 = new Diabetes("Arjun",35,"Male","Type 1",200,140,220,"Fatigue","Insulin","Insulin","Dr. Mehta","Apollo","Mumbai","India",72,175,"Balanced Diet",true,2018,false);

        Diabetes d4 = new Diabetes("Sneha",40,"Female","Type 2",170,115,195,"Frequent Urination","Medication","Metformin","Dr. Kumar","Apollo","Bangalore","India",68,160,"Low Sugar",false,2021,true);

        Diabetes d5 = new Diabetes("Kiran",55,"Male","Type 2",210,150,230,"Blurred Vision","Medication","Insulin","Dr. Reddy","Yashoda","Hyderabad","India",80,172,"Low Carb",true,2017,false);

        Diabetes d6 = new Diabetes("Anita",48,"Female","Type 2",185,125,205,"Fatigue","Medication","Metformin","Dr. Sharma","Fortis","Delhi","India",69,162,"Balanced Diet",false,2020,true);

        Diabetes d7 = new Diabetes("Rahul",38,"Male","Type 1",195,135,215,"Thirst","Insulin","Insulin","Dr. Mehta","Apollo","Mumbai","India",74,176,"Low Sugar",true,2019,false);

        Diabetes d8 = new Diabetes("Meera",52,"Female","Type 2",175,118,198,"Fatigue","Medication","Metformin","Dr. Kumar","Apollo","Bangalore","India",67,158,"Balanced Diet",false,2022,true);

        Diabetes d9 = new Diabetes("Vijay",60,"Male","Type 2",220,160,240,"Blurred Vision","Medication","Insulin","Dr. Reddy","Yashoda","Hyderabad","India",82,170,"Low Carb",true,2016,false);

        Diabetes d10 = new Diabetes("Lakshmi",47,"Female","Type 2",180,122,200,"Thirst","Medication","Metformin","Dr. Sharma","Fortis","Delhi","India",66,160,"Low Sugar",false,2021,true);

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
        d6.display();
        d7.display();
        d8.display();
        d9.display();
        d10.display();
    }
}