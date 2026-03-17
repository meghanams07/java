class LazyPool {
    int poolId;
    String poolName;
    int depth;
    int length;
    int width;
    String waterType;
    int capacity;
    String safetyGuard;
    String location;
    String color;
    String temperature;
    String cleaningType;
    int filters;
    String lighting;
    String music;
    String tubeType;
    int lifeguards;
    String category;
    String status;
    String maintenance;

    public LazyPool(int poolId, String poolName, int depth, int length, int width, String waterType,
                   int capacity, String safetyGuard, String location, String color, String temperature,
                   String cleaningType, int filters, String lighting, String music, String tubeType,
                   int lifeguards, String category, String status, String maintenance) {
        this.poolId = poolId;
        this.poolName = poolName;
        this.depth = depth;
        this.length = length;
        this.width = width;
        this.waterType = waterType;
        this.capacity = capacity;
        this.safetyGuard = safetyGuard;
        this.location = location;
        this.color = color;
        this.temperature = temperature;
        this.cleaningType = cleaningType;
        this.filters = filters;
        this.lighting = lighting;
        this.music = music;
        this.tubeType = tubeType;
        this.lifeguards = lifeguards;
        this.category = category;
        this.status = status;
        this.maintenance = maintenance;
    }

    public void getLazyPoolDetails() {
        System.out.println("PoolId: " + poolId);
        System.out.println("PoolName: " + poolName);
        System.out.println("Depth: " + depth);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("WaterType: " + waterType);
        System.out.println("Capacity: " + capacity);
        System.out.println("SafetyGuard: " + safetyGuard);
        System.out.println("Location: " + location);
        System.out.println("Color: " + color);
        System.out.println("Temperature: " + temperature);
        System.out.println("CleaningType: " + cleaningType);
        System.out.println("Filters: " + filters);
        System.out.println("Lighting: " + lighting);
        System.out.println("Music: " + music);
        System.out.println("TubeType: " + tubeType);
        System.out.println("Lifeguards: " + lifeguards);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("Maintenance: " + maintenance);
    }
}