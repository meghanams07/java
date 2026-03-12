class RocketExecutor{
    public static void main(String[] args){		
	    Rocket r1 = new Rocket();
        r1.name="Falcon"; r1.speed=25000; r1.height=70; r1.weight=500;
        r1.fuelType="Liquid"; r1.stages=2; r1.country="USA"; r1.payload=20000;
        r1.manufacturer="SpaceX"; r1.launchYear=2020; r1.thrust=7600; r1.diameter=4;
        r1.crewCapacity=7; r1.cost=50; r1.missionType="Satellite"; r1.orbitHeight=500;
        r1.launchSite="Florida"; r1.flightTime=10; r1.status="Active"; r1.engineType="Merlin";
        r1.temperature=300; r1.pressure=100; r1.guidanceSystem="Auto"; r1.range=10000; r1.material="Aluminum";
        System.out.println(r1.name+" "+r1.speed+" "+r1.height+" "+r1.weight+" "+r1.fuelType+" "+r1.stages+" "+r1.country+" "+r1.payload+" "+r1.manufacturer+" "+r1.launchYear+" "+r1.thrust+" "+r1.diameter+" "+r1.crewCapacity+" "+r1.cost+" "+r1.missionType+" "+r1.orbitHeight+" "+r1.launchSite+" "+r1.flightTime+" "+r1.status+" "+r1.engineType+" "+r1.temperature+" "+r1.pressure+" "+r1.guidanceSystem+" "+r1.range+" "+r1.material);

        Rocket r2 = new Rocket();
        r2.name="Atlas"; r2.speed=24000; r2.height=60; r2.weight=450;
        r2.fuelType="Liquid"; r2.stages=2; r2.country="USA"; r2.payload=18000;
        r2.manufacturer="NASA"; r2.launchYear=2019; r2.thrust=7000; r2.diameter=3;
        r2.crewCapacity=6; r2.cost=45; r2.missionType="Research"; r2.orbitHeight=450;
        r2.launchSite="Texas"; r2.flightTime=9; r2.status="Active"; r2.engineType="RD180";
        r2.temperature=290; r2.pressure=95; r2.guidanceSystem="Auto"; r2.range=9000; r2.material="Steel";
        System.out.println(r2.name+" "+r2.speed+" "+r2.height+" "+r2.weight+" "+r2.fuelType+" "+r2.stages+" "+r2.country+" "+r2.payload+" "+r2.manufacturer+" "+r2.launchYear+" "+r2.thrust+" "+r2.diameter+" "+r2.crewCapacity+" "+r2.cost+" "+r2.missionType+" "+r2.orbitHeight+" "+r2.launchSite+" "+r2.flightTime+" "+r2.status+" "+r2.engineType+" "+r2.temperature+" "+r2.pressure+" "+r2.guidanceSystem+" "+r2.range+" "+r2.material);
		
		Rocket r3 = new Rocket();
		r3.name="Ariane"; r3.speed=23000; r3.height=65; r3.weight=480; r3.fuelType="Liquid"; r3.stages=2; r3.country="France";
		r3.payload=17000; r3.manufacturer="ESA"; r3.launchYear=2018; r3.thrust=6900; r3.diameter=3; r3.crewCapacity=5;
		r3.cost=40; r3.missionType="Satellite"; r3.orbitHeight=420; r3.launchSite="Guiana"; r3.flightTime=9;
		r3.status="Active"; r3.engineType="Vulcain"; r3.temperature=295; r3.pressure=96; r3.guidanceSystem="Auto";
		r3.range=8800; r3.material="Steel";
		System.out.println(r3.name+" "+r3.speed+" "+r3.height+" "+r3.weight+" "+r3.fuelType+" "+r3.stages+" "+r3.country+" "+r3.payload+" "+r3.manufacturer+" "+r3.launchYear+" "+r3.thrust+" "+r3.diameter+" "+r3.crewCapacity+" "+r3.cost+" "+r3.missionType+" "+r3.orbitHeight+" "+r3.launchSite+" "+r3.flightTime+" "+r3.status+" "+r3.engineType+" "+r3.temperature+" "+r3.pressure+" "+r3.guidanceSystem+" "+r3.range+" "+r3.material);

		Rocket r4 = new Rocket();
		r4.name="Delta"; r4.speed=24000; r4.height=66; r4.weight=485; r4.fuelType="Liquid"; r4.stages=2; r4.country="USA";
		r4.payload=17500; r4.manufacturer="ULA"; r4.launchYear=2017; r4.thrust=6950; r4.diameter=3; r4.crewCapacity=6;
		r4.cost=42; r4.missionType="Research"; r4.orbitHeight=430; r4.launchSite="California"; r4.flightTime=9;
		r4.status="Active"; r4.engineType="RS68"; r4.temperature=298; r4.pressure=97; r4.guidanceSystem="Auto";
		r4.range=8900; r4.material="Steel";
		System.out.println(r4.name+" "+r4.speed+" "+r4.height+" "+r4.weight+" "+r4.fuelType+" "+r4.stages+" "+r4.country+" "+r4.payload+" "+r4.manufacturer+" "+r4.launchYear+" "+r4.thrust+" "+r4.diameter+" "+r4.crewCapacity+" "+r4.cost+" "+r4.missionType+" "+r4.orbitHeight+" "+r4.launchSite+" "+r4.flightTime+" "+r4.status+" "+r4.engineType+" "+r4.temperature+" "+r4.pressure+" "+r4.guidanceSystem+" "+r4.range+" "+r4.material);

		Rocket r5 = new Rocket();
		r5.name="Soyuz"; r5.speed=22000; r5.height=50; r5.weight=400; r5.fuelType="Liquid"; r5.stages=3; r5.country="Russia";
		r5.payload=15000; r5.manufacturer="Roscosmos"; r5.launchYear=2016; r5.thrust=6500; r5.diameter=2; r5.crewCapacity=3;
		r5.cost=30; r5.missionType="Crew"; r5.orbitHeight=400; r5.launchSite="Baikonur"; r5.flightTime=8;
		r5.status="Active"; r5.engineType="RD107"; r5.temperature=280; r5.pressure=90; r5.guidanceSystem="Manual";
		r5.range=8000; r5.material="Steel";
		System.out.println(r5.name+" "+r5.speed+" "+r5.height+" "+r5.weight+" "+r5.fuelType+" "+r5.stages+" "+r5.country+" "+r5.payload+" "+r5.manufacturer+" "+r5.launchYear+" "+r5.thrust+" "+r5.diameter+" "+r5.crewCapacity+" "+r5.cost+" "+r5.missionType+" "+r5.orbitHeight+" "+r5.launchSite+" "+r5.flightTime+" "+r5.status+" "+r5.engineType+" "+r5.temperature+" "+r5.pressure+" "+r5.guidanceSystem+" "+r5.range+" "+r5.material);
		
		Rocket r6 = new Rocket();
		r6.name="GSLV"; r6.speed=21000; r6.height=49; r6.weight=420; r6.fuelType="Liquid"; r6.stages=3; r6.country="India";
		r6.payload=14000; r6.manufacturer="ISRO"; r6.launchYear=2015; r6.thrust=6400; r6.diameter=2; r6.crewCapacity=0;
		r6.cost=25; r6.missionType="Satellite"; r6.orbitHeight=380; r6.launchSite="Sriharikota"; r6.flightTime=8;
		r6.status="Active"; r6.engineType="CE7.5"; r6.temperature=275; r6.pressure=88; r6.guidanceSystem="Auto";
		r6.range=7800; r6.material="Steel";
		System.out.println(r6.name+" "+r6.speed+" "+r6.height+" "+r6.weight+" "+r6.fuelType+" "+r6.stages+" "+r6.country+" "+r6.payload+" "+r6.manufacturer+" "+r6.launchYear+" "+r6.thrust+" "+r6.diameter+" "+r6.crewCapacity+" "+r6.cost+" "+r6.missionType+" "+r6.orbitHeight+" "+r6.launchSite+" "+r6.flightTime+" "+r6.status+" "+r6.engineType+" "+r6.temperature+" "+r6.pressure+" "+r6.guidanceSystem+" "+r6.range+" "+r6.material);

		Rocket r7 = new Rocket();
		r7.name="PSLV"; r7.speed=20000; r7.height=44; r7.weight=410; r7.fuelType="Solid"; r7.stages=4; r7.country="India";
		r7.payload=13000; r7.manufacturer="ISRO"; r7.launchYear=2014; r7.thrust=6200; r7.diameter=2; r7.crewCapacity=0;
		r7.cost=20; r7.missionType="Satellite"; r7.orbitHeight=360; r7.launchSite="Sriharikota"; r7.flightTime=7;
		r7.status="Active"; r7.engineType="PS1"; r7.temperature=270; r7.pressure=85; r7.guidanceSystem="Auto";
		r7.range=7500; r7.material="Aluminum";
		System.out.println(r7.name+" "+r7.speed+" "+r7.height+" "+r7.weight+" "+r7.fuelType+" "+r7.stages+" "+r7.country+" "+r7.payload+" "+r7.manufacturer+" "+r7.launchYear+" "+r7.thrust+" "+r7.diameter+" "+r7.crewCapacity+" "+r7.cost+" "+r7.missionType+" "+r7.orbitHeight+" "+r7.launchSite+" "+r7.flightTime+" "+r7.status+" "+r7.engineType+" "+r7.temperature+" "+r7.pressure+" "+r7.guidanceSystem+" "+r7.range+" "+r7.material);

		Rocket r8 = new Rocket();
		r8.name="LongMarch"; r8.speed=23000; r8.height=57; r8.weight=470; r8.fuelType="Liquid"; r8.stages=3; r8.country="China";
		r8.payload=16000; r8.manufacturer="CASC"; r8.launchYear=2013; r8.thrust=6600; r8.diameter=3; r8.crewCapacity=3;
		r8.cost=35; r8.missionType="Crew"; r8.orbitHeight=410; r8.launchSite="Jiuquan"; r8.flightTime=9;
		r8.status="Active"; r8.engineType="YF77"; r8.temperature=290; r8.pressure=92; r8.guidanceSystem="Auto";
		r8.range=8400; r8.material="Steel";
		System.out.println(r8.name+" "+r8.speed+" "+r8.height+" "+r8.weight+" "+r8.fuelType+" "+r8.stages+" "+r8.country+" "+r8.payload+" "+r8.manufacturer+" "+r8.launchYear+" "+r8.thrust+" "+r8.diameter+" "+r8.crewCapacity+" "+r8.cost+" "+r8.missionType+" "+r8.orbitHeight+" "+r8.launchSite+" "+r8.flightTime+" "+r8.status+" "+r8.engineType+" "+r8.temperature+" "+r8.pressure+" "+r8.guidanceSystem+" "+r8.range+" "+r8.material);

		Rocket r9 = new Rocket();
		r9.name="Electron"; r9.speed=18000; r9.height=18; r9.weight=150; r9.fuelType="Electric"; r9.stages=2; r9.country="USA";
		r9.payload=300; r9.manufacturer="RocketLab"; r9.launchYear=2018; r9.thrust=200; r9.diameter=1; r9.crewCapacity=0;
		r9.cost=7; r9.missionType="SmallSat"; r9.orbitHeight=300; r9.launchSite="NewZealand"; r9.flightTime=5;
		r9.status="Active"; r9.engineType="Rutherford"; r9.temperature=260; r9.pressure=70; r9.guidanceSystem="Auto";
		r9.range=5000; r9.material="CarbonFiber";
		System.out.println(r9.name+" "+r9.speed+" "+r9.height+" "+r9.weight+" "+r9.fuelType+" "+r9.stages+" "+r9.country+" "+r9.payload+" "+r9.manufacturer+" "+r9.launchYear+" "+r9.thrust+" "+r9.diameter+" "+r9.crewCapacity+" "+r9.cost+" "+r9.missionType+" "+r9.orbitHeight+" "+r9.launchSite+" "+r9.flightTime+" "+r9.status+" "+r9.engineType+" "+r9.temperature+" "+r9.pressure+" "+r9.guidanceSystem+" "+r9.range+" "+r9.material);

		Rocket r10 = new Rocket();
		r10.name="NewShepard"; r10.speed=15000; r10.height=19; r10.weight=120; r10.fuelType="Liquid"; r10.stages=1; r10.country="USA";
		r10.payload=1000; r10.manufacturer="BlueOrigin"; r10.launchYear=2021; r10.thrust=300; r10.diameter=3; r10.crewCapacity=6;
		r10.cost=10; r10.missionType="Tourism"; r10.orbitHeight=100; r10.launchSite="Texas"; r10.flightTime=4;
		r10.status="Active"; r10.engineType="BE3"; r10.temperature=250; r10.pressure=65; r10.guidanceSystem="Auto";
		r10.range=4000; r10.material="Composite";
		System.out.println(r10.name+" "+r10.speed+" "+r10.height+" "+r10.weight+" "+r10.fuelType+" "+r10.stages+" "+r10.country+" "+r10.payload+" "+r10.manufacturer+" "+r10.launchYear+" "+r10.thrust+" "+r10.diameter+" "+r10.crewCapacity+" "+r10.cost+" "+r10.missionType+" "+r10.orbitHeight+" "+r10.launchSite+" "+r10.flightTime+" "+r10.status+" "+r10.engineType+" "+r10.temperature+" "+r10.pressure+" "+r10.guidanceSystem+" "+r10.range+" "+r10.material);
		
		Rocket r11 = new Rocket();
		r11.name="Starship"; r11.speed=27000; r11.height=120; r11.weight=1200; r11.fuelType="Methane"; r11.stages=2; r11.country="USA";
		r11.payload=100000; r11.manufacturer="SpaceX"; r11.launchYear=2023; r11.thrust=15000; r11.diameter=9; r11.crewCapacity=100;
		r11.cost=200; r11.missionType="Mars"; r11.orbitHeight=600; r11.launchSite="Texas"; r11.flightTime=12;
		r11.status="Testing"; r11.engineType="Raptor"; r11.temperature=320; r11.pressure=120; r11.guidanceSystem="Auto";
		r11.range=15000; r11.material="Steel";
		System.out.println(r11.name+" "+r11.speed+" "+r11.height+" "+r11.weight+" "+r11.fuelType+" "+r11.stages+" "+r11.country+" "+r11.payload+" "+r11.manufacturer+" "+r11.launchYear+" "+r11.thrust+" "+r11.diameter+" "+r11.crewCapacity+" "+r11.cost+" "+r11.missionType+" "+r11.orbitHeight+" "+r11.launchSite+" "+r11.flightTime+" "+r11.status+" "+r11.engineType+" "+r11.temperature+" "+r11.pressure+" "+r11.guidanceSystem+" "+r11.range+" "+r11.material);

		Rocket r12 = new Rocket();
		r12.name="SaturnV"; r12.speed=28000; r12.height=110; r12.weight=2900; r12.fuelType="Liquid"; r12.stages=3; r12.country="USA";
		r12.payload=140000; r12.manufacturer="NASA"; r12.launchYear=1967; r12.thrust=16000; r12.diameter=10; r12.crewCapacity=3;
		r12.cost=300; r12.missionType="Moon"; r12.orbitHeight=650; r12.launchSite="Florida"; r12.flightTime=13;
		r12.status="Retired"; r12.engineType="F1"; r12.temperature=330; r12.pressure=130; r12.guidanceSystem="Manual";
		r12.range=16000; r12.material="Steel";
		System.out.println(r12.name+" "+r12.speed+" "+r12.height+" "+r12.weight+" "+r12.fuelType+" "+r12.stages+" "+r12.country+" "+r12.payload+" "+r12.manufacturer+" "+r12.launchYear+" "+r12.thrust+" "+r12.diameter+" "+r12.crewCapacity+" "+r12.cost+" "+r12.missionType+" "+r12.orbitHeight+" "+r12.launchSite+" "+r12.flightTime+" "+r12.status+" "+r12.engineType+" "+r12.temperature+" "+r12.pressure+" "+r12.guidanceSystem+" "+r12.range+" "+r12.material);

		Rocket r13 = new Rocket();
		r13.name="Vega"; r13.speed=21000; r13.height=30; r13.weight=137; r13.fuelType="Solid"; r13.stages=4; r13.country="Italy";
		r13.payload=1500; r13.manufacturer="ESA"; r13.launchYear=2012; r13.thrust=2500; r13.diameter=3; r13.crewCapacity=0;
		r13.cost=37; r13.missionType="Satellite"; r13.orbitHeight=350; r13.launchSite="Guiana"; r13.flightTime=6;
		r13.status="Active"; r13.engineType="P80"; r13.temperature=260; r13.pressure=80; r13.guidanceSystem="Auto";
		r13.range=6000; r13.material="Composite";
		System.out.println(r13.name+" "+r13.speed+" "+r13.height+" "+r13.weight+" "+r13.fuelType+" "+r13.stages+" "+r13.country+" "+r13.payload+" "+r13.manufacturer+" "+r13.launchYear+" "+r13.thrust+" "+r13.diameter+" "+r13.crewCapacity+" "+r13.cost+" "+r13.missionType+" "+r13.orbitHeight+" "+r13.launchSite+" "+r13.flightTime+" "+r13.status+" "+r13.engineType+" "+r13.temperature+" "+r13.pressure+" "+r13.guidanceSystem+" "+r13.range+" "+r13.material);

		Rocket r14 = new Rocket();
		r14.name="H2A"; r14.speed=22000; r14.height=53; r14.weight=445; r14.fuelType="Liquid"; r14.stages=2; r14.country="Japan";
		r14.payload=20000; r14.manufacturer="Mitsubishi"; r14.launchYear=2001; r14.thrust=7200; r14.diameter=4; r14.crewCapacity=0;
		r14.cost=90; r14.missionType="Satellite"; r14.orbitHeight=500; r14.launchSite="Tanegashima"; r14.flightTime=9;
		r14.status="Active"; r14.engineType="LE7A"; r14.temperature=285; r14.pressure=95; r14.guidanceSystem="Auto";
		r14.range=9200; r14.material="Steel";
		System.out.println(r14.name+" "+r14.speed+" "+r14.height+" "+r14.weight+" "+r14.fuelType+" "+r14.stages+" "+r14.country+" "+r14.payload+" "+r14.manufacturer+" "+r14.launchYear+" "+r14.thrust+" "+r14.diameter+" "+r14.crewCapacity+" "+r14.cost+" "+r14.missionType+" "+r14.orbitHeight+" "+r14.launchSite+" "+r14.flightTime+" "+r14.status+" "+r14.engineType+" "+r14.temperature+" "+r14.pressure+" "+r14.guidanceSystem+" "+r14.range+" "+r14.material);

		Rocket r15 = new Rocket();
		r15.name="Angara"; r15.speed=24000; r15.height=64; r15.weight=773; r15.fuelType="Liquid"; r15.stages=2; r15.country="Russia";
		r15.payload=24500; r15.manufacturer="Khrunichev"; r15.launchYear=2014; r15.thrust=9000; r15.diameter=4; r15.crewCapacity=0;
		r15.cost=100; r15.missionType="Satellite"; r15.orbitHeight=520; r15.launchSite="Plesetsk"; r15.flightTime=10;
		r15.status="Active"; r15.engineType="RD191"; r15.temperature=295; r15.pressure=100; r15.guidanceSystem="Auto";
		r15.range=9800; r15.material="Steel";
		System.out.println(r15.name+" "+r15.speed+" "+r15.height+" "+r15.weight+" "+r15.fuelType+" "+r15.stages+" "+r15.country+" "+r15.payload+" "+r15.manufacturer+" "+r15.launchYear+" "+r15.thrust+" "+r15.diameter+" "+r15.crewCapacity+" "+r15.cost+" "+r15.missionType+" "+r15.orbitHeight+" "+r15.launchSite+" "+r15.flightTime+" "+r15.status+" "+r15.engineType+" "+r15.temperature+" "+r15.pressure+" "+r15.guidanceSystem+" "+r15.range+" "+r15.material);
		
		Rocket r16 = new Rocket();
		r16.name="FalconHeavy"; r16.speed=26000; r16.height=70; r16.weight=1400; r16.fuelType="Liquid"; r16.stages=2; r16.country="USA";
		r16.payload=63800; r16.manufacturer="SpaceX"; r16.launchYear=2018; r16.thrust=22800; r16.diameter=12; r16.crewCapacity=0;
		r16.cost=150; r16.missionType="Satellite"; r16.orbitHeight=550; r16.launchSite="Florida"; r16.flightTime=11;
		r16.status="Active"; r16.engineType="Merlin"; r16.temperature=300; r16.pressure=110; r16.guidanceSystem="Auto";
		r16.range=12000; r16.material="Steel";
		System.out.println(r16.name+" "+r16.speed+" "+r16.height+" "+r16.weight+" "+r16.fuelType+" "+r16.stages+" "+r16.country+" "+r16.payload+" "+r16.manufacturer+" "+r16.launchYear+" "+r16.thrust+" "+r16.diameter+" "+r16.crewCapacity+" "+r16.cost+" "+r16.missionType+" "+r16.orbitHeight+" "+r16.launchSite+" "+r16.flightTime+" "+r16.status+" "+r16.engineType+" "+r16.temperature+" "+r16.pressure+" "+r16.guidanceSystem+" "+r16.range+" "+r16.material);

		Rocket r17 = new Rocket();
		r17.name="Terran1"; r17.speed=21000; r17.height=35; r17.weight=125; r17.fuelType="Liquid"; r17.stages=2; r17.country="USA";
		r17.payload=1250; r17.manufacturer="Relativity"; r17.launchYear=2023; r17.thrust=3000; r17.diameter=2; r17.crewCapacity=0;
		r17.cost=12; r17.missionType="Satellite"; r17.orbitHeight=350; r17.launchSite="Florida"; r17.flightTime=6;
		r17.status="Testing"; r17.engineType="Aeon"; r17.temperature=270; r17.pressure=80; r17.guidanceSystem="Auto";
		r17.range=6500; r17.material="Alloy";
		System.out.println(r17.name+" "+r17.speed+" "+r17.height+" "+r17.weight+" "+r17.fuelType+" "+r17.stages+" "+r17.country+" "+r17.payload+" "+r17.manufacturer+" "+r17.launchYear+" "+r17.thrust+" "+r17.diameter+" "+r17.crewCapacity+" "+r17.cost+" "+r17.missionType+" "+r17.orbitHeight+" "+r17.launchSite+" "+r17.flightTime+" "+r17.status+" "+r17.engineType+" "+r17.temperature+" "+r17.pressure+" "+r17.guidanceSystem+" "+r17.range+" "+r17.material);

		Rocket r18 = new Rocket();
		r18.name="FireflyAlpha"; r18.speed=20000; r18.height=29; r18.weight=54; r18.fuelType="Liquid"; r18.stages=2; r18.country="USA";
		r18.payload=1000; r18.manufacturer="Firefly"; r18.launchYear=2021; r18.thrust=2000; r18.diameter=2; r18.crewCapacity=0;
		r18.cost=15; r18.missionType="Satellite"; r18.orbitHeight=300; r18.launchSite="California"; r18.flightTime=6;
		r18.status="Active"; r18.engineType="Reaver"; r18.temperature=265; r18.pressure=78; r18.guidanceSystem="Auto";
		r18.range=6000; r18.material="Composite";
		System.out.println(r18.name+" "+r18.speed+" "+r18.height+" "+r18.weight+" "+r18.fuelType+" "+r18.stages+" "+r18.country+" "+r18.payload+" "+r18.manufacturer+" "+r18.launchYear+" "+r18.thrust+" "+r18.diameter+" "+r18.crewCapacity+" "+r18.cost+" "+r18.missionType+" "+r18.orbitHeight+" "+r18.launchSite+" "+r18.flightTime+" "+r18.status+" "+r18.engineType+" "+r18.temperature+" "+r18.pressure+" "+r18.guidanceSystem+" "+r18.range+" "+r18.material);

		Rocket r19 = new Rocket();
		r19.name="LauncherOne"; r19.speed=19000; r19.height=21; r19.weight=30; r19.fuelType="Liquid"; r19.stages=2; r19.country="USA";
		r19.payload=500; r19.manufacturer="VirginOrbit"; r19.launchYear=2020; r19.thrust=1500; r19.diameter=1; r19.crewCapacity=0;
		r19.cost=10; r19.missionType="Satellite"; r19.orbitHeight=280; r19.launchSite="AirLaunch"; r19.flightTime=5;
		r19.status="Active"; r19.engineType="Newton"; r19.temperature=255; r19.pressure=70; r19.guidanceSystem="Auto";
		r19.range=5500; r19.material="Composite";
		System.out.println(r19.name+" "+r19.speed+" "+r19.height+" "+r19.weight+" "+r19.fuelType+" "+r19.stages+" "+r19.country+" "+r19.payload+" "+r19.manufacturer+" "+r19.launchYear+" "+r19.thrust+" "+r19.diameter+" "+r19.crewCapacity+" "+r19.cost+" "+r19.missionType+" "+r19.orbitHeight+" "+r19.launchSite+" "+r19.flightTime+" "+r19.status+" "+r19.engineType+" "+r19.temperature+" "+r19.pressure+" "+r19.guidanceSystem+" "+r19.range+" "+r19.material);

		Rocket r20 = new Rocket();
		r20.name="Minotaur"; r20.speed=20000; r20.height=24; r20.weight=36; r20.fuelType="Solid"; r20.stages=4; r20.country="USA";
		r20.payload=580; r20.manufacturer="Orbital"; r20.launchYear=2000; r20.thrust=1800; r20.diameter=2; r20.crewCapacity=0;
		r20.cost=20; r20.missionType="Satellite"; r20.orbitHeight=300; r20.launchSite="Virginia"; r20.flightTime=6;
		r20.status="Active"; r20.engineType="SRB"; r20.temperature=260; r20.pressure=75; r20.guidanceSystem="Auto";
		r20.range=6000; r20.material="Steel";
		System.out.println(r20.name+" "+r20.speed+" "+r20.height+" "+r20.weight+" "+r20.fuelType+" "+r20.stages+" "+r20.country+" "+r20.payload+" "+r20.manufacturer+" "+r20.launchYear+" "+r20.thrust+" "+r20.diameter+" "+r20.crewCapacity+" "+r20.cost+" "+r20.missionType+" "+r20.orbitHeight+" "+r20.launchSite+" "+r20.flightTime+" "+r20.status+" "+r20.engineType+" "+r20.temperature+" "+r20.pressure+" "+r20.guidanceSystem+" "+r20.range+" "+r20.material);

		Rocket r21 = new Rocket();
		r21.name="Scout"; r21.speed=18000; r21.height=23; r21.weight=18; r21.fuelType="Solid"; r21.stages=4; r21.country="USA";
		r21.payload=210; r21.manufacturer="NASA"; r21.launchYear=1960; r21.thrust=800; r21.diameter=1; r21.crewCapacity=0;
		r21.cost=5; r21.missionType="Research"; r21.orbitHeight=250; r21.launchSite="Wallops"; r21.flightTime=4;
		r21.status="Retired"; r21.engineType="SRB"; r21.temperature=250; r21.pressure=65; r21.guidanceSystem="Manual";
		r21.range=4000; r21.material="Steel";
		System.out.println(r21.name+" "+r21.speed+" "+r21.height+" "+r21.weight+" "+r21.fuelType+" "+r21.stages+" "+r21.country+" "+r21.payload+" "+r21.manufacturer+" "+r21.launchYear+" "+r21.thrust+" "+r21.diameter+" "+r21.crewCapacity+" "+r21.cost+" "+r21.missionType+" "+r21.orbitHeight+" "+r21.launchSite+" "+r21.flightTime+" "+r21.status+" "+r21.engineType+" "+r21.temperature+" "+r21.pressure+" "+r21.guidanceSystem+" "+r21.range+" "+r21.material);

		Rocket r22 = new Rocket();
		r22.name="N1"; r22.speed=27000; r22.height=105; r22.weight=2800; r22.fuelType="Liquid"; r22.stages=4; r22.country="Russia";
		r22.payload=95000; r22.manufacturer="Soviet"; r22.launchYear=1969; r22.thrust=15000; r22.diameter=17; r22.crewCapacity=3;
		r22.cost=250; r22.missionType="Moon"; r22.orbitHeight=640; r22.launchSite="Baikonur"; r22.flightTime=12;
		r22.status="Failed"; r22.engineType="NK15"; r22.temperature=325; r22.pressure=120; r22.guidanceSystem="Manual";
		r22.range=15000; r22.material="Steel";
		System.out.println(r22.name+" "+r22.speed+" "+r22.height+" "+r22.weight+" "+r22.fuelType+" "+r22.stages+" "+r22.country+" "+r22.payload+" "+r22.manufacturer+" "+r22.launchYear+" "+r22.thrust+" "+r22.diameter+" "+r22.crewCapacity+" "+r22.cost+" "+r22.missionType+" "+r22.orbitHeight+" "+r22.launchSite+" "+r22.flightTime+" "+r22.status+" "+r22.engineType+" "+r22.temperature+" "+r22.pressure+" "+r22.guidanceSystem+" "+r22.range+" "+r22.material);

		Rocket r23 = new Rocket();
		r23.name="Ares1"; r23.speed=26000; r23.height=94; r23.weight=900; r23.fuelType="Solid"; r23.stages=2; r23.country="USA";
		r23.payload=25000; r23.manufacturer="NASA"; r23.launchYear=2009; r23.thrust=12000; r23.diameter=5; r23.crewCapacity=4;
		r23.cost=120; r23.missionType="Crew"; r23.orbitHeight=520; r23.launchSite="Florida"; r23.flightTime=10;
		r23.status="Cancelled"; r23.engineType="J2X"; r23.temperature=300; r23.pressure=100; r23.guidanceSystem="Auto";
		r23.range=11000; r23.material="Alloy";
		System.out.println(r23.name+" "+r23.speed+" "+r23.height+" "+r23.weight+" "+r23.fuelType+" "+r23.stages+" "+r23.country+" "+r23.payload+" "+r23.manufacturer+" "+r23.launchYear+" "+r23.thrust+" "+r23.diameter+" "+r23.crewCapacity+" "+r23.cost+" "+r23.missionType+" "+r23.orbitHeight+" "+r23.launchSite+" "+r23.flightTime+" "+r23.status+" "+r23.engineType+" "+r23.temperature+" "+r23.pressure+" "+r23.guidanceSystem+" "+r23.range+" "+r23.material);

		Rocket r24 = new Rocket();
		r24.name="Ares5"; r24.speed=27000; r24.height=116; r24.weight=3000; r24.fuelType="Liquid"; r24.stages=2; r24.country="USA";
		r24.payload=180000; r24.manufacturer="NASA"; r24.launchYear=2010; r24.thrust=18000; r24.diameter=10; r24.crewCapacity=6;
		r24.cost=350; r24.missionType="Moon"; r24.orbitHeight=700; r24.launchSite="Florida"; r24.flightTime=14;
		r24.status="Cancelled"; r24.engineType="RS68"; r24.temperature=340; r24.pressure=135; r24.guidanceSystem="Auto";
		r24.range=17000; r24.material="Steel";
		System.out.println(r24.name+" "+r24.speed+" "+r24.height+" "+r24.weight+" "+r24.fuelType+" "+r24.stages+" "+r24.country+" "+r24.payload+" "+r24.manufacturer+" "+r24.launchYear+" "+r24.thrust+" "+r24.diameter+" "+r24.crewCapacity+" "+r24.cost+" "+r24.missionType+" "+r24.orbitHeight+" "+r24.launchSite+" "+r24.flightTime+" "+r24.status+" "+r24.engineType+" "+r24.temperature+" "+r24.pressure+" "+r24.guidanceSystem+" "+r24.range+" "+r24.material);

		Rocket r25 = new Rocket();
		r25.name="SLS"; r25.speed=27500; r25.height=98; r25.weight=2600; r25.fuelType="Liquid"; r25.stages=2; r25.country="USA";
		r25.payload=130000; r25.manufacturer="NASA"; r25.launchYear=2022; r25.thrust=17000; r25.diameter=8; r25.crewCapacity=4;
		r25.cost=400; r25.missionType="Moon"; r25.orbitHeight=680; r25.launchSite="Florida"; r25.flightTime=13;
		r25.status="Active"; r25.engineType="RS25"; r25.temperature=335; r25.pressure=130; r25.guidanceSystem="Auto";
		r25.range=16500; r25.material="Steel";
		System.out.println(r25.name+" "+r25.speed+" "+r25.height+" "+r25.weight+" "+r25.fuelType+" "+r25.stages+" "+r25.country+" "+r25.payload+" "+r25.manufacturer+" "+r25.launchYear+" "+r25.thrust+" "+r25.diameter+" "+r25.crewCapacity+" "+r25.cost+" "+r25.missionType+" "+r25.orbitHeight+" "+r25.launchSite+" "+r25.flightTime+" "+r25.status+" "+r25.engineType+" "+r25.temperature+" "+r25.pressure+" "+r25.guidanceSystem+" "+r25.range+" "+r25.material);
	}
}