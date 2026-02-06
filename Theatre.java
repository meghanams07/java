class Theatre {
    public static void main(String[] args) {
        String name = "PVR Cinemas";
        String manager = "Kiran";
        String location = "Orion Mall";

        String screens[] = {"Screen 1", "Screen 2", "Screen 3"};
        String movies[] = {"Leo", "Jailer", "Vikram"};

        System.out.println("The Theatre Information is:");
        System.out.println("Theatre Name: " + name);
        System.out.println("Manager: " + manager);
        System.out.println("Location: " + location);

        for(String screen : screens) {
            System.out.println("Available Screen: " + screen);
        }

        for(String movie : movies) {
            System.out.println("Now Showing: " + movie);
        }
    }
}
