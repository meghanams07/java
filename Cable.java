class Cable {

    String brand;
    String type;
    String connectorType;
    double length;
    double price;
    boolean fastCharging;
    boolean dataTransfer;
    String color;
    double weight;
    boolean braided;
    boolean durable;
    boolean portable;

    Cable(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Cable(String brand, String type){
        this.type = type;
        System.out.println("Type : " + type);
    }

    Cable(String brand, String type, String connectorType){
        this.connectorType = connectorType;
        System.out.println("Connector Type : " + connectorType);
    }

    Cable(String brand, String type, String connectorType, double length){
        this.length = length;
        System.out.println("Length : " + length);
    }

    Cable(String brand, String type, String connectorType, double length, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Cable(String brand, String type, String connectorType, double length, double price, boolean fastCharging){
        this.fastCharging = fastCharging;
        System.out.println("Fast Charging : " + fastCharging);
    }

    Cable(String brand, String type, String connectorType, double length, double price, boolean fastCharging, boolean dataTransfer){
        this.dataTransfer = dataTransfer;
        System.out.println("Data Transfer : " + dataTransfer);
    }

    Cable(String brand, String type, String connectorType, double length, double price, boolean fastCharging, boolean dataTransfer, String color){
        this.color = color;
        System.out.println("Color : " + color);
    }

    Cable(String brand, String type, String connectorType, double length, double price, boolean fastCharging, boolean dataTransfer, String color, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Cable(String brand, String type, String connectorType, double length, double price, boolean fastCharging, boolean dataTransfer, String color, double weight, boolean braided){
        this.braided = braided;
        System.out.println("Braided : " + braided);
    }

    Cable(String brand, String type, String connectorType, double length, double price, boolean fastCharging, boolean dataTransfer, String color, double weight, boolean braided, boolean durable){
        this.durable = durable;
        System.out.println("Durable : " + durable);
    }

    Cable(String brand, String type, String connectorType, double length, double price, boolean fastCharging, boolean dataTransfer, String color, double weight, boolean braided, boolean durable, boolean portable){
        this.portable = portable;
        System.out.println("Portable : " + portable);
    }
}