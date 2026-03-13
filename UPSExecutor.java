class UPSExecutor {

    public static void main(String[] args) {

        UPS u1  = new UPS("APC");
        UPS u2  = new UPS("APC","BX1100C");
        UPS u3  = new UPS("APC","BX1100C",1100);
        UPS u4  = new UPS("APC","BX1100C",1100,"Line Interactive");
        UPS u5  = new UPS("APC","BX1100C",1100,"Line Interactive",9500);
        UPS u6  = new UPS("APC","BX1100C",1100,"Line Interactive",9500,20);
        UPS u7  = new UPS("APC","BX1100C",1100,"Line Interactive",9500,20,true);
        UPS u8  = new UPS("APC","BX1100C",1100,"Line Interactive",9500,20,true,4);
        UPS u9  = new UPS("APC","BX1100C",1100,"Line Interactive",9500,20,true,4,7.5);
        UPS u10 = new UPS("APC","BX1100C",1100,"Line Interactive",9500,20,true,4,7.5,true);
        UPS u11 = new UPS("APC","BX1100C",1100,"Line Interactive",9500,20,true,4,7.5,true,true);
        UPS u12 = new UPS("APC","BX1100C",1100,"Line Interactive",9500,20,true,4,7.5,true,true,true);

    }
}