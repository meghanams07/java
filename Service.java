class Service {

    int serviceId;
    String serviceName;
    String type;
    String category;
    int duration;
    int price;
    String currency;
    String specialist;
    String productUsed;
    String equipment;
    String appointmentType;
    String availability;
    String gender;
    String method;
    String rating;
    String discount;
    String status;
    String popularity;
    String experience;
    String description;

    public void getServiceDetails(){

        System.out.println("ServiceId: " + serviceId);
        System.out.println("ServiceName: " + serviceName);
        System.out.println("Type: " + type);
        System.out.println("Category: " + category);
        System.out.println("Duration: " + duration);
        System.out.println("Price: " + price);
        System.out.println("Currency: " + currency);
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
    }
}