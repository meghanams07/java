class PeriodicTableExecutor {
    public static void main(String[] args) {
        
        Element e1 = new Element(1, "Hydrogen", "H", 1.008, "Non-metal", 1, 1, "Gas", "Colorless", 1766, "Henry Cavendish", "England", -259.0, -253.0, 1, 1, 0, "Fuel", "Stable", "Chemical Element");
        PeriodicTable pt1 = new PeriodicTable(1, "Modern Periodic Table", "Dmitri Mendeleev", 118, 18, 7, "Chemistry", 1869, "Russia", "Multi", "Elements", "Chemistry Textbook", "English", "Tabular", "Modern", 118, "Active", "Scientific", "Education", "Science", e1);
        pt1.getPeriodicTableDetails();

        Element e2 = new Element(2, "Helium", "He", 4.0026, "Noble Gas", 18, 1, "Gas", "Colorless", 1868, "Pierre Janssen", "France", -272.0, -269.0, 2, 2, 2, "Balloons", "Stable", "Chemical Element");
        PeriodicTable pt2 = new PeriodicTable(2, "Extended Periodic Table", "Glenn T Seaborg", 118, 18, 7, "Chemistry", 1945, "USA", "Extended", "Superheavy", "Actinide Research", "English", "Tabular", "Extended", 118, "Active", "Nuclear", "Research", "Science", e2);
        pt2.getPeriodicTableDetails();

        Element e3 = new Element(3, "Lithium", "Li", 6.94, "Alkali Metal", 1, 2, "Solid", "Silver", 1817, "Johan Arfwedson", "Sweden", 181.0, 1342.0, 3, 3, 4, "Batteries", "Stable", "Chemical Element");
        PeriodicTable pt3 = new PeriodicTable(3, "IUPAC Periodic Table", "IUPAC Committee", 118, 18, 7, "Chemistry", 2016, "International", "Official", "Standard", "Red Book", "English", "Tabular", "IUPAC", 118, "Official", "Naming", "Standard", "Science", e3);
        pt3.getPeriodicTableDetails();

        Element e4 = new Element(4, "Beryllium", "Be", 9.012, "Alkaline Earth", 2, 2, "Solid", "Steel Gray", 1798, "Louis Vauquelin", "France", 1287.0, 2470.0, 4, 4, 5, "Aerospace", "Stable", "Chemical Element");
        PeriodicTable pt4 = new PeriodicTable(4, "Lanthanide Series", "Carl Axel Arrhenius", 15, 3, 1, "Chemistry", 1839, "Sweden", "Rare Earth", "Lanthanides", "Rare Earths", "English", "Series", "F-Block", 57, "Active", "Separation", "Technology", "Science", e4);
        pt4.getPeriodicTableDetails();

        Element e5 = new Element(5, "Boron", "B", 10.81, "Metalloid", 13, 2, "Solid", "Black", 1808, "Humphry Davy", "England", 2076.0, 3927.0, 5, 5, 6, "Semiconductors", "Stable", "Chemical Element");
        PeriodicTable pt5 = new PeriodicTable(5, "Actinide Series", "Glenn Seaborg", 15, 3, 1, "Chemistry", 1940, "USA", "Radioactive", "Actinides", "Transuranium", "English", "Series", "F-Block", 89, "Active", "Synthetic", "Nuclear", "Science", e5);
        pt5.getPeriodicTableDetails();

        Element e6 = new Element(6, "Carbon", "C", 12.011, "Non-metal", 14, 2, "Solid", "Black", 1772, "Antoine Lavoisier", "France", 3550.0, 4827.0, 6, 6, 6, "Diamonds", "Stable", "Chemical Element");
        PeriodicTable pt6 = new PeriodicTable(6, "Noble Gases Table", "William Ramsay", 7, 1, 7, "Chemistry", 1894, "Scotland", "Gaseous", "Group 18", "Inert Gases", "English", "Vertical", "Group 18", 118, "Active", "Discovery", "Lighting", "Science", e6);
        pt6.getPeriodicTableDetails();

        Element e7 = new Element(7, "Nitrogen", "N", 14.007, "Non-metal", 15, 2, "Gas", "Colorless", 1772, "Daniel Rutherford", "Scotland", -210.0, -196.0, 7, 7, 7, "Fertilizer", "Stable", "Chemical Element");
        PeriodicTable pt7 = new PeriodicTable(7, "Halogens Group", "Jöns Berzelius", 5, 1, 5, "Chemistry", 1826, "Sweden", "Reactive", "Group 17", "Halogen Chemistry", "English", "Vertical", "Group 17", 117, "Active", "Reactivity", "Disinfectants", "Science", e7);
        pt7.getPeriodicTableDetails();

        Element e8 = new Element(8, "Oxygen", "O", 15.999, "Non-metal", 16, 2, "Gas", "Colorless", 1774, "Joseph Priestley", "England", -219.0, -183.0, 8, 8, 8, "Respiration", "Stable", "Chemical Element");
        PeriodicTable pt8 = new PeriodicTable(8, "Alkali Metals", "Humphry Davy", 6, 1, 6, "Chemistry", 1807, "England", "Reactive", "Group 1", "Alkali Research", "English", "Vertical", "Group 1", 87, "Active", "Electrolysis", "Batteries", "Science", e8);
        pt8.getPeriodicTableDetails();

        Element e9 = new Element(9, "Fluorine", "F", 18.998, "Halogen", 17, 2, "Gas", "Pale Yellow", 1886, "Henri Moissan", "France", -220.0, -188.0, 9, 9, 10, "Teflon", "Stable", "Chemical Element");
        PeriodicTable pt9 = new PeriodicTable(9, "Transition Metals", "Lothar Meyer", 38, 10, 4, "Chemistry", 1870, "Germany", "Metallic", "D-Block", "Transition Elements", "English", "Block", "D-Block", 118, "Active", "Properties", "Catalysts", "Science", e9);
        pt9.getPeriodicTableDetails();

        Element e10 = new Element(10, "Neon", "Ne", 20.180, "Noble Gas", 18, 2, "Gas", "Red-Orange", 1898, "William Ramsay", "Scotland", -249.0, -246.0, 10, 10, 10, "Neon Signs", "Stable", "Chemical Element");
        PeriodicTable pt10 = new PeriodicTable(10, "Superheavy Elements", "Yuri Oganessian", 10, 5, 2, "Chemistry", 2000, "Russia", "Synthetic", "G-Block", "Island of Stability", "English", "Extended", "Future", 119, "Research", "Particle", "Fundamental", "Science", e10);
        pt10.getPeriodicTableDetails();

        // Continue pattern for pt11-pt20 (showing consistency)
        Element e11 = new Element(11, "Sodium", "Na", 22.990, "Alkali Metal", 1, 3, "Solid", "Silver", 1807, "Humphry Davy", "England", 98.0, 883.0, 11, 11, 12, "Table Salt", "Stable", "Chemical Element");
        PeriodicTable pt11 = new PeriodicTable(11, "P-Block Elements", "Antoine Lavoisier", 35, 6, 6, "Chemistry", 1789, "France", "Varied", "P-Block", "Nonmetals", "English", "Block", "P-Block", 118, "Active", "Properties", "Industry", "Science", e11);
        pt11.getPeriodicTableDetails();

        Element e12 = new Element(12, "Magnesium", "Mg", 24.305, "Alkaline Earth", 2, 3, "Solid", "Silver", 1755, "Joseph Black", "Scotland", 650.0, 1090.0, 12, 12, 12, "Fireworks", "Stable", "Chemical Element");
        PeriodicTable pt12 = new PeriodicTable(12, "S-Block Elements", "Johan Dobereiner", 14, 2, 7, "Chemistry", 1829, "Germany", "Metallic", "S-Block", "Triads", "English", "Block", "S-Block", 87, "Active", "Patterns", "Reactivity", "Science", e12);
        pt12.getPeriodicTableDetails();

        Element e13 = new Element(13, "Aluminum", "Al", 26.982, "Post-transition", 13, 3, "Solid", "Silver", 1825, "Hans Christian Oersted", "Denmark", 660.0, 2519.0, 13, 13, 14, "Aircraft", "Stable", "Chemical Element");
        PeriodicTable pt13 = new PeriodicTable(13, "D-Block Transition", "Henry Moseley", 30, 10, 5, "Chemistry", 1913, "England", "Colored", "Transition", "Atomic Number", "English", "Block", "Modern Order", 118, "Active", "Atomic Number", "Alloys", "Science", e13);
        pt13.getPeriodicTableDetails();

        Element e14 = new Element(14, "Silicon", "Si", 28.085, "Metalloid", 14, 3, "Solid", "Gray", 1824, "Jöns Berzelius", "Sweden", 1414.0, 3265.0, 14, 14, 14, "Chips", "Stable", "Chemical Element");
        PeriodicTable pt14 = new PeriodicTable(14, "F-Block Lanthanides", "Johan Gadolin", 15, 1, 1, "Chemistry", 1794, "Finland", "Rare Earths", "Lanthanides", "Ytterby", "English", "Series", "F-Series", 71, "Active", "Separation", "Magnets", "Science", e14);
        pt14.getPeriodicTableDetails();

        Element e15 = new Element(15, "Phosphorus", "P", 30.974, "Non-metal", 15, 3, "Solid", "White", 1669, "Hennig Brand", "Germany", 44.0, 280.0, 15, 15, 16, "Matches", "Reactive", "Chemical Element");
        PeriodicTable pt15 = new PeriodicTable(15, "Synthetic Elements", "Edwin McMillan", 24, 8, 3, "Chemistry", 1940, "USA", "Artificial", "Transuranic", "Cyclotron", "English", "Extended", "Man-made", 118, "Research", "Accelerator", "Research", "Science", e15);
        pt15.getPeriodicTableDetails();

        Element e16 = new Element(16, "Sulfur", "S", 32.06, "Non-metal", 16, 3, "Solid", "Yellow", 0, "Known to ancients", "Global", 115.0, 445.0, 16, 16, 16, "Sulfuric Acid", "Stable", "Chemical Element");
        PeriodicTable pt16 = new PeriodicTable(16, "Platinum Group", "Antonio de Ulloa", 6, 1, 3, "Chemistry", 1735, "Spain", "Precious", "PGM", "Noble Metals", "English", "Group", "6A", 78, "Active", "Catalysis", "Jewelry", "Science", e16);
        pt16.getPeriodicTableDetails();

        Element e17 = new Element(17, "Chlorine", "Cl", 35.45, "Halogen", 17, 3, "Gas", "Green-Yellow", 1774, "Carl Wilhelm Scheele", "Sweden", -101.0, -34.0, 17, 17, 18, "Water Treatment", "Reactive", "Chemical Element");
        PeriodicTable pt17 = new PeriodicTable(17, "Iron Group", "Ancient Metallurgy", 4, 1, 3, "Chemistry", 5000, "Anatolia", "Ferrous", "Ferroalloys", "Metallurgy", "English", "Group", "8B", 28, "Active", "Smelting", "Steel", "Science", e17);
        pt17.getPeriodicTableDetails();

        Element e18 = new Element(18, "Argon", "Ar", 39.948, "Noble Gas", 18, 3, "Gas", "Colorless", 1894, "William Ramsay", "Scotland", -189.0, -186.0, 18, 18, 22, "Welding", "Stable", "Chemical Element");
        PeriodicTable pt18 = new PeriodicTable(18, "Coinage Metals", "Ancient Civilizations", 3, 1, 3, "Chemistry", 3000, "Mesopotamia", "Precious", "Group 11", "Numismatics", "English", "Vertical", "Group 11", 79, "Active", "Currency", "Money", "Science", e18);
        pt18.getPeriodicTableDetails();

        Element e19 = new Element(19, "Potassium", "K", 39.098, "Alkali Metal", 1, 4, "Solid", "Silver", 1807, "Humphry Davy", "England", 63.0, 759.0, 19, 19, 20, "Fertilizer", "Reactive", "Chemical Element");
        PeriodicTable pt19 = new PeriodicTable(19, "Rare Earth Elements", "Martin Klaproth", 17, 1, 2, "Chemistry", 1787, "Germany", "Earth Tones", "REE", "Lanthanides", "English", "Series", "Rare Earths", 71, "Active", "Electronics", "High Tech", "Science", e19);
        pt19.getPeriodicTableDetails();

        Element e20 = new Element(20, "Calcium", "Ca", 40.078, "Alkaline Earth", 2, 4, "Solid", "Silver", 1808, "Humphry Davy", "England", 842.0, 1484.0, 20, 20, 20, "Bones", "Stable", "Chemical Element");
        PeriodicTable pt20 = new PeriodicTable(20, "Element 118 Table", "Yuri Oganessian", 1, 18, 7, "Chemistry", 2002, "Russia", "Oganesson", "Superheavy", "Noble Gas End", "English", "Single", "118", 118, "Confirmed", "Synthesis", "Fundamental", "Science", e20);
        pt20.getPeriodicTableDetails();
    }
}