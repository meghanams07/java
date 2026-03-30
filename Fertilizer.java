class Fertilizer {

    private int fertilizerId;
    private String name;
    private String type;
    private String composition;
    private String brand;
    private double price;
    private String usage;
    private String quantity;
    private String expiryDate;

    public void setFertilizerId(int fertilizerId){
        this.fertilizerId = fertilizerId;
    }

    public int getFertilizerId(){
        return this.fertilizerId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setComposition(String composition){
        this.composition = composition;
    }

    public String getComposition(){
        return this.composition;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setUsage(String usage){
        this.usage = usage;
    }

    public String getUsage(){
        return this.usage;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getQuantity(){
        return this.quantity;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate(){
        return this.expiryDate;
    }
}