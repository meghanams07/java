class OrganRunner {

    public static void main(String[] args) {

        Organ o1 = new Organ("Heart","Circulatory","Chest",0.3,12,"Pump Blood","Muscle","Coronary","Vagus","Red",true,"None","Cardiologist","Apollo","India",2023,"Adult","Cone",15,true);

        Organ o2 = new Organ("Liver","Digestive","Abdomen",1.5,20,"Detox","Glandular","Hepatic","Autonomic","Brown",true,"Fatty Liver","Hepatologist","Fortis","India",2022,"Adult","Triangular",18,true);

        Organ o3 = new Organ("Kidney","Urinary","Abdomen",0.15,10,"Filter Blood","Epithelial","Renal","Autonomic","Red",true,"Kidney Stone","Nephrologist","Apollo","India",2023,"Adult","Bean",12,true);

        Organ o4 = new Organ("Lung","Respiratory","Chest",1.0,25,"Gas Exchange","Spongy","Pulmonary","Vagus","Pink",true,"Asthma","Pulmonologist","AIIMS","India",2022,"Adult","Lobed",20,true);

        Organ o5 = new Organ("Brain","Nervous","Head",1.4,15,"Control Body","Neural","Cerebral","Cranial","Grey",true,"Stroke","Neurologist","Apollo","India",2024,"Adult","Oval",25,true);

        Organ o6 = new Organ("Stomach","Digestive","Abdomen",0.5,18,"Digest Food","Muscle","Gastric","Autonomic","Pink",false,"Ulcer","Gastroenterologist","Fortis","India",2021,"Adult","J-shaped",14,true);

        Organ o7 = new Organ("Pancreas","Digestive","Abdomen",0.2,15,"Produce Insulin","Glandular","Pancreatic","Autonomic","Yellow",false,"Diabetes","Endocrinologist","Apollo","India",2023,"Adult","Leaf",13,true);

        Organ o8 = new Organ("Spleen","Lymphatic","Abdomen",0.15,12,"Filter Blood","Lymphoid","Splenic","Autonomic","Purple",false,"Infection","Immunologist","AIIMS","India",2022,"Adult","Oval",10,true);

        Organ o9 = new Organ("Skin","Integumentary","Whole Body",3.0,200,"Protection","Epithelial","Dermal","Sensory","Brown",false,"Eczema","Dermatologist","Fortis","India",2023,"Adult","Layered",8,true);

        Organ o10 = new Organ("Intestine","Digestive","Abdomen",1.2,600,"Absorb Nutrients","Epithelial","Mesenteric","Autonomic","Pink",true,"IBS","Gastroenterologist","Apollo","India",2024,"Adult","Tubular",16,true);

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