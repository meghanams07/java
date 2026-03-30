class Medicine {

    private int medicineId;
    private String name;
    private String manufacturer;
    private double price;
    private String expiryDate;
    private String dosage;
    private String type;

    public void setMedicineId(int medicineId){
        this.medicineId = medicineId;
    }

    public int getMedicineId(){
        return this.medicineId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate(){
        return this.expiryDate;
    }

    public void setDosage(String dosage){
        this.dosage = dosage;
    }

    public String getDosage(){
        return this.dosage;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}