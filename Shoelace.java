class Shoelace{

    String brand;
    String color;
    String material;
    int length;
    int price;
    String type;
    String pattern;
    String thickness;
    String style;
    String shape;
    String country;
    String quality;
    String flexibility;
    String durability;
    String waterproof;
    String washable;
    String usage;
    String packaging;
    int warranty;
    String manufacturer;

    Shoelace(){
        System.out.println("Shoelace class Default constructor");
    }

    Shoelace(String brand,String color,String material,int length,int price,String type,String pattern,
             String thickness,String style,String shape,String country,String quality,String flexibility,
             String durability,String waterproof,String washable,String usage,String packaging,
             int warranty,String manufacturer){

        this.brand=brand;
        this.color=color;
        this.material=material;
        this.length=length;
        this.price=price;
        this.type=type;
        this.pattern=pattern;
        this.thickness=thickness;
        this.style=style;
        this.shape=shape;
        this.country=country;
        this.quality=quality;
        this.flexibility=flexibility;
        this.durability=durability;
        this.waterproof=waterproof;
        this.washable=washable;
        this.usage=usage;
        this.packaging=packaging;
        this.warranty=warranty;
        this.manufacturer=manufacturer;

        System.out.println(this.brand+" "+this.color+" "+this.material+" "+this.length+" "+this.price+" "+
        this.type+" "+this.pattern+" "+this.thickness+" "+this.style+" "+this.shape+" "+this.country+" "+
        this.quality+" "+this.flexibility+" "+this.durability+" "+this.waterproof+" "+this.washable+" "+
        this.usage+" "+this.packaging+" "+this.warranty+" "+this.manufacturer);
    }
}