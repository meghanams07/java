class CPU {

    String brand;
    String model;
    int cores;
    int threads;
    double baseClock;
    double boostClock;
    int cache;
    double price;
    String socketType;
    double weight;
    boolean integratedGraphics;
    boolean overclockable;

    CPU(String brand){
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    CPU(String brand, String model){
        this.model = model;
        System.out.println("Model : " + model);
    }

    CPU(String brand, String model, int cores){
        this.cores = cores;
        System.out.println("Cores : " + cores);
    }

    CPU(String brand, String model, int cores, int threads){
        this.threads = threads;
        System.out.println("Threads : " + threads);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock){
        this.baseClock = baseClock;
        System.out.println("Base Clock : " + baseClock);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock, double boostClock){
        this.boostClock = boostClock;
        System.out.println("Boost Clock : " + boostClock);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock, double boostClock, int cache){
        this.cache = cache;
        System.out.println("Cache : " + cache);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock, double boostClock, int cache, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock, double boostClock, int cache, double price, String socketType){
        this.socketType = socketType;
        System.out.println("Socket Type : " + socketType);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock, double boostClock, int cache, double price, String socketType, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock, double boostClock, int cache, double price, String socketType, double weight, boolean integratedGraphics){
        this.integratedGraphics = integratedGraphics;
        System.out.println("Integrated Graphics : " + integratedGraphics);
    }

    CPU(String brand, String model, int cores, int threads, double baseClock, double boostClock, int cache, double price, String socketType, double weight, boolean integratedGraphics, boolean overclockable){
        this.overclockable = overclockable;
        System.out.println("Overclockable : " + overclockable);
    }
}