class Esp32Executor {
    public static void main(String[] args) {

        Esp32Device e1 = new Esp32Device();
        e1.setDeviceId(1); e1.setDeviceName("ESP32-1"); e1.setWifiStatus("ON"); e1.setBluetoothStatus("OFF");
        e1.setGpioPins("GPIO1"); e1.setAnalogValue("100"); e1.setTemperature("25C"); e1.setVoltage("3.3V"); e1.setMode("Active");
        System.out.println(e1.getDeviceId()); System.out.println(e1.getDeviceName()); System.out.println(e1.getWifiStatus());
        System.out.println(e1.getBluetoothStatus()); System.out.println(e1.getGpioPins()); System.out.println(e1.getAnalogValue());
        System.out.println(e1.getTemperature()); System.out.println(e1.getVoltage()); System.out.println(e1.getMode());

        Esp32Device e2 = new Esp32Device();
        e2.setDeviceId(2); e2.setDeviceName("ESP32-2"); e2.setWifiStatus("OFF"); e2.setBluetoothStatus("ON");
        e2.setGpioPins("GPIO2"); e2.setAnalogValue("200"); e2.setTemperature("26C"); e2.setVoltage("3.3V"); e2.setMode("Sleep");
        System.out.println(e2.getDeviceId()); System.out.println(e2.getDeviceName()); System.out.println(e2.getWifiStatus());
        System.out.println(e2.getBluetoothStatus()); System.out.println(e2.getGpioPins()); System.out.println(e2.getAnalogValue());
        System.out.println(e2.getTemperature()); System.out.println(e2.getVoltage()); System.out.println(e2.getMode());

        Esp32Device e3 = new Esp32Device();
        e3.setDeviceId(3); e3.setDeviceName("ESP32-3"); e3.setWifiStatus("ON"); e3.setBluetoothStatus("OFF");
        e3.setGpioPins("GPIO3"); e3.setAnalogValue("300"); e3.setTemperature("27C"); e3.setVoltage("3.3V"); e3.setMode("Active");
        System.out.println(e3.getDeviceId()); System.out.println(e3.getDeviceName()); System.out.println(e3.getWifiStatus());
        System.out.println(e3.getBluetoothStatus()); System.out.println(e3.getGpioPins()); System.out.println(e3.getAnalogValue());
        System.out.println(e3.getTemperature()); System.out.println(e3.getVoltage()); System.out.println(e3.getMode());

        Esp32Device e4 = new Esp32Device();
        e4.setDeviceId(4); e4.setDeviceName("ESP32-4"); e4.setWifiStatus("OFF"); e4.setBluetoothStatus("ON");
        e4.setGpioPins("GPIO4"); e4.setAnalogValue("400"); e4.setTemperature("28C"); e4.setVoltage("3.3V"); e4.setMode("Sleep");
        System.out.println(e4.getDeviceId()); System.out.println(e4.getDeviceName()); System.out.println(e4.getWifiStatus());
        System.out.println(e4.getBluetoothStatus()); System.out.println(e4.getGpioPins()); System.out.println(e4.getAnalogValue());
        System.out.println(e4.getTemperature()); System.out.println(e4.getVoltage()); System.out.println(e4.getMode());

        Esp32Device e5 = new Esp32Device();
        e5.setDeviceId(5); e5.setDeviceName("ESP32-5"); e5.setWifiStatus("ON"); e5.setBluetoothStatus("OFF");
        e5.setGpioPins("GPIO5"); e5.setAnalogValue("500"); e5.setTemperature("29C"); e5.setVoltage("3.3V"); e5.setMode("Active");
        System.out.println(e5.getDeviceId()); System.out.println(e5.getDeviceName()); System.out.println(e5.getWifiStatus());
        System.out.println(e5.getBluetoothStatus()); System.out.println(e5.getGpioPins()); System.out.println(e5.getAnalogValue());
        System.out.println(e5.getTemperature()); System.out.println(e5.getVoltage()); System.out.println(e5.getMode());

        Esp32Device e6 = new Esp32Device();
        e6.setDeviceId(6); e6.setDeviceName("ESP32-6"); e6.setWifiStatus("OFF"); e6.setBluetoothStatus("ON");
        e6.setGpioPins("GPIO6"); e6.setAnalogValue("600"); e6.setTemperature("30C"); e6.setVoltage("3.3V"); e6.setMode("Sleep");
        System.out.println(e6.getDeviceId()); System.out.println(e6.getDeviceName()); System.out.println(e6.getWifiStatus());
        System.out.println(e6.getBluetoothStatus()); System.out.println(e6.getGpioPins()); System.out.println(e6.getAnalogValue());
        System.out.println(e6.getTemperature()); System.out.println(e6.getVoltage()); System.out.println(e6.getMode());

        Esp32Device e7 = new Esp32Device();
        e7.setDeviceId(7); e7.setDeviceName("ESP32-7"); e7.setWifiStatus("ON"); e7.setBluetoothStatus("OFF");
        e7.setGpioPins("GPIO7"); e7.setAnalogValue("700"); e7.setTemperature("31C"); e7.setVoltage("3.3V"); e7.setMode("Active");
        System.out.println(e7.getDeviceId()); System.out.println(e7.getDeviceName()); System.out.println(e7.getWifiStatus());
        System.out.println(e7.getBluetoothStatus()); System.out.println(e7.getGpioPins()); System.out.println(e7.getAnalogValue());
        System.out.println(e7.getTemperature()); System.out.println(e7.getVoltage()); System.out.println(e7.getMode());

        Esp32Device e8 = new Esp32Device();
        e8.setDeviceId(8); e8.setDeviceName("ESP32-8"); e8.setWifiStatus("OFF"); e8.setBluetoothStatus("ON");
        e8.setGpioPins("GPIO8"); e8.setAnalogValue("800"); e8.setTemperature("32C"); e8.setVoltage("3.3V"); e8.setMode("Sleep");
        System.out.println(e8.getDeviceId()); System.out.println(e8.getDeviceName()); System.out.println(e8.getWifiStatus());
        System.out.println(e8.getBluetoothStatus()); System.out.println(e8.getGpioPins()); System.out.println(e8.getAnalogValue());
        System.out.println(e8.getTemperature()); System.out.println(e8.getVoltage()); System.out.println(e8.getMode());

        Esp32Device e9 = new Esp32Device();
        e9.setDeviceId(9); e9.setDeviceName("ESP32-9"); e9.setWifiStatus("ON"); e9.setBluetoothStatus("OFF");
        e9.setGpioPins("GPIO9"); e9.setAnalogValue("900"); e9.setTemperature("33C"); e9.setVoltage("3.3V"); e9.setMode("Active");
        System.out.println(e9.getDeviceId()); System.out.println(e9.getDeviceName()); System.out.println(e9.getWifiStatus());
        System.out.println(e9.getBluetoothStatus()); System.out.println(e9.getGpioPins()); System.out.println(e9.getAnalogValue());
        System.out.println(e9.getTemperature()); System.out.println(e9.getVoltage()); System.out.println(e9.getMode());

        Esp32Device e10 = new Esp32Device();
        e10.setDeviceId(10); e10.setDeviceName("ESP32-10"); e10.setWifiStatus("OFF"); e10.setBluetoothStatus("ON");
        e10.setGpioPins("GPIO10"); e10.setAnalogValue("1000"); e10.setTemperature("34C"); e10.setVoltage("3.3V"); e10.setMode("Sleep");
        System.out.println(e10.getDeviceId()); System.out.println(e10.getDeviceName()); System.out.println(e10.getWifiStatus());
        System.out.println(e10.getBluetoothStatus()); System.out.println(e10.getGpioPins()); System.out.println(e10.getAnalogValue());
        System.out.println(e10.getTemperature()); System.out.println(e10.getVoltage()); System.out.println(e10.getMode());

        Esp32Device e11 = new Esp32Device();
        e11.setDeviceId(11); e11.setDeviceName("ESP32-11"); e11.setWifiStatus("ON"); e11.setBluetoothStatus("OFF");
        e11.setGpioPins("GPIO11"); e11.setAnalogValue("1100"); e11.setTemperature("35C"); e11.setVoltage("3.3V"); e11.setMode("Active");
        System.out.println(e11.getDeviceId()); System.out.println(e11.getDeviceName()); System.out.println(e11.getWifiStatus());
        System.out.println(e11.getBluetoothStatus()); System.out.println(e11.getGpioPins()); System.out.println(e11.getAnalogValue());
        System.out.println(e11.getTemperature()); System.out.println(e11.getVoltage()); System.out.println(e11.getMode());

        Esp32Device e12 = new Esp32Device();
        e12.setDeviceId(12); e12.setDeviceName("ESP32-12"); e12.setWifiStatus("OFF"); e12.setBluetoothStatus("ON");
        e12.setGpioPins("GPIO12"); e12.setAnalogValue("1200"); e12.setTemperature("36C"); e12.setVoltage("3.3V"); e12.setMode("Sleep");
        System.out.println(e12.getDeviceId()); System.out.println(e12.getDeviceName()); System.out.println(e12.getWifiStatus());
        System.out.println(e12.getBluetoothStatus()); System.out.println(e12.getGpioPins()); System.out.println(e12.getAnalogValue());
        System.out.println(e12.getTemperature()); System.out.println(e12.getVoltage()); System.out.println(e12.getMode());

        Esp32Device e13 = new Esp32Device();
        e13.setDeviceId(13); e13.setDeviceName("ESP32-13"); e13.setWifiStatus("ON"); e13.setBluetoothStatus("OFF");
        e13.setGpioPins("GPIO13"); e13.setAnalogValue("1300"); e13.setTemperature("37C"); e13.setVoltage("3.3V"); e13.setMode("Active");
        System.out.println(e13.getDeviceId()); System.out.println(e13.getDeviceName()); System.out.println(e13.getWifiStatus());
        System.out.println(e13.getBluetoothStatus()); System.out.println(e13.getGpioPins()); System.out.println(e13.getAnalogValue());
        System.out.println(e13.getTemperature()); System.out.println(e13.getVoltage()); System.out.println(e13.getMode());

        Esp32Device e14 = new Esp32Device();
        e14.setDeviceId(14); e14.setDeviceName("ESP32-14"); e14.setWifiStatus("OFF"); e14.setBluetoothStatus("ON");
        e14.setGpioPins("GPIO14"); e14.setAnalogValue("1400"); e14.setTemperature("38C"); e14.setVoltage("3.3V"); e14.setMode("Sleep");
        System.out.println(e14.getDeviceId()); System.out.println(e14.getDeviceName()); System.out.println(e14.getWifiStatus());
        System.out.println(e14.getBluetoothStatus()); System.out.println(e14.getGpioPins()); System.out.println(e14.getAnalogValue());
        System.out.println(e14.getTemperature()); System.out.println(e14.getVoltage()); System.out.println(e14.getMode());

        Esp32Device e15 = new Esp32Device();
        e15.setDeviceId(15); e15.setDeviceName("ESP32-15"); e15.setWifiStatus("ON"); e15.setBluetoothStatus("OFF");
        e15.setGpioPins("GPIO15"); e15.setAnalogValue("1500"); e15.setTemperature("39C"); e15.setVoltage("3.3V"); e15.setMode("Active");
        System.out.println(e15.getDeviceId()); System.out.println(e15.getDeviceName()); System.out.println(e15.getWifiStatus());
        System.out.println(e15.getBluetoothStatus()); System.out.println(e15.getGpioPins()); System.out.println(e15.getAnalogValue());
        System.out.println(e15.getTemperature()); System.out.println(e15.getVoltage()); System.out.println(e15.getMode());

        Esp32Device e16 = new Esp32Device();
        e16.setDeviceId(16); e16.setDeviceName("ESP32-16"); e16.setWifiStatus("OFF"); e16.setBluetoothStatus("ON");
        e16.setGpioPins("GPIO16"); e16.setAnalogValue("1600"); e16.setTemperature("40C"); e16.setVoltage("3.3V"); e16.setMode("Sleep");
        System.out.println(e16.getDeviceId()); System.out.println(e16.getDeviceName()); System.out.println(e16.getWifiStatus());
        System.out.println(e16.getBluetoothStatus()); System.out.println(e16.getGpioPins()); System.out.println(e16.getAnalogValue());
        System.out.println(e16.getTemperature()); System.out.println(e16.getVoltage()); System.out.println(e16.getMode());

        Esp32Device e17 = new Esp32Device();
        e17.setDeviceId(17); e17.setDeviceName("ESP32-17"); e17.setWifiStatus("ON"); e17.setBluetoothStatus("OFF");
        e17.setGpioPins("GPIO17"); e17.setAnalogValue("1700"); e17.setTemperature("41C"); e17.setVoltage("3.3V"); e17.setMode("Active");
        System.out.println(e17.getDeviceId()); System.out.println(e17.getDeviceName()); System.out.println(e17.getWifiStatus());
        System.out.println(e17.getBluetoothStatus()); System.out.println(e17.getGpioPins()); System.out.println(e17.getAnalogValue());
        System.out.println(e17.getTemperature()); System.out.println(e17.getVoltage()); System.out.println(e17.getMode());

        Esp32Device e18 = new Esp32Device();
        e18.setDeviceId(18); e18.setDeviceName("ESP32-18"); e18.setWifiStatus("OFF"); e18.setBluetoothStatus("ON");
        e18.setGpioPins("GPIO18"); e18.setAnalogValue("1800"); e18.setTemperature("42C"); e18.setVoltage("3.3V"); e18.setMode("Sleep");
        System.out.println(e18.getDeviceId()); System.out.println(e18.getDeviceName()); System.out.println(e18.getWifiStatus());
        System.out.println(e18.getBluetoothStatus()); System.out.println(e18.getGpioPins()); System.out.println(e18.getAnalogValue());
        System.out.println(e18.getTemperature()); System.out.println(e18.getVoltage()); System.out.println(e18.getMode());

        Esp32Device e19 = new Esp32Device();
        e19.setDeviceId(19); e19.setDeviceName("ESP32-19"); e19.setWifiStatus("ON"); e19.setBluetoothStatus("OFF");
        e19.setGpioPins("GPIO19"); e19.setAnalogValue("1900"); e19.setTemperature("43C"); e19.setVoltage("3.3V"); e19.setMode("Active");
        System.out.println(e19.getDeviceId()); System.out.println(e19.getDeviceName()); System.out.println(e19.getWifiStatus());
        System.out.println(e19.getBluetoothStatus()); System.out.println(e19.getGpioPins()); System.out.println(e19.getAnalogValue());
        System.out.println(e19.getTemperature()); System.out.println(e19.getVoltage()); System.out.println(e19.getMode());

        Esp32Device e20 = new Esp32Device();
        e20.setDeviceId(20); e20.setDeviceName("ESP32-20"); e20.setWifiStatus("OFF"); e20.setBluetoothStatus("ON");
        e20.setGpioPins("GPIO20"); e20.setAnalogValue("2000"); e20.setTemperature("44C"); e20.setVoltage("3.3V"); e20.setMode("Sleep");
        System.out.println(e20.getDeviceId()); System.out.println(e20.getDeviceName()); System.out.println(e20.getWifiStatus());
        System.out.println(e20.getBluetoothStatus()); System.out.println(e20.getGpioPins()); System.out.println(e20.getAnalogValue());
        System.out.println(e20.getTemperature()); System.out.println(e20.getVoltage()); System.out.println(e20.getMode());

        Esp32Device e21 = new Esp32Device();
        e21.setDeviceId(21); e21.setDeviceName("ESP32-21"); e21.setWifiStatus("ON"); e21.setBluetoothStatus("OFF");
        e21.setGpioPins("GPIO21"); e21.setAnalogValue("2100"); e21.setTemperature("45C"); e21.setVoltage("3.3V"); e21.setMode("Active");
        System.out.println(e21.getDeviceId()); System.out.println(e21.getDeviceName()); System.out.println(e21.getWifiStatus());
        System.out.println(e21.getBluetoothStatus()); System.out.println(e21.getGpioPins()); System.out.println(e21.getAnalogValue());
        System.out.println(e21.getTemperature()); System.out.println(e21.getVoltage()); System.out.println(e21.getMode());

        Esp32Device e22 = new Esp32Device();
        e22.setDeviceId(22); e22.setDeviceName("ESP32-22"); e22.setWifiStatus("OFF"); e22.setBluetoothStatus("ON");
        e22.setGpioPins("GPIO22"); e22.setAnalogValue("2200"); e22.setTemperature("46C"); e22.setVoltage("3.3V"); e22.setMode("Sleep");
        System.out.println(e22.getDeviceId()); System.out.println(e22.getDeviceName()); System.out.println(e22.getWifiStatus());
        System.out.println(e22.getBluetoothStatus()); System.out.println(e22.getGpioPins()); System.out.println(e22.getAnalogValue());
        System.out.println(e22.getTemperature()); System.out.println(e22.getVoltage()); System.out.println(e22.getMode());

        Esp32Device e23 = new Esp32Device();
        e23.setDeviceId(23); e23.setDeviceName("ESP32-23"); e23.setWifiStatus("ON"); e23.setBluetoothStatus("OFF");
        e23.setGpioPins("GPIO23"); e23.setAnalogValue("2300"); e23.setTemperature("47C"); e23.setVoltage("3.3V"); e23.setMode("Active");
        System.out.println(e23.getDeviceId()); System.out.println(e23.getDeviceName()); System.out.println(e23.getWifiStatus());
        System.out.println(e23.getBluetoothStatus()); System.out.println(e23.getGpioPins()); System.out.println(e23.getAnalogValue());
        System.out.println(e23.getTemperature()); System.out.println(e23.getVoltage()); System.out.println(e23.getMode());

        Esp32Device e24 = new Esp32Device();
        e24.setDeviceId(24); e24.setDeviceName("ESP32-24"); e24.setWifiStatus("OFF"); e24.setBluetoothStatus("ON");
        e24.setGpioPins("GPIO24"); e24.setAnalogValue("2400"); e24.setTemperature("48C"); e24.setVoltage("3.3V"); e24.setMode("Sleep");
        System.out.println(e24.getDeviceId()); System.out.println(e24.getDeviceName()); System.out.println(e24.getWifiStatus());
        System.out.println(e24.getBluetoothStatus()); System.out.println(e24.getGpioPins()); System.out.println(e24.getAnalogValue());
        System.out.println(e24.getTemperature()); System.out.println(e24.getVoltage()); System.out.println(e24.getMode());

        Esp32Device e25 = new Esp32Device();
        e25.setDeviceId(25); e25.setDeviceName("ESP32-25"); e25.setWifiStatus("ON"); e25.setBluetoothStatus("OFF");
        e25.setGpioPins("GPIO25"); e25.setAnalogValue("2500"); e25.setTemperature("49C"); e25.setVoltage("3.3V"); e25.setMode("Active");
        System.out.println(e25.getDeviceId()); System.out.println(e25.getDeviceName()); System.out.println(e25.getWifiStatus());
        System.out.println(e25.getBluetoothStatus()); System.out.println(e25.getGpioPins()); System.out.println(e25.getAnalogValue());
        System.out.println(e25.getTemperature()); System.out.println(e25.getVoltage()); System.out.println(e25.getMode());

        Esp32Device e26 = new Esp32Device();
        e26.setDeviceId(26); e26.setDeviceName("ESP32-26"); e26.setWifiStatus("OFF"); e26.setBluetoothStatus("ON");
        e26.setGpioPins("GPIO26"); e26.setAnalogValue("2600"); e26.setTemperature("50C"); e26.setVoltage("3.3V"); e26.setMode("Sleep");
        System.out.println(e26.getDeviceId()); System.out.println(e26.getDeviceName()); System.out.println(e26.getWifiStatus());
        System.out.println(e26.getBluetoothStatus()); System.out.println(e26.getGpioPins()); System.out.println(e26.getAnalogValue());
        System.out.println(e26.getTemperature()); System.out.println(e26.getVoltage()); System.out.println(e26.getMode());

        Esp32Device e27 = new Esp32Device();
        e27.setDeviceId(27); e27.setDeviceName("ESP32-27"); e27.setWifiStatus("ON"); e27.setBluetoothStatus("OFF");
        e27.setGpioPins("GPIO27"); e27.setAnalogValue("2700"); e27.setTemperature("51C"); e27.setVoltage("3.3V"); e27.setMode("Active");
        System.out.println(e27.getDeviceId()); System.out.println(e27.getDeviceName()); System.out.println(e27.getWifiStatus());
        System.out.println(e27.getBluetoothStatus()); System.out.println(e27.getGpioPins()); System.out.println(e27.getAnalogValue());
        System.out.println(e27.getTemperature()); System.out.println(e27.getVoltage()); System.out.println(e27.getMode());

        Esp32Device e28 = new Esp32Device();
        e28.setDeviceId(28); e28.setDeviceName("ESP32-28"); e28.setWifiStatus("OFF"); e28.setBluetoothStatus("ON");
        e28.setGpioPins("GPIO28"); e28.setAnalogValue("2800"); e28.setTemperature("52C"); e28.setVoltage("3.3V"); e28.setMode("Sleep");
        System.out.println(e28.getDeviceId()); System.out.println(e28.getDeviceName()); System.out.println(e28.getWifiStatus());
        System.out.println(e28.getBluetoothStatus()); System.out.println(e28.getGpioPins()); System.out.println(e28.getAnalogValue());
        System.out.println(e28.getTemperature()); System.out.println(e28.getVoltage()); System.out.println(e28.getMode());

        Esp32Device e29 = new Esp32Device();
        e29.setDeviceId(29); e29.setDeviceName("ESP32-29"); e29.setWifiStatus("ON"); e29.setBluetoothStatus("OFF");
        e29.setGpioPins("GPIO29"); e29.setAnalogValue("2900"); e29.setTemperature("53C"); e29.setVoltage("3.3V"); e29.setMode("Active");
        System.out.println(e29.getDeviceId()); System.out.println(e29.getDeviceName()); System.out.println(e29.getWifiStatus());
        System.out.println(e29.getBluetoothStatus()); System.out.println(e29.getGpioPins()); System.out.println(e29.getAnalogValue());
        System.out.println(e29.getTemperature()); System.out.println(e29.getVoltage()); System.out.println(e29.getMode());
    }
}