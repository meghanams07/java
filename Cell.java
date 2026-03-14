class Cell {

    String cellName;
    String organismType;
    String cellType;
    String shape;
    double size;
    String nucleusType;
    boolean hasCellWall;
    boolean hasChloroplast;
    String function;
    String location;
    String cytoplasmType;
    String membraneType;
    String energySource;
    String reproductionType;
    String discoveredBy;
    int discoveryYear;
    String color;
    double lifespan;
    String organellesPresent;
    boolean active;

    Cell(String cellName, String organismType, String cellType, String shape, double size,
         String nucleusType, boolean hasCellWall, boolean hasChloroplast, String function,
         String location, String cytoplasmType, String membraneType, String energySource,
         String reproductionType, String discoveredBy, int discoveryYear,
         String color, double lifespan, String organellesPresent, boolean active) {

        this.cellName = cellName;
        this.organismType = organismType;
        this.cellType = cellType;
        this.shape = shape;
        this.size = size;
        this.nucleusType = nucleusType;
        this.hasCellWall = hasCellWall;
        this.hasChloroplast = hasChloroplast;
        this.function = function;
        this.location = location;
        this.cytoplasmType = cytoplasmType;
        this.membraneType = membraneType;
        this.energySource = energySource;
        this.reproductionType = reproductionType;
        this.discoveredBy = discoveredBy;
        this.discoveryYear = discoveryYear;
        this.color = color;
        this.lifespan = lifespan;
        this.organellesPresent = organellesPresent;
        this.active = active;
    }

    void display() {

        System.out.println("Cell Name : " + this.cellName);
        System.out.println("Organism Type : " + this.organismType);
        System.out.println("Cell Type : " + this.cellType);
        System.out.println("Shape : " + this.shape);
        System.out.println("Size : " + this.size);
        System.out.println("Nucleus Type : " + this.nucleusType);
        System.out.println("Has Cell Wall : " + this.hasCellWall);
        System.out.println("Has Chloroplast : " + this.hasChloroplast);
        System.out.println("Function : " + this.function);
        System.out.println("Location : " + this.location);
        System.out.println("Cytoplasm Type : " + this.cytoplasmType);
        System.out.println("Membrane Type : " + this.membraneType);
        System.out.println("Energy Source : " + this.energySource);
        System.out.println("Reproduction Type : " + this.reproductionType);
        System.out.println("Discovered By : " + this.discoveredBy);
        System.out.println("Discovery Year : " + this.discoveryYear);
        System.out.println("Color : " + this.color);
        System.out.println("Lifespan : " + this.lifespan);
        System.out.println("Organelles Present : " + this.organellesPresent);
        System.out.println("Active : " + this.active);
        System.out.println("-----------------------------------");
    }
}