class MedicalShopExecutor {
    public static void main(String[] args) {

        MedicalShop m1 = new MedicalShop();
        m1.displayDetails();

        MedicalShop m2 = new MedicalShop(2, "MedPlus", "Chennai", "Arun", 9123456780L,
                "LIC456", 8, false, "9AM", "10PM", 300000.0, 1500, "Wholesale",
                "Kiran", 2010, true, "medplus@gmail.com", "www.medplus.com", 4.2, "GST456");
        m2.displayDetails();
    }
}