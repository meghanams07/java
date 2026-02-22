class JobPortal{
	public static String[] searchJobByCompany(String companyName){
		if(companyName == "linkedIn"){
			String[] linkedIn = {
								"Data Analyst",
								"Full Stack Developer",
								"Backend Developer",
								"Frontend Developer",
								"Java Developer",
								"Python Developer",
								"Cloud Engineer",
								"DevOps Engineer",
								"Machine Learning Engineer",
								"AI Engineer",
								"UI/UX Designer",
								"Product Manager",
								"Project Manager",
								"Business Analyst",
								"Cyber Security Analyst",
								"QA Engineer",
								"Mobile App Developer",
								"React Developer",
								"NodeJS Developer",
								"Database Administrator"
								};
			return linkedIn;
		}else if(companyName == "google"){
				String[] google = {
									"Site Reliability Engineer",
									"Android Developer",
									"Chrome Developer",
									"Search Algorithm Engineer",
									"Big Data Engineer",
									"TensorFlow Engineer",
									"Security Engineer",
									"Cloud Architect",
									"Technical Program Manager",
									"UX Researcher",
									"Software Tester",
									"Embedded Systems Engineer",
									"AR/VR Developer",
									"Performance Engineer",
									"Release Engineer",
									"Data Engineer",
									"Visualization Specialist",
									"Product Designer",
									"Solutions Consultant",
									"Systems Administrator"
									};
				return google;
		}else if(companyName == "microsoft"){
				String[] microsoft = {
									".NET Developer",
									"Azure Engineer",
									"Power BI Developer",
									"SharePoint Developer",
									"C# Developer",
									"Game Developer",
									"Xbox Engineer",
									"Cloud Security Engineer",
									"Enterprise Architect",
									"IT Support Engineer",
									"Automation Engineer",
									"CRM Developer",
									"Windows Kernel Engineer",
									"Exchange Administrator",
									"SQL Server DBA",
									"Application Support Analyst",
									"DevSecOps Engineer",
									"Technical Writer",
									"QA Automation Engineer",
									"Infrastructure Engineer"
									};
				return microsoft;
		}else if(companyName == "amazon"){
				String[] amazon = {
								"Solutions Architect",
								"AWS Developer",
								"Logistics Analyst",
								"Operations Manager",
								"Supply Chain Engineer",
								"Alexa Developer",
								"Kindle Engineer",
								"Data Warehouse Engineer",
								"Risk Analyst",
								"Robotics Engineer",
								"Inventory Planner",
								"Vendor Manager",
								"BI Developer",
								"Network Architect",
								"Security Consultant",
								"Fulfillment Associate",
								"Cloud Consultant",
								"Technical Account Manager",
								"Platform Engineer",
								"Product Owner"
								};
				return amazon;
		}else if(companyName == "meta"){
				String[] meta = {
								"React Native Developer",
								"Social Media Analyst",
								"Ad Tech Engineer",
								"Graph API Developer",
								"AR Developer",
								"VR Engineer",
								"Community Operations Manager",
								"Growth Engineer",
								"Content Moderation Analyst",
								"Privacy Engineer",
								"Blockchain Developer",
								"Data Visualization Engineer",
								"Ads Optimization Engineer",
								"Platform Integrity Analyst",
								"UI Engineer",
								"Messaging Systems Engineer",
								"Trust & Safety Analyst",
								"Research Scientist",
								"Frontend Architect",
								"Mobile Security Engineer"
								};
				return meta;
		}else if(companyName == "tcs"){
							String[] tcs = {
										"System Engineer",
										"Assistant System Engineer",
										"IT Analyst",
										"Application Developer",
										"Support Analyst",
										"Mainframe Developer",
										"SAP Consultant",
										"Oracle Consultant",
										"Unix Administrator",
										"Network Support Engineer",
										"Testing Analyst",
										"Automation Tester",
										"RPA Developer",
										"Service Desk Analyst",
										"Technical Consultant",
										"Digital Marketing Analyst",
										"Blockchain Engineer",
										"IoT Developer",
										"Scrum Master",
										"IT Project Coordinator"
										};
				return tcs;
		}else if(companyName == "infosys"){
				String[] infosys = {
									"Systems Engineer Trainee",
									"Technology Analyst",
									"Associate Consultant",
									"Cloud Migration Engineer",
									"UI Developer",
									"Full Stack Consultant",
									"Java Spring Developer",
									"Python Django Developer",
									"Big Data Consultant",
									"Testing Consultant",
									"Performance Tester",
									"Cyber Risk Analyst",
									"Power Platform Developer",
									"Data Migration Specialist",
									"IT Auditor",
									"Network Consultant",
									"AI Consultant",
									"Automation Architect",
									"Digital Transformation Lead",
									"Infrastructure Analyst"
									};
				return infosys;
		}else if(companyName == "wipro"){
				String[] wipro = {
								"Project Engineer",
								"Technical Support Executive",
								"Software Tester",
								"Cloud Operations Engineer",
								"Linux Administrator",
								"Windows Administrator",
								"IT Service Manager",
								"DevOps Consultant",
								"Oracle DBA",
								"SAP Basis Consultant",
								"Web Developer",
								"Mobile QA Engineer",
								"IT Security Specialist",
								"Data Migration Engineer",
								"CRM Consultant",
								"ETL Developer",
								"Business Intelligence Analyst",
								"IT Infrastructure Manager",
								"Firmware Engineer",
								"Integration Developer"
								};
				return wipro;
		}else if(companyName == "ibm"){
				String[] ibm = {
								"Research Scientist",
								"Quantum Computing Engineer",
								"Mainframe Specialist",
								"Hybrid Cloud Engineer",
								"AI Research Engineer",
								"Blockchain Consultant",
								"Technical Support Engineer",
								"Systems Consultant",
								"RedHat Engineer",
								"Middleware Specialist",
								"IT Architect",
								"Storage Engineer",
								"Network Security Engineer",
								"Cognitive Developer",
								"Data Governance Analyst",
								"Cloud Integration Specialist",
								"Enterprise Support Engineer",
								"Application Architect",
								"DevOps Specialist",
								"IT Operations Analyst"
								};
				return ibm;
		}else if(companyName == "oracle"){
				String[] oracle = {
								"Oracle DBA",
								"PL/SQL Developer",
								"ERP Consultant",
								"Fusion Developer",
								"Java EE Developer",
								"Cloud Infrastructure Engineer",
								"Middleware Engineer",
								"PeopleSoft Developer",
								"Financial Systems Analyst",
								"Technical Support Analyst",
								"Application Engineer",
								"Data Center Engineer",
								"Security Architect",
								"CRM Consultant",
								"Performance Engineer",
								"Integration Architect",
								"Cloud Sales Engineer",
								"Product Specialist",
								"QA Specialist",
								"Release Manager"
								};
				return oracle;
		}else if(companyName == "accenture"){
				String[] accenture = {
									"Application Development Analyst",
									"Cloud Strategy Consultant",
									"Security Operations Analyst",
									"Automation Test Lead",
									"Digital Experience Designer",
									"Enterprise Technology Architect",
									"IT Risk Consultant",
									"SAP Functional Consultant",
									"Data Engineering Specialist",
									"AI Transformation Consultant",
									"Platform Support Engineer",
									"Agile Coach",
									"DevOps Transformation Lead",
									"ServiceNow Developer",
									"Business Process Consultant",
									"IT Governance Analyst",
									"API Developer",
									"Cloud Migration Consultant",
									"RPA Solution Architect",
									"Technology Delivery Lead"
									};
				return accenture ;
		}else if(companyName == "capgemini"){
				String[] capgemini = {
								"Software Consultant",
								"Infrastructure Support Engineer",
								"Salesforce Developer",
								"SAP ABAP Developer",
								"Cyber Security Consultant",
								"Automation Framework Engineer",
								"Cloud Native Developer",
								"Big Data Architect",
								"IT Compliance Analyst",
								"Digital Marketing Technologist",
								"Test Automation Engineer",
								"Network Operations Engineer",
								"Power BI Consultant",
								"Data Quality Analyst",
								"Scrum Master",
								"Technical Delivery Manager",
								"UX Strategist",
								"IT Service Analyst",
								"Enterprise Application Developer",
								"Cloud Security Consultant"
								};
				return capgemini;
		}else if(companyName == "cognizant"){
				String[] cognizant = {
									"Programmer Analyst",
									"Associate Projects",
									"Cloud Infrastructure Specialist",
									"Data Analytics Consultant",
									"Automation Engineer",
									"Healthcare IT Analyst",
									"Digital Engineering Lead",
									"IT Service Desk Engineer",
									"ERP Developer",
									"QA Automation Lead",
									"AI Data Trainer",
									"Web Content Engineer",
									"IT Support Consultant",
									"Systems Integration Engineer",
									"Release Train Engineer",
									"Microservices Developer",
									"Database Support Engineer",
									"IT Security Consultant",
									"Performance Testing Lead",
									"Solution Delivery Manager"
									};
				return cognizant;
		}else if(companyName == "hcl"){
				String[] hcl = {
								"Graduate Engineer Trainee",
								"IT Infrastructure Specialist",
								"Automation Testing Engineer",
								"Cloud Monitoring Engineer",
								"Service Delivery Manager",
								"Technical Support Analyst",
								"Embedded Software Developer",
								"IT Asset Manager",
								"Application Maintenance Engineer",
								"Data Center Support Engineer",
								"Network Monitoring Specialist",
								"SAP Technical Consultant",
								"CRM Functional Consultant",
								"QA Validation Engineer",
								"Linux Support Engineer",
								"PowerShell Developer",
								"IT Operations Manager",
								"API Integration Developer",
								"Business Intelligence Developer",
								"Cyber Threat Analyst"
								};
				return hcl;
		}else if(companyName == "techMahindra"){
				String[] techMahindra = {
									"Associate Software Engineer",
									"Telecom Network Engineer",
									"Cloud Platform Engineer",
									"Automation Consultant",
									"Java Microservices Developer",
									"ITSM Consultant",
									"Security Compliance Analyst",
									"AI Data Analyst",
									"RPA Developer",
									"IT Infrastructure Architect",
									"Testing Specialist",
									"IT Application Support Engineer",
									"Big Data Developer",
									"DevOps Automation Engineer",
									"ERP Functional Consultant",
									"UI Specialist",
									"IT Change Manager",
									"Data Governance Specialist",
									"Technical Support Manager",
									"Digital Solutions Architect"
									};
				return techMahindra;
		}else if(companyName == "deloitte"){
				String[] deloitte = {
									"Risk Advisory Analyst",
									"Cyber Risk Consultant",
									"Data Strategy Consultant",
									"IT Audit Analyst",
									"Cloud Advisory Specialist",
									"Business Technology Analyst",
									"Analytics Consultant",
									"ERP Transformation Lead",
									"IT Compliance Consultant",
									"AI Strategy Consultant",
									"Digital Forensics Analyst",
									"Application Security Engineer",
									"Technology Risk Manager",
									"Process Automation Consultant",
									"IT Governance Consultant",
									"Enterprise Data Architect",
									"Technical Project Consultant",
									"Innovation Specialist",
									"IT Financial Analyst",
									"Cloud Transformation Manager"
									};
				return deloitte;
		}else if(companyName == "pwc"){
				String[] pwc = {
							"Technology Consultant",
							"Digital Assurance Analyst",
							"IT Risk Analyst",
							"Cyber Security Consultant",
							"Data & Analytics Consultant",
							"Cloud Solutions Specialist",
							"Enterprise Applications Consultant",
							"Business Intelligence Architect",
							"IT Controls Specialist",
							"Digital Transformation Consultant",
							"Automation Consultant",
							"Security Testing Analyst",
							"IT Strategy Advisor",
							"Data Migration Consultant",
							"ERP Implementation Specialist",
							"Technical Compliance Manager",
							"AI Risk Analyst",
							"IT Performance Analyst",
							"Infrastructure Consultant",
							"Technology Governance Lead"
							};
				return pwc;
		}else if(companyName == "ey"){
				String[] ey = {
							"Technology Risk Consultant",
							"Digital Innovation Analyst",
							"Cloud Advisory Consultant",
							"Data Science Consultant",
							"Cyber Security Analyst",
							"IT Audit Consultant",
							"AI Implementation Specialist",
							"Blockchain Consultant",
							"ERP Systems Consultant",
							"Automation Lead",
							"IT Infrastructure Advisor",
							"Analytics Engineer",
							"Technical Risk Manager",
							"Security Architecture Consultant",
							"DevOps Advisory Specialist",
							"IT Compliance Manager",
							"Cloud Security Architect",
							"Enterprise Risk Analyst",
							"Digital Strategy Consultant",
							"IT Advisory Manager"
							};
				return ey;
		}else if(companyName == "kpmg"){
				String[] kpmg = {
								"IT Advisory Analyst",
								"Cyber Defense Consultant",
								"Cloud Risk Specialist",
								"Data Governance Consultant",
								"Technology Risk Advisor",
								"Digital Assurance Consultant",
								"ERP Risk Analyst",
								"Information Security Consultant",
								"Analytics Advisory Specialist",
								"IT Compliance Analyst",
								"Business Technology Consultant",
								"Automation Risk Consultant",
								"IT Infrastructure Advisor",
								"Cloud Audit Manager",
								"Data Privacy Consultant",
								"IT Controls Manager",
								"AI Governance Specialist",
								"Technology Transformation Lead",
								"Security Audit Analyst",
								"Enterprise Risk Consultant"
								};
				return kpmg;
		}else if(companyName == "zoho"){
				String[] zoho = {
								"Web Application Developer",
								"CRM Developer",
								"Technical Support Engineer",
								"Full Stack Engineer",
								"QA Automation Engineer",
								"Mobile App Engineer",
								"Product Support Specialist",
								"Cloud Applications Developer",
								"Security Analyst",
								"DevOps Specialist",
								"UI Designer",
								"Database Engineer",
								"Performance Test Engineer",
								"Backend API Developer",
								"Frontend Engineer",
								"Product Analyst",
								"Systems Engineer",
								"Technical Evangelist",
								"Software Architect",
								"Customer Success Engineer"
								};
				return zoho;
		}else if(companyName == "flipkart"){
				String[] flipkart = {
								"E-Commerce Analyst",
								"Catalog Management Executive",
								"Supply Chain Analyst",
								"Warehouse Operations Manager",
								"Frontend Commerce Developer",
								"Backend Commerce Engineer",
								"Payment Gateway Specialist",
								"Logistics Technology Engineer",
								"Fraud Detection Analyst",
								"Growth Product Manager",
								"Marketplace Seller Support",
								"Data Platform Engineer",
								"Mobile Commerce Developer",
								"Recommendation Systems Engineer",
								"Pricing Analyst",
								"Business Intelligence Developer",
								"Cloud Operations Engineer",
								"Automation Test Engineer",
								"UX Research Analyst",
								"Retail Technology Architect"
								};
				return flipkart;
		}else if(companyName == "paytm"){
				String[] paytm = {
								"FinTech Developer",
								"Payment Systems Engineer",
								"KYC Verification Analyst",
								"Fraud Risk Manager",
								"UPI Integration Developer",
								"Mobile Wallet Engineer",
								"Backend API Engineer",
								"Frontend UI Developer",
								"Digital Banking Analyst",
								"Security Operations Engineer",
								"Compliance Officer",
								"Data Analytics Engineer",
								"DevOps FinTech Specialist",
								"Blockchain Payments Developer",
								"Technical Support Executive",
								"CRM Operations Manager",
								"Cloud FinOps Analyst",
								"Transaction Monitoring Specialist",
								"AI Risk Modeler",
								"Product Growth Manager"
								};
				return paytm;
		}else if(companyName == "phonePe"){
				String[] phonePe = {
								"UPI Platform Engineer",
								"Payments QA Engineer",
								"Fraud Analytics Specialist",
								"Merchant Integration Developer",
								"Android Payments Developer",
								"iOS FinTech Developer",
								"Security Compliance Analyst",
								"Data Insights Manager",
								"Transaction Risk Engineer",
								"Platform Reliability Engineer",
								"Cloud Infrastructure Engineer",
								"AML Analyst",
								"Backend Microservices Developer",
								"Product Operations Analyst",
								"FinTech Data Scientist",
								"Customer Trust Specialist",
								"Digital Wallet Architect",
								"Automation Engineer",
								"Financial Systems Developer",
								"Technical Program Lead"
								};
				return phonePe;
		}else if(companyName == "swiggy"){
				String[] swiggy = {
								"Food Delivery Operations Manager",
								"Logistics Optimization Engineer",
								"Route Planning Analyst",
								"Restaurant Onboarding Executive",
								"Mobile App Backend Developer",
								"Frontend Ordering Engineer",
								"Recommendation Algorithm Engineer",
								"Delivery Partner Support Lead",
								"Supply Chain Data Analyst",
								"Cloud Kitchen Operations Head",
								"DevOps Delivery Engineer",
								"Growth Hacker",
								"UX Designer – Food Apps",
								"Performance Marketing Analyst",
								"Business Strategy Analyst",
								"Inventory Systems Developer",
								"AI Demand Forecast Engineer",
								"Platform QA Engineer",
								"Payment Integration Engineer",
								"Customer Experience Manager"
								};
				return swiggy;
		}else if(companyName == "zomato"){
				String[] zomato = {
								"Restaurant Data Analyst",
								"Food Tech Backend Engineer",
								"Delivery Fleet Manager",
								"Mobile Ordering Developer",
								"Ad Sales Executive",
								"Growth Marketing Manager",
								"Food Quality Auditor",
								"Menu Intelligence Analyst",
								"Cloud Infrastructure Specialist",
								"Frontend React Engineer",
								"AI Personalization Engineer",
								"Supply Operations Analyst",
								"Vendor Relations Manager",
								"Logistics Systems Developer",
								"Security Engineer – Payments",
								"Automation QA Lead",
								"Product Strategy Analyst",
								"Big Data Engineer",
								"Customer Insights Manager",
								"Operations Excellence Head"
								};
				return zomato;
		}else if(companyName == "byjus"){
				String[] byjus = {
								"E-Learning Content Developer",
								"EdTech Backend Engineer",
								"Learning Experience Designer",
								"Curriculum Specialist",
								"Student Success Manager",
								"Mobile Learning App Developer",
								"Cloud LMS Engineer",
								"Data Analytics – Education",
								"AI Adaptive Learning Engineer",
								"QA Engineer – EdTech",
								"Product Growth Analyst",
								"CRM Support Executive",
								"Sales Operations Manager",
								"Digital Marketing Executive",
								"Instructional Designer",
								"Platform Reliability Engineer",
								"Video Production Specialist",
								"Assessment Systems Developer",
								"Academic Counselor",
								"Technology Program Manager"
								};
				return byjus;
		}else if(companyName == "unacademy"){
				String[] unacademy = {
									"Live Streaming Engineer",
									"Course Content Manager",
									"Backend Education Developer",
									"Frontend Learning Platform Engineer",
									"Mobile App Education Developer",
									"AI Tutor Development Engineer",
									"Student Engagement Analyst",
									"Subscription Growth Manager",
									"Cloud Education Architect",
									"Performance Testing Engineer",
									"Academic Operations Manager",
									"Security Engineer – EdTech",
									"Analytics Product Manager",
									"QA Automation Engineer",
									"Curriculum Planner",
									"Digital Campaign Manager",
									"User Experience Researcher",
									"Learning Data Scientist",
									"Community Manager",
									"Platform Support Engineer"
									};
				return unacademy;
		}else if(companyName == "dell"){
				String[] dell = {
								"Hardware Design Engineer",
								"Firmware Developer",
								"Technical Support Specialist",
								"Cloud Infrastructure Architect",
								"Storage Solutions Engineer",
								"Network Solutions Engineer",
								"Cybersecurity Consultant",
								"Enterprise Sales Engineer",
								"Data Center Engineer",
								"Systems Integration Specialist",
								"Product Lifecycle Manager",
								"Server Configuration Specialist",
								"IT Field Engineer",
								"Embedded Systems Developer",
								"Automation Systems Engineer",
								"Cloud Migration Specialist",
								"AI Hardware Researcher",
								"Technical Account Manager",
								"Quality Assurance Engineer",
								"IT Solutions Architect"
								};
				return dell;
		}else if(companyName == "hp"){
				String[] hp = {
							"Printer Firmware Engineer",
							"PC Hardware Engineer",
							"Device Driver Developer",
							"Cloud Print Services Engineer",
							"IT Support Analyst",
							"Cybersecurity Architect",
							"Data Center Operations Engineer",
							"Embedded Systems Engineer",
							"Technical Support Executive",
							"UX Designer – Devices",
							"Supply Chain Systems Analyst",
							"Automation Test Specialist",
							"Product Development Engineer",
							"Salesforce CRM Developer",
							"Big Data Infrastructure Engineer",
							"AI Device Researcher",
							"Manufacturing Systems Engineer",
							"Network Security Specialist",
							"Cloud Systems Administrator",
							"Technical Project Lead"
							};
				return hp;
		}else if(companyName == "intel"){
				String[] intel = {
								"Chip Design Engineer",
								"Semiconductor Process Engineer",
								"Embedded Firmware Developer",
								"AI Hardware Engineer",
								"GPU Performance Engineer",
								"Silicon Validation Engineer",
								"Processor Architecture Engineer",
								"Device Driver Engineer",
								"Cloud Data Center Engineer",
								"Cybersecurity Hardware Specialist",
								"Automation Manufacturing Engineer",
								"Testing and Verification Engineer",
								"Machine Learning Hardware Developer",
								"Compiler Engineer",
								"FPGA Engineer",
								"Systems Software Engineer",
								"High Performance Computing Engineer",
								"Microarchitecture Researcher",
								"Network Acceleration Engineer",
								"Technical Solutions Architect"
								};
				return intel;
		}else if(companyName == "nvidia"){
				String[] nvidia = {
								"GPU Software Engineer",
								"CUDA Developer",
								"Deep Learning Engineer",
								"Computer Vision Engineer",
								"Graphics Driver Developer",
								"AI Research Scientist",
								"Autonomous Vehicle Engineer",
								"Performance Optimization Engineer",
								"Chip Verification Engineer",
								"Parallel Computing Engineer",
								"Robotics AI Engineer",
								"Cloud GPU Architect",
								"Simulation Engineer",
								"Embedded AI Developer",
								"High Performance Computing Engineer",
								"Neural Network Engineer",
								"Data Center GPU Specialist",
								"Firmware Engineer",
								"Hardware Validation Engineer",
								"AI Framework Developer"
								};
				return nvidia;
		}else if(companyName == "amd"){
				String[] amd = {
							"Processor Design Engineer",
							"GPU Architecture Engineer",
							"Silicon Validation Engineer",
							"Firmware Developer",
							"Embedded Systems Engineer",
							"Compiler Optimization Engineer",
							"Hardware Test Engineer",
							"Semiconductor Process Developer",
							"Performance Benchmark Analyst",
							"Device Driver Engineer",
							"Systems Software Engineer",
							"FPGA Developer",
							"Power Management Engineer",
							"Chip Packaging Engineer",
							"Microprocessor Engineer",
							"Hardware Security Engineer",
							"AI Acceleration Engineer",
							"Manufacturing Engineer",
							"Reliability Engineer",
							"Technical Product Engineer"
							};
				return amd;
		}else if(companyName == "cisco"){
				String[] cisco = {
								"Network Engineer",
								"Routing Protocol Specialist",
								"Cybersecurity Engineer",
								"Cloud Networking Architect",
								"VoIP Engineer",
								"Wireless Network Engineer",
								"Firewall Security Analyst",
								"Data Center Network Engineer",
								"Network Automation Developer",
								"Technical Support Engineer",
								"DevNet Developer",
								"Security Operations Analyst",
								"Infrastructure Architect",
								"IoT Network Engineer",
								"Systems Integration Engineer",
								"Enterprise Solutions Architect",
								"Network Performance Engineer",
								"Cloud Security Engineer",
								"Software Defined Network Engineer",
								"Technical Consulting Engineer"
								};
				return cisco;
		}else if(companyName == "sap"){
				String[] sap = {
								"SAP ABAP Developer",
								"SAP HANA Consultant",
								"SAP FICO Consultant",
								"SAP MM Consultant",
								"SAP SD Consultant",
								"SAP Basis Administrator",
								"SAP UI5 Developer",
								"SAP Cloud Platform Engineer",
								"SAP Data Migration Specialist",
								"SAP Security Consultant",
								"SAP Analytics Consultant",
								"SAP Integration Developer",
								"SAP Ariba Consultant",
								"SAP SuccessFactors Specialist",
								"SAP S/4HANA Developer",
								"SAP Technical Architect",
								"SAP Testing Consultant",
								"SAP Solution Manager",
								"SAP Business Analyst",
								"SAP Cloud Integration Engineer"
								};
				return sap;
		}else if(companyName == "siemens"){
				String[] siemens = {
								"Industrial Automation Engineer",
								"PLC Programmer",
								"SCADA Engineer",
								"Embedded Systems Developer",
								"Power Systems Engineer",
								"Electrical Design Engineer",
								"IoT Solutions Engineer",
								"Smart Grid Specialist",
								"Control Systems Engineer",
								"Robotics Engineer",
								"Mechanical Design Engineer",
								"Digital Twin Engineer",
								"Manufacturing Process Engineer",
								"Energy Systems Analyst",
								"Industrial Cybersecurity Engineer",
								"Software Engineer – Automation",
								"Product Lifecycle Engineer",
								"Testing & Commissioning Engineer",
								"Rail Systems Engineer",
								"AI Industrial Solutions Developer"
								};
				return siemens;
		}else if(companyName == "bosch"){
				String[] bosch = {
								"Automotive Software Engineer",
								"Embedded C Developer",
								"ADAS Engineer",
								"Powertrain Engineer",
								"IoT Firmware Developer",
								"Industrial Automation Specialist",
								"Robotics Software Engineer",
								"Mechanical Design Engineer",
								"Quality Control Engineer",
								"AI Automotive Researcher",
								"Systems Integration Engineer",
								"Cybersecurity Engineer – Automotive",
								"Sensor Development Engineer",
								"Manufacturing Automation Engineer",
								"Technical Sales Engineer",
								"Cloud IoT Architect",
								"Testing Validation Engineer",
								"Control Systems Engineer",
								"Electrical Systems Engineer",
								"Product Development Engineer"
								};
				return bosch;
		}else if(companyName == "mindtree"){
				String[] mindtree = {
									"Digital Transformation Engineer",
									"Cloud Native Developer",
									"React JS Developer",
									"NodeJS Backend Engineer",
									"Data Engineering Consultant",
									"Automation QA Engineer",
									"DevOps Cloud Engineer",
									"Cybersecurity Consultant",
									"IT Service Management Analyst",
									"AI/ML Developer",
									"Salesforce Consultant",
									"ServiceNow Specialist",
									"UI/UX Designer",
									"Business Process Analyst",
									"Microservices Architect",
									"Platform Support Engineer",
									"Testing Automation Lead",
									"Infrastructure Consultant",
									"IT Delivery Manager",
									"Data Governance Engineer"
									};
				return mindtree;
		}else if(companyName == "mphasis"){
				String[] mphasis = {
								"Cloud Transformation Engineer",
								"Java Spring Boot Developer",
								"Testing Specialist",
								"Digital Risk Analyst",
								"DevSecOps Engineer",
								"IT Infrastructure Specialist",
								"Automation Consultant",
								"Data Science Engineer",
								"Full Stack Consultant",
								"AI Chatbot Developer",
								"Business Intelligence Engineer",
								"Cyber Risk Analyst",
								"Cloud Platform Engineer",
								"Application Support Analyst",
								"IT Governance Specialist",
								"API Integration Engineer",
								"Technical Delivery Lead",
								"ERP Implementation Engineer",
								"Performance Testing Engineer",
								"IT Operations Specialist"
								};
				return mphasis;
		}else if(companyName == "hexaware"){
				String[] hexaware = {
									"Digital Solutions Engineer",
									"Cloud Operations Specialist",
									"Automation Framework Developer",
									"Testing Engineer",
									"Cybersecurity Analyst",
									"Java Microservices Developer",
									"AI Analytics Engineer",
									"Big Data Consultant",
									"IT Infrastructure Manager",
									"Business Systems Analyst",
									"Data Quality Engineer",
									"DevOps Automation Engineer",
									"UI Frontend Engineer",
									"Mobile App QA Engineer",
									"Technical Consultant",
									"ERP Functional Specialist",
									"ITSM Process Analyst",
									"Cloud Security Analyst",
									"Application Migration Engineer",
									"Scrum Master"
									};
				return hexaware;
		}else if(companyName == "persistentSystems"){
				String[] persistentSystems = {
											"Product Engineering Developer",
											"Cloud SaaS Engineer",
											"AI Research Developer",
											"Data Platform Engineer",
											"Microservices Specialist",
											"Automation Testing Engineer",
											"DevOps Platform Engineer",
											"Cybersecurity Specialist",
											"Full Stack Engineer",
											"Blockchain Developer",
											"Mobile App Architect",
											"UX Engineer",
											"API Developer",
											"Digital Banking Engineer",
											"Big Data Platform Architect",
											"Cloud Migration Architect",
											"Technical Support Engineer",
											"IT Delivery Manager",
											"Machine Learning Researcher",
											"Enterprise Application Engineer"
											};
				return persistentSystems;
		}else if(companyName == "nokia"){
				String[] nokia = {
								"Telecom Software Engineer",
								"5G Network Engineer",
								"Radio Frequency Engineer",
								"Core Network Specialist",
								"Cloud RAN Engineer",
								"Telecom Protocol Developer",
								"Network Planning Engineer",
								"OSS/BSS Developer",
								"Transmission Engineer",
								"Telecom Security Analyst",
								"Embedded Telecom Developer",
								"Network Automation Engineer",
								"Systems Validation Engineer",
								"Wireless Testing Engineer",
								"IP Networking Engineer",
								"Telecom Data Analyst",
								"Fiber Network Engineer",
								"Field Support Engineer",
								"Telecom Solutions Architect",
								"Performance Optimization Engineer"
								};
				return nokia;
		}else if(companyName == "ericsson"){
				String[] ericsson = {
								"LTE Engineer",
								"5G Core Developer",
								"Telecom Integration Engineer",
								"Network Deployment Specialist",
								"Cloud Packet Core Engineer",
								"Telecom Operations Analyst",
								"RAN Optimization Engineer",
								"Network Security Consultant",
								"Service Delivery Engineer",
								"Telecom Software Tester",
								"Protocol Stack Developer",
								"IP Transport Engineer",
								"Telecom Project Manager",
								"Microwave Planning Engineer",
								"Support Operations Specialist",
								"Telecom Infrastructure Engineer",
								"Automation Telecom Engineer",
								"Telecom Architect",
								"Network Analytics Engineer",
								"Customer Solutions Engineer"
								};
				return ericsson;
		}else if(companyName == "qualcomm"){
				String[] qualcomm = {
									"Chipset Engineer",
									"Wireless Modem Developer",
									"Embedded DSP Engineer",
									"RF Systems Engineer",
									"Bluetooth Protocol Engineer",
									"WiFi Firmware Engineer",
									"Mobile Processor Engineer",
									"Semiconductor Validation Engineer",
									"5G Systems Engineer",
									"Power Optimization Engineer",
									"Camera Software Engineer",
									"AI Edge Computing Engineer",
									"Hardware Security Engineer",
									"Linux Kernel Developer",
									"System Performance Engineer",
									"Firmware Testing Engineer",
									"ASIC Design Engineer",
									"Chip Architecture Researcher",
									"Signal Processing Engineer",
									"Mobile Systems Architect"
									};
				return qualcomm;
		}else if(companyName == "broadcom"){
				String[] broadcom = {
								"ASIC Verification Engineer",
								"Network Switching Engineer",
								"Broadband Systems Engineer",
								"Storage Controller Developer",
								"RFIC Engineer",
								"Chip Validation Specialist",
								"Hardware Debug Engineer",
								"PCIe Systems Engineer",
								"Data Center Networking Engineer",
								"Security Silicon Engineer",
								"Embedded Firmware Developer",
								"Signal Integrity Engineer",
								"Power Electronics Engineer",
								"Driver Development Engineer",
								"Semiconductor Packaging Engineer",
								"EDA Tools Engineer",
								"Network Firmware Engineer",
								"Cloud Silicon Architect",
								"Testing Automation Engineer",
								"Technical Applications Engineer"
								};
				return broadcom;
		}else if(companyName == "micron"){
				String[] micron = {
							"Memory Design Engineer",
							"DRAM Process Engineer",
							"NAND Flash Developer",
							"Semiconductor Equipment Engineer",
							"Yield Enhancement Engineer",
							"Reliability Testing Engineer",
							"Process Integration Engineer",
							"Packaging Development Engineer",
							"Quality Assurance Engineer",
							"Manufacturing Systems Engineer",
							"Product Engineering Specialist",
							"Firmware Developer – Storage",
							"Data Center Memory Engineer",
							"Failure Analysis Engineer",
							"Test Development Engineer",
							"Automation Manufacturing Engineer",
							"Supply Chain Planner",
							"Production Support Engineer",
							"Electrical Characterization Engineer",
							"Technology Development Engineer"
							};
				return micron;
		}else if(companyName == "uber"){
				String[] uber = {
							"Ride Matching Algorithm Engineer",
							"Backend Platform Engineer",
							"Frontend Web Engineer",
							"Android App Developer",
							"iOS Mobility Developer",
							"Mapping Data Engineer",
							"Logistics Operations Analyst",
							"Safety Systems Engineer",
							"Fraud Detection Specialist",
							"Cloud Infrastructure Engineer",
							"Payment Integration Engineer",
							"Growth Product Manager",
							"Driver Experience Analyst",
							"DevOps Reliability Engineer",
							"Machine Learning Platform Engineer",
							"Data Visualization Engineer",
							"Autonomous Driving Engineer",
							"Business Intelligence Analyst",
							"Customer Support Technology Lead",
							"Marketplace Optimization Engineer"
							};
				return uber;
		}else if(companyName == "ola"){
				String[] ola = {
								"Mobility Platform Developer",
								"Fleet Operations Manager",
								"Ride Allocation Engineer",
								"EV Systems Engineer",
								"Driver Support Executive",
								"Payment Gateway Developer",
								"Cloud Mobility Architect",
								"Safety Monitoring Analyst",
								"Data Science Engineer",
								"Mobile Application Engineer",
								"Backend Microservices Engineer",
								"Fraud Risk Analyst",
								"Growth Strategy Analyst",
								"Logistics Planning Engineer",
								"Automation QA Engineer",
								"EV Charging Infrastructure Engineer",
								"Platform Security Engineer",
								"Customer Experience Manager",
								"AI Route Optimization Engineer",
								"Business Operations Analyst"
								};
				return ola;
		}else if(companyName == "airbnb"){
				String[] airbnb = {
									"Hospitality Platform Engineer",
									"Frontend Booking Developer",
									"Backend Search Engineer",
									"Trust & Safety Analyst",
									"Pricing Algorithm Engineer",
									"Cloud Infrastructure Architect",
									"UX Researcher – Travel",
									"Data Science – Hospitality",
									"Mobile App Booking Developer",
									"Host Success Manager",
									"Revenue Optimization Analyst",
									"Security Engineer – Platform",
									"Fraud Prevention Specialist",
									"DevOps Cloud Engineer",
									"Product Growth Strategist",
									"Localization Engineer",
									"Marketplace Data Analyst",
									"Automation Testing Engineer",
									"Customer Experience Engineer",
									"Travel Experience Designer"
									};
				return airbnb;
		}else if(companyName == "netflix"){
				String[] netflix = {
								"Streaming Platform Engineer",
								"Video Encoding Engineer",
								"Content Delivery Network Engineer",
								"Recommendation Algorithm Engineer",
								"Backend Java Engineer",
								"Frontend React Developer",
								"Data Engineering Specialist",
								"Cloud Infrastructure Engineer",
								"DevOps Streaming Engineer",
								"Security Engineer – Media",
								"Content Analytics Manager",
								"UI Platform Developer",
								"Media Systems Architect",
								"Machine Learning Engineer – Personalization",
								"Playback Optimization Engineer",
								"Site Reliability Engineer",
								"Product Analytics Specialist",
								"Automation Test Engineer",
								"Digital Rights Engineer",
								"Globalization Engineer"
								};
				return netflix;
		}else if(companyName == "spotify"){
				String[] spotify = {
								"Audio Streaming Engineer",
								"Music Recommendation Engineer",
								"Backend Kotlin Developer",
								"Frontend Web Player Developer",
								"Data Platform Engineer",
								"DevOps Cloud Specialist",
								"Podcast Platform Engineer",
								"Audio ML Engineer",
								"Content Licensing Analyst",
								"Security Engineer – Streaming",
								"Mobile Music App Developer",
								"Search Optimization Engineer",
								"UX Designer – Media",
								"Analytics Product Manager",
								"Streaming Infrastructure Engineer",
								"Automation QA Specialist",
								"Growth Marketing Analyst",
								"AI Personalization Scientist",
								"Platform Reliability Engineer",
								"Digital Media Architect"
								};
				return spotify;
		}else if(companyName == "samsung"){
				String[] samsung = {
								"Android Firmware Engineer",
								"Semiconductor Design Engineer",
								"Display Technology Engineer",
								"Embedded Systems Developer",
								"5G Device Engineer",
								"AI Research Engineer",
								"Camera Algorithm Engineer",
								"Hardware Validation Engineer",
								"Consumer Electronics Designer",
								"IoT Platform Engineer",
								"Mobile UI Developer",
								"Cloud Services Engineer",
								"Chipset Verification Engineer",
								"Battery Technology Engineer",
								"Smart TV Software Engineer",
								"Cybersecurity Engineer",
								"Manufacturing Automation Engineer",
								"Product Innovation Manager",
								"Data Analytics Engineer",
								"Technical Support Specialist"
								};
				return samsung;
		}else if(companyName == "sony"){
				String[] sony = {
								"Game Engine Developer",
								"PlayStation Systems Engineer",
								"Audio Signal Processing Engineer",
								"Camera Firmware Developer",
								"Media Streaming Engineer",
								"Visual Effects Engineer",
								"Embedded Hardware Engineer",
								"AR/VR Developer",
								"Cloud Gaming Engineer",
								"Product Design Engineer",
								"AI Imaging Engineer",
								"Cybersecurity Specialist",
								"Mobile App Developer",
								"Data Science Analyst",
								"Automation QA Engineer",
								"UI/UX Designer",
								"Network Infrastructure Engineer",
								"Technical Program Manager",
								"Electronics Testing Engineer",
								"Digital Media Architect"
								};
				return sony;
		}else if(companyName == "panasonic"){
				String[] panasonic = {
								"Consumer Electronics Engineer",
								"Embedded C Developer",
								"Automotive Systems Engineer",
								"Battery Systems Engineer",
								"Industrial Automation Engineer",
								"IoT Firmware Developer",
								"Energy Solutions Engineer",
								"Mechanical Design Engineer",
								"Quality Assurance Engineer",
								"Cloud Integration Engineer",
								"Manufacturing Process Engineer",
								"AI Smart Device Developer",
								"Testing Validation Engineer",
								"Electrical Systems Engineer",
								"Product Lifecycle Manager",
								"Robotics Engineer",
								"Power Electronics Engineer",
								"Technical Sales Engineer",
								"Data Analytics Specialist",
								"Control Systems Engineer"
								};
				return panasonic;
		}else if(companyName == "lg"){
				String[] lg = {
							"Smart Appliance Engineer",
							"Display Panel Engineer",
							"Mobile Software Developer",
							"IoT Solutions Architect",
							"Embedded Firmware Engineer",
							"AI Home Automation Engineer",
							"Cloud Backend Developer",
							"UX Designer – Smart Devices",
							"Quality Testing Engineer",
							"Electronics Hardware Engineer",
							"Product Innovation Engineer",
							"Manufacturing Automation Specialist",
							"Battery Technology Engineer",
							"Network Connectivity Engineer",
							"Security Systems Engineer",
							"Technical Support Engineer",
							"Big Data Engineer",
							"Systems Integration Engineer",
							"Energy Management Engineer",
							"Platform Reliability Engineer"
							};
				return lg;
		}else if(companyName == "relianceJio"){
				String[] relianceJio = {
								"Telecom Network Engineer",
								"Fiber Deployment Engineer",
								"5G Infrastructure Specialist",
								"Cloud Platform Engineer",
								"Digital Services Developer",
								"OSS/BSS Engineer",
								"Network Operations Analyst",
								"Telecom Security Engineer",
								"Data Center Specialist",
								"Backend API Developer",
								"Mobile Network Planner",
								"Customer Support Technology Lead",
								"AI Network Optimization Engineer",
								"DevOps Telecom Engineer",
								"Billing Systems Analyst",
								"IT Infrastructure Manager",
								"Technical Field Engineer",
								"Telecom Project Coordinator",
								"Automation Network Engineer",
								"Solutions Architect"
								};
				return relianceJio;
		}else if(companyName == "airtel"){
				String[] airtel = {
							"Telecom Systems Engineer",
							"LTE Optimization Engineer",
							"Network Performance Analyst",
							"Fiber Network Specialist",
							"Cloud Infrastructure Engineer",
							"Security Operations Analyst",
							"OSS Developer",
							"Billing Platform Engineer",
							"Data Analytics Manager",
							"Field Operations Engineer",
							"IP Network Engineer",
							"Telecom Automation Specialist",
							"Customer Experience Analyst",
							"Mobile Core Network Engineer",
							"DevOps Telecom Specialist",
							"Technical Support Executive",
							"AI Traffic Prediction Engineer",
							"Telecom Architect",
							"Integration Engineer",
							"Enterprise Solutions Manager"
							};
				return airtel;
		}else if(companyName == "vodafone"){
				String[] vodafone = {
								"Telecom Infrastructure Engineer",
								"5G Deployment Engineer",
								"Cloud Services Architect",
								"Network Security Specialist",
								"Data Governance Analyst",
								"Billing Systems Developer",
								"Customer Care Technology Lead",
								"Mobile Core Engineer",
								"Telecom Integration Engineer",
								"IP Routing Engineer",
								"OSS Support Engineer",
								"Digital Transformation Manager",
								"Automation QA Engineer",
								"AI Network Engineer",
								"Field Technical Engineer",
								"Business Intelligence Analyst",
								"DevOps Infrastructure Engineer",
								"Telecom Solutions Consultant",
								"Risk Compliance Analyst",
								"Enterprise Connectivity Engineer"
								};
				return vodafone;
		}else if(companyName == "payPal"){
				String[] payPal = {
							"FinTech Backend Engineer",
							"Payment Gateway Architect",
							"Fraud Detection Analyst",
							"Security Compliance Engineer",
							"Cloud Infrastructure Specialist",
							"Mobile Wallet Developer",
							"Data Science Engineer",
							"DevOps Reliability Engineer",
							"API Integration Specialist",
							"Financial Systems Analyst",
							"Risk Modeling Engineer",
							"Product Growth Analyst",
							"Blockchain Payments Engineer",
							"Automation QA Engineer",
							"Cybersecurity Architect",
							"UI/UX Designer – FinTech",
							"Transaction Monitoring Specialist",
							"Cloud FinOps Analyst",
							"Technical Program Manager",
							"Digital Banking Engineer"
							};
				return payPal;
		}else if(companyName == "visa"){
				String[] visa = {
								"Payment Processing Engineer",
								"Cybersecurity Analyst",
								"Fraud Risk Specialist",
								"Cloud Platform Architect",
								"Transaction Systems Developer",
								"Data Analytics Engineer",
								"DevSecOps Engineer",
								"Blockchain Solutions Engineer",
								"Financial Software Developer",
								"Security Compliance Manager",
								"Backend API Engineer",
								"Mobile Payments Developer",
								"Risk Assessment Analyst",
								"Automation Testing Engineer",
								"AI Fraud Detection Engineer",
								"Product Strategy Manager",
								"Cloud Security Engineer",
								"Technical Account Manager",
								"Enterprise Solutions Architect",
								"Digital Payments Analyst"
								};
				return visa;
		}else if(companyName == "mastercard"){
				String[] mastercard = {
									"Global Payments Engineer",
									"Financial Systems Architect",
									"Fraud Analytics Engineer",
									"Cyber Risk Specialist",
									"Cloud Native Developer",
									"Transaction Monitoring Engineer",
									"API Platform Developer",
									"Security Testing Engineer",
									"Data Governance Manager",
									"DevOps Cloud Engineer",
									"Digital Banking Consultant",
									"Mobile Wallet Architect",
									"Blockchain Research Engineer",
									"Automation QA Specialist",
									"AI Risk Modeling Engineer",
									"Backend Java Developer",
									"Product Innovation Manager",
									"Cloud Infrastructure Manager",
									"Compliance Technology Analyst",
									"Enterprise Integration Engineer"
									};
				return mastercard;
		}else if(companyName == "goldmanSachs"){
				String[] goldmanSachs = {
								"Quantitative Analyst",
								"Financial Software Engineer",
								"Risk Management Analyst",
								"Investment Banking Analyst",
								"Algorithmic Trading Developer",
								"Data Science – Finance",
								"Cybersecurity Risk Analyst",
								"Cloud Infrastructure Engineer",
								"Regulatory Compliance Analyst",
								"DevOps Engineer – Finance",
								"Blockchain Finance Engineer",
								"Financial Modeling Specialist",
								"UI Developer – Trading Platforms",
								"Backend Java Developer",
								"AI Risk Prediction Engineer",
								"Business Intelligence Analyst",
								"Capital Markets Technologist",
								"Automation QA Engineer",
								"Enterprise Architect",
								"Technology Program Manager"
								};
				return goldmanSachs;
		}else if(companyName == "jpmorgan"){
				String[] jpmorgan = {
									"Financial Technology Engineer",
									"Trading Systems Developer",
									"Credit Risk Analyst",
									"Cloud Security Engineer",
									"DevSecOps Engineer",
									"Data Platform Engineer",
									"Investment Analytics Developer",
									"Fraud Detection Engineer",
									"Banking Application Support",
									"Microservices Backend Developer",
									"UI Engineer – Banking",
									"Machine Learning Engineer – Finance",
									"IT Compliance Specialist",
									"Blockchain Developer",
									"Performance Testing Engineer",
									"Infrastructure Automation Engineer",
									"Digital Banking Architect",
									"Enterprise Data Analyst",
									"Technical Product Owner",
									"Cybersecurity Consultant"
									};
				return jpmorgan;
		}else if(companyName == "hsbc"){
				String[] hsbc = {
								"Banking Systems Analyst",
								"AML Compliance Specialist",
								"Digital Transformation Engineer",
								"Cloud Banking Architect",
								"Risk Analytics Engineer",
								"Data Governance Manager",
								"Fraud Investigation Analyst",
								"DevOps Banking Engineer",
								"IT Audit Specialist",
								"Mobile Banking Developer",
								"Backend Financial Engineer",
								"Cybersecurity Operations Analyst",
								"Payments Systems Engineer",
								"AI Credit Scoring Engineer",
								"Automation Testing Specialist",
								"Enterprise Solutions Architect",
								"Financial Reporting Analyst",
								"IT Infrastructure Lead",
								"Technical Support Engineer",
								"Banking Platform Developer"
								};
				return hsbc;
		}else if(companyName == "morganStanley"){
				String[] morganStanley = {
									"Equity Trading Technologist",
									"Investment Systems Developer",
									"Financial Data Engineer",
									"Risk Technology Analyst",
									"Cloud Platform Engineer",
									"Cyber Risk Consultant",
									"Algorithm Developer",
									"Capital Markets Analyst",
									"DevOps Finance Engineer",
									"RegTech Developer",
									"Backend C++ Developer",
									"Data Science – Investments",
									"Compliance Systems Analyst",
									"Automation QA Engineer",
									"Enterprise Architect – Finance",
									"UI Developer – Trading Desk",
									"Blockchain Finance Specialist",
									"Machine Learning Risk Analyst",
									"IT Governance Specialist",
									"Technology Project Lead"
									};
				return morganStanley;
		}else if(companyName == "citi"){
				String[] citi = {
								"Digital Banking Engineer",
								"Payment Processing Analyst",
								"Cloud Financial Engineer",
								"Fraud Risk Consultant",
								"Core Banking Developer",
								"Regulatory Reporting Analyst",
								"DevOps Cloud Engineer",
								"Cybersecurity Compliance Manager",
								"Financial Systems Architect",
								"Mobile Banking QA Engineer",
								"AI Fraud Detection Specialist",
								"Backend Microservices Developer",
								"Enterprise Data Architect",
								"Risk Analytics Manager",
								"Automation Test Lead",
								"IT Infrastructure Consultant",
								"Blockchain Banking Engineer",
								"API Platform Developer",
								"Product Strategy Analyst",
								"Technical Delivery Manager"
								};
				return citi;
		}else if(companyName == "barclays"){
				String[] barclays = {
									"Investment Technology Analyst",
									"Trading Platform Developer",
									"Cloud Security Architect",
									"Credit Risk Modeler",
									"DevOps Infrastructure Engineer",
									"Backend Financial Developer",
									"AML Systems Specialist",
									"Data Engineering Consultant",
									"AI Banking Engineer",
									"Regulatory Technology Analyst",
									"Automation QA Engineer",
									"Financial Reporting Developer",
									"UI Developer – Finance",
									"Enterprise Systems Architect",
									"Blockchain Developer – Banking",
									"IT Operations Manager",
									"Performance Testing Engineer",
									"Cyber Defense Analyst",
									"Digital Payments Engineer",
									"Technology Risk Manager"
									};
				return barclays;
		}else if(companyName == "standardChartered"){
				String[] standardChartered = {
										"Core Banking Engineer",
										"Financial Risk Analyst",
										"Digital Banking Developer",
										"Cloud Infrastructure Architect",
										"Cybersecurity Banking Specialist",
										"Regulatory Compliance Manager",
										"DevOps Banking Engineer",
										"AI Credit Risk Engineer",
										"Backend API Developer",
										"AML Monitoring Analyst",
										"Automation QA Engineer",
										"Enterprise Data Analyst",
										"Payments Systems Architect",
										"Blockchain Finance Developer",
										"IT Governance Manager",
										"Product Innovation Analyst",
										"Cloud Security Specialist",
										"Financial Data Scientist",
										"Technology Delivery Lead",
										"Mobile Banking Engineer"
										};
				return standardChartered;
		}else if(companyName == "deloitteDigital"){
				String[] deloitteDigital = {
									"Digital Experience Engineer",
									"Cloud Solutions Consultant",
									"UX Strategy Specialist",
									"Full Stack Consultant",
									"DevOps Cloud Engineer",
									"Cyber Risk Consultant",
									"Data Analytics Lead",
									"AI Innovation Engineer",
									"ERP Digital Specialist",
									"Automation Transformation Engineer",
									"API Integration Consultant",
									"Enterprise Architect",
									"Cloud Migration Lead",
									"Business Technology Advisor",
									"Security Architecture Consultant",
									"Mobile App Consultant",
									"Testing Automation Specialist",
									"Product Strategy Consultant",
									"Infrastructure Advisory Lead",
									"Digital Program Manager"
									};
				return deloitteDigital;
		}else if(companyName == "genpact"){
				String[] genpact = {
								"Business Process Analyst",
								"Digital Operations Engineer",
								"Data Analytics Consultant",
								"Automation RPA Developer",
								"Cloud Infrastructure Engineer",
								"Financial Systems Analyst",
								"AI Process Optimization Engineer",
								"Cybersecurity Consultant",
								"ERP Implementation Specialist",
								"Backend Application Developer",
								"DevOps Automation Engineer",
								"Risk & Compliance Analyst",
								"Business Intelligence Engineer",
								"IT Service Delivery Manager",
								"Automation QA Engineer",
								"Blockchain Operations Analyst",
								"API Integration Engineer",
								"Enterprise Systems Architect",
								"Technical Support Analyst",
								"Transformation Program Lead"
								};
				return genpact;
		}else if(companyName == "muSigma"){
				String[] muSigma = {
									"Decision Sciences Analyst",
									"Data Modeling Engineer",
									"Predictive Analytics Specialist",
									"Business Intelligence Consultant",
									"Machine Learning Engineer",
									"Data Visualization Expert",
									"Statistical Analyst",
									"Big Data Engineer",
									"Cloud Analytics Architect",
									"AI Research Analyst",
									"Marketing Analytics Specialist",
									"Risk Analytics Engineer",
									"Data Governance Consultant",
									"Automation Data Engineer",
									"Financial Analytics Consultant",
									"SQL Data Engineer",
									"Python Analytics Developer",
									"Customer Insights Analyst",
									"Operations Analytics Manager",
									"Analytics Delivery Lead"
									};
				return muSigma;
		}else if(companyName == "fractalAnalytics"){
				String[] fractalAnalytics = {
									"Data Science Consultant",
									"AI Research Engineer",
									"Machine Learning Architect",
									"Predictive Modeling Specialist",
									"Business Analytics Analyst",
									"Data Visualization Engineer",
									"Cloud Analytics Developer",
									"Marketing Analytics Consultant",
									"Risk Modeling Analyst",
									"Decision Science Engineer",
									"Big Data Platform Engineer",
									"AI Product Manager",
									"Statistical Modeling Expert",
									"Data Governance Analyst",
									"Automation Analytics Engineer",
									"Python Data Developer",
									"Customer Insights Specialist",
									"Financial Analytics Engineer",
									"Analytics Delivery Manager",
									"Data Engineering Consultant"
									};
				return fractalAnalytics;
		}else if(companyName == "tigerAnalytics"){
				String[] tigerAnalytics = {
									"Advanced Analytics Consultant",
									"Machine Learning Engineer",
									"Data Strategy Specialist",
									"Business Intelligence Developer",
									"AI Transformation Consultant",
									"Cloud Data Engineer",
									"Predictive Analytics Specialist",
									"Data Visualization Architect",
									"Statistical Data Scientist",
									"Marketing Analytics Engineer",
									"Retail Analytics Consultant",
									"Risk Analytics Specialist",
									"Automation Data Engineer",
									"Python ML Developer",
									"Data Governance Lead",
									"Big Data Architect",
									"Customer Data Analyst",
									"Operations Analytics Consultant",
									"AI Deployment Engineer",
									"Analytics Project Manager"
									};
				return tigerAnalytics;
		}else if(companyName == "harman"){
				String[] harman = {
									"Embedded Audio Engineer",
									"Automotive Software Developer",
									"IoT Systems Engineer",
									"Infotainment Systems Developer",
									"Cloud Connected Devices Engineer",
									"Cybersecurity Engineer – Automotive",
									"Android Automotive Developer",
									"Firmware Engineer",
									"Audio Signal Processing Engineer",
									"Vehicle Connectivity Specialist",
									"UX Designer – Automotive",
									"Testing & Validation Engineer",
									"AI Voice Assistant Developer",
									"Data Analytics Engineer",
									"Product Innovation Engineer",
									"Control Systems Engineer",
									"Bluetooth Integration Engineer",
									"Hardware Design Engineer",
									"Technical Program Manager",
									"Quality Assurance Engineer"
									};
				return harman;
		}else if(companyName == "honeywell"){
				String[] honeywell = {
									"Industrial Automation Engineer",
									"Aerospace Systems Engineer",
									"Embedded Systems Developer",
									"IoT Solutions Architect",
									"Control Systems Engineer",
									"Cybersecurity Engineer",
									"Mechanical Design Engineer",
									"Manufacturing Process Engineer",
									"Energy Systems Engineer",
									"AI Industrial Researcher",
									"Robotics Engineer",
									"Cloud Integration Specialist",
									"Electrical Systems Engineer",
									"Testing & Certification Engineer",
									"Safety Systems Engineer",
									"Data Analytics Engineer",
									"Product Lifecycle Manager",
									"Field Service Engineer",
									"Quality Assurance Specialist",
									"Technical Solutions Architect"
									};
				return honeywell;
		}else if(companyName == "abb"){
				String[] abb = {
								"Power Electronics Engineer",
								"Industrial Robotics Engineer",
								"Automation Systems Developer",
								"Smart Grid Engineer",
								"Electrical Design Specialist",
								"Embedded Firmware Engineer",
								"Control Systems Developer",
								"IoT Industrial Engineer",
								"Energy Management Analyst",
								"Cybersecurity Engineer – Industrial",
								"Mechanical Design Engineer",
								"PLC Programmer",
								"Digital Twin Engineer",
								"AI Industrial Solutions Developer",
								"Manufacturing Systems Engineer",
								"Testing Validation Engineer",
								"Cloud Energy Architect",
								"Product Development Engineer",
								"Field Application Engineer",
								"Technical Sales Engineer"
								};
				return abb;
		}else if(companyName == "schneiderElectric"){
				String[] schneiderElectric = {
										"Energy Automation Engineer",
										"Smart Building Systems Engineer",
										"Electrical Systems Architect",
										"IoT Energy Solutions Developer",
										"Power Systems Analyst",
										"Industrial Cybersecurity Engineer",
										"Embedded Systems Engineer",
										"Cloud Energy Platform Engineer",
										"PLC Control Engineer",
										"Sustainability Solutions Specialist",
										"Mechanical Systems Engineer",
										"Testing & Commissioning Engineer",
										"Digital Grid Engineer",
										"AI Energy Optimization Engineer",
										"Product Lifecycle Specialist",
										"Quality Control Engineer",
										"Field Service Engineer",
										"Automation QA Engineer",
										"Technical Support Engineer",
										"Solutions Architect"
										};
				return schneiderElectric;
		}else if(companyName == "philips"){
				String[] philips = {
								"Medical Imaging Engineer",
								"Healthcare Software Developer",
								"Embedded Systems Engineer",
								"AI Radiology Researcher",
								"Biomedical Engineer",
								"Cloud Health Platform Engineer",
								"Cybersecurity Specialist – Healthcare",
								"UX Designer – Medical Devices",
								"Quality Assurance Engineer",
								"Data Analytics – Healthcare",
								"IoT Medical Devices Engineer",
								"Testing & Validation Engineer",
								"Clinical Systems Developer",
								"Product Innovation Manager",
								"Regulatory Compliance Engineer",
								"Mobile Health App Developer",
								"DevOps Healthcare Engineer",
								"Technical Support Specialist",
								"AI Diagnostics Engineer",
								"Systems Integration Engineer"
								};
				return philips;
		}else if(companyName == "threeM"){
				String[] threeM = {
								"Materials Science Engineer",
								"Product Development Engineer",
								"Industrial Automation Engineer",
								"Manufacturing Process Specialist",
								"Quality Assurance Engineer",
								"Supply Chain Systems Analyst",
								"Embedded Systems Developer",
								"AI Manufacturing Engineer",
								"Mechanical Design Engineer",
								"Chemical Process Engineer",
								"Technical Sales Engineer",
								"Research & Development Scientist",
								"Data Analytics Engineer",
								"Automation Testing Engineer",
								"Cloud Integration Specialist",
								"Product Lifecycle Engineer",
								"Cybersecurity Specialist",
								"Field Application Engineer",
								"Industrial IoT Engineer",
								"Technical Program Manager"
								};
				return threeM;
		}else if(companyName == "serviceNow"){
				String[] serviceNow = {
									"ServiceNow Platform Developer",
									"ITSM Consultant",
									"Workflow Automation Engineer",
									"Cloud SaaS Engineer",
									"Backend Java Developer",
									"Frontend UI Developer",
									"Security Operations Engineer",
									"Platform Reliability Engineer",
									"DevOps Cloud Specialist",
									"Data Integration Engineer",
									"IT Governance Consultant",
									"Automation QA Engineer",
									"Product Support Engineer",
									"Enterprise Architect",
									"API Platform Engineer",
									"Customer Success Manager",
									"Technical Program Manager",
									"UX Designer",
									"Performance Testing Engineer",
									"Cloud Security Architect"
									};
				return serviceNow;
		}else if(companyName == "workday"){
				String[] workday = {
								"HCM Systems Engineer",
								"Financial Systems Developer",
								"Cloud SaaS Engineer",
								"Integration Consultant",
								"Payroll Systems Analyst",
								"Security Compliance Engineer",
								"Backend Platform Developer",
								"Frontend UI Engineer",
								"Data Migration Specialist",
								"Automation Testing Engineer",
								"DevOps Cloud Engineer",
								"Enterprise Applications Architect",
								"Product Innovation Manager",
								"Customer Success Engineer",
								"Analytics Platform Developer",
								"IT Infrastructure Engineer",
								"Mobile App Developer",
								"Cloud Security Specialist",
								"Technical Account Manager",
								"Solutions Consultant"
								};
				return workday;
		}else if(companyName == "atlassian"){
				String[] atlassian = {
								"Jira Platform Developer",
								"Confluence Systems Engineer",
								"Cloud SaaS Engineer",
								"DevOps Platform Engineer",
								"Agile Tools Consultant",
								"Backend Java Engineer",
								"Frontend React Developer",
								"Product Growth Engineer",
								"Security Compliance Engineer",
								"Data Platform Developer",
								"Site Reliability Engineer",
								"Automation QA Engineer",
								"Enterprise Solutions Architect",
								"UX Designer",
								"Technical Program Manager",
								"Customer Success Engineer",
								"Cloud Migration Specialist",
								"API Integration Engineer",
								"Performance Testing Engineer",
								"Developer Experience Engineer"
								};
				return atlassian;
		}else if(companyName == "redhat"){
				String[] redhat = {
								"Linux Kernel Developer",
								"OpenShift Engineer",
								"Kubernetes Platform Engineer",
								"Cloud Infrastructure Architect",
								"DevOps Automation Engineer",
								"Security Engineer – Linux",
								"Middleware Specialist",
								"Ansible Automation Engineer",
								"Site Reliability Engineer",
								"Open Source Consultant",
								"Containerization Specialist",
								"Backend Systems Engineer",
								"Performance Engineer",
								"Technical Support Engineer",
								"Cloud Security Architect",
								"Platform Reliability Engineer",
								"Enterprise Solutions Consultant",
								"QA Automation Engineer",
								"Infrastructure Developer",
								"Technical Account Manager"
								};
				return redhat;
		}else if(companyName == "vmware"){
				String[] vmware = {
								"Virtualization Engineer",
								"Cloud Infrastructure Developer",
								"NSX Network Engineer",
								"vSphere Administrator",
								"DevOps Platform Specialist",
								"Cloud Security Engineer",
								"Site Reliability Engineer",
								"Automation Framework Engineer",
								"Backend Systems Developer",
								"Enterprise Architect",
								"Performance Optimization Engineer",
								"Data Center Engineer",
								"Product Support Specialist",
								"Cloud Migration Consultant",
								"Kubernetes Engineer",
								"QA Validation Engineer",
								"Technical Program Manager",
								"Infrastructure Automation Engineer",
								"Solutions Architect",
								"Platform Integration Engineer"
								};
				return vmware;
		}else if(companyName == "juniper"){
				String[] juniper = {
								"Network Routing Engineer",
								"Switching Systems Developer",
								"Cybersecurity Network Engineer",
								"Cloud Networking Architect",
								"Firewall Systems Engineer",
								"Network Automation Developer",
								"Protocol Stack Engineer",
								"Technical Support Engineer",
								"Data Center Networking Specialist",
								"Wireless Network Engineer",
								"DevOps Networking Engineer",
								"Performance Testing Engineer",
								"Systems Integration Engineer",
								"Security Operations Analyst",
								"IP Networking Architect",
								"Embedded Systems Developer",
								"Solutions Consultant",
								"Network Reliability Engineer",
								"Customer Solutions Engineer",
								"Cloud Infrastructure Specialist"
								};
				return juniper;
		}else if(companyName == "netapp"){
				String[] netapp = {
								"Storage Systems Engineer",
								"Cloud Data Engineer",
								"Backup Solutions Architect",
								"DevOps Infrastructure Engineer",
								"Data Center Specialist",
								"Cloud Security Engineer",
								"Automation Testing Engineer",
								"Backend Platform Developer",
								"Performance Engineer",
								"Enterprise Storage Architect",
								"Data Migration Specialist",
								"Site Reliability Engineer",
								"Technical Support Engineer",
								"Solutions Architect",
								"Hybrid Cloud Engineer",
								"Product Development Engineer",
								"Infrastructure Automation Engineer",
								"Customer Success Manager",
								"Cloud Platform Consultant",
								"Technical Program Lead"
								};
				return netapp;
		}else if(companyName == "autodesk"){
				String[] autodesk = {
								"CAD Software Developer",
								"3D Graphics Engineer",
								"BIM Solutions Architect",
								"Cloud Design Platform Engineer",
								"UX Designer – Design Tools",
								"Backend Java Developer",
								"Frontend WebGL Developer",
								"AI Design Researcher",
								"Simulation Engineer",
								"Product Innovation Manager",
								"DevOps Cloud Engineer",
								"Automation QA Engineer",
								"Technical Support Engineer",
								"Data Visualization Engineer",
								"Enterprise Applications Architect",
								"AR/VR Design Developer",
								"Security Compliance Specialist",
								"Performance Optimization Engineer",
								"Technical Account Manager",
								"Mobile App Developer"
								};
				return autodesk;
		}else if(companyName == "cadence"){
				String[] cadence = {
								"EDA Tools Developer",
								"ASIC Design Engineer",
								"Chip Verification Engineer",
								"FPGA Developer",
								"Physical Design Engineer",
								"Semiconductor Modeling Engineer",
								"Signal Integrity Engineer",
								"Embedded Systems Developer",
								"Automation Testing Engineer",
								"Hardware Validation Engineer",
								"Software Simulation Engineer",
								"Performance Optimization Engineer",
								"AI Hardware Researcher",
								"Cloud Infrastructure Engineer",
								"Technical Support Specialist",
								"Product Engineering Manager",
								"Backend Systems Developer",
								"Security Systems Engineer",
								"Testing & Debug Engineer",
								"Solutions Architect"
								};
				return cadence;
		}else if(companyName == "synopsys"){
				String[] synopsys = {
								"Silicon Design Engineer",
								"Verification Engineer",
								"EDA Software Developer",
								"ASIC Validation Engineer",
								"Hardware Security Specialist",
								"Embedded Firmware Engineer",
								"AI Chip Research Engineer",
								"Cloud EDA Platform Engineer",
								"Physical Implementation Engineer",
								"Automation Framework Engineer",
								"Semiconductor Process Engineer",
								"Testing & Debug Specialist",
								"Backend Software Engineer",
								"Product Development Engineer",
								"Cybersecurity Engineer",
								"Performance Engineer",
								"Technical Support Engineer",
								"Data Analytics Engineer",
								"Solutions Architect",
								"Technical Program Manager"
								};
				return synopsys;
		}else if(companyName == "zebraTechnologies"){
				String[] zebraTechnologies = {
										"IoT Solutions Engineer",
										"RFID Systems Developer",
										"Mobile Computing Engineer",
										"Barcode Scanner Firmware Engineer",
										"Cloud Platform Engineer",
										"Embedded Systems Developer",
										"Automation QA Engineer",
										"Data Analytics Engineer",
										"Supply Chain Technology Specialist",
										"Backend Application Developer",
										"Frontend UI Developer",
										"Security Engineer",
										"DevOps Infrastructure Engineer",
										"Product Innovation Engineer",
										"Testing Validation Engineer",
										"Technical Support Engineer",
										"Enterprise Architect",
										"Mobile App Developer",
										"Customer Success Manager",
										"Solutions Consultant"
										};
				return zebraTechnologies;
		}else if(companyName == "tataMotors"){
				String[] tataMotors = {
								"Automotive Design Engineer",
								"Embedded Automotive Developer",
								"EV Systems Engineer",
								"Powertrain Engineer",
								"Manufacturing Process Engineer",
								"Quality Assurance Engineer",
								"Vehicle Testing Engineer",
								"Mechanical Design Specialist",
								"AI Autonomous Driving Engineer",
								"Battery Systems Engineer",
								"Supply Chain Analyst",
								"Production Planning Engineer",
								"Control Systems Engineer",
								"Industrial Automation Engineer",
								"Product Development Engineer",
								"Cybersecurity Engineer – Automotive",
								"Telematics Systems Engineer",
								"Technical Sales Manager",
								"R&D Engineer",
								"Project Management Specialist"
								};
				return tataMotors;
		}else if(companyName == "mahindra"){
				String[] mahindra = {
								"Automotive Software Engineer",
								"EV Powertrain Engineer",
								"Mechanical Design Engineer",
								"Manufacturing Process Engineer",
								"Quality Control Engineer",
								"Embedded Systems Developer",
								"Vehicle Testing Engineer",
								"Battery Management Engineer",
								"Supply Chain Planner",
								"Production Engineer",
								"Industrial Automation Specialist",
								"R&D Engineer",
								"Control Systems Engineer",
								"Telematics Engineer",
								"Cybersecurity Engineer – Automotive",
								"Product Development Engineer",
								"Field Service Engineer",
								"Project Management Officer",
								"AI Mobility Researcher",
								"Operations Excellence Manager"
								};
				return mahindra;
		}else if(companyName == "bajajAuto"){
				String[] bajajAuto = {
								"Two-Wheeler Design Engineer",
								"Engine Development Engineer",
								"Manufacturing Automation Engineer",
								"Embedded Systems Developer",
								"Vehicle Dynamics Engineer",
								"Quality Assurance Engineer",
								"Battery Systems Engineer",
								"EV Charging Engineer",
								"Mechanical Testing Engineer",
								"Production Planning Engineer",
								"Supply Chain Analyst",
								"Control Systems Engineer",
								"R&D Innovation Engineer",
								"Technical Sales Engineer",
								"Industrial IoT Engineer",
								"Cybersecurity Specialist",
								"Process Improvement Engineer",
								"Product Lifecycle Engineer",
								"Field Technical Engineer",
								"Automation QA Engineer"
								};
				return bajajAuto;
		}else if(companyName == "heroMotoCorp"){
				String[] heroMotoCorp = {
								"Motorcycle Design Engineer",
								"Engine Calibration Engineer",
								"EV Systems Specialist",
								"Manufacturing Engineer",
								"Quality Systems Engineer",
								"Embedded Automotive Developer",
								"Battery Technology Engineer",
								"Vehicle Validation Engineer",
								"Supply Chain Coordinator",
								"Production Supervisor",
								"Control Systems Engineer",
								"R&D Mechanical Engineer",
								"Industrial Automation Engineer",
								"Telematics Systems Developer",
								"Product Testing Engineer",
								"Technical Support Engineer",
								"AI Mobility Engineer",
								"Operations Manager",
								"Process Optimization Specialist",
								"Field Service Engineer"
								};
				return heroMotoCorp;
		}else if(companyName == "hyundai"){
				String[] hyundai = {
							"Automotive Systems Engineer",
							"EV Platform Developer",
							"Autonomous Driving Engineer",
							"Mechanical Design Engineer",
							"Vehicle Testing Specialist",
							"Battery Systems Developer",
							"Embedded Software Engineer",
							"Manufacturing Automation Engineer",
							"Quality Assurance Analyst",
							"Supply Chain Systems Engineer",
							"Control Systems Engineer",
							"Telematics Integration Engineer",
							"R&D Powertrain Engineer",
							"Cybersecurity Engineer – Automotive",
							"Product Lifecycle Manager",
							"Technical Sales Engineer",
							"Production Planning Engineer",
							"AI Mobility Researcher",
							"Field Support Engineer",
							"Operations Strategy Analyst"
							};
				return hyundai;
		}else if(companyName == "toyota"){
				String[] toyota = {
								"Hybrid Systems Engineer",
								"Automotive Embedded Developer",
								"Mechanical Design Engineer",
								"Manufacturing Process Engineer",
								"Quality Testing Engineer",
								"Battery Research Engineer",
								"Control Systems Specialist",
								"Supply Chain Planner",
								"Production Engineer",
								"Vehicle Validation Engineer",
								"AI Autonomous Systems Engineer",
								"Cybersecurity Automotive Specialist",
								"Telematics Developer",
								"R&D Innovation Engineer",
								"Industrial Automation Engineer",
								"Field Service Technician",
								"Project Coordinator",
								"Product Development Manager",
								"Operations Engineer",
								"Technical Training Specialist"
								};
				return toyota;
		}else if(companyName == "honda"){
				String[] honda = {
								"Engine Development Engineer",
								"EV Systems Engineer",
								"Automotive Software Developer",
								"Mechanical Design Specialist",
								"Quality Assurance Engineer",
								"Manufacturing Automation Specialist",
								"Battery Technology Developer",
								"Control Systems Engineer",
								"Vehicle Testing Engineer",
								"Supply Chain Analyst",
								"R&D Innovation Engineer",
								"Embedded Systems Developer",
								"Telematics Systems Engineer",
								"Production Planning Engineer",
								"Cybersecurity Engineer – Automotive",
								"Field Service Engineer",
								"Product Lifecycle Specialist",
								"AI Mobility Engineer",
								"Operations Manager",
								"Technical Sales Engineer"
								};
				return honda;
		}else if(companyName == "tesla"){
				String[] tesla = {
							"EV Powertrain Engineer",
							"Autonomous Driving Engineer",
							"Battery Research Scientist",
							"Embedded Systems Developer",
							"AI Vision Engineer",
							"Mechanical Design Engineer",
							"Manufacturing Automation Engineer",
							"Quality Control Engineer",
							"Energy Storage Engineer",
							"Robotics Engineer",
							"Cloud Data Engineer",
							"Cybersecurity Engineer",
							"Vehicle Firmware Developer",
							"Supply Chain Systems Analyst",
							"R&D Innovation Engineer",
							"Testing Validation Engineer",
							"Control Systems Engineer",
							"Product Development Engineer",
							"Field Service Specialist",
							"Technical Program Manager"
							};
				return tesla;
		}else if(companyName == "spaceX"){
				String[] spaceX = {
								"Aerospace Systems Engineer",
								"Rocket Propulsion Engineer",
								"Avionics Software Developer",
								"Flight Dynamics Engineer",
								"Embedded Systems Engineer",
								"Satellite Communications Engineer",
								"Mechanical Design Engineer",
								"Manufacturing Process Engineer",
								"Launch Operations Specialist",
								"Control Systems Engineer",
								"AI Navigation Engineer",
								"Robotics Engineer",
								"Quality Assurance Engineer",
								"Materials Science Engineer",
								"Testing & Validation Engineer",
								"Cybersecurity Specialist",
								"Cloud Infrastructure Engineer",
								"Product Development Engineer",
								"Field Support Engineer",
								"Mission Operations Manager"
								};
				return spaceX;
		}else if(companyName == "isro"){
				String[] isro = {
							"Space Research Scientist",
							"Satellite Systems Engineer",
							"Rocket Propulsion Engineer",
							"Avionics Engineer",
							"Embedded Systems Developer",
							"Mission Planning Specialist",
							"Control Systems Engineer",
							"Data Analysis Scientist",
							"Materials Engineer",
							"Launch Vehicle Engineer",
							"Communication Systems Engineer",
							"Testing & Validation Engineer",
							"Quality Assurance Specialist",
							"Ground Station Engineer",
							"AI Space Research Engineer",
							"Mechanical Design Engineer",
							"Power Systems Engineer",
							"Project Scientist",
							"Technical Support Engineer",
							"Research & Development Engineer"
							};
				return isro;
		}else if(companyName == "drdo"){
				String[] drdo = {
								"Defense Research Scientist",
								"Missile Systems Engineer",
								"Embedded Software Developer",
								"Cybersecurity Specialist",
								"Aerospace Engineer",
								"Mechanical Design Engineer",
								"Electronics Systems Engineer",
								"AI Defense Researcher",
								"Radar Systems Engineer",
								"Control Systems Engineer",
								"Testing & Evaluation Engineer",
								"Materials Research Scientist",
								"Robotics Engineer",
								"Communication Systems Engineer",
								"Quality Assurance Engineer",
								"Project Officer",
								"R&D Innovation Specialist",
								"Power Electronics Engineer",
								"Field Testing Engineer",
								"Technical Program Manager"
								};
				return drdo;
		}else if(companyName == "bhel"){
				String[] bhel = {
								"Power Plant Engineer",
								"Electrical Design Engineer",
								"Mechanical Maintenance Engineer",
								"Thermal Systems Engineer",
								"Control Systems Engineer",
								"Boiler Design Specialist",
								"Turbine Engineer",
								"Manufacturing Process Engineer",
								"Quality Assurance Engineer",
								"Industrial Automation Engineer",
								"Energy Efficiency Analyst",
								"Project Planning Engineer",
								"Field Service Engineer",
								"R&D Power Systems Engineer",
								"Testing & Commissioning Engineer",
								"Materials Engineer",
								"Safety Officer",
								"Procurement Engineer",
								"Technical Support Specialist",
								"Operations Manager"
								};
				return bhel;
		}else if(companyName == "ntpc"){
				String[] ntpc = {
								"Thermal Power Engineer",
								"Electrical Operations Engineer",
								"Mechanical Maintenance Engineer",
								"Energy Analyst",
								"Control Room Engineer",
								"Plant Performance Engineer",
								"Renewable Energy Specialist",
								"Grid Integration Engineer",
								"Environmental Engineer",
								"Safety Systems Engineer",
								"Project Management Officer",
								"Instrumentation Engineer",
								"Power Systems Analyst",
								"Hydro Power Engineer",
								"Quality Control Engineer",
								"Procurement Specialist",
								"Field Operations Engineer",
								"Technical Consultant",
								"Maintenance Planner",
								"Operations Supervisor"
								};
				return ntpc;
		}else if(companyName == "ongc"){
				String[] ongc = {
								"Petroleum Engineer",
								"Drilling Engineer",
								"Reservoir Engineer",
								"Geophysicist",
								"Mechanical Maintenance Engineer",
								"Pipeline Engineer",
								"Production Engineer",
								"Offshore Operations Engineer",
								"Energy Systems Analyst",
								"Environmental Compliance Officer",
								"Safety Engineer",
								"Instrumentation Specialist",
								"Project Planning Engineer",
								"Refinery Process Engineer",
								"Quality Assurance Specialist",
								"Field Service Engineer",
								"Procurement Manager",
								"Technical Support Engineer",
								"Data Analytics Engineer",
								"Operations Manager"
								};
				return ongc;
		}else if(companyName == "adaniGroup"){
				String[] adaniGroup = {
									"Infrastructure Engineer",
									"Renewable Energy Specialist",
									"Solar Power Engineer",
									"Wind Energy Engineer",
									"Electrical Systems Engineer",
									"Logistics Operations Manager",
									"Supply Chain Analyst",
									"Port Operations Engineer",
									"Data Analytics Specialist",
									"Project Finance Analyst",
									"Cybersecurity Engineer",
									"IT Infrastructure Manager",
									"Quality Control Engineer",
									"Industrial Automation Specialist",
									"Environmental Engineer",
									"Procurement Officer",
									"Control Systems Engineer",
									"Risk Management Analyst",
									"Technical Consultant",
									"Operations Strategy Manager"
									};
				return adaniGroup;
		}else if(companyName == "vedanta"){
				String[] vedanta = {
								"Mining Engineer",
								"Metallurgical Engineer",
								"Process Control Engineer",
								"Mechanical Maintenance Engineer",
								"Electrical Systems Engineer",
								"Environmental Engineer",
								"Safety Compliance Officer",
								"Quality Assurance Engineer",
								"Production Planning Engineer",
								"Energy Management Analyst",
								"Industrial Automation Engineer",
								"Supply Chain Specialist",
								"Project Manager",
								"R&D Materials Scientist",
								"Field Operations Engineer",
								"Procurement Engineer",
								"Technical Support Specialist",
								"Data Analytics Engineer",
								"Operations Supervisor",
								"Risk Assessment Analyst"
								};
				return vedanta;
		}else if(companyName == "itc"){
				String[] itc = {
								"Supply Chain Manager",
								"Production Planning Executive",
								"Quality Assurance Analyst",
								"Packaging Technology Engineer",
								"Food Safety Specialist",
								"Marketing Strategy Analyst",
								"Digital Transformation Manager",
								"Data Analytics Specialist",
								"Retail Operations Manager",
								"Procurement Officer",
								"Product Development Executive",
								"Brand Manager",
								"Sales Operations Executive",
								"IT Systems Administrator",
								"Cybersecurity Analyst",
								"Cloud Infrastructure Engineer",
								"Automation Testing Engineer",
								"Business Intelligence Analyst",
								"Operations Excellence Manager",
								"Technical Support Engineer"
								};
				return itc;
		}else if(companyName == "hul"){
				String[] hul = {
								"Product Innovation Manager",
								"Supply Chain Analyst",
								"Manufacturing Process Engineer",
								"Quality Control Specialist",
								"Packaging Development Engineer",
								"Digital Marketing Manager",
								"Data Science Analyst",
								"Procurement Executive",
								"Retail Strategy Manager",
								"Brand Development Manager",
								"IT Infrastructure Engineer",
								"Cybersecurity Specialist",
								"Cloud Solutions Architect",
								"Automation Engineer",
								"Business Intelligence Developer",
								"Operations Manager",
								"Customer Insights Analyst",
								"R&D Scientist",
								"Field Sales Executive",
								"Technical Support Analyst"
								};
				return hul;
		}else if(companyName == "nestle"){
				String[] nestle = {
								"Food Technology Engineer",
								"Quality Assurance Manager",
								"Supply Chain Planner",
								"Manufacturing Engineer",
								"Product Development Scientist",
								"Packaging Specialist",
								"Food Safety Auditor",
								"Brand Marketing Executive",
								"Procurement Specialist",
								"Data Analytics Engineer",
								"IT Systems Administrator",
								"Cybersecurity Analyst",
								"Cloud Infrastructure Engineer",
								"Automation Testing Specialist",
								"Business Intelligence Analyst",
								"Operations Manager",
								"Retail Strategy Analyst",
								"Environmental Sustainability Manager",
								"Technical Support Engineer",
								"R&D Food Scientist"
								};
				return nestle;
		}else if(companyName == "pepsiCo"){
				String[] pepsiCo = {
								"Manufacturing Process Engineer",
								"Quality Control Analyst",
								"Supply Chain Coordinator",
								"Packaging Innovation Engineer",
								"Product Development Specialist",
								"Brand Marketing Manager",
								"Digital Strategy Analyst",
								"Procurement Executive",
								"Retail Operations Analyst",
								"IT Infrastructure Specialist",
								"Cybersecurity Engineer",
								"Cloud Systems Administrator",
								"Data Analytics Manager",
								"Automation Testing Engineer",
								"Business Intelligence Developer",
								"Operations Supervisor",
								"Field Sales Manager",
								"Environmental Compliance Officer",
								"R&D Food Technologist",
								"Technical Support Specialist"
								};
				return pepsiCo;
		}else if(companyName == "cocaCola"){
				String[] cocaCola = {
								"Production Engineer",
								"Quality Assurance Manager",
								"Supply Chain Analyst",
								"Packaging Development Specialist",
								"Food Safety Officer",
								"Brand Strategy Manager",
								"Digital Marketing Analyst",
								"Procurement Manager",
								"Retail Operations Executive",
								"IT Systems Engineer",
								"Cybersecurity Specialist",
								"Cloud Infrastructure Architect",
								"Automation Engineer",
								"Business Intelligence Analyst",
								"Operations Excellence Manager",
								"Environmental Sustainability Engineer",
								"Field Sales Executive",
								"R&D Beverage Scientist",
								"Customer Experience Manager",
								"Technical Support Engineer"
								};
				return cocaCola;
		}else if(companyName == "walmart"){
				String[] walmart = {
								"Retail Operations Manager",
								"E-Commerce Platform Engineer",
								"Supply Chain Analyst",
								"Inventory Systems Specialist",
								"Data Analytics Engineer",
								"Cloud Infrastructure Engineer",
								"Cybersecurity Analyst",
								"Backend API Developer",
								"Frontend Web Developer",
								"Mobile App Developer",
								"Automation QA Engineer",
								"Logistics Optimization Engineer",
								"Procurement Manager",
								"Product Strategy Analyst",
								"Business Intelligence Developer",
								"AI Demand Forecast Engineer",
								"Store Systems Administrator",
								"Technical Support Engineer",
								"Customer Experience Manager",
								"Digital Transformation Lead"
								};
				return walmart;
		}else if(companyName == "target"){
				String[] target = {
								"Retail Technology Engineer",
								"Inventory Planning Analyst",
								"E-Commerce Developer",
								"Cloud Platform Architect",
								"Cyber Risk Specialist",
								"Supply Chain Systems Engineer",
								"Data Science Analyst",
								"Frontend UI Developer",
								"Backend Microservices Engineer",
								"Automation Test Engineer",
								"Logistics Operations Manager",
								"Procurement Specialist",
								"Business Strategy Analyst",
								"Product Development Manager",
								"AI Personalization Engineer",
								"Store Operations Executive",
								"Technical Support Specialist",
								"Enterprise Architect",
								"Customer Insights Analyst",
								"DevOps Engineer"
								};
				return target;
		}else if(companyName == "costco"){
				String[] costco = {
								"Warehouse Operations Manager",
								"Supply Chain Coordinator",
								"Retail Systems Engineer",
								"E-Commerce Backend Developer",
								"Data Analytics Specialist",
								"Cloud Infrastructure Engineer",
								"Cybersecurity Engineer",
								"Inventory Systems Analyst",
								"Automation QA Specialist",
								"Procurement Officer",
								"Business Intelligence Analyst",
								"AI Forecasting Engineer",
								"Store IT Administrator",
								"Product Quality Manager",
								"Logistics Planning Engineer",
								"Customer Experience Analyst",
								"DevOps Infrastructure Engineer",
								"Technical Support Engineer",
								"Enterprise Solutions Architect",
								"Operations Strategy Manager"
								};
				return costco;
		}else if(companyName == "ikea"){
				String[] ikea = {
							"Retail Operations Engineer",
							"Supply Chain Systems Analyst",
							"E-Commerce Platform Developer",
							"Cloud Solutions Architect",
							"Inventory Optimization Specialist",
							"Data Analytics Engineer",
							"Automation Testing Engineer",
							"Cybersecurity Specialist",
							"Backend Systems Developer",
							"Frontend Web Designer",
							"Product Lifecycle Manager",
							"Procurement Executive",
							"Business Intelligence Developer",
							"AI Demand Planning Engineer",
							"Store Technology Specialist",
							"DevOps Engineer",
							"Customer Experience Designer",
							"Technical Support Manager",
							"Enterprise Architect",
							"Sustainability Program Manager"
							};
				return ikea;
		}else if(companyName == "hdfcBank"){
				String[] hdfcBank = {
									"Core Banking Engineer",
									"Digital Banking Developer",
									"Cloud Infrastructure Specialist",
									"Cybersecurity Analyst",
									"Fraud Risk Manager",
									"Backend API Engineer",
									"Mobile Banking Developer",
									"DevOps Engineer",
									"Data Analytics Specialist",
									"Regulatory Compliance Officer",
									"AI Credit Risk Engineer",
									"Automation QA Engineer",
									"Enterprise Data Architect",
									"Financial Systems Analyst",
									"IT Infrastructure Manager",
									"Blockchain Banking Developer",
									"Business Intelligence Analyst",
									"Technical Program Manager",
									"Payments Systems Engineer",
									"Customer Experience Manager"
									};
				return hdfcBank;
		}else if(companyName == "iciciBank"){
				String[] iciciBank = {
								"Digital Banking Engineer",
								"Core Systems Developer",
								"Cloud Platform Engineer",
								"Cyber Risk Specialist",
								"Fraud Detection Analyst",
								"Backend Java Developer",
								"Mobile App Banking Developer",
								"DevOps Infrastructure Engineer",
								"Data Governance Manager",
								"AI Loan Processing Engineer",
								"Automation Test Engineer",
								"Enterprise Architect",
								"Financial Reporting Analyst",
								"IT Compliance Manager",
								"Blockchain Solutions Engineer",
								"API Platform Developer",
								"Product Innovation Manager",
								"Risk Analytics Engineer",
								"Technical Support Executive",
								"Technology Delivery Lead"
								};
				return iciciBank;
		}else if(companyName == "axisBank"){
				String[] axisBank = {
								"Banking Systems Engineer",
								"Digital Payments Developer",
								"Cloud Security Architect",
								"Fraud Analytics Specialist",
								"Core Banking Application Developer",
								"DevOps Cloud Engineer",
								"Data Science Analyst",
								"Mobile Banking QA Engineer",
								"Regulatory Compliance Analyst",
								"AI Risk Modeling Engineer",
								"Automation Testing Specialist",
								"Enterprise Data Engineer",
								"Financial Technology Consultant",
								"IT Infrastructure Lead",
								"Blockchain Finance Engineer",
								"Backend API Developer",
								"Product Strategy Analyst",
								"Cybersecurity Operations Manager",
								"Technical Delivery Manager",
								"Customer Solutions Architect"
								};
				return axisBank;
		}else if(companyName == "sbi"){
				String[] sbi = {
							"Core Banking Engineer",
							"Digital Transformation Manager",
							"Cloud Infrastructure Engineer",
							"Cybersecurity Specialist",
							"Fraud Monitoring Analyst",
							"Mobile Banking Developer",
							"DevOps Banking Engineer",
							"Data Analytics Engineer",
							"Regulatory Compliance Manager",
							"AI Risk Assessment Engineer",
							"Automation QA Specialist",
							"Enterprise Solutions Architect",
							"Financial Reporting Analyst",
							"Blockchain Banking Consultant",
							"API Integration Developer",
							"Product Development Manager",
							"IT Infrastructure Specialist",
							"Technical Support Engineer",
							"Payments Processing Engineer",
							"Technology Risk Analyst"
							};
				return sbi;
		}else if(companyName == "kotakMahindra"){
				String[] kotakMahindra = {
								"Digital Banking Architect",
								"Core Systems Developer",
								"Cloud Security Engineer",
								"Fraud Risk Specialist",
								"Backend Microservices Developer",
								"DevOps Infrastructure Specialist",
								"Data Science Engineer",
								"Mobile Banking Developer",
								"RegTech Analyst",
								"AI Credit Modeling Engineer",
								"Automation QA Engineer",
								"Enterprise Data Architect",
								"IT Compliance Officer",
								"Blockchain Developer",
								"API Platform Architect",
								"Product Strategy Manager",
								"Financial Systems Analyst",
								"Cyber Defense Engineer",
								"Technical Program Manager",
								"Payments Technology Specialist"
								};
				return kotakMahindra;
		}else if(companyName == "idfcFirst"){
				String[] idfcFirst = {
								"Core Banking Application Engineer",
								"Digital Banking Developer",
								"Cloud Infrastructure Architect",
								"Cybersecurity Analyst",
								"Fraud Analytics Manager",
								"Backend Java Engineer",
								"Mobile Banking Developer",
								"DevOps Engineer",
								"Data Governance Specialist",
								"AI Loan Risk Engineer",
								"Automation Test Engineer",
								"Enterprise Architect",
								"Financial Systems Consultant",
								"IT Compliance Specialist",
								"Blockchain Banking Engineer",
								"API Integration Specialist",
								"Product Innovation Lead",
								"Risk Analytics Consultant",
								"Technical Support Analyst",
								"Technology Operations Manager"
								};
				return idfcFirst;
		}else if(companyName == "razorpay"){
				String[] razorpay = {
							"FinTech Backend Engineer",
							"Payment Gateway Developer",
							"API Integration Engineer",
							"Cloud Infrastructure Engineer",
							"Cybersecurity Analyst",
							"Fraud Detection Specialist",
							"DevOps Engineer",
							"Mobile Payments Developer",
							"Data Science Engineer",
							"UI/UX Designer – FinTech",
							"Automation QA Engineer",
							"Risk Compliance Manager",
							"Product Growth Analyst",
							"Blockchain Payments Engineer",
							"Technical Support Engineer",
							"Enterprise Solutions Architect",
							"AI Risk Modeling Engineer",
							"Platform Reliability Engineer",
							"Financial Systems Analyst",
							"Technical Program Manager"
							};
				return razorpay;
		}else if(companyName == "freshworks"){
				String[] freshworks = {
								"SaaS Platform Developer",
								"Backend Java Engineer",
								"Frontend React Developer",
								"Cloud SaaS Architect",
								"DevOps Infrastructure Engineer",
								"Product Support Specialist",
								"Customer Success Manager",
								"Automation Testing Engineer",
								"Data Analytics Engineer",
								"Security Compliance Analyst",
								"Mobile App Developer",
								"API Platform Engineer",
								"Performance Optimization Engineer",
								"UX Designer",
								"Site Reliability Engineer",
								"Enterprise Solutions Consultant",
								"Technical Account Manager",
								"AI Chatbot Developer",
								"Integration Specialist",
								"Product Innovation Lead"
								};
				return freshworks;
		}else if(companyName == "inMobi"){
				String[] inMobi = {
							"AdTech Platform Engineer",
							"Mobile Advertising Developer",
							"Backend Data Engineer",
							"Frontend UI Developer",
							"Cloud Infrastructure Specialist",
							"Programmatic Ads Specialist",
							"AI Personalization Engineer",
							"Data Science Analyst",
							"DevOps Cloud Engineer",
							"Cybersecurity Engineer",
							"Automation QA Specialist",
							"Performance Marketing Analyst",
							"Product Strategy Manager",
							"Platform Reliability Engineer",
							"API Integration Developer",
							"Technical Support Engineer",
							"Analytics Architect",
							"Machine Learning Researcher",
							"Enterprise Solutions Manager",
							"Technical Program Lead"
							};
				return inMobi;
		}else if(companyName == "dream11"){
				String[] dream11 = {
								"Fantasy Sports Platform Engineer",
								"Backend Microservices Developer",
								"Frontend React Engineer",
								"Mobile App Developer",
								"Cloud Infrastructure Architect",
								"Data Science Engineer",
								"AI Recommendation Specialist",
								"Cybersecurity Analyst",
								"DevOps Engineer",
								"Payment Systems Developer",
								"Automation QA Engineer",
								"Product Growth Manager",
								"Risk Monitoring Specialist",
								"Platform Reliability Engineer",
								"Business Intelligence Analyst",
								"API Platform Engineer",
								"User Experience Designer",
								"Technical Support Engineer",
								"Analytics Product Manager",
								"Technology Delivery Lead"
								};
				return dream11;
		}else if(companyName == "cred"){
				String[] cred = {
							"FinTech Platform Developer",
							"Backend Java Engineer",
							"Mobile Wallet Developer",
							"Cloud Infrastructure Engineer",
							"Cyber Risk Analyst",
							"Data Science Specialist",
							"DevOps Cloud Engineer",
							"Fraud Detection Engineer",
							"Automation Testing Engineer",
							"Product Innovation Manager",
							"AI Credit Risk Engineer",
							"API Integration Specialist",
							"UI/UX Designer",
							"Performance Optimization Engineer",
							"Enterprise Solutions Architect",
							"Financial Systems Analyst",
							"Platform Reliability Engineer",
							"Customer Experience Manager",
							"Technical Support Specialist",
							"Program Management Lead"
							};
				return cred;
		}else if(companyName == "groww"){
				String[] groww = {
							"Investment Platform Developer",
							"Backend Financial Engineer",
							"Frontend Trading UI Developer",
							"Cloud Infrastructure Specialist",
							"Cybersecurity Engineer",
							"Data Analytics Engineer",
							"DevOps Infrastructure Engineer",
							"Fraud Risk Analyst",
							"AI Investment Modeling Engineer",
							"Automation QA Engineer",
							"Product Growth Analyst",
							"Blockchain Finance Developer",
							"Mobile Trading App Developer",
							"Enterprise Data Architect",
							"Platform Reliability Engineer",
							"API Systems Engineer",
							"Technical Support Executive",
							"Risk Compliance Manager",
							"Financial Systems Consultant",
							"Technology Delivery Manager"
							};
				return groww;
		}else if(companyName == "upstox"){
				String[] upstox = {
							"Stock Trading Platform Engineer",
							"Backend API Developer",
							"Frontend React Trading UI",
							"Cloud Infrastructure Engineer",
							"Cybersecurity Analyst",
							"DevOps Engineer",
							"Data Science Specialist",
							"AI Risk Modeling Engineer",
							"Automation QA Engineer",
							"Financial Systems Architect",
							"Product Strategy Manager",
							"Blockchain Finance Specialist",
							"Mobile App Developer",
							"Platform Reliability Engineer",
							"Enterprise Data Engineer",
							"Risk Compliance Analyst",
							"Technical Support Engineer",
							"Business Intelligence Analyst",
							"Performance Optimization Engineer",
							"Technology Program Manager"
							};
				return upstox;
		}else if(companyName == "meesho"){
				String[] meesho = {
							"E-Commerce Platform Engineer",
							"Backend Microservices Developer",
							"Frontend Web Developer",
							"Cloud Infrastructure Engineer",
							"Supply Chain Analyst",
							"Data Science Engineer",
							"DevOps Automation Engineer",
							"Cybersecurity Specialist",
							"Automation Testing Engineer",
							"Product Growth Analyst",
							"AI Recommendation Engineer",
							"Mobile App Developer",
							"Business Intelligence Manager",
							"Platform Reliability Engineer",
							"Inventory Systems Specialist",
							"API Integration Developer",
							"Customer Experience Manager",
							"Technical Support Engineer",
							"Enterprise Architect",
							"Technology Delivery Lead"
							};
				return meesho;
		}else if(companyName == "udaan"){
				String[] udaan = {
							"B2B Commerce Platform Engineer",
							"Backend Systems Developer",
							"Frontend Web Developer",
							"Cloud Infrastructure Architect",
							"Supply Chain Systems Analyst",
							"Data Analytics Engineer",
							"DevOps Infrastructure Engineer",
							"Cybersecurity Specialist",
							"Automation QA Engineer",
							"Product Strategy Manager",
							"AI Demand Forecast Engineer",
							"Mobile App Developer",
							"Business Intelligence Analyst",
							"Platform Reliability Engineer",
							"Inventory Optimization Engineer",
							"API Integration Specialist",
							"Customer Success Manager",
							"Technical Support Engineer",
							"Enterprise Solutions Architect",
							"Operations Excellence Manager"
							};
				return udaan;
		}else if(companyName == "nykaa"){
				String[] nykaa = {
							"E-Commerce Backend Developer",
							"Frontend UI Engineer",
							"Cloud Infrastructure Engineer",
							"Supply Chain Planner",
							"Data Science Analyst",
							"DevOps Engineer",
							"Cybersecurity Specialist",
							"Automation Testing Engineer",
							"Product Innovation Manager",
							"AI Personalization Engineer",
							"Mobile App Developer",
							"Business Intelligence Developer",
							"Platform Reliability Engineer",
							"Inventory Systems Analyst",
							"API Integration Developer",
							"Digital Marketing Strategist",
							"Customer Experience Manager",
							"Technical Support Executive",
							"Enterprise Architect",
							"Technology Delivery Lead"
							};
				return nykaa;
		}else if(companyName == "bookMyShow"){
				String[] bookMyShow = {
							"Ticketing Platform Engineer",
							"Backend API Developer",
							"Frontend React Developer",
							"Cloud Infrastructure Engineer",
							"Payment Gateway Specialist",
							"Data Analytics Engineer",
							"DevOps Engineer",
							"Cybersecurity Analyst",
							"Automation QA Engineer",
							"Product Growth Manager",
							"AI Recommendation Engineer",
							"Mobile App Developer",
							"Business Intelligence Analyst",
							"Platform Reliability Engineer",
							"Event Operations Manager",
							"API Integration Engineer",
							"Customer Experience Lead",
							"Technical Support Engineer",
							"Enterprise Architect",
							"Technology Delivery Manager"
							};
				return bookMyShow;
		}else if(companyName == "makeMyTrip"){
				String[] makeMyTrip = {
								"Travel Booking Platform Engineer",
								"Backend Systems Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Architect",
								"Payment Integration Developer",
								"Data Science Specialist",
								"DevOps Infrastructure Engineer",
								"Cybersecurity Specialist",
								"Automation Testing Engineer",
								"AI Pricing Optimization Engineer",
								"Mobile App Developer",
								"Business Intelligence Manager",
								"Platform Reliability Engineer",
								"API Systems Architect",
								"Customer Success Manager",
								"Technical Support Engineer",
								"Enterprise Solutions Architect",
								"Product Strategy Lead",
								"Digital Marketing Analyst",
								"Technology Program Manager"
								};
				return makeMyTrip;
		}else if(companyName == "cleartrip"){
				String[] cleartrip = {
								"Flight Booking Backend Developer",
								"Frontend Web Engineer",
								"Cloud Platform Engineer",
								"Payment Gateway Engineer",
								"Data Analytics Specialist",
								"DevOps Automation Engineer",
								"Cybersecurity Analyst",
								"Automation QA Engineer",
								"AI Travel Recommendation Engineer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Customer Experience Manager",
								"Technical Support Executive",
								"Enterprise Architect",
								"Product Innovation Manager",
								"Digital Marketing Strategist",
								"Operations Manager",
								"Technology Delivery Lead"
								};
				return cleartrip;
		}else if(companyName == "redBus"){
				String[] redBus = {
								"Transport Booking Platform Engineer",
								"Backend API Developer",
								"Frontend React Developer",
								"Cloud Infrastructure Engineer",
								"Payment Systems Specialist",
								"Data Science Engineer",
								"DevOps Infrastructure Engineer",
								"Cybersecurity Specialist",
								"Automation Testing Engineer",
								"AI Route Optimization Engineer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Developer",
								"Customer Support Manager",
								"Enterprise Architect",
								"Product Strategy Manager",
								"Digital Marketing Analyst",
								"Operations Coordinator",
								"Technology Program Manager"
								};
				return redBus;
		}else if(companyName == "oyo"){
				String[] oyo = {
								"Hospitality Platform Engineer",
								"Backend Systems Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Architect",
								"Revenue Management Analyst",
								"Data Science Engineer",
								"DevOps Engineer",
								"Cybersecurity Specialist",
								"Automation QA Engineer",
								"AI Pricing Optimization Engineer",
								"Mobile App Developer",
								"Business Intelligence Manager",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Customer Experience Manager",
								"Enterprise Solutions Architect",
								"Product Innovation Lead",
								"Digital Marketing Manager",
								"Operations Excellence Manager",
								"Technology Delivery Manager"
								};
				return oyo;
		}else if(companyName == "lenskart"){
				String[] lenskart = {
								"E-Commerce Backend Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Engineer",
								"Supply Chain Systems Analyst",
								"Data Analytics Engineer",
								"DevOps Infrastructure Engineer",
								"Cybersecurity Specialist",
								"Automation Testing Engineer",
								"AI Recommendation Engineer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"Inventory Management Specialist",
								"API Integration Developer",
								"Customer Success Manager",
								"Enterprise Architect",
								"Product Development Manager",
								"Digital Marketing Analyst",
								"Operations Manager",
								"Technology Program Lead"
								};
				return lenskart;
		}else if(companyName == "urbanCompany"){
				String[] urbanCompany = {
								"Service Marketplace Engineer",
								"Backend API Developer",
								"Frontend React Developer",
								"Cloud Infrastructure Architect",
								"Logistics Optimization Engineer",
								"Data Science Specialist",
								"DevOps Engineer",
								"Cybersecurity Analyst",
								"Automation QA Engineer",
								"AI Demand Forecast Engineer",
								"Mobile App Developer",
								"Business Intelligence Manager",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Customer Experience Manager",
								"Enterprise Architect",
								"Product Innovation Lead",
								"Operations Strategy Manager",
								"Digital Marketing Executive",
								"Technology Delivery Manager"
								};
				return urbanCompany;
		}else if(companyName == "practo"){
				String[] practo = {
								"Healthcare Platform Engineer",
								"Backend Systems Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Architect",
								"Data Analytics Specialist",
								"DevOps Infrastructure Engineer",
								"Cybersecurity Specialist",
								"Automation Testing Engineer",
								"AI Health Recommendation Engineer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Customer Success Manager",
								"Enterprise Architect",
								"Product Innovation Manager",
								"Digital Marketing Analyst",
								"Operations Manager",
								"Technical Support Engineer",
								"Technology Program Manager"
								};
				return practo;
		}else if(companyName == "tataPower"){
				String[] tataPower = {
								"Power Systems Engineer",
								"Renewable Energy Specialist",
								"Solar Plant Engineer",
								"Wind Energy Engineer",
								"Electrical Design Engineer",
								"Grid Integration Engineer",
								"Control Systems Engineer",
								"Energy Analytics Specialist",
								"Industrial Automation Engineer",
								"Cybersecurity Engineer – Energy",
								"Project Planning Engineer",
								"Field Service Engineer",
								"Testing & Commissioning Engineer",
								"Quality Assurance Engineer",
								"Environmental Compliance Officer",
								"Procurement Specialist",
								"Technical Consultant",
								"Operations Manager",
								"R&D Energy Scientist",
								"Sustainability Program Manager"
								};
				return tataPower;
		}else if(companyName == "godrej"){
				String[] godrej = {
							"Manufacturing Process Engineer",
							"Supply Chain Analyst",
							"Product Development Engineer",
							"Quality Assurance Specialist",
							"Industrial Automation Engineer",
							"Packaging Innovation Engineer",
							"Retail Operations Manager",
							"Data Analytics Engineer",
							"Cloud Infrastructure Specialist",
							"Cybersecurity Analyst",
							"Automation QA Engineer",
							"Business Intelligence Developer",
							"Environmental Sustainability Manager",
							"Procurement Executive",
							"Operations Excellence Manager",
							"IT Systems Administrator",
							"Customer Experience Manager",
							"Technical Support Engineer",
							"R&D Engineer",
							"Technology Delivery Lead"
							};
				return godrej;
		}else if(companyName == "adityaBirlaGroup"){
				String[] adityaBirlaGroup = {
									"Infrastructure Development Engineer",
									"Manufacturing Process Specialist",
									"Supply Chain Analyst",
									"Financial Systems Manager",
									"Data Analytics Engineer",
									"Industrial Automation Engineer",
									"Quality Assurance Engineer",
									"Cloud Infrastructure Architect",
									"Cybersecurity Analyst",
									"Automation Testing Engineer",
									"Business Intelligence Developer",
									"Product Innovation Manager",
									"Procurement Executive",
									"Operations Excellence Manager",
									"R&D Materials Scientist",
									"IT Systems Administrator",
									"Environmental Sustainability Manager",
									"Technical Support Engineer",
									"Project Management Officer",
									"Technology Delivery Lead"
									};
				return adityaBirlaGroup;
		}else if(companyName == "tvsMotor"){
				String[] tvsMotor = {
							"Automotive Design Engineer",
							"EV Systems Developer",
							"Embedded Software Engineer",
							"Manufacturing Process Engineer",
							"Vehicle Testing Specialist",
							"Battery Management Engineer",
							"Quality Assurance Engineer",
							"Supply Chain Systems Analyst",
							"Control Systems Engineer",
							"Industrial Automation Specialist",
							"Telematics Integration Engineer",
							"R&D Innovation Engineer",
							"Production Planning Engineer",
							"Cybersecurity Engineer – Automotive",
							"Field Service Engineer",
							"Product Lifecycle Manager",
							"AI Mobility Researcher",
							"Operations Strategy Analyst",
							"Technical Sales Engineer",
							"Project Coordinator"
							};
				return tvsMotor;
		}else if(companyName == "bharatPe"){
				String[] bharatPe = {
								"FinTech Backend Developer",
								"Payment Gateway Engineer",
								"Cloud Infrastructure Specialist",
								"Cybersecurity Analyst",
								"Fraud Detection Engineer",
								"DevOps Engineer",
								"Mobile Wallet Developer",
								"Data Science Specialist",
								"Automation QA Engineer",
								"Risk Compliance Manager",
								"AI Credit Modeling Engineer",
								"API Integration Specialist",
								"Product Strategy Manager",
								"Platform Reliability Engineer",
								"Financial Systems Analyst",
								"Technical Support Executive",
								"Enterprise Architect",
								"Blockchain Payments Engineer",
								"Business Intelligence Developer",
								"Technology Delivery Lead"
								};
				return bharatPe;
		}else if(companyName == "policyBazaar"){
				String[] policyBazaar = {
									"Insurance Platform Developer",
									"Backend API Engineer",
									"Frontend Web Developer",
									"Cloud Infrastructure Engineer",
									"Data Analytics Specialist",
									"DevOps Infrastructure Engineer",
									"Cybersecurity Specialist",
									"Automation Testing Engineer",
									"AI Risk Assessment Engineer",
									"Mobile App Developer",
									"Business Intelligence Manager",
									"Platform Reliability Engineer",
									"API Integration Developer",
									"Customer Experience Manager",
									"Enterprise Architect",
									"Product Innovation Lead",
									"Digital Marketing Analyst",
									"Operations Strategy Manager",
									"Technical Support Engineer",
									"Technology Program Manager"
									};
				return policyBazaar;
		}else if(companyName == "naukri"){
				String[] naukri = {
								"Job Portal Backend Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Architect",
								"Search Algorithm Engineer",
								"Data Science Specialist",
								"DevOps Engineer",
								"Cybersecurity Analyst",
								"Automation QA Engineer",
								"AI Resume Matching Engineer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Customer Success Manager",
								"Enterprise Architect",
								"Product Growth Manager",
								"Digital Marketing Executive",
								"Operations Manager",
								"Technical Support Engineer",
								"Technology Delivery Lead"
								};
				return naukri;
		}else if(companyName == "indeed"){
				String[] indeed = {
							"Recruitment Platform Engineer",
							"Backend Systems Developer",
							"Frontend React Developer",
							"Cloud Infrastructure Engineer",
							"Search Engine Optimization Engineer",
							"Data Analytics Specialist",
							"DevOps Infrastructure Engineer",
							"Cybersecurity Specialist",
							"Automation Testing Engineer",
							"AI Job Recommendation Engineer",
							"Mobile App Developer",
							"Business Intelligence Analyst",
							"Platform Reliability Engineer",
							"API Integration Developer",
							"Customer Success Manager",
							"Enterprise Solutions Architect",
							"Product Strategy Manager",
							"Digital Marketing Analyst",
							"Operations Excellence Manager",
							"Technical Program Manager"
							};
				return indeed;
		}else if(companyName == "stripe"){
				String[] stripe = {
								"Payment Processing Engineer",
								"Backend API Developer",
								"Cloud Infrastructure Architect",
								"Cybersecurity Specialist",
								"Fraud Risk Engineer",
								"DevOps Infrastructure Engineer",
								"Data Science Specialist",
								"Automation QA Engineer",
								"Blockchain Payments Developer",
								"Mobile Payments Engineer",
								"Financial Systems Analyst",
								"Platform Reliability Engineer",
								"API Integration Architect",
								"Product Innovation Manager",
								"Enterprise Solutions Architect",
								"AI Risk Modeling Engineer",
								"Technical Support Engineer",
								"Compliance Technology Analyst",
								"Business Intelligence Developer",
								"Technology Delivery Manager"
								};
				return stripe;
		}else if(companyName == "cloudflare"){
				String[] cloudflare = {
								"Network Security Engineer",
								"Edge Computing Developer",
								"Cloud Infrastructure Architect",
								"Cybersecurity Analyst",
								"DDoS Mitigation Specialist",
								"DevOps Engineer",
								"Backend Systems Developer",
								"Frontend Web Developer",
								"Performance Optimization Engineer",
								"Data Analytics Engineer",
								"Platform Reliability Engineer",
								"API Security Specialist",
								"Product Innovation Manager",
								"Automation Testing Engineer",
								"Enterprise Solutions Architect",
								"AI Traffic Analysis Engineer",
								"Technical Support Engineer",
								"Cloud Networking Specialist",
								"Zero Trust Security Engineer",
								"Technology Program Manager"
								};
				return cloudflare;
		}else if(companyName == "snowflake"){
				String[] snowflake = {
								"Cloud Data Engineer",
								"Data Warehouse Architect",
								"Backend Platform Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Specialist",
								"Cybersecurity Engineer",
								"DevOps Infrastructure Engineer",
								"Automation QA Engineer",
								"AI Data Modeling Engineer",
								"Data Governance Specialist",
								"Platform Reliability Engineer",
								"API Integration Developer",
								"Enterprise Solutions Architect",
								"Product Innovation Manager",
								"Technical Support Engineer",
								"Business Intelligence Analyst",
								"Performance Optimization Engineer",
								"Cloud Security Architect",
								"Analytics Consultant",
								"Technology Delivery Lead"
								};
				return snowflake;
		}else if(companyName == "blueOrigin"){
				String[] blueOrigin = {
									"Aerospace Systems Engineer",
									"Rocket Propulsion Engineer",
									"Avionics Software Developer",
									"Flight Dynamics Engineer",
									"Embedded Systems Engineer",
									"Satellite Communications Engineer",
									"Mechanical Design Engineer",
									"Launch Operations Specialist",
									"Control Systems Engineer",
									"AI Navigation Engineer",
									"Robotics Engineer",
									"Quality Assurance Engineer",
									"Materials Science Engineer",
									"Testing & Validation Engineer",
									"Cybersecurity Specialist",
									"Cloud Infrastructure Engineer",
									"Product Development Engineer",
									"Field Support Engineer",
									"Mission Operations Manager",
									"Spacecraft Integration Engineer"
									};
				return blueOrigin;
		}else if(companyName == "walmartGlobalTech"){
				String[] walmartGlobalTech = {
									"Retail Tech Backend Developer",
									"Frontend UI Engineer",
									"Cloud Infrastructure Architect",
									"Cybersecurity Engineer",
									"Data Science Specialist",
									"DevOps Engineer",
									"Automation QA Engineer",
									"AI Demand Forecast Engineer",
									"Mobile App Developer",
									"Business Intelligence Analyst",
									"Platform Reliability Engineer",
									"API Integration Developer",
									"Enterprise Architect",
									"Product Innovation Manager",
									"Supply Chain Systems Engineer",
									"Technical Support Engineer",
									"Customer Experience Manager",
									"Digital Transformation Lead",
									"Performance Optimization Engineer",
									"Technology Program Manager"
									};
				return walmartGlobalTech;
		}else if(companyName == "flipkartLabs"){
				String[] flipkartLabs = {
								"AI Research Engineer",
								"Backend Platform Developer",
								"Frontend Web Engineer",
								"Cloud Infrastructure Engineer",
								"Cybersecurity Specialist",
								"DevOps Infrastructure Engineer",
								"Automation Testing Engineer",
								"AI Recommendation Engineer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Enterprise Architect",
								"Product Innovation Lead",
								"Data Analytics Specialist",
								"Search Algorithm Engineer",
								"Technical Support Engineer",
								"Operations Strategy Manager",
								"Digital Marketing Analyst",
								"Technology Delivery Manager"
								};
				return flipkartLabs;
		}else if(companyName == "razorpayX"){
				String[] razorpayX = {
									"Banking API Developer",
									"Cloud Infrastructure Engineer",
									"Cybersecurity Specialist",
									"Fraud Detection Analyst",
									"DevOps Engineer",
									"Mobile Payments Developer",
									"Data Science Specialist",
									"Automation QA Engineer",
									"AI Risk Modeling Engineer",
									"Financial Systems Architect",
									"Product Growth Manager",
									"Platform Reliability Engineer",
									"API Security Engineer",
									"Enterprise Solutions Architect",
									"Compliance Technology Analyst",
									"Technical Support Executive",
									"Blockchain Finance Engineer",
									"Business Intelligence Developer",
									"Performance Engineer",
									"Technology Delivery Lead"
									};
				return razorpayX;
		}else if(companyName == "freshdesk"){
				String[] freshdesk = {
								"Customer Support Platform Engineer",
								"Backend Systems Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Architect",
								"Cybersecurity Specialist",
								"DevOps Engineer",
								"Automation Testing Engineer",
								"AI Chatbot Developer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Enterprise Architect",
								"Product Innovation Manager",
								"Customer Success Lead",
								"Technical Support Engineer",
								"Performance Optimization Engineer",
								"Security Compliance Analyst",
								"Data Analytics Engineer",
								"Technology Program Manager"
								};
				return freshdesk;
		}else if(companyName == "dreamSports"){
				String[] dreamSports = {
									"Sports Analytics Engineer",
									"Backend Microservices Developer",
									"Frontend React Developer",
									"Cloud Infrastructure Engineer",
									"Cybersecurity Analyst",
									"DevOps Infrastructure Engineer",
									"Automation QA Engineer",
									"AI Recommendation Specialist",
									"Mobile App Developer",
									"Business Intelligence Analyst",
									"Platform Reliability Engineer",
									"API Integration Developer",
									"Enterprise Architect",
									"Product Strategy Manager",
									"Data Science Specialist",
									"Risk Monitoring Engineer",
									"Technical Support Engineer",
									"Performance Engineer",
									"Digital Marketing Analyst",
									"Technology Delivery Manager"
									};
				return dreamSports;
		}else if(companyName == "swiggyInstamart"){
				String[] swiggyInstamart = {
									"Quick Commerce Backend Engineer",
									"Frontend Web Developer",
									"Cloud Infrastructure Architect",
									"Supply Chain Systems Analyst",
									"Data Science Engineer",
									"DevOps Infrastructure Engineer",
									"Cybersecurity Specialist",
									"Automation Testing Engineer",
									"AI Inventory Forecast Engineer",
									"Mobile App Developer",
									"Business Intelligence Manager",
									"Platform Reliability Engineer",
									"API Integration Specialist",
									"Customer Experience Manager",
									"Enterprise Solutions Architect",
									"Operations Excellence Lead",
									"Digital Marketing Executive",
									"Technical Support Engineer",
									"Performance Optimization Engineer",
									"Technology Program Manager"
									};
				return swiggyInstamart;
		}else if(companyName == "zomatoBlinkit"){
				String[] zomatoBlinkit = {
								"Quick Delivery Platform Engineer",
								"Backend Systems Developer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Engineer",
								"Supply Chain Planner",
								"Data Analytics Specialist",
								"DevOps Engineer",
								"Cybersecurity Analyst",
								"Automation QA Engineer",
								"AI Route Optimization Engineer",
								"Mobile App Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Developer",
								"Customer Success Manager",
								"Enterprise Architect",
								"Product Innovation Lead",
								"Operations Strategy Manager",
								"Technical Support Engineer",
								"Technology Delivery Lead"
								};
				return zomatoBlinkit;
		}else if(companyName == "tataElxsi"){
				String[] tataElxsi = {
							"Embedded Automotive Developer",
							"AI Vision Engineer",
							"Cloud Infrastructure Specialist",
							"Cybersecurity Engineer",
							"DevOps Engineer",
							"Automation Testing Engineer",
							"EV Systems Engineer",
							"Mechanical Design Engineer",
							"Control Systems Specialist",
							"Data Science Analyst",
							"Product Development Engineer",
							"UX Designer",
							"Platform Reliability Engineer",
							"API Integration Developer",
							"Enterprise Architect",
							"R&D Innovation Engineer",
							"Field Support Engineer",
							"Quality Assurance Engineer",
							"Technical Consultant",
							"Technology Delivery Manager"
							};
				return tataElxsi;
		}else if(companyName == "ltts"){
				String[] ltts = {
							"Engineering Design Specialist",
							"Embedded Systems Developer",
							"Cloud Infrastructure Engineer",
							"Cybersecurity Specialist",
							"DevOps Infrastructure Engineer",
							"Automation QA Engineer",
							"Mechanical Design Engineer",
							"Control Systems Engineer",
							"Data Analytics Specialist",
							"Product Lifecycle Manager",
							"AI Industrial Engineer",
							"Platform Reliability Engineer",
							"API Integration Developer",
							"Enterprise Architect",
							"R&D Innovation Lead",
							"Field Service Engineer",
							"Quality Assurance Specialist",
							"Technical Support Engineer",
							"Project Management Officer",
							"Technology Delivery Manager"
							};
				return ltts;
		}else if(companyName == "capillaryTechnologies"){
				String[] capillaryTechnologies = {
									"Loyalty Platform Engineer",
									"CRM Backend Developer",
									"Frontend UI Engineer",
									"Cloud Infrastructure Architect",
									"Data Analytics Specialist",
									"DevOps Infrastructure Engineer",
									"Cybersecurity Analyst",
									"Automation QA Engineer",
									"AI Customer Insights Engineer",
									"Mobile App Developer",
									"Business Intelligence Manager",
									"Platform Reliability Engineer",
									"API Integration Specialist",
									"Enterprise Architect",
									"Product Innovation Lead",
									"Customer Success Manager",
									"Performance Optimization Engineer",
									"Technical Support Engineer",
									"Digital Marketing Analyst",
									"Technology Delivery Manager"
									};
				return capillaryTechnologies;
		}else if(companyName == "zohoDesk"){
				String[] zohoDesk = {
								"Helpdesk Platform Developer",
								"Backend Java Engineer",
								"Frontend React Developer",
								"Cloud SaaS Architect",
								"DevOps Engineer",
								"Cybersecurity Specialist",
								"Automation Testing Engineer",
								"AI Chatbot Engineer",
								"Mobile Support App Developer",
								"Data Analytics Specialist",
								"Platform Reliability Engineer",
								"API Integration Developer",
								"Enterprise Solutions Architect",
								"Customer Experience Manager",
								"Technical Support Engineer",
								"Performance Engineer",
								"UX Designer",
								"Product Strategy Lead",
								"Security Compliance Analyst",
								"Technology Program Manager"
								};
				return zohoDesk;
		}else if(companyName == "zohoCRM"){
				String[] zohoCRM = {
								"CRM Platform Developer",
								"Backend Systems Engineer",
								"Frontend UI Engineer",
								"Cloud Infrastructure Engineer",
								"Data Analytics Specialist",
								"DevOps Engineer",
								"Cybersecurity Analyst",
								"Automation QA Engineer",
								"AI Sales Prediction Engineer",
								"Mobile CRM Developer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Enterprise Architect",
								"Product Innovation Manager",
								"Customer Success Lead",
								"Performance Optimization Engineer",
								"Technical Support Executive",
								"Digital Marketing Strategist",
								"Technology Delivery Manager"
								};
				return zohoCRM;
		}else if(companyName == "zohoCreator"){
				String[] zohoCreator = {
								"Low-Code Platform Engineer",
								"Backend API Developer",
								"Frontend UI Engineer",
								"Cloud SaaS Engineer",
								"DevOps Infrastructure Specialist",
								"Cybersecurity Engineer",
								"Automation Testing Engineer",
								"AI Workflow Automation Engineer",
								"Mobile App Developer",
								"Business Intelligence Specialist",
								"Platform Reliability Engineer",
								"API Security Engineer",
								"Enterprise Architect",
								"Product Strategy Manager",
								"Customer Support Engineer",
								"Performance Optimization Engineer",
								"UX Researcher",
								"Security Compliance Analyst",
								"Technical Consultant",
								"Technology Program Manager"
								};
				return zohoCreator;
		}else if(companyName == "infosysEdge"){
				String[] infosysEdge = {
								"Digital Transformation Engineer",
								"Cloud Native Developer",
								"AI Platform Engineer",
								"Data Science Specialist",
								"DevOps Automation Engineer",
								"Cybersecurity Consultant",
								"Automation Testing Engineer",
								"Frontend UI Developer",
								"Backend Microservices Engineer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Enterprise Architect",
								"Product Innovation Manager",
								"IT Governance Analyst",
								"Performance Engineer",
								"Technical Support Specialist",
								"Digital Strategy Consultant",
								"Security Operations Engineer",
								"Technology Delivery Lead"
								};
				return infosysEdge;
		}else if(companyName == "wiproDigital"){
				String[] wiproDigital = {
							"Digital Experience Engineer",
							"Cloud Infrastructure Architect",
							"AI Solutions Engineer",
							"Data Analytics Consultant",
							"DevOps Engineer",
							"Cybersecurity Specialist",
							"Automation QA Engineer",
							"Frontend React Developer",
							"Backend Systems Developer",
							"UX Designer",
							"Business Intelligence Manager",
							"Platform Reliability Engineer",
							"API Integration Developer",
							"Enterprise Solutions Architect",
							"Product Innovation Lead",
							"Technical Support Engineer",
							"Performance Optimization Specialist",
							"Digital Marketing Consultant",
							"Security Compliance Analyst",
							"Technology Program Manager"
							};
				return wiproDigital;
		}else if(companyName == "tcsDigital"){
				String[] tcsDigital = {
								"Digital Transformation Consultant",
								"Cloud Native Developer",
								"AI & ML Engineer",
								"Data Analytics Specialist",
								"DevOps Engineer",
								"Cybersecurity Analyst",
								"Automation QA Engineer",
								"Frontend UI Developer",
								"Backend Systems Engineer",
								"Business Intelligence Consultant",
								"Platform Reliability Engineer",
								"API Integration Specialist",
								"Enterprise Architect",
								"Product Innovation Manager",
								"IT Compliance Specialist",
								"Performance Optimization Engineer",
								"Technical Support Engineer",
								"Digital Strategy Manager",
								"Security Architect",
								"Technology Delivery Lead"
								};
								return tcsDigital;
		}else if(companyName == "hclDigital"){
				String[] hclDigital = {
								"Digital Platform Engineer",
								"Cloud Solutions Architect",
								"AI Research Engineer",
								"Data Engineering Specialist",
								"DevOps Automation Engineer",
								"Cybersecurity Consultant",
								"Automation Testing Engineer",
								"Frontend UI Developer",
								"Backend API Engineer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"Enterprise Architect",
								"Product Development Manager",
								"IT Governance Specialist",
								"Performance Engineer",
								"Technical Support Executive",
								"Security Operations Engineer",
								"Digital Strategy Lead",
								"UX Researcher",
								"Technology Delivery Manager"
								};
				return hclDigital;
		}else if(companyName == "ibmResearch"){
				String[] ibmResearch = {
								"AI Research Scientist",
								"Quantum Computing Engineer",
								"Blockchain Research Engineer",
								"Cloud Systems Architect",
								"Cybersecurity Researcher",
								"Data Science Specialist",
								"DevOps Infrastructure Engineer",
								"Automation Testing Engineer",
								"Frontend Platform Developer",
								"Backend Systems Engineer",
								"Business Intelligence Analyst",
								"Platform Reliability Engineer",
								"API Security Specialist",
								"Enterprise Architect",
								"Product Innovation Lead",
								"Technical Support Engineer",
								"Performance Optimization Specialist",
								"Security Compliance Analyst",
								"AI Ethics Researcher",
								"Technology Program Manager"
								};
				return ibmResearch;
		}else if(companyName == "googleDeepMind"){
				String[] googleDeepMind = {
									"Artificial Intelligence Researcher",
									"Machine Learning Scientist",
									"Reinforcement Learning Engineer",
									"Neural Network Architect",
									"AI Safety Researcher",
									"Cloud AI Engineer",
									"Data Science Specialist",
									"DevOps Infrastructure Engineer",
									"Automation Testing Engineer",
									"Backend Systems Developer",
									"Frontend Research Platform Developer",
									"Business Intelligence Analyst",
									"Platform Reliability Engineer",
									"API Integration Specialist",
									"Enterprise Architect",
									"Product Innovation Manager",
									"Technical Support Engineer",
									"Performance Optimization Engineer",
									"AI Ethics Specialist",
									"Technology Delivery Lead"
									};
				return googleDeepMind;
		}else if(companyName == "microsoftAzure"){
				String[] microsoftAzure = {
									"Cloud Solutions Architect",
									"Azure DevOps Engineer",
									"Cloud Security Engineer",
									"Data Platform Engineer",
									"AI Cloud Specialist",
									"Backend Systems Developer",
									"Frontend Portal Developer",
									"Automation QA Engineer",
									"Platform Reliability Engineer",
									"Enterprise Architect",
									"API Integration Engineer",
									"Cybersecurity Specialist",
									"Performance Optimization Engineer",
									"Technical Support Engineer",
									"Product Strategy Manager",
									"Cloud Infrastructure Manager",
									"Business Intelligence Analyst",
									"Compliance Technology Analyst",
									"DevSecOps Engineer",
									"Technology Program Manager"
									};
				return microsoftAzure;
		}else if(companyName == "amazonAWS"){
				String[] amazonAWS = {
							"Cloud Infrastructure Architect",
							"AWS Solutions Engineer",
							"DevOps Cloud Engineer",
							"Cloud Security Specialist",
							"Data Engineering Specialist",
							"AI Cloud Engineer",
							"Backend Systems Developer",
							"Frontend Console Developer",
							"Automation Testing Engineer",
							"Platform Reliability Engineer",
							"Enterprise Architect",
							"API Gateway Specialist",
							"Performance Optimization Engineer",
							"Technical Support Engineer",
							"Product Innovation Manager",
							"Cloud Networking Engineer",
							"Business Intelligence Analyst",
							"Compliance Specialist",
							"DevSecOps Engineer",
							"Technology Delivery Lead"
							};
				return amazonAWS;
		}else if(companyName == "metaRealityLabs"){
				String[] metaRealityLabs = {
								"AR/VR Software Engineer",
								"Mixed Reality Developer",
								"3D Graphics Engineer",
								"AI Vision Specialist",
								"Embedded Systems Engineer",
								"Cloud Infrastructure Engineer",
								"Cybersecurity Specialist",
								"Automation QA Engineer",
								"Platform Reliability Engineer",
								"Enterprise Architect",
								"API Integration Engineer",
								"Performance Optimization Engineer",
								"Product Innovation Manager",
								"UX Designer – AR/VR",
								"Mobile XR Developer",
								"Hardware Integration Engineer",
								"AI Research Scientist",
								"Technical Support Engineer",
								"Security Compliance Analyst",
								"Technology Program Manager"
								};
				return metaRealityLabs;
		}else if(companyName == "apple"){
				String[] apple = {
								"iOS Application Developer",
								"macOS Systems Engineer",
								"Embedded Firmware Engineer",
								"AI & ML Engineer",
								"Chip Design Engineer",
								"Cloud Services Architect",
								"Cybersecurity Specialist",
								"Automation QA Engineer",
								"Backend API Developer",
								"Frontend UI Engineer",
								"Platform Reliability Engineer",
								"Enterprise Architect",
								"Product Innovation Manager",
								"UX Designer",
								"Performance Optimization Engineer",
								"Hardware Validation Engineer",
								"Security Engineer",
								"Technical Support Specialist",
								"Data Analytics Engineer",
								"Technology Program Manager"
								};
				return apple;
		}else if(companyName == "oracleCloud"){
				String[] oracleCloud = {
								"Cloud Infrastructure Engineer",
								"Oracle Cloud Architect",
								"DevOps Engineer",
								"Cloud Security Specialist",
								"Data Platform Engineer",
								"AI Cloud Developer",
								"Backend Systems Engineer",
								"Frontend Portal Developer",
								"Automation Testing Engineer",
								"Platform Reliability Engineer",
								"Enterprise Architect",
								"API Integration Specialist",
								"Performance Optimization Engineer",
								"Technical Support Engineer",
								"Product Strategy Manager",
								"Cloud Networking Engineer",
								"Business Intelligence Analyst",
								"Compliance Specialist",
								"DevSecOps Engineer",
								"Technology Delivery Lead"
								};
								return oracleCloud;
		}
				return null;
		};
		
		public static void displayJobNames(String[] companyNames){
			for(String companyName:companyNames){
				System.out.println(companyName);
			}
		};
}