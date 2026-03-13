class SmartLightExecutor {

    public static void main(String[] args) {

        SmartLight sl1  = new SmartLight("Philips");
        SmartLight sl2  = new SmartLight("Philips","Hue");
        SmartLight sl3  = new SmartLight("Philips","Hue",800);
        SmartLight sl4  = new SmartLight("Philips","Hue",800,"RGB");
        SmartLight sl5  = new SmartLight("Philips","Hue",800,"RGB",3500);
        SmartLight sl6  = new SmartLight("Philips","Hue",800,"RGB",3500,true);
        SmartLight sl7  = new SmartLight("Philips","Hue",800,"RGB",3500,true,true);
        SmartLight sl8  = new SmartLight("Philips","Hue",800,"RGB",3500,true,true,true);
        SmartLight sl9  = new SmartLight("Philips","Hue",800,"RGB",3500,true,true,true,10);
        SmartLight sl10 = new SmartLight("Philips","Hue",800,"RGB",3500,true,true,true,10,0.2);
        SmartLight sl11 = new SmartLight("Philips","Hue",800,"RGB",3500,true,true,true,10,0.2,true);
        SmartLight sl12 = new SmartLight("Philips","Hue",800,"RGB",3500,true,true,true,10,0.2,true,true);

    }
}