class PeriodicTable {
    int tableId;
    String tableName;
    String scientist;
    int totalElements;
    int groups;
    int periods;
    String category;
    int discoveredYear;
    String originCountry;
    String color;
    String classification;
    String referenceBook;
    String language;
    String structure;
    String version;
    int atomicSeries;
    String status;
    String updateType;
    String usage;
    String field;

    Element element;

    public PeriodicTable(int tableId, String tableName, String scientist, int totalElements,
                        int groups, int periods, String category, int discoveredYear,
                        String originCountry, String color, String classification,
                        String referenceBook, String language, String structure,
                        String version, int atomicSeries, String status, String updateType,
                        String usage, String field, Element element) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.scientist = scientist;
        this.totalElements = totalElements;
        this.groups = groups;
        this.periods = periods;
        this.category = category;
        this.discoveredYear = discoveredYear;
        this.originCountry = originCountry;
        this.color = color;
        this.classification = classification;
        this.referenceBook = referenceBook;
        this.language = language;
        this.structure = structure;
        this.version = version;
        this.atomicSeries = atomicSeries;
        this.status = status;
        this.updateType = updateType;
        this.usage = usage;
        this.field = field;
        this.element = element;
    }

    public void getPeriodicTableDetails() {
        System.out.println("TableId: " + tableId);
        System.out.println("TableName: " + tableName);
        System.out.println("Scientist: " + scientist);
        System.out.println("TotalElements: " + totalElements);
        System.out.println("Groups: " + groups);
        System.out.println("Periods: " + periods);
        System.out.println("Category: " + category);
        System.out.println("DiscoveredYear: " + discoveredYear);
        System.out.println("OriginCountry: " + originCountry);
        System.out.println("Color: " + color);
        System.out.println("Classification: " + classification);
        System.out.println("ReferenceBook: " + referenceBook);
        System.out.println("Language: " + language);
        System.out.println("Structure: " + structure);
        System.out.println("Version: " + version);
        System.out.println("AtomicSeries: " + atomicSeries);
        System.out.println("Status: " + status);
        System.out.println("UpdateType: " + updateType);
        System.out.println("Usage: " + usage);
        System.out.println("Field: " + field);
        System.out.println("--- Element Details ---");
        this.element.getElementDetails();
        System.out.println("=====================================");
    }
}