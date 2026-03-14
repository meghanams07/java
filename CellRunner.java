class CellRunner {

    public static void main(String[] args) {

        Cell c1 = new Cell("Red Blood Cell","Human","Eukaryotic","Round",7.5,"None",false,false,"Transport Oxygen","Blood","Fluid","Lipid","Glucose","Mitosis","Hooke",1665,"Red",120,"Hemoglobin",true);

        Cell c2 = new Cell("White Blood Cell","Human","Eukaryotic","Irregular",10,"Present",false,false,"Immune Defense","Blood","Fluid","Lipid","Glucose","Mitosis","Hooke",1665,"White",10,"Lysosome",true);

        Cell c3 = new Cell("Plant Cell","Plant","Eukaryotic","Rectangular",50,"Present",true,true,"Photosynthesis","Leaf","Dense","Cellulose","Sunlight","Mitosis","Hooke",1665,"Green",365,"Chloroplast",true);

        Cell c4 = new Cell("Bacterial Cell","Bacteria","Prokaryotic","Rod",2,"None",true,false,"Reproduction","Soil","Simple","Peptidoglycan","Organic","Binary Fission","Leeuwenhoek",1674,"Transparent",24,"Ribosome",true);

        Cell c5 = new Cell("Muscle Cell","Human","Eukaryotic","Long",100,"Present",false,false,"Movement","Muscle","Dense","Lipid","Glucose","Mitosis","Hooke",1665,"Pink",90,"Mitochondria",true);

        Cell c6 = new Cell("Nerve Cell","Human","Eukaryotic","Branched",120,"Present",false,false,"Signal Transmission","Brain","Fluid","Lipid","Glucose","Mitosis","Hooke",1665,"Grey",100,"Axon",true);

        Cell c7 = new Cell("Skin Cell","Human","Eukaryotic","Flat",30,"Present",false,false,"Protection","Skin","Dense","Lipid","Glucose","Mitosis","Hooke",1665,"Brown",30,"Keratin",true);

        Cell c8 = new Cell("Root Cell","Plant","Eukaryotic","Rectangular",40,"Present",true,false,"Absorption","Root","Dense","Cellulose","Minerals","Mitosis","Hooke",1665,"White",365,"Vacuole",true);

        Cell c9 = new Cell("Algae Cell","Algae","Eukaryotic","Oval",25,"Present",true,true,"Photosynthesis","Water","Fluid","Cellulose","Sunlight","Mitosis","Hooke",1665,"Green",200,"Chloroplast",true);

        Cell c10 = new Cell("Yeast Cell","Fungus","Eukaryotic","Oval",6,"Present",true,false,"Fermentation","Food","Fluid","Chitin","Sugar","Budding","Pasteur",1857,"Cream",48,"Mitochondria",true);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();
        c8.display();
        c9.display();
        c10.display();
    }
}