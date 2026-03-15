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

    public void getPeriodicTableDetails(){

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

        this.element.getElementDetails();
    }
}