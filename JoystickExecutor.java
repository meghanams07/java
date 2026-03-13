class JoystickExecutor {

    public static void main(String[] args) {

        Joystick j1  = new Joystick("Logitech");
        Joystick j2  = new Joystick("Logitech","Extreme 3D");
        Joystick j3  = new Joystick("Logitech","Extreme 3D","Flight");
        Joystick j4  = new Joystick("Logitech","Extreme 3D","Flight",false);
        Joystick j5  = new Joystick("Logitech","Extreme 3D","Flight",false,12);
        Joystick j6  = new Joystick("Logitech","Extreme 3D","Flight",false,12,4200);
        Joystick j7  = new Joystick("Logitech","Extreme 3D","Flight",false,12,4200,true);
        Joystick j8  = new Joystick("Logitech","Extreme 3D","Flight",false,12,4200,true,true);
        Joystick j9  = new Joystick("Logitech","Extreme 3D","Flight",false,12,4200,true,true,"USB");
        Joystick j10 = new Joystick("Logitech","Extreme 3D","Flight",false,12,4200,true,true,"USB",0.35);
        Joystick j11 = new Joystick("Logitech","Extreme 3D","Flight",false,12,4200,true,true,"USB",0.35,false);
        Joystick j12 = new Joystick("Logitech","Extreme 3D","Flight",false,12,4200,true,true,"USB",0.35,false,true);

    }
}