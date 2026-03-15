class FactoryExecutor {

    public static void main(String[] args) {

        Factory f1 = new Factory();

        f1.factoryId = 1;
        f1.factoryName = "ABC Factory";
        f1.location = "Bangalore";
        f1.owner = "Ramesh";
        f1.workers = 200;
        f1.product = "Steel";
        f1.area = 5000;
        f1.shift = "Day & Night";
        f1.machinesCount = 50;
        f1.powerSource = "Electric";
        f1.manager = "Suresh";
        f1.establishedYear = 2010;
        f1.city = "Bangalore";
        f1.country = "India";
        f1.safetyLevel = "High";
        f1.color = "Gray";
        f1.productionCapacity = 1000;
        f1.status = "Running";
        f1.category = "Manufacturing";
        f1.license = "ISO Certified";

        Machine m1 = new Machine();

        m1.machineId = 101;
        m1.machineName = "Cutting Machine";
        m1.machineType = "Industrial";
        m1.manufacturer = "Bosch";
        m1.model = "CMX200";
        m1.power = 500;
        m1.fuelType = "Electric";
        m1.color = "Blue";
        m1.weight = 1500;
        m1.material = "Steel";
        m1.speed = 3000;
        m1.operationType = "Automatic";
        m1.coolingSystem = "Air Cooling";
        m1.capacity = 200;
        m1.safety = "High";
        m1.year = 2023;
        m1.status = "Active";
        m1.category = "Cutting";
        m1.maintenance = "Monthly";
        m1.location = "Section A";

        f1.machine = m1;

        f1.getFactoryDetails();
		Factory f2 = new Factory();

f2.factoryId = 2;
f2.factoryName = "XYZ Factory";
f2.location = "Mysore";
f2.owner = "Suresh";
f2.workers = 150;
f2.product = "Cement";
f2.area = 4000;
f2.shift = "Day";
f2.machinesCount = 40;
f2.powerSource = "Electric";
f2.manager = "Kiran";
f2.establishedYear = 2012;
f2.city = "Mysore";
f2.country = "India";
f2.safetyLevel = "Medium";
f2.color = "White";
f2.productionCapacity = 800;
f2.status = "Running";
f2.category = "Construction";
f2.license = "ISO Certified";

Machine m2 = new Machine();

m2.machineId = 102;
m2.machineName = "Grinding Machine";
m2.machineType = "Industrial";
m2.manufacturer = "Siemens";
m2.model = "GMX100";
m2.power = 400;
m2.fuelType = "Electric";
m2.color = "Green";
m2.weight = 1200;
m2.material = "Iron";
m2.speed = 2500;
m2.operationType = "Automatic";
m2.coolingSystem = "Water Cooling";
m2.capacity = 180;
m2.safety = "High";
m2.year = 2022;
m2.status = "Active";
m2.category = "Grinding";
m2.maintenance = "Monthly";
m2.location = "Section B";

f2.machine = m2;

f2.getFactoryDetails();
Factory f3 = new Factory();
Machine m3 = new Machine();

f3.factoryId = 3;
f3.factoryName = "Delta Factory";
f3.location = "Chennai";
f3.owner = "Arun";
f3.workers = 220;
f3.product = "Plastic";
f3.area = 6000;
f3.shift = "Day & Night";
f3.machinesCount = 60;
f3.powerSource = "Electric";
f3.manager = "Manoj";
f3.establishedYear = 2015;
f3.city = "Chennai";
f3.country = "India";
f3.safetyLevel = "High";
f3.color = "Blue";
f3.productionCapacity = 1200;
f3.status = "Running";
f3.category = "Manufacturing";
f3.license = "Gov Approved";

m3.machineId = 103;
m3.machineName = "Molding Machine";
m3.machineType = "Industrial";
m3.manufacturer = "Hitachi";
m3.model = "MMX300";
m3.power = 450;
m3.fuelType = "Electric";
m3.color = "Yellow";
m3.weight = 1400;
m3.material = "Steel";
m3.speed = 2700;
m3.operationType = "Automatic";
m3.coolingSystem = "Air Cooling";
m3.capacity = 220;
m3.safety = "High";
m3.year = 2024;
m3.status = "Active";
m3.category = "Molding";
m3.maintenance = "Weekly";
m3.location = "Section C";

f3.machine = m3;

f3.getFactoryDetails();
Factory f4 = new Factory();

f4.factoryId = 4;
f4.factoryName = "Omega Factory";
f4.location = "Hyderabad";
f4.owner = "Ravi";
f4.workers = 180;
f4.product = "Glass";
f4.area = 4500;
f4.shift = "Day & Night";
f4.machinesCount = 55;
f4.powerSource = "Electric";
f4.manager = "Naveen";
f4.establishedYear = 2011;
f4.city = "Hyderabad";
f4.country = "India";
f4.safetyLevel = "High";
f4.color = "White";
f4.productionCapacity = 900;
f4.status = "Running";
f4.category = "Manufacturing";
f4.license = "ISO Certified";

Machine m4 = new Machine();

m4.machineId = 104;
m4.machineName = "Glass Cutting Machine";
m4.machineType = "Industrial";
m4.manufacturer = "Bosch";
m4.model = "GCM200";
m4.power = 420;
m4.fuelType = "Electric";
m4.color = "Silver";
m4.weight = 1300;
m4.material = "Steel";
m4.speed = 2600;
m4.operationType = "Automatic";
m4.coolingSystem = "Air Cooling";
m4.capacity = 210;
m4.safety = "High";
m4.year = 2021;
m4.status = "Active";
m4.category = "Cutting";
m4.maintenance = "Monthly";
m4.location = "Section D";

f4.machine = m4;

f4.getFactoryDetails();
Factory f5 = new Factory();

f5.factoryId = 5;
f5.factoryName = "Prime Factory";
f5.location = "Pune";
f5.owner = "Karthik";
f5.workers = 160;
f5.product = "Rubber";
f5.area = 4200;
f5.shift = "Day";
f5.machinesCount = 48;
f5.powerSource = "Electric";
f5.manager = "Ajay";
f5.establishedYear = 2014;
f5.city = "Pune";
f5.country = "India";
f5.safetyLevel = "Medium";
f5.color = "Black";
f5.productionCapacity = 750;
f5.status = "Running";
f5.category = "Manufacturing";
f5.license = "Gov Approved";

Machine m5 = new Machine();

m5.machineId = 105;
m5.machineName = "Rubber Press Machine";
m5.machineType = "Industrial";
m5.manufacturer = "Siemens";
m5.model = "RPM500";
m5.power = 390;
m5.fuelType = "Electric";
m5.color = "Red";
m5.weight = 1250;
m5.material = "Iron";
m5.speed = 2400;
m5.operationType = "Semi Automatic";
m5.coolingSystem = "Water Cooling";
m5.capacity = 170;
m5.safety = "Medium";
m5.year = 2020;
m5.status = "Active";
m5.category = "Press";
m5.maintenance = "Monthly";
m5.location = "Section E";

f5.machine = m5;

f5.getFactoryDetails();
Factory f6 = new Factory();

f6.factoryId = 6;
f6.factoryName = "Star Factory";
f6.location = "Delhi";
f6.owner = "Mahesh";
f6.workers = 210;
f6.product = "Aluminium";
f6.area = 5200;
f6.shift = "Day & Night";
f6.machinesCount = 65;
f6.powerSource = "Electric";
f6.manager = "Rohit";
f6.establishedYear = 2016;
f6.city = "Delhi";
f6.country = "India";
f6.safetyLevel = "High";
f6.color = "Silver";
f6.productionCapacity = 1100;
f6.status = "Running";
f6.category = "Metal";
f6.license = "ISO Certified";

Machine m6 = new Machine();

m6.machineId = 106;
m6.machineName = "Aluminium Cutting Machine";
m6.machineType = "Industrial";
m6.manufacturer = "Bosch";
m6.model = "ACM600";
m6.power = 460;
m6.fuelType = "Electric";
m6.color = "Gray";
m6.weight = 1450;
m6.material = "Steel";
m6.speed = 2800;
m6.operationType = "Automatic";
m6.coolingSystem = "Air Cooling";
m6.capacity = 230;
m6.safety = "High";
m6.year = 2023;
m6.status = "Active";
m6.category = "Cutting";
m6.maintenance = "Monthly";
m6.location = "Section F";

f6.machine = m6;

f6.getFactoryDetails();
Factory f7 = new Factory();

f7.factoryId = 7;
f7.factoryName = "Sunrise Factory";
f7.location = "Mumbai";
f7.owner = "Anil";
f7.workers = 190;
f7.product = "Textile";
f7.area = 4700;
f7.shift = "Day";
f7.machinesCount = 52;
f7.powerSource = "Electric";
f7.manager = "Deepak";
f7.establishedYear = 2013;
f7.city = "Mumbai";
f7.country = "India";
f7.safetyLevel = "Medium";
f7.color = "Yellow";
f7.productionCapacity = 850;
f7.status = "Running";
f7.category = "Textile";
f7.license = "Gov Approved";

Machine m7 = new Machine();

m7.machineId = 107;
m7.machineName = "Textile Weaving Machine";
m7.machineType = "Industrial";
m7.manufacturer = "Siemens";
m7.model = "TWM700";
m7.power = 410;
m7.fuelType = "Electric";
m7.color = "Blue";
m7.weight = 1350;
m7.material = "Iron";
m7.speed = 2600;
m7.operationType = "Semi Automatic";
m7.coolingSystem = "Water Cooling";
m7.capacity = 200;
m7.safety = "Medium";
m7.year = 2021;
m7.status = "Active";
m7.category = "Weaving";
m7.maintenance = "Monthly";
m7.location = "Section G";

f7.machine = m7;

f7.getFactoryDetails();
Factory f8 = new Factory();

f8.factoryId = 8;
f8.factoryName = "Galaxy Factory";
f8.location = "Coimbatore";
f8.owner = "Prakash";
f8.workers = 170;
f8.product = "Cotton";
f8.area = 4300;
f8.shift = "Day & Night";
f8.machinesCount = 50;
f8.powerSource = "Electric";
f8.manager = "Harish";
f8.establishedYear = 2017;
f8.city = "Coimbatore";
f8.country = "India";
f8.safetyLevel = "High";
f8.color = "White";
f8.productionCapacity = 780;
f8.status = "Running";
f8.category = "Textile";
f8.license = "ISO Certified";

Machine m8 = new Machine();

m8.machineId = 108;
m8.machineName = "Cotton Spinning Machine";
m8.machineType = "Industrial";
m8.manufacturer = "Bosch";
m8.model = "CSM800";
m8.power = 420;
m8.fuelType = "Electric";
m8.color = "Green";
m8.weight = 1320;
m8.material = "Steel";
m8.speed = 2550;
m8.operationType = "Automatic";
m8.coolingSystem = "Air Cooling";
m8.capacity = 190;
m8.safety = "High";
m8.year = 2022;
m8.status = "Active";
m8.category = "Spinning";
m8.maintenance = "Monthly";
m8.location = "Section H";

f8.machine = m8;

f8.getFactoryDetails();
Factory f9 = new Factory();

f9.factoryId = 9;
f9.factoryName = "Future Factory";
f9.location = "Ahmedabad";
f9.owner = "Vikas";
f9.workers = 200;
f9.product = "Chemicals";
f9.area = 5100;
f9.shift = "Day & Night";
f9.machinesCount = 58;
f9.powerSource = "Electric";
f9.manager = "Sanjay";
f9.establishedYear = 2018;
f9.city = "Ahmedabad";
f9.country = "India";
f9.safetyLevel = "High";
f9.color = "Gray";
f9.productionCapacity = 950;
f9.status = "Running";
f9.category = "Chemical";
f9.license = "Gov Approved";

Machine m9 = new Machine();

m9.machineId = 109;
m9.machineName = "Chemical Mixing Machine";
m9.machineType = "Industrial";
m9.manufacturer = "Siemens";
m9.model = "CMM900";
m9.power = 470;
m9.fuelType = "Electric";
m9.color = "Silver";
m9.weight = 1500;
m9.material = "Steel";
m9.speed = 2750;
m9.operationType = "Automatic";
m9.coolingSystem = "Water Cooling";
m9.capacity = 240;
m9.safety = "High";
m9.year = 2023;
m9.status = "Active";
m9.category = "Mixing";
m9.maintenance = "Monthly";
m9.location = "Section I";

f9.machine = m9;

f9.getFactoryDetails();
Factory f10 = new Factory();

f10.factoryId = 10;
f10.factoryName = "Royal Factory";
f10.location = "Jaipur";
f10.owner = "Rahul";
f10.workers = 175;
f10.product = "Marble";
f10.area = 4800;
f10.shift = "Day";
f10.machinesCount = 45;
f10.powerSource = "Electric";
f10.manager = "Vijay";
f10.establishedYear = 2014;
f10.city = "Jaipur";
f10.country = "India";
f10.safetyLevel = "Medium";
f10.color = "White";
f10.productionCapacity = 820;
f10.status = "Running";
f10.category = "Stone";
f10.license = "ISO Certified";

Machine m10 = new Machine();

m10.machineId = 110;
m10.machineName = "Marble Cutting Machine";
m10.machineType = "Industrial";
m10.manufacturer = "Bosch";
m10.model = "MCM1000";
m10.power = 430;
m10.fuelType = "Electric";
m10.color = "Gray";
m10.weight = 1400;
m10.material = "Steel";
m10.speed = 2500;
m10.operationType = "Automatic";
m10.coolingSystem = "Water Cooling";
m10.capacity = 210;
m10.safety = "Medium";
m10.year = 2021;
m10.status = "Active";
m10.category = "Cutting";
m10.maintenance = "Monthly";
m10.location = "Section J";

f10.machine = m10;

f10.getFactoryDetails();
Factory f11 = new Factory();

f11.factoryId = 11;
f11.factoryName = "Vision Factory";
f11.location = "Surat";
f11.owner = "Amit";
f11.workers = 165;
f11.product = "Diamond";
f11.area = 4100;
f11.shift = "Day";
f11.machinesCount = 42;
f11.powerSource = "Electric";
f11.manager = "Nitin";
f11.establishedYear = 2019;
f11.city = "Surat";
f11.country = "India";
f11.safetyLevel = "High";
f11.color = "Silver";
f11.productionCapacity = 700;
f11.status = "Running";
f11.category = "Jewellery";
f11.license = "Gov Approved";

Machine m11 = new Machine();

m11.machineId = 111;
m11.machineName = "Diamond Polishing Machine";
m11.machineType = "Industrial";
m11.manufacturer = "Hitachi";
m11.model = "DPM1100";
m11.power = 350;
m11.fuelType = "Electric";
m11.color = "Blue";
m11.weight = 1100;
m11.material = "Iron";
m11.speed = 2300;
m11.operationType = "Automatic";
m11.coolingSystem = "Air Cooling";
m11.capacity = 180;
m11.safety = "High";
m11.year = 2022;
m11.status = "Active";
m11.category = "Polishing";
m11.maintenance = "Monthly";
m11.location = "Section K";

f11.machine = m11;

f11.getFactoryDetails();
Factory f13 = new Factory();

f13.factoryId = 13;
f13.factoryName = "PowerTech Factory";
f13.location = "Bhopal";
f13.owner = "Vivek";
f13.workers = 195;
f13.product = "Batteries";
f13.area = 4900;
f13.shift = "Day & Night";
f13.machinesCount = 57;
f13.powerSource = "Electric";
f13.manager = "Tarun";
f13.establishedYear = 2017;
f13.city = "Bhopal";
f13.country = "India";
f13.safetyLevel = "High";
f13.color = "Gray";
f13.productionCapacity = 920;
f13.status = "Running";
f13.category = "Electronics";
f13.license = "Gov Approved";

Machine m13 = new Machine();

m13.machineId = 113;
m13.machineName = "Battery Assembly Machine";
m13.machineType = "Industrial";
m13.manufacturer = "Siemens";
m13.model = "BAM1300";
m13.power = 470;
m13.fuelType = "Electric";
m13.color = "Silver";
m13.weight = 1500;
m13.material = "Steel";
m13.speed = 2750;
m13.operationType = "Automatic";
m13.coolingSystem = "Air Cooling";
m13.capacity = 230;
m13.safety = "High";
m13.year = 2024;
m13.status = "Active";
m13.category = "Assembly";
m13.maintenance = "Monthly";
m13.location = "Section M";

f13.machine = m13;

f13.getFactoryDetails();
Factory f14 = new Factory();

f14.factoryId = 14;
f14.factoryName = "Neo Factory";
f14.location = "Lucknow";
f14.owner = "Pradeep";
f14.workers = 175;
f14.product = "Furniture";
f14.area = 4400;
f14.shift = "Day";
f14.machinesCount = 46;
f14.powerSource = "Electric";
f14.manager = "Kamal";
f14.establishedYear = 2013;
f14.city = "Lucknow";
f14.country = "India";
f14.safetyLevel = "Medium";
f14.color = "Brown";
f14.productionCapacity = 760;
f14.status = "Running";
f14.category = "Wood";
f14.license = "ISO Certified";

Machine m14 = new Machine();

m14.machineId = 114;
m14.machineName = "Wood Cutting Machine";
m14.machineType = "Industrial";
m14.manufacturer = "Bosch";
m14.model = "WCM1400";
m14.power = 390;
m14.fuelType = "Electric";
m14.color = "Brown";
m14.weight = 1200;
m14.material = "Iron";
m14.speed = 2400;
m14.operationType = "Semi Automatic";
m14.coolingSystem = "Air Cooling";
m14.capacity = 180;
m14.safety = "Medium";
m14.year = 2020;
m14.status = "Active";
m14.category = "Cutting";
m14.maintenance = "Monthly";
m14.location = "Section N";

f14.machine = m14;

f14.getFactoryDetails();
Factory f15 = new Factory();

f15.factoryId = 15;
f15.factoryName = "Smart Factory";
f15.location = "Indore";
f15.owner = "Rohit";
f15.workers = 205;
f15.product = "Electronics";
f15.area = 5300;
f15.shift = "Day & Night";
f15.machinesCount = 62;
f15.powerSource = "Electric";
f15.manager = "Manish";
f15.establishedYear = 2018;
f15.city = "Indore";
f15.country = "India";
f15.safetyLevel = "High";
f15.color = "White";
f15.productionCapacity = 1000;
f15.status = "Running";
f15.category = "Electronics";
f15.license = "Gov Approved";

Machine m15 = new Machine();

m15.machineId = 115;
m15.machineName = "Circuit Assembly Machine";
m15.machineType = "Industrial";
m15.manufacturer = "Siemens";
m15.model = "CAM1500";
m15.power = 480;
m15.fuelType = "Electric";
m15.color = "Silver";
m15.weight = 1550;
m15.material = "Steel";
m15.speed = 2900;
m15.operationType = "Automatic";
m15.coolingSystem = "Water Cooling";
m15.capacity = 240;
m15.safety = "High";
m15.year = 2023;
m15.status = "Active";
m15.category = "Assembly";
m15.maintenance = "Monthly";
m15.location = "Section O";

f15.machine = m15;

f15.getFactoryDetails();
Factory f16 = new Factory();

f16.factoryId = 16;
f16.factoryName = "Ultra Factory";
f16.location = "Patna";
f16.owner = "Akhil";
f16.workers = 190;
f16.product = "Paper";
f16.area = 4700;
f16.shift = "Day";
f16.machinesCount = 49;
f16.powerSource = "Electric";
f16.manager = "Suresh";
f16.establishedYear = 2012;
f16.city = "Patna";
f16.country = "India";
f16.safetyLevel = "Medium";
f16.color = "White";
f16.productionCapacity = 780;
f16.status = "Running";
f16.category = "Paper";
f16.license = "ISO Certified";

Machine m16 = new Machine();

m16.machineId = 116;
m16.machineName = "Paper Cutting Machine";
m16.machineType = "Industrial";
m16.manufacturer = "Bosch";
m16.model = "PCM1600";
m16.power = 370;
m16.fuelType = "Electric";
m16.color = "Gray";
m16.weight = 1180;
m16.material = "Steel";
m16.speed = 2300;
m16.operationType = "Semi Automatic";
m16.coolingSystem = "Air Cooling";
m16.capacity = 170;
m16.safety = "Medium";
m16.year = 2021;
m16.status = "Active";
m16.category = "Cutting";
m16.maintenance = "Monthly";
m16.location = "Section P";

f16.machine = m16;

f16.getFactoryDetails();
Factory f17 = new Factory();

f17.factoryId = 17;
f17.factoryName = "Advance Factory";
f17.location = "Kolkata";
f17.owner = "Sanjay";
f17.workers = 210;
f17.product = "Steel Rods";
f17.area = 5500;
f17.shift = "Day & Night";
f17.machinesCount = 68;
f17.powerSource = "Electric";
f17.manager = "Rakesh";
f17.establishedYear = 2019;
f17.city = "Kolkata";
f17.country = "India";
f17.safetyLevel = "High";
f17.color = "Gray";
f17.productionCapacity = 1200;
f17.status = "Running";
f17.category = "Metal";
f17.license = "Gov Approved";

Machine m17 = new Machine();

m17.machineId = 117;
m17.machineName = "Steel Rolling Machine";
m17.machineType = "Industrial";
m17.manufacturer = "Siemens";
m17.model = "SRM1700";
m17.power = 500;
m17.fuelType = "Electric";
m17.color = "Silver";
m17.weight = 1600;
m17.material = "Steel";
m17.speed = 3000;
m17.operationType = "Automatic";
m17.coolingSystem = "Water Cooling";
m17.capacity = 260;
m17.safety = "High";
m17.year = 2024;
m17.status = "Active";
m17.category = "Rolling";
m17.maintenance = "Monthly";
m17.location = "Section Q";

f17.machine = m17;

f17.getFactoryDetails();
Factory f18 = new Factory();
Machine m18 = new Machine();

f18.factoryId = 18;
f18.factoryName = "Eco Factory";
f18.location = "Goa";
f18.owner = "Kiran";
f18.workers = 140;
f18.product = "Recycled Plastic";
f18.area = 3900;
f18.shift = "Day";
f18.machinesCount = 35;
f18.powerSource = "Solar";
f18.manager = "Naveen";
f18.establishedYear = 2020;
f18.city = "Goa";
f18.country = "India";
f18.safetyLevel = "High";
f18.color = "Green";
f18.productionCapacity = 650;
f18.status = "Running";
f18.category = "Recycling";
f18.license = "ISO Certified";

m18.machineId = 118;
m18.machineName = "Plastic Recycling Machine";
m18.machineType = "Industrial";
m18.manufacturer = "Hitachi";
m18.model = "PRM1800";
m18.power = 420;
m18.fuelType = "Electric";
m18.color = "Green";
m18.weight = 1300;
m18.material = "Steel";
m18.speed = 2500;
m18.operationType = "Automatic";
m18.coolingSystem = "Air Cooling";
m18.capacity = 200;
m18.safety = "High";
m18.year = 2023;
m18.status = "Active";
m18.category = "Recycling";
m18.maintenance = "Monthly";
m18.location = "Section R";

f18.machine = m18;

f18.getFactoryDetails();
Factory f19 = new Factory();
Machine m19 = new Machine();

f19.factoryId = 19;
f19.factoryName = "Mega Factory";
f19.location = "Chandigarh";
f19.owner = "Arjun";
f19.workers = 220;
f19.product = "Automobile Parts";
f19.area = 6000;
f19.shift = "Day & Night";
f19.machinesCount = 72;
f19.powerSource = "Electric";
f19.manager = "Vikram";
f19.establishedYear = 2015;
f19.city = "Chandigarh";
f19.country = "India";
f19.safetyLevel = "High";
f19.color = "Black";
f19.productionCapacity = 1300;
f19.status = "Running";
f19.category = "Automobile";
f19.license = "Gov Approved";

m19.machineId = 119;
m19.machineName = "CNC Machine";
m19.machineType = "Industrial";
m19.manufacturer = "Bosch";
m19.model = "CNC1900";
m19.power = 520;
m19.fuelType = "Electric";
m19.color = "Black";
m19.weight = 1700;
m19.material = "Steel";
m19.speed = 3100;
m19.operationType = "Automatic";
m19.coolingSystem = "Water Cooling";
m19.capacity = 270;
m19.safety = "High";
m19.year = 2024;
m19.status = "Active";
m19.category = "CNC";
m19.maintenance = "Monthly";
m19.location = "Section S";

f19.machine = m19;

f19.getFactoryDetails();
Factory f20 = new Factory();
Machine m20 = new Machine();

f20.factoryId = 20;
f20.factoryName = "Global Factory";
f20.location = "Bangalore";
f20.owner = "Karthik";
f20.workers = 250;
f20.product = "Robotics";
f20.area = 6500;
f20.shift = "Day & Night";
f20.machinesCount = 80;
f20.powerSource = "Electric";
f20.manager = "Aditya";
f20.establishedYear = 2021;
f20.city = "Bangalore";
f20.country = "India";
f20.safetyLevel = "High";
f20.color = "Silver";
f20.productionCapacity = 1500;
f20.status = "Running";
f20.category = "Robotics";
f20.license = "ISO Certified";

m20.machineId = 120;
m20.machineName = "Robot Assembly Machine";
m20.machineType = "Industrial";
m20.manufacturer = "Siemens";
m20.model = "RAM2000";
m20.power = 600;
m20.fuelType = "Electric";
m20.color = "Silver";
m20.weight = 1800;
m20.material = "Steel";
m20.speed = 3200;
m20.operationType = "Automatic";
m20.coolingSystem = "Water Cooling";
m20.capacity = 300;
m20.safety = "High";
m20.year = 2025;
m20.status = "Active";
m20.category = "Assembly";
m20.maintenance = "Monthly";
m20.location = "Section T";

f20.machine = m20;

f20.getFactoryDetails();
    }
}