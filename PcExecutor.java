class PcExecutor {
    public static void main(String[] args) {

        Hardware h1 = new Hardware(101, "Graphics Card", "GPU", "Nvidia", "RTX 3060", "V1",
                "PCI Express", 170, "PCIe", "Black", 1200, "Metal", "3 Years", 2023,
                "Active", "Graphics", "Ampere", "Dual Fan", 1800, "HDMI");

        Hardware h2 = new Hardware(102, "Motherboard", "Main Board", "HP", "HP-Board-X", "V2",
                "Intel", 120, "ATX", "Green", 900, "Fiber", "2 Years", 2022, "Active",
                "Board", "Intel Chipset", "Passive", 1200, "USB");

        Hardware h3 = new Hardware(103, "RAM", "Memory", "Corsair", "DDR4", "V1",
                "Intel/AMD", 30, "DIMM", "Black", 200, "Silicon", "3 Years", 2023,
                "Active", "Memory", "DDR4", "Heat Sink", 3200, "Slot");

        Hardware h4 = new Hardware(104, "SSD", "Storage", "Samsung", "EVO", "V3", "SATA", 20,
                "SATA", "Black", 150, "Metal", "5 Years", 2024, "Active", "Storage",
                "NAND", "Passive", 3500, "SATA");

        Hardware h5 = new Hardware(105, "Keyboard", "Input", "Logitech", "K120", "V1",
                "Universal", 5, "USB", "Black", 300, "Plastic", "1 Year", 2022,
                "Active", "Input Device", "Standard", "None", 100, "USB");

        Hardware h6 = new Hardware(106, "Mouse", "Input", "HP", "HP Optical", "V2", "Universal",
                3, "USB", "Black", 200, "Plastic", "1 Year", 2023, "Active",
                "Input Device", "Standard", "None", 100, "USB");

        Hardware h7 = new Hardware(107, "Monitor", "Output", "Samsung", "Curved", "V1", "HDMI",
                40, "HDMI", "Black", 3000, "Plastic", "3 Years", 2024, "Active",
                "Display", "LED", "Passive", 144, "HDMI");

        Hardware h8 = new Hardware(108, "Power Supply", "Power", "Corsair", "CX550", "V1",
                "ATX", 550, "Cable", "Black", 1500, "Metal", "5 Years", 2023,
                "Active", "Power", "Standard", "Fan", 120, "24 Pin");

        Hardware h9 = new Hardware(109, "Cooling Fan", "Cooling", "Cooler Master", "Hyper 212",
                "V2", "Universal", 15, "Fan Header", "Black", 600, "Aluminium",
                "2 Years", 2024, "Active", "Cooling", "Fan", "Air", 2000, "4 Pin");

        Hardware h10 = new Hardware(110, "Hard Disk", "Storage", "Seagate", "Barracuda", "V1",
                "SATA", 25, "SATA", "Silver", 400, "Metal", "3 Years", 2022, "Active",
                "Storage", "HDD", "Passive", 7200, "SATA");

        Hardware h11 = new Hardware(111, "SSD", "Storage", "Samsung", "980", "V2", "NVMe", 10,
                "M.2", "Black", 100, "Metal", "5 Years", 2023, "Active", "Storage",
                "NAND", "Passive", 3500, "M.2");

        Hardware h12 = new Hardware(112, "RAM", "Memory", "Kingston", "DDR4", "V1", "Intel", 25,
                "DIMM", "Green", 200, "Silicon", "3 Years", 2021, "Active", "Memory",
                "DDR4", "Heat Sink", 2666, "Slot");

        Hardware h13 = new Hardware(113, "Monitor", "Output", "LG", "24MP400", "V1", "HDMI", 35,
                "HDMI", "Black", 3200, "Plastic", "3 Years", 2022, "Active", "Display",
                "LED", "Passive", 75, "HDMI");

        Hardware h14 = new Hardware(114, "Graphics Card", "GPU", "Nvidia", "RTX 4080", "V1",
                "PCIe", 320, "PCIe", "Black", 1500, "Metal", "3 Years", 2024, "Active",
                "Graphics", "Ada", "Triple Fan", 2500, "HDMI");

        Hardware h15 = new Hardware(115, "Keyboard", "Input", "Logitech", "K120", "V1",
                "Universal", 5, "USB", "Black", 400, "Plastic", "1 Year", 2021,
                "Active", "Input Device", "Standard", "None", 100, "USB");

        Hardware h16 = new Hardware(116, "Sound Card", "Audio", "Creative", "Sound Blaster", "V2",
                "PCIe", 15, "PCIe", "Black", 250, "Metal", "2 Years", 2023, "Active",
                "Audio", "Creative Chipset", "Passive", 48000, "Audio Jack");

        Hardware h17 = new Hardware(117, "Web Camera", "Input Device", "Logitech", "C270", "V1",
                "USB", 5, "USB", "Black", 200, "Plastic", "1 Year", 2022, "Active",
                "Camera", "HD Camera Chip", "None", 30, "USB");

        Hardware h18 = new Hardware(118, "Network Card", "Networking", "TP-Link", "TG-3468", "V1",
                "PCIe", 10, "PCIe", "Green", 150, "Plastic", "2 Years", 2023, "Active",
                "Network", "Gigabit Chipset", "Passive", 1000, "Ethernet");

        Hardware h19 = new Hardware(119, "CPU Cooler", "Cooling", "Cooler Master", "Hyper 212",
                "V3", "Intel/AMD", 20, "Fan Header", "Black", 700, "Aluminium",
                "3 Years", 2024, "Active", "Cooling", "Cooling Chip", "Air Cooling",
                2000, "4 Pin");

        Hardware h20 = new Hardware(120, "Workstation GPU", "Graphics", "Nvidia", "RTX A4000",
                "V1", "PCIe", 200, "PCIe", "Black", 1200, "Metal", "3 Years", 2024,
                "Active", "Graphics", "Professional GPU", "Dual Fan", 1800, "DisplayPort");

        Pc p1 = new Pc(1, "Gaming PC", "Dell", "Intel i7", 16, 512, "Windows 11",
                "Dell Motherboard", "Nvidia RTX 3060", "ATX", 6, "Yes", "Yes", "Black",
                650, "Mechanical", "Gaming Mouse", "LED", 2024, "Working", h1);

        Pc p2 = new Pc(2, "Office PC", "HP", "Intel i5", 8, 256, "Windows 10", "HP Board",
                "Integrated", "Mini Tower", 4, "Yes", "Yes", "Silver", 450, "Standard",
                "Optical", "LCD", 2022, "Working", h2);

        Pc p3 = new Pc(3, "Student PC", "Lenovo", "Intel i3", 8, 512, "Windows 11",
                "Lenovo Board", "Integrated", "Mini", 4, "Yes", "Yes", "Black", 400,
                "Standard", "Optical", "LED", 2023, "Working", h3);

        Pc p4 = new Pc(4, "Designer PC", "Asus", "Intel i9", 32, 1024, "Windows 11",
                "Asus Prime", "RTX 4070", "Full Tower", 8, "Yes", "Yes", "White", 750,
                "Mechanical", "Gaming", "4K", 2024, "Working", h4);

        Pc p5 = new Pc(5, "Home PC", "Acer", "Intel i5", 8, 512, "Windows 11", "Acer Board",
                "Integrated", "Mini Tower", 4, "Yes", "Yes", "Black", 450, "Standard",
                "Optical", "LED", 2022, "Working", h5);

        Pc p6 = new Pc(6, "Programming PC", "Dell", "Intel i7", 16, 1024, "Linux",
                "Dell Board", "Integrated", "Tower", 6, "Yes", "Yes", "Grey", 550,
                "Mechanical", "Optical", "LED", 2023, "Working", h6);

        Pc p7 = new Pc(7, "Editing PC", "Asus", "Intel i9", 32, 2048, "Windows 11",
                "Asus Board", "RTX 3080", "Full Tower", 8, "Yes", "Yes", "White", 750,
                "Mechanical", "Gaming", "4K", 2024, "Working", h7);

        Pc p8 = new Pc(8, "Developer PC", "Lenovo", "Intel i7", 16, 512, "Ubuntu",
                "Lenovo Board", "Integrated", "Tower", 6, "Yes", "Yes", "Black", 550,
                "Mechanical", "Optical", "LED", 2023, "Working", h8);

        Pc p9 = new Pc(9, "Gaming Setup", "MSI", "Intel i9", 32, 1024, "Windows 11",
                "MSI Gaming", "RTX 4070", "Full Tower", 8, "Yes", "Yes", "Red", 750,
                "Mechanical", "Gaming", "Curved", 2024, "Working", h9);

        Pc p10 = new Pc(10, "Office Workstation", "HP", "Intel i5", 16, 512, "Windows 10",
                "HP Board", "Integrated", "Mini Tower", 6, "Yes", "Yes", "Grey", 500,
                "Standard", "Optical", "LED", 2022, "Working", h10);

        Pc p11 = new Pc(11, "Design PC", "Asus", "Intel i7", 16, 1024, "Windows 11",
                "Asus Prime", "RTX 3050", "Tower", 6, "Yes", "Yes", "White", 650,
                "Mechanical", "Gaming", "LED", 2023, "Working", h11);

        Pc p12 = new Pc(12, "School PC", "Dell", "Intel i3", 8, 256, "Windows 10",
                "Dell Board", "Integrated", "Mini", 4, "Yes", "No", "Black", 400,
                "Standard", "Optical", "LCD", 2021, "Working", h12);

        Pc p13 = new Pc(13, "Lab PC", "Lenovo", "Intel i5", 8, 512, "Windows 10",
                "Lenovo Board", "Integrated", "Mini Tower", 4, "Yes", "Yes", "Black",
                450, "Standard", "Optical", "LED", 2022, "Working", h13);

        Pc p14 = new Pc(14, "Gaming Rig", "MSI", "Intel i9", 32, 2048, "Windows 11",
                "MSI Gaming Board", "RTX 4080", "Full Tower", 8, "Yes", "Yes", "Black",
                850, "Mechanical", "Gaming", "4K", 2024, "Working", h14);

        Pc p15 = new Pc(15, "Home Study PC", "Acer", "Intel i3", 8, 256, "Windows 10",
                "Acer Board", "Integrated", "Mini", 4, "Yes", "Yes", "Grey", 400,
                "Standard", "Optical", "LCD", 2021, "Working", h15);

        Pc p16 = new Pc(16, "Multimedia PC", "HP", "Intel i5", 16, 1024, "Windows 11",
                "HP Motherboard", "Nvidia GTX 1650", "Tower", 6, "Yes", "Yes", "Black",
                600, "Mechanical", "Gaming Mouse", "LED", 2023, "Working", h16);

        Pc p17 = new Pc(17, "Student Study PC", "Dell", "Intel i3", 8, 512, "Windows 10",
                "Dell Board", "Integrated", "Mini Tower", 4, "Yes", "Yes", "Black", 450,
                "Standard", "Optical", "LED", 2022, "Working", h17);

        Pc p18 = new Pc(18, "Office Desktop", "Lenovo", "Intel i5", 16, 512, "Windows 11",
                "Lenovo Motherboard", "Integrated", "Tower", 6, "Yes", "Yes", "Grey", 500,
                "Standard", "Optical", "LED", 2023, "Working", h18);

        Pc p19 = new Pc(19, "Gaming Desktop", "Asus", "Intel i7", 32, 1024, "Windows 11",
                "Asus Gaming Board", "Nvidia RTX 3070", "Full Tower", 8, "Yes", "Yes",
                "Black", 750, "Mechanical", "Gaming Mouse", "Curved LED", 2024, "Working", h19);

        Pc p20 = new Pc(20, "Workstation PC", "HP", "Intel Xeon", 64, 2048, "Windows 11 Pro",
                "HP Workstation Board", "Nvidia RTX A4000", "Full Tower", 10, "Yes", "Yes",
                "Black", 850, "Mechanical", "Professional Mouse", "4K LED", 2024, "Working", h20);

        p1.displayDetails();
        System.out.println("============================================");
        p2.displayDetails();
        System.out.println("============================================");
        p3.displayDetails();
        System.out.println("============================================");
        p4.displayDetails();
        System.out.println("============================================");
        p5.displayDetails();
        System.out.println("============================================");
        p6.displayDetails();
        System.out.println("============================================");
        p7.displayDetails();
        System.out.println("============================================");
        p8.displayDetails();
        System.out.println("============================================");
        p9.displayDetails();
        System.out.println("============================================");
        p10.displayDetails();
        System.out.println("============================================");
        p11.displayDetails();
        System.out.println("============================================");
        p12.displayDetails();
        System.out.println("============================================");
        p13.displayDetails();
        System.out.println("============================================");
        p14.displayDetails();
        System.out.println("============================================");
        p15.displayDetails();
        System.out.println("============================================");
        p16.displayDetails();
        System.out.println("============================================");
        p17.displayDetails();
        System.out.println("============================================");
        p18.displayDetails();
        System.out.println("============================================");
        p19.displayDetails();
        System.out.println("============================================");
        p20.displayDetails();
        System.out.println("============================================");
    }
}