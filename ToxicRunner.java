class ToxicRunner {

    public static void main(String[] args) {

        Toxic t1 = new Toxic("Cyanide","CN","Poison","White","Bitter","Solid",9.5,"Inhalation","Respiratory Failure","Hydroxocobalamin","Cool Place","ChemCorp","USA",26,true,true,"High",12,"Industrial",true);

        Toxic t2 = new Toxic("Arsenic","As","Poison","Grey","Odorless","Solid",9.0,"Ingestion","Organ Damage","Dimercaprol","Dry Place","ChemCorp","China",75,false,true,"High",24,"Pesticide",true);

        Toxic t3 = new Toxic("Mercury","Hg","Heavy Metal","Silver","Odorless","Liquid",8.5,"Skin Contact","Nervous Damage","Chelation","Cool Place","MetalWorks","USA",200,false,false,"High",36,"Laboratory",true);

        Toxic t4 = new Toxic("Lead","Pb","Heavy Metal","Grey","Odorless","Solid",7.5,"Ingestion","Brain Damage","Chelation","Dry Place","MetalWorks","India",207,false,false,"Medium",36,"Industrial",true);

        Toxic t5 = new Toxic("Chlorine","Cl2","Gas","Green","Sharp","Gas",8.0,"Inhalation","Lung Irritation","Oxygen","Cool Storage","GasCorp","Germany",70,true,true,"High",12,"Water Treatment",true);

        Toxic t6 = new Toxic("Carbon Monoxide","CO","Gas","Colorless","Odorless","Gas",9.0,"Inhalation","Suffocation","Oxygen","Ventilated Area","GasCorp","USA",28,true,false,"High",12,"Industrial",true);

        Toxic t7 = new Toxic("Formaldehyde","CH2O","Chemical","Colorless","Pungent","Liquid",7.0,"Inhalation","Eye Irritation","Fresh Air","Cool Place","ChemLab","India",30,true,true,"Medium",18,"Preservative",true);

        Toxic t8 = new Toxic("Benzene","C6H6","Chemical","Colorless","Sweet","Liquid",8.0,"Inhalation","Cancer Risk","Fresh Air","Cool Storage","ChemLab","USA",78,true,false,"High",18,"Industrial",true);

        Toxic t9 = new Toxic("Ammonia","NH3","Gas","Colorless","Strong","Gas",6.5,"Inhalation","Eye Irritation","Water Wash","Ventilated Area","GasCorp","India",17,true,false,"Medium",12,"Cleaning",false);

        Toxic t10 = new Toxic("Sulfur Dioxide","SO2","Gas","Colorless","Sharp","Gas",7.5,"Inhalation","Breathing Issues","Fresh Air","Cool Storage","GasCorp","UK",64,false,false,"Medium",12,"Industrial",true);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
        t7.display();
        t8.display();
        t9.display();
        t10.display();
    }
}