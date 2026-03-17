class Shop {
    int shopId;
    String shopName;
    String shopType;
    String ownerName;
    int employees;
    int floor;
    String category;
    String openingTime;
    String closingTime;
    String color;
    int area;
    String brand;
    int products;
    String paymentType;
    String acType;
    int cameras;
    String manager;
    String status;
    int year;
    String city;

    public Shop(int shopId, String shopName, String shopType, String ownerName, int employees,
               int floor, String category, String openingTime, String closingTime, String color,
               int area, String brand, int products, String paymentType, String acType,
               int cameras, String manager, String status, int year, String city) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopType = shopType;
        this.ownerName = ownerName;
        this.employees = employees;
        this.floor = floor;
        this.category = category;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.color = color;
        this.area = area;
        this.brand = brand;
        this.products = products;
        this.paymentType = paymentType;
        this.acType = acType;
        this.cameras = cameras;
        this.manager = manager;
        this.status = status;
        this.year = year;
        this.city = city;
    }

    public void displayDetails() {
        System.out.println("ShopId: " + shopId);
        System.out.println("ShopName: " + shopName);
        System.out.println("ShopType: " + shopType);
        System.out.println("OwnerName: " + ownerName);
        System.out.println("Employees: " + employees);
        System.out.println("Floor: " + floor);
        System.out.println("Category: " + category);
        System.out.println("OpeningTime: " + openingTime);
        System.out.println("ClosingTime: " + closingTime);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
        System.out.println("Brand: " + brand);
        System.out.println("Products: " + products);
        System.out.println("PaymentType: " + paymentType);
        System.out.println("ACType: " + acType);
        System.out.println("Cameras: " + cameras);
        System.out.println("Manager: " + manager);
        System.out.println("Status: " + status);
        System.out.println("Year: " + year);
        System.out.println("City: " + city);
    }
}