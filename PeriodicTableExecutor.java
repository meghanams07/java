class PeriodicTableExecutor {

    public static void main(String[] args){

        PeriodicTable pt1 = new PeriodicTable();

        pt1.tableId = 1;
        pt1.tableName = "Modern Periodic Table";
        pt1.scientist = "Dmitri Mendeleev";
        pt1.totalElements = 118;
        pt1.groups = 18;
        pt1.periods = 7;
        pt1.category = "Chemistry";
        pt1.discoveredYear = 1869;
        pt1.originCountry = "Russia";
        pt1.color = "Multi";
        pt1.classification = "Elements";
        pt1.referenceBook = "Chemistry Textbook";
        pt1.language = "English";
        pt1.structure = "Tabular";
        pt1.version = "Modern";
        pt1.atomicSeries = 118;
        pt1.status = "Active";
        pt1.updateType = "Scientific";
        pt1.usage = "Education";
        pt1.field = "Science";

        Element e1 = new Element();

        e1.atomicNumber = 1;
        e1.elementName = "Hydrogen";
        e1.symbol = "H";
        e1.atomicMass = 1.008;
        e1.category = "Non-metal";
        e1.group = 1;
        e1.period = 1;
        e1.state = "Gas";
        e1.color = "Colorless";
        e1.discoveredYear = 1766;
        e1.discoveredBy = "Henry Cavendish";
        e1.originCountry = "England";
        e1.meltingPoint = -259;
        e1.boilingPoint = -253;
        e1.electrons = 1;
        e1.protons = 1;
        e1.neutrons = 0;
        e1.usage = "Fuel";
        e1.status = "Stable";
        e1.type = "Chemical Element";

        pt1.element = e1;

        pt1.getPeriodicTableDetails();

PeriodicTable pt2 = new PeriodicTable();

        pt2.tableId = 2;
        pt2.tableName = "Extended Periodic Table";
        pt2.scientist = "Glenn T Seaborg";
        pt2.totalElements = 118;
        pt2.groups = 18;
        pt2.periods = 7;
        pt2.category = "Chemistry";
        pt2.discoveredYear = 1945;
        pt2.originCountry = "USA";
        pt2.color = "Extended";
        pt2.classification = "Superheavy";
        pt2.referenceBook = "Actinide Research";
        pt2.language = "English";
        pt2.structure = "Tabular";
        pt2.version = "Extended";
        pt2.atomicSeries = 118;
        pt2.status = "Active";
        pt2.updateType = "Nuclear";
        pt2.usage = "Research";
        pt2.field = "Science";

        Element e2 = new Element();

        e2.atomicNumber = 2;
        e2.elementName = "Helium";
        e2.symbol = "He";
        e2.atomicMass = 4.0026;
        e2.category = "Noble Gas";
        e2.group = 18;
        e2.period = 1;
        e2.state = "Gas";
        e2.color = "Colorless";
        e2.discoveredYear = 1868;
        e2.discoveredBy = "Pierre Janssen";
        e2.originCountry = "France";
        e2.meltingPoint = -272;
        e2.boilingPoint = -269;
        e2.electrons = 2;
        e2.protons = 2;
        e2.neutrons = 2;
        e2.usage = "Balloons";
        e2.status = "Stable";
        e2.type = "Chemical Element";

        pt2.element = e2;

        pt2.getPeriodicTableDetails();

PeriodicTable pt3 = new PeriodicTable();

        pt3.tableId = 3;
        pt3.tableName = "IUPAC Periodic Table";
        pt3.scientist = "IUPAC Committee";
        pt3.totalElements = 118;
        pt3.groups = 18;
        pt3.periods = 7;
        pt3.category = "Chemistry";
        pt3.discoveredYear = 2016;
        pt3.originCountry = "International";
        pt3.color = "Official";
        pt3.classification = "Standard";
        pt3.referenceBook = "Red Book";
        pt3.language = "English";
        pt3.structure = "Tabular";
        pt3.version = "IUPAC";
        pt3.atomicSeries = 118;
        pt3.status = "Official";
        pt3.updateType = "Naming";
        pt3.usage = "Standard";
        pt3.field = "Science";

        Element e3 = new Element();

        e3.atomicNumber = 3;
        e3.elementName = "Lithium";
        e3.symbol = "Li";
        e3.atomicMass = 6.94;
        e3.category = "Alkali Metal";
        e3.group = 1;
        e3.period = 2;
        e3.state = "Solid";
        e3.color = "Silver";
        e3.discoveredYear = 1817;
        e3.discoveredBy = "Johan Arfwedson";
        e3.originCountry = "Sweden";
        e3.meltingPoint = 181;
        e3.boilingPoint = 1342;
        e3.electrons = 3;
        e3.protons = 3;
        e3.neutrons = 4;
        e3.usage = "Batteries";
        e3.status = "Stable";
        e3.type = "Chemical Element";

        pt3.element = e3;

        pt3.getPeriodicTableDetails();

PeriodicTable pt4 = new PeriodicTable();

        pt4.tableId = 4;
        pt4.tableName = "Lanthanide Series";
        pt4.scientist = "Carl Axel Arrhenius";
        pt4.totalElements = 15;
        pt4.groups = 3;
        pt4.periods = 1;
        pt4.category = "Chemistry";
        pt4.discoveredYear = 1839;
        pt4.originCountry = "Sweden";
        pt4.color = "Rare Earth";
        pt4.classification = "Lanthanides";
        pt4.referenceBook = "Rare Earths";
        pt4.language = "English";
        pt4.structure = "Series";
        pt4.version = "F-Block";
        pt4.atomicSeries = 57;
        pt4.status = "Active";
        pt4.updateType = "Separation";
        pt4.usage = "Technology";
        pt4.field = "Science";

        Element e4 = new Element();

        e4.atomicNumber = 4;
        e4.elementName = "Beryllium";
        e4.symbol = "Be";
        e4.atomicMass = 9.012;
        e4.category = "Alkaline Earth";
        e4.group = 2;
        e4.period = 2;
        e4.state = "Solid";
        e4.color = "Steel Gray";
        e4.discoveredYear = 1798;
        e4.discoveredBy = "Louis Vauquelin";
        e4.originCountry = "France";
        e4.meltingPoint = 1287;
        e4.boilingPoint = 2470;
        e4.electrons = 4;
        e4.protons = 4;
        e4.neutrons = 5;
        e4.usage = "Aerospace";
        e4.status = "Stable";
        e4.type = "Chemical Element";

        pt4.element = e4;

        pt4.getPeriodicTableDetails();

PeriodicTable pt5 = new PeriodicTable();

        pt5.tableId = 5;
        pt5.tableName = "Actinide Series";
        pt5.scientist = "Glenn Seaborg";
        pt5.totalElements = 15;
        pt5.groups = 3;
        pt5.periods = 1;
        pt5.category = "Chemistry";
        pt5.discoveredYear = 1940;
        pt5.originCountry = "USA";
        pt5.color = "Radioactive";
        pt5.classification = "Actinides";
        pt5.referenceBook = "Transuranium";
        pt5.language = "English";
        pt5.structure = "Series";
        pt5.version = "F-Block";
        pt5.atomicSeries = 89;
        pt5.status = "Active";
        pt5.updateType = "Synthetic";
        pt5.usage = "Nuclear";
        pt5.field = "Science";

        Element e5 = new Element();

        e5.atomicNumber = 5;
        e5.elementName = "Boron";
        e5.symbol = "B";
        e5.atomicMass = 10.81;
        e5.category = "Metalloid";
        e5.group = 13;
        e5.period = 2;
        e5.state = "Solid";
        e5.color = "Black";
        e5.discoveredYear = 1808;
        e5.discoveredBy = "Humphry Davy";
        e5.originCountry = "England";
        e5.meltingPoint = 2076;
        e5.boilingPoint = 3927;
        e5.electrons = 5;
        e5.protons = 5;
        e5.neutrons = 6;
        e5.usage = "Semiconductors";
        e5.status = "Stable";
        e5.type = "Chemical Element";

        pt5.element = e5;

        pt5.getPeriodicTableDetails();

PeriodicTable pt6 = new PeriodicTable();

        pt6.tableId = 6;
        pt6.tableName = "Noble Gases Table";
        pt6.scientist = "William Ramsay";
        pt6.totalElements = 7;
        pt6.groups = 1;
        pt6.periods = 7;
        pt6.category = "Chemistry";
        pt6.discoveredYear = 1894;
        pt6.originCountry = "Scotland";
        pt6.color = "Gaseous";
        pt6.classification = "Group 18";
        pt6.referenceBook = "Inert Gases";
        pt6.language = "English";
        pt6.structure = "Vertical";
        pt6.version = "Group 18";
        pt6.atomicSeries = 118;
        pt6.status = "Active";
        pt6.updateType = "Discovery";
        pt6.usage = "Lighting";
        pt6.field = "Science";

        Element e6 = new Element();

        e6.atomicNumber = 6;
        e6.elementName = "Carbon";
        e6.symbol = "C";
        e6.atomicMass = 12.011;
        e6.category = "Non-metal";
        e6.group = 14;
        e6.period = 2;
        e6.state = "Solid";
        e6.color = "Black";
        e6.discoveredYear = 1772;
        e6.discoveredBy = "Antoine Lavoisier";
        e6.originCountry = "France";
        e6.meltingPoint = 3550;
        e6.boilingPoint = 4827;
        e6.electrons = 6;
        e6.protons = 6;
        e6.neutrons = 6;
        e6.usage = "Diamonds";
        e6.status = "Stable";
        e6.type = "Chemical Element";

        pt6.element = e6;

        pt6.getPeriodicTableDetails();

PeriodicTable pt7 = new PeriodicTable();

        pt7.tableId = 7;
        pt7.tableName = "Halogens Group";
        pt7.scientist = "Jöns Berzelius";
        pt7.totalElements = 5;
        pt7.groups = 1;
        pt7.periods = 5;
        pt7.category = "Chemistry";
        pt7.discoveredYear = 1826;
        pt7.originCountry = "Sweden";
        pt7.color = "Reactive";
        pt7.classification = "Group 17";
        pt7.referenceBook = "Halogen Chemistry";
        pt7.language = "English";
        pt7.structure = "Vertical";
        pt7.version = "Group 17";
        pt7.atomicSeries = 117;
        pt7.status = "Active";
        pt7.updateType = "Reactivity";
        pt7.usage = "Disinfectants";
        pt7.field = "Science";

        Element e7 = new Element();

        e7.atomicNumber = 7;
        e7.elementName = "Nitrogen";
        e7.symbol = "N";
        e7.atomicMass = 14.007;
        e7.category = "Non-metal";
        e7.group = 15;
        e7.period = 2;
        e7.state = "Gas";
        e7.color = "Colorless";
        e7.discoveredYear = 1772;
        e7.discoveredBy = "Daniel Rutherford";
        e7.originCountry = "Scotland";
        e7.meltingPoint = -210;
        e7.boilingPoint = -196;
        e7.electrons = 7;
        e7.protons = 7;
        e7.neutrons = 7;
        e7.usage = "Fertilizer";
        e7.status = "Stable";
        e7.type = "Chemical Element";

        pt7.element = e7;

        pt7.getPeriodicTableDetails();

PeriodicTable pt8 = new PeriodicTable();

        pt8.tableId = 8;
        pt8.tableName = "Alkali Metals";
        pt8.scientist = "Humphry Davy";
        pt8.totalElements = 6;
        pt8.groups = 1;
        pt8.periods = 6;
        pt8.category = "Chemistry";
        pt8.discoveredYear = 1807;
        pt8.originCountry = "England";
        pt8.color = "Reactive";
        pt8.classification = "Group 1";
        pt8.referenceBook = "Alkali Research";
        pt8.language = "English";
        pt8.structure = "Vertical";
        pt8.version = "Group 1";
        pt8.atomicSeries = 87;
        pt8.status = "Active";
        pt8.updateType = "Electrolysis";
        pt8.usage = "Batteries";
        pt8.field = "Science";

        Element e8 = new Element();

        e8.atomicNumber = 8;
        e8.elementName = "Oxygen";
        e8.symbol = "O";
        e8.atomicMass = 15.999;
        e8.category = "Non-metal";
        e8.group = 16;
        e8.period = 2;
        e8.state = "Gas";
        e8.color = "Colorless";
        e8.discoveredYear = 1774;
        e8.discoveredBy = "Joseph Priestley";
        e8.originCountry = "England";
        e8.meltingPoint = -219;
        e8.boilingPoint = -183;
        e8.electrons = 8;
        e8.protons = 8;
        e8.neutrons = 8;
        e8.usage = "Respiration";
        e8.status = "Stable";
        e8.type = "Chemical Element";

        pt8.element = e8;

        pt8.getPeriodicTableDetails();

PeriodicTable pt9 = new PeriodicTable();

        pt9.tableId = 9;
        pt9.tableName = "Transition Metals";
        pt9.scientist = "Lothar Meyer";
        pt9.totalElements = 38;
        pt9.groups = 10;
        pt9.periods = 4;
        pt9.category = "Chemistry";
        pt9.discoveredYear = 1870;
        pt9.originCountry = "Germany";
        pt9.color = "Metallic";
        pt9.classification = "D-Block";
        pt9.referenceBook = "Transition Elements";
        pt9.language = "English";
        pt9.structure = "Block";
        pt9.version = "D-Block";
        pt9.atomicSeries = 118;
        pt9.status = "Active";
        pt9.updateType = "Properties";
        pt9.usage = "Catalysts";
        pt9.field = "Science";

        Element e9 = new Element();

        e9.atomicNumber = 9;
        e9.elementName = "Fluorine";
        e9.symbol = "F";
        e9.atomicMass = 18.998;
        e9.category = "Halogen";
        e9.group = 17;
        e9.period = 2;
        e9.state = "Gas";
        e9.color = "Pale Yellow";
        e9.discoveredYear = 1886;
        e9.discoveredBy = "Henri Moissan";
        e9.originCountry = "France";
        e9.meltingPoint = -220;
        e9.boilingPoint = -188;
        e9.electrons = 9;
        e9.protons = 9;
        e9.neutrons = 10;
        e9.usage = "Teflon";
        e9.status = "Stable";
        e9.type = "Chemical Element";

        pt9.element = e9;

        pt9.getPeriodicTableDetails();

PeriodicTable pt10 = new PeriodicTable();

        pt10.tableId = 10;
        pt10.tableName = "Superheavy Elements";
        pt10.scientist = "Yuri Oganessian";
        pt10.totalElements = 10;
        pt10.groups = 5;
        pt10.periods = 2;
        pt10.category = "Chemistry";
        pt10.discoveredYear = 2000;
        pt10.originCountry = "Russia";
        pt10.color = "Synthetic";
        pt10.classification = "G-Block";
        pt10.referenceBook = "Island of Stability";
        pt10.language = "English";
        pt10.structure = "Extended";
        pt10.version = "Future";
        pt10.atomicSeries = 119;
        pt10.status = "Research";
        pt10.updateType = "Particle";
        pt10.usage = "Fundamental";
        pt10.field = "Science";

        Element e10 = new Element();

        e10.atomicNumber = 10;
        e10.elementName = "Neon";
        e10.symbol = "Ne";
        e10.atomicMass = 20.180;
        e10.category = "Noble Gas";
        e10.group = 18;
        e10.period = 2;
        e10.state = "Gas";
        e10.color = "Red-Orange";
        e10.discoveredYear = 1898;
        e10.discoveredBy = "William Ramsay";
        e10.originCountry = "Scotland";
        e10.meltingPoint = -249;
        e10.boilingPoint = -246;
        e10.electrons = 10;
        e10.protons = 10;
        e10.neutrons = 10;
        e10.usage = "Neon Signs";
        e10.status = "Stable";
        e10.type = "Chemical Element";

        pt10.element = e10;

        pt10.getPeriodicTableDetails();

PeriodicTable pt11 = new PeriodicTable();

        pt11.tableId = 11;
        pt11.tableName = "P-Block Elements";
        pt11.scientist = "Antoine Lavoisier";
        pt11.totalElements = 35;
        pt11.groups = 6;
        pt11.periods = 6;
        pt11.category = "Chemistry";
        pt11.discoveredYear = 1789;
        pt11.originCountry = "France";
        pt11.color = "Varied";
        pt11.classification = "P-Block";
        pt11.referenceBook = "Nonmetals";
        pt11.language = "English";
        pt11.structure = "Block";
        pt11.version = "P-Block";
        pt11.atomicSeries = 118;
        pt11.status = "Active";
        pt11.updateType = "Properties";
        pt11.usage = "Industry";
        pt11.field = "Science";

        Element e11 = new Element();

        e11.atomicNumber = 11;
        e11.elementName = "Sodium";
        e11.symbol = "Na";
        e11.atomicMass = 22.990;
        e11.category = "Alkali Metal";
        e11.group = 1;
        e11.period = 3;
        e11.state = "Solid";
        e11.color = "Silver";
        e11.discoveredYear = 1807;
        e11.discoveredBy = "Humphry Davy";
        e11.originCountry = "England";
        e11.meltingPoint = 98;
        e11.boilingPoint = 883;
        e11.electrons = 11;
        e11.protons = 11;
        e11.neutrons = 12;
        e11.usage = "Table Salt";
        e11.status = "Stable";
        e11.type = "Chemical Element";

        pt11.element = e11;

        pt11.getPeriodicTableDetails();

PeriodicTable pt12 = new PeriodicTable();

        pt12.tableId = 12;
        pt12.tableName = "S-Block Elements";
        pt12.scientist = "Johan Dobereiner";
        pt12.totalElements = 14;
        pt12.groups = 2;
        pt12.periods = 7;
        pt12.category = "Chemistry";
        pt12.discoveredYear = 1829;
        pt12.originCountry = "Germany";
        pt12.color = "Metallic";
        pt12.classification = "S-Block";
        pt12.referenceBook = "Triads";
        pt12.language = "English";
        pt12.structure = "Block";
        pt12.version = "S-Block";
        pt12.atomicSeries = 87;
        pt12.status = "Active";
        pt12.updateType = "Patterns";
        pt12.usage = "Reactivity";
        pt12.field = "Science";

        Element e12 = new Element();

        e12.atomicNumber = 12;
        e12.elementName = "Magnesium";
        e12.symbol = "Mg";
        e12.atomicMass = 24.305;
        e12.category = "Alkaline Earth";
        e12.group = 2;
        e12.period = 3;
        e12.state = "Solid";
        e12.color = "Silver";
        e12.discoveredYear = 1755;
        e12.discoveredBy = "Joseph Black";
        e12.originCountry = "Scotland";
        e12.meltingPoint = 650;
        e12.boilingPoint = 1090;
        e12.electrons = 12;
        e12.protons = 12;
        e12.neutrons = 12;
        e12.usage = "Fireworks";
        e12.status = "Stable";
        e12.type = "Chemical Element";

        pt12.element = e12;

        pt12.getPeriodicTableDetails();

PeriodicTable pt13 = new PeriodicTable();

        pt13.tableId = 13;
        pt13.tableName = "D-Block Transition";
        pt13.scientist = "Henry Moseley";
        pt13.totalElements = 30;
        pt13.groups = 10;
        pt13.periods = 5;
        pt13.category = "Chemistry";
        pt13.discoveredYear = 1913;
        pt13.originCountry = "England";
        pt13.color = "Colored";
        pt13.classification = "Transition";
        pt13.referenceBook = "Atomic Number";
        pt13.language = "English";
        pt13.structure = "Block";
        pt13.version = "Modern Order";
        pt13.atomicSeries = 118;
        pt13.status = "Active";
        pt13.updateType = "Atomic Number";
        pt13.usage = "Alloys";
        pt13.field = "Science";

        Element e13 = new Element();

        e13.atomicNumber = 13;
        e13.elementName = "Aluminum";
        e13.symbol = "Al";
        e13.atomicMass = 26.982;
        e13.category = "Post-transition";
        e13.group = 13;
        e13.period = 3;
        e13.state = "Solid";
        e13.color = "Silver";
        e13.discoveredYear = 1825;
        e13.discoveredBy = "Hans Christian Oersted";
        e13.originCountry = "Denmark";
        e13.meltingPoint = 660;
        e13.boilingPoint = 2519;
        e13.electrons = 13;
        e13.protons = 13;
        e13.neutrons = 14;
        e13.usage = "Aircraft";
        e13.status = "Stable";
        e13.type = "Chemical Element";

        pt13.element = e13;

        pt13.getPeriodicTableDetails();

PeriodicTable pt14 = new PeriodicTable();

        pt14.tableId = 14;
        pt14.tableName = "F-Block Lanthanides";
        pt14.scientist = "Johan Gadolin";
        pt14.totalElements = 15;
        pt14.groups = 1;
        pt14.periods = 1;
        pt14.category = "Chemistry";
        pt14.discoveredYear = 1794;
        pt14.originCountry = "Finland";
        pt14.color = "Rare Earths";
        pt14.classification = "Lanthanides";
        pt14.referenceBook = "Ytterby";
        pt14.language = "English";
        pt14.structure = "Series";
        pt14.version = "F-Series";
        pt14.atomicSeries = 71;
        pt14.status = "Active";
        pt14.updateType = "Separation";
        pt14.usage = "Magnets";
        pt14.field = "Science";

        Element e14 = new Element();

        e14.atomicNumber = 14;
        e14.elementName = "Silicon";
        e14.symbol = "Si";
        e14.atomicMass = 28.085;
        e14.category = "Metalloid";
        e14.group = 14;
        e14.period = 3;
        e14.state = "Solid";
        e14.color = "Gray";
        e14.discoveredYear = 1824;
        e14.discoveredBy = "Jöns Berzelius";
        e14.originCountry = "Sweden";
        e14.meltingPoint = 1414;
        e14.boilingPoint = 3265;
        e14.electrons = 14;
        e14.protons = 14;
        e14.neutrons = 14;
        e14.usage = "Chips";
        e14.status = "Stable";
        e14.type = "Chemical Element";

        pt14.element = e14;

        pt14.getPeriodicTableDetails();

PeriodicTable pt15 = new PeriodicTable();

        pt15.tableId = 15;
        pt15.tableName = "Synthetic Elements";
        pt15.scientist = "Edwin McMillan";
        pt15.totalElements = 24;
        pt15.groups = 8;
        pt15.periods = 3;
        pt15.category = "Chemistry";
        pt15.discoveredYear = 1940;
        pt15.originCountry = "USA";
        pt15.color = "Artificial";
        pt15.classification = "Transuranic";
        pt15.referenceBook = "Cyclotron";
        pt15.language = "English";
        pt15.structure = "Extended";
        pt15.version = "Man-made";
        pt15.atomicSeries = 118;
        pt15.status = "Research";
        pt15.updateType = "Accelerator";
        pt15.usage = "Research";
        pt15.field = "Science";

        Element e15 = new Element();

        e15.atomicNumber = 15;
        e15.elementName = "Phosphorus";
        e15.symbol = "P";
        e15.atomicMass = 30.974;
        e15.category = "Non-metal";
        e15.group = 15;
        e15.period = 3;
        e15.state = "Solid";
        e15.color = "White";
        e15.discoveredYear = 1669;
        e15.discoveredBy = "Hennig Brand";
        e15.originCountry = "Germany";
        e15.meltingPoint = 44;
        e15.boilingPoint = 280;
        e15.electrons = 15;
        e15.protons = 15;
        e15.neutrons = 16;
        e15.usage = "Matches";
        e15.status = "Reactive";
        e15.type = "Chemical Element";

        pt15.element = e15;

        pt15.getPeriodicTableDetails();

PeriodicTable pt16 = new PeriodicTable();

        pt16.tableId = 16;
        pt16.tableName = "Platinum Group";
        pt16.scientist = "Antonio de Ulloa";
        pt16.totalElements = 6;
        pt16.groups = 1;
        pt16.periods = 3;
        pt16.category = "Chemistry";
        pt16.discoveredYear = 1735;
        pt16.originCountry = "Spain";
        pt16.color = "Precious";
        pt16.classification = "PGM";
        pt16.referenceBook = "Noble Metals";
        pt16.language = "English";
        pt16.structure = "Group";
        pt16.version = "6A";
        pt16.atomicSeries = 78;
        pt16.status = "Active";
        pt16.updateType = "Catalysis";
        pt16.usage = "Jewelry";
        pt16.field = "Science";

        Element e16 = new Element();

        e16.atomicNumber = 16;
        e16.elementName = "Sulfur";
        e16.symbol = "S";
        e16.atomicMass = 32.06;
        e16.category = "Non-metal";
        e16.group = 16;
        e16.period = 3;
        e16.state = "Solid";
        e16.color = "Yellow";
        e16.discoveredYear = "Ancient";
        e16.discoveredBy = "Known to ancients";
        e16.originCountry = "Global";
        e16.meltingPoint = 115;
        e16.boilingPoint = 445;
        e16.electrons = 16;
        e16.protons = 16;
        e16.neutrons = 16;
        e16.usage = "Sulfuric Acid";
        e16.status = "Stable";
        e16.type = "Chemical Element";

        pt16.element = e16;

        pt16.getPeriodicTableDetails();

PeriodicTable pt17 = new PeriodicTable();

        pt17.tableId = 17;
        pt17.tableName = "Iron Group";
        pt17.scientist = "Ancient Metallurgy";
        pt17.totalElements = 4;
        pt17.groups = 1;
        pt17.periods = 3;
        pt17.category = "Chemistry";
        pt17.discoveredYear = 5000;
        pt17.originCountry = "Anatolia";
        pt17.color = "Ferrous";
        pt17.classification = "Ferroalloys";
        pt17.referenceBook = "Metallurgy";
        pt17.language = "English";
        pt17.structure = "Group";
        pt17.version = "8B";
        pt17.atomicSeries = 28;
        pt17.status = "Active";
        pt17.updateType = "Smelting";
        pt17.usage = "Steel";
        pt17.field = "Science";

        Element e17 = new Element();

        e17.atomicNumber = 17;
        e17.elementName = "Chlorine";
        e17.symbol = "Cl";
        e17.atomicMass = 35.45;
        e17.category = "Halogen";
        e17.group = 17;
        e17.period = 3;
        e17.state = "Gas";
        e17.color = "Green-Yellow";
        e17.discoveredYear = 1774;
        e17.discoveredBy = "Carl Wilhelm Scheele";
        e17.originCountry = "Sweden";
        e17.meltingPoint = -101;
        e17.boilingPoint = -34;
        e17.electrons = 17;
        e17.protons = 17;
        e17.neutrons = 18;
        e17.usage = "Water Treatment";
        e17.status = "Reactive";
        e17.type = "Chemical Element";

        pt17.element = e17;

        pt17.getPeriodicTableDetails();

PeriodicTable pt18 = new PeriodicTable();

        pt18.tableId = 18;
        pt18.tableName = "Coinage Metals";
        pt18.scientist = "Ancient Civilizations";
        pt18.totalElements = 3;
        pt18.groups = 1;
        pt18.periods = 3;
        pt18.category = "Chemistry";
        pt18.discoveredYear = 3000;
        pt18.originCountry = "Mesopotamia";
        pt18.color = "Precious";
        pt18.classification = "Group 11";
        pt18.referenceBook = "Numismatics";
        pt18.language = "English";
        pt18.structure = "Vertical";
        pt18.version = "Group 11";
        pt18.atomicSeries = 79;
        pt18.status = "Active";
        pt18.updateType = "Currency";
        pt18.usage = "Money";
        pt18.field = "Science";

        Element e18 = new Element();

        e18.atomicNumber = 18;
        e18.elementName = "Argon";
        e18.symbol = "Ar";
        e18.atomicMass = 39.948;
        e18.category = "Noble Gas";
        e18.group = 18;
        e18.period = 3;
        e18.state = "Gas";
        e18.color = "Colorless";
        e18.discoveredYear = 1894;
        e18.discoveredBy = "William Ramsay";
        e18.originCountry = "Scotland";
        e18.meltingPoint = -189;
        e18.boilingPoint = -186;
        e18.electrons = 18;
        e18.protons = 18;
        e18.neutrons = 22;
        e18.usage = "Welding";
        e18.status = "Stable";
        e18.type = "Chemical Element";

        pt18.element = e18;

        pt18.getPeriodicTableDetails();

PeriodicTable pt19 = new PeriodicTable();

        pt19.tableId = 19;
        pt19.tableName = "Rare Earth Elements";
        pt19.scientist = "Martin Klaproth";
        pt19.totalElements = 17;
        pt19.groups = 1;
        pt19.periods = 2;
        pt19.category = "Chemistry";
        pt19.discoveredYear = 1787;
        pt19.originCountry = "Germany";
        pt19.color = "Earth Tones";
        pt19.classification = "REE";
        pt19.referenceBook = "Lanthanides";
        pt19.language = "English";
        pt19.structure = "Series";
        pt19.version = "Rare Earths";
        pt19.atomicSeries = 71;
        pt19.status = "Active";
        pt19.updateType = "Electronics";
        pt19.usage = "High Tech";
        pt19.field = "Science";

        Element e19 = new Element();

        e19.atomicNumber = 19;
        e19.elementName = "Potassium";
        e19.symbol = "K";
        e19.atomicMass = 39.098;
        e19.category = "Alkali Metal";
        e19.group = 1;
        e19.period = 4;
        e19.state = "Solid";
        e19.color = "Silver";
        e19.discoveredYear = 1807;
        e19.discoveredBy = "Humphry Davy";
        e19.originCountry = "England";
        e19.meltingPoint = 63;
        e19.boilingPoint = 759;
        e19.electrons = 19;
        e19.protons = 19;
        e19.neutrons = 20;
        e19.usage = "Fertilizer";
        e19.status = "Reactive";
        e19.type = "Chemical Element";

        pt19.element = e19;

        pt19.getPeriodicTableDetails();

PeriodicTable pt20 = new PeriodicTable();

        pt20.tableId = 20;
        pt20.tableName = "Element 118 Table";
        pt20.scientist = "Yuri Oganessian";
        pt20.totalElements = 1;
        pt20.groups = 18;
        pt20.periods = 7;
        pt20.category = "Chemistry";
        pt20.discoveredYear = 2002;
        pt20.originCountry = "Russia";
        pt20.color = "Oganesson";
        pt20.classification = "Superheavy";
        pt20.referenceBook = "Noble Gas End";
        pt20.language = "English";
        pt20.structure = "Single";
        pt20.version = "118";
        pt20.atomicSeries = 118;
        pt20.status = "Confirmed";
        pt20.updateType = "Synthesis";
        pt20.usage = "Fundamental";
        pt20.field = "Science";

        Element e20 = new Element();

        e20.atomicNumber = 20;
        e20.elementName = "Calcium";
        e20.symbol = "Ca";
        e20.atomicMass = 40.078;
        e20.category = "Alkaline Earth";
        e20.group = 2;
        e20.period = 4;
        e20.state = "Solid";
        e20.color = "Silver";
        e20.discoveredYear = 1808;
        e20.discoveredBy = "Humphry Davy";
        e20.originCountry = "England";
        e20.meltingPoint = 842;
        e20.boilingPoint = 1484;
        e20.electrons = 20;
        e20.protons = 20;
        e20.neutrons = 20;
        e20.usage = "Bones";
        e20.status = "Stable";
        e20.type = "Chemical Element";

        pt20.element = e20;

        pt20.getPeriodicTableDetails();
    }
}