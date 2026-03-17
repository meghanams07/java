class Service {
    int serviceId, duration, price;
    String serviceName, type, category, currency, specialist;
    String productUsed, equipment, appointmentType, availability;
    String gender, method, rating, discount, status, popularity;
    String experience, description;

    public Service(int serviceId, String serviceName, String type, String category,
                  int duration, int price, String currency, String specialist,
                  String productUsed, String equipment, String appointmentType,
                  String availability, String gender, String method, String rating,
                  String discount, String status, String popularity, String experience,
                  String description) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.type = type;
        this.category = category;
        this.duration = duration;
        this.price = price;
        this.currency = currency;
        this.specialist = specialist;
        this.productUsed = productUsed;
        this.equipment = equipment;
        this.appointmentType = appointmentType;
        this.availability = availability;
        this.gender = gender;
        this.method = method;
        this.rating = rating;
        this.discount = discount;
        this.status = status;
        this.popularity = popularity;
        this.experience = experience;
        this.description = description;
    }

    public void displayDetails() {
        System.out.println("ServiceId: " + serviceId);
        System.out.println("ServiceName: " + serviceName);
        System.out.println("Type: " + type);
        System.out.println("Category: " + category);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Price: " + price + " " + currency);
        System.out.println("Specialist: " + specialist);
        System.out.println("ProductUsed: " + productUsed);
        System.out.println("Equipment: " + equipment);
        System.out.println("AppointmentType: " + appointmentType);
        System.out.println("Availability: " + availability);
        System.out.println("Gender: " + gender);
        System.out.println("Method: " + method);
        System.out.println("Rating: " + rating);
        System.out.println("Discount: " + discount);
        System.out.println("Status: " + status);
        System.out.println("Popularity: " + popularity);
        System.out.println("Experience: " + experience);
        System.out.println("Description: " + description);
        System.out.println("----------------------------------------");
    }
}