class Necklace{

    String brand;
    String material;
    String color;
    int price;
    int length;
    String type;
    int weight;
    String design;
    String stone;
    String claspType;
    String country;
    String shape;
    String style;
    int beadsCount;
    String polish;
    String quality;
    String gender;
    String occasion;
    int warranty;
    String manufacturer;

    Necklace(){
        System.out.println("Necklace class Default constructor");
    }

    Necklace(String brand,String material,String color,int price,int length,String type,int weight,
             String design,String stone,String claspType,String country,String shape,String style,
             int beadsCount,String polish,String quality,String gender,String occasion,int warranty,String manufacturer){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.price=price;
        this.length=length;
        this.type=type;
        this.weight=weight;
        this.design=design;
        this.stone=stone;
        this.claspType=claspType;
        this.country=country;
        this.shape=shape;
        this.style=style;
        this.beadsCount=beadsCount;
        this.polish=polish;
        this.quality=quality;
        this.gender=gender;
        this.occasion=occasion;
        this.warranty=warranty;
        this.manufacturer=manufacturer;

        System.out.println(this.brand+" "+this.material+" "+this.color+" "+this.price+" "+this.length+" "+
        this.type+" "+this.weight+" "+this.design+" "+this.stone+" "+this.claspType+" "+this.country+" "+
        this.shape+" "+this.style+" "+this.beadsCount+" "+this.polish+" "+this.quality+" "+
        this.gender+" "+this.occasion+" "+this.warranty+" "+this.manufacturer);
    }
}