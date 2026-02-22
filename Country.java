class Country{
	public static String[] findStatesByCountry(String countryName){
		if(countryName == "India"){
    String[] india = {
        "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar",
        "Chhattisgarh","Goa","Gujarat","Haryana",
        "Himachal Pradesh","Jharkhand","Karnataka","Kerala",
        "Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
        "Mizoram","Nagaland","Odisha","Punjab",
        "Rajasthan","Sikkim","Tamil Nadu","Telangana",
        "Tripura","Uttar Pradesh","Uttarakhand","West Bengal"
    };
    return india;
}else if(countryName == "Brazil"){
    String[] brazil = {
        "Acre","Alagoas","Amapa","Amazonas","Bahia",
        "Ceara","Distrito Federal","Espirito Santo",
        "Goias","Maranhao","Mato Grosso",
        "Mato Grosso do Sul","Minas Gerais",
        "Para","Paraiba","Parana",
        "Pernambuco","Piaui","Rio de Janeiro",
        "Rio Grande do Norte","Rio Grande do Sul",
        "Rondonia","Roraima","Santa Catarina",
        "Sao Paulo","Sergipe","Tocantins"
    };
    return brazil;
}else if(countryName == "United States"){
    String[] usa = {
        "Alabama","Alaska","Arizona","Arkansas","California",
        "Colorado","Connecticut","Delaware","Florida","Georgia",
        "Hawaii","Idaho","Illinois","Indiana","Iowa",
        "Kansas","Kentucky","Louisiana","Maine","Maryland",
        "Massachusetts","Michigan","Minnesota","Mississippi",
        "Missouri","Montana","Nebraska","Nevada","New Hampshire",
        "New Jersey","New Mexico","New York","North Carolina",
        "North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania",
        "Rhode Island","South Carolina","South Dakota","Tennessee",
        "Texas","Utah","Vermont","Virginia","Washington",
        "West Virginia","Wisconsin","Wyoming"
    };
    return usa;
}else if(countryName == "Canada"){
    String[] canada = {
        "Alberta","British Columbia","Manitoba","New Brunswick",
        "Newfoundland and Labrador","Nova Scotia","Ontario",
        "Prince Edward Island","Quebec","Saskatchewan"
    };
    return canada;
}else if(countryName == "Australia"){
    String[] australia = {
        "New South Wales","Queensland","South Australia",
        "Tasmania","Victoria","Western Australia"
    };
    return australia;
}else if(countryName == "Germany"){
    String[] germany = {
        "Baden-Wurttemberg","Bavaria","Berlin","Brandenburg",
        "Bremen","Hamburg","Hesse","Lower Saxony",
        "Mecklenburg-Vorpommern","North Rhine-Westphalia",
        "Rhineland-Palatinate","Saarland","Saxony",
        "Saxony-Anhalt","Schleswig-Holstein","Thuringia"
    };
    return germany;
}else if(countryName == "France"){
    String[] france = {
        "Auvergne-Rhone-Alpes","Bourgogne-Franche-Comte","Brittany",
        "Centre-Val de Loire","Corsica","Grand Est",
        "Hauts-de-France","Ile-de-France","Normandy",
        "Nouvelle-Aquitaine","Occitanie",
        "Pays de la Loire","Provence-Alpes-Cote d'Azur"
    };
    return france;
}else if(countryName == "South Korea"){
    String[] southKorea = {
        "Seoul","Busan","Incheon",
        "Daegu","Daejeon","Gwangju",
        "Ulsan","Jeju"
    };
    return southKorea;
}else if(countryName == "France"){
    String[] france = {
        "Auvergne-Rhone-Alpes","Bourgogne-Franche-Comte","Brittany",
        "Centre-Val de Loire","Corsica","Grand Est",
        "Hauts-de-France","Ile-de-France","Normandy",
        "Nouvelle-Aquitaine","Occitanie",
        "Pays de la Loire","Provence-Alpes-Cote d'Azur"
    };
    return france;
}else if(countryName == "Italy"){
    String[] italy = {
        "Abruzzo","Basilicata","Calabria","Campania",
        "Emilia-Romagna","Friuli Venezia Giulia","Lazio",
        "Liguria","Lombardy","Marche",
        "Molise","Piedmont","Puglia",
        "Sardinia","Sicily","Tuscany",
        "Umbria","Veneto"
    };
    return italy;
}else if(countryName == "Japan"){
    String[] japan = {
        "Hokkaido","Aomori","Iwate","Miyagi","Akita",
        "Yamagata","Fukushima","Ibaraki","Tochigi",
        "Gunma","Saitama","Chiba","Tokyo",
        "Kanagawa","Niigata","Toyama","Ishikawa",
        "Fukui","Yamanashi","Nagano","Gifu",
        "Shizuoka","Aichi","Mie","Shiga",
        "Kyoto","Osaka","Hyogo","Nara",
        "Wakayama","Tottori","Shimane",
        "Okayama","Hiroshima","Yamaguchi",
        "Tokushima","Kagawa","Ehime",
        "Kochi","Fukuoka","Saga",
        "Nagasaki","Kumamoto","Oita",
        "Miyazaki","Kagoshima","Okinawa"
    };
    return japan;
}else if(countryName == "China"){
    String[] china = {
        "Anhui","Beijing","Chongqing","Fujian","Gansu",
        "Guangdong","Guangxi","Guizhou","Hainan",
        "Hebei","Heilongjiang","Henan","Hubei",
        "Hunan","Inner Mongolia","Jiangsu",
        "Jiangxi","Jilin","Liaoning","Ningxia",
        "Qinghai","Shaanxi","Shandong","Shanghai",
        "Shanxi","Sichuan","Tianjin","Tibet",
        "Xinjiang","Yunnan","Zhejiang"
    };
    return china;
}else if(countryName == "Sierra Leone"){
    String[] sierraLeone = {
        "Western Area","Northern",
        "Eastern","Southern",
        "North West"
    };
    return sierraLeone;
}else if(countryName == "Russia"){
    String[] russia = {
        "Adygea","Altai Republic","Altai Krai","Amur Oblast",
        "Arkhangelsk Oblast","Astrakhan Oblast","Bashkortostan",
        "Belgorod Oblast","Bryansk Oblast","Buryatia",
        "Chechnya","Chelyabinsk Oblast","Chukotka",
        "Chuvashia","Dagestan","Ingushetia",
        "Irkutsk Oblast","Ivanovo Oblast","Kabardino-Balkaria",
        "Kaliningrad Oblast","Kalmykia","Kaluga Oblast",
        "Kamchatka Krai","Karachay-Cherkessia","Karelia",
        "Kemerovo Oblast","Khabarovsk Krai","Khakassia",
        "Khanty-Mansi","Kirov Oblast","Komi",
        "Kostroma Oblast","Krasnodar Krai","Krasnoyarsk Krai",
        "Kurgan Oblast","Kursk Oblast","Leningrad Oblast",
        "Lipetsk Oblast","Magadan Oblast","Mari El",
        "Mordovia","Moscow","Moscow Oblast",
        "Murmansk Oblast","Nenets","Nizhny Novgorod Oblast",
        "North Ossetia","Novgorod Oblast","Novosibirsk Oblast",
        "Omsk Oblast","Orenburg Oblast","Oryol Oblast",
        "Penza Oblast","Perm Krai","Primorsky Krai",
        "Pskov Oblast","Rostov Oblast","Ryazan Oblast",
        "Saint Petersburg","Sakha","Sakhalin Oblast",
        "Samara Oblast","Saratov Oblast","Smolensk Oblast",
        "Stavropol Krai","Sverdlovsk Oblast","Tambov Oblast",
        "Tatarstan","Tomsk Oblast","Tula Oblast",
        "Tver Oblast","Tyumen Oblast","Tuva",
        "Udmurtia","Ulyanovsk Oblast","Vladimir Oblast",
        "Volgograd Oblast","Vologda Oblast","Voronezh Oblast",
        "Yamalo-Nenets","Yaroslavl Oblast"
    };
    return russia;
}else if(countryName == "South Africa"){
    String[] southAfrica = {
        "Eastern Cape","Free State","Gauteng",
        "KwaZulu-Natal","Limpopo","Mpumalanga",
        "Northern Cape","North West","Western Cape"
    };
    return southAfrica;
}else if(countryName == "Argentina"){
    String[] argentina = {
        "Buenos Aires","Catamarca","Chaco","Chubut",
        "Cordoba","Corrientes","Entre Rios","Formosa",
        "Jujuy","La Pampa","La Rioja","Mendoza",
        "Misiones","Neuquen","Rio Negro",
        "Salta","San Juan","San Luis",
        "Santa Cruz","Santa Fe","Santiago del Estero",
        "Tierra del Fuego","Tucuman"
    };
    return argentina;
}else if(countryName == "Indonesia"){
    String[] indonesia = {
        "Aceh","Bali","Banten","Bengkulu",
        "Central Java","Central Kalimantan",
        "Central Sulawesi","East Java","East Kalimantan",
        "East Nusa Tenggara","Gorontalo","Jakarta",
        "Jambi","Lampung","Maluku",
        "North Kalimantan","North Maluku",
        "North Sulawesi","North Sumatra",
        "Papua","Riau","Riau Islands",
        "South Kalimantan","South Sulawesi",
        "South Sumatra","Southeast Sulawesi",
        "West Java","West Kalimantan",
        "West Nusa Tenggara","West Papua",
        "West Sulawesi","West Sumatra",
        "Yogyakarta"
    };
    return indonesia;
}else if(countryName == "Saudi Arabia"){
    String[] saudiArabia = {
        "Riyadh","Makkah","Madinah","Eastern Province",
        "Asir","Tabuk","Qassim","Hail",
        "Northern Borders","Jazan","Najran",
        "Al Bahah","Al Jawf"
    };
    return saudiArabia;
}else if(countryName == "United Kingdom"){
    String[] uk = {
        "England","Scotland","Wales","Northern Ireland"
    };
    return uk;
}else if(countryName == "Spain"){
    String[] spain = {
        "Andalusia","Aragon","Asturias","Balearic Islands",
        "Basque Country","Canary Islands","Cantabria",
        "Castile and Leon","Castile-La Mancha","Catalonia",
        "Extremadura","Galicia","La Rioja",
        "Madrid","Murcia","Navarre","Valencia"
    };
    return spain;
}else if(countryName == "Turkey"){
    String[] turkey = {
        "Adana","Ankara","Antalya","Bursa",
        "Istanbul","Izmir","Konya","Gaziantep",
        "Kayseri","Mersin","Eskisehir",
        "Trabzon","Samsun","Diyarbakir",
        "Van","Erzurum","Malatya"
    };
    return turkey;
}else if(countryName == "Pakistan"){
    String[] pakistan = {
        "Punjab","Sindh","Khyber Pakhtunkhwa",
        "Balochistan","Islamabad Capital Territory",
        "Gilgit-Baltistan","Azad Kashmir"
    };
    return pakistan;
}else if(countryName == "Bangladesh"){
    String[] bangladesh = {
        "Dhaka","Chattogram","Rajshahi",
        "Khulna","Barishal","Sylhet",
        "Rangpur","Mymensingh"
    };
    return bangladesh;
}else if(countryName == "Nigeria"){
    String[] nigeria = {
        "Abia","Adamawa","Akwa Ibom","Anambra",
        "Bauchi","Bayelsa","Benue","Borno",
        "Cross River","Delta","Ebonyi","Edo",
        "Ekiti","Enugu","Gombe","Imo",
        "Jigawa","Kaduna","Kano","Katsina",
        "Kebbi","Kogi","Kwara","Lagos",
        "Nasarawa","Niger","Ogun","Ondo",
        "Osun","Oyo","Plateau","Rivers",
        "Sokoto","Taraba","Yobe","Zamfara",
        "FCT Abuja"
    };
    return nigeria;
}else if(countryName == "Egypt"){
    String[] egypt = {
        "Cairo","Giza","Alexandria","Dakahlia",
        "Red Sea","Beheira","Fayoum","Gharbia",
        "Ismailia","Menofia","Minya","Qalyubia",
        "New Valley","Suez","Aswan","Assiut",
        "Beni Suef","Port Said","Damietta",
        "Sharkia","South Sinai","Kafr El Sheikh",
        "Matrouh","Luxor","Qena","North Sinai",
        "Sohag"
    };
    return egypt;
}else if(countryName == "Philippines"){
    String[] philippines = {
        "Metro Manila","Ilocos Region","Cagayan Valley",
        "Central Luzon","CALABARZON","MIMAROPA",
        "Bicol Region","Western Visayas",
        "Central Visayas","Eastern Visayas",
        "Zamboanga Peninsula","Northern Mindanao",
        "Davao Region","SOCCSKSARGEN",
        "Caraga","BARMM"
    };
    return philippines;
}else if(countryName == "Thailand"){
    String[] thailand = {
        "Bangkok","Chiang Mai","Chiang Rai","Phuket",
        "Krabi","Pattaya","Khon Kaen","Nakhon Ratchasima",
        "Ayutthaya","Surat Thani","Udon Thani",
        "Songkhla","Chonburi","Lampang","Nakhon Si Thammarat"
    };
    return thailand;
}else if(countryName == "Vietnam"){
    String[] vietnam = {
        "Hanoi","Ho Chi Minh City","Da Nang",
        "Hai Phong","Can Tho","An Giang",
        "Binh Duong","Dong Nai","Hue",
        "Khanh Hoa","Lam Dong","Quang Ninh",
        "Thanh Hoa","Vinh Phuc","Nghe An"
    };
    return vietnam;
}else if(countryName == "Malaysia"){
    String[] malaysia = {
        "Johor","Kedah","Kelantan","Malacca",
        "Negeri Sembilan","Pahang","Penang",
        "Perak","Perlis","Sabah",
        "Sarawak","Selangor",
        "Kuala Lumpur","Putrajaya","Labuan"
    };
    return malaysia;
}else if(countryName == "Nepal"){
    String[] nepal = {
        "Koshi","Madhesh","Bagmati",
        "Gandaki","Lumbini",
        "Karnali","Sudurpashchim"
    };
    return nepal;
}else if(countryName == "Sri Lanka"){
    String[] sriLanka = {
        "Western","Central","Southern",
        "Northern","Eastern","North Western",
        "North Central","Uva","Sabaragamuwa"
    };
    return sriLanka;
}else if(countryName == "United Arab Emirates"){
    String[] uae = {
        "Abu Dhabi","Dubai","Sharjah",
        "Ajman","Umm Al-Quwain",
        "Ras Al Khaimah","Fujairah"
    };
    return uae;
}else if(countryName == "Qatar"){
    String[] qatar = {
        "Doha","Al Rayyan","Al Wakrah",
        "Umm Salal","Al Khor","Al Shamal",
        "Al Daayen","Al Shahaniya"
    };
    return qatar;
}else if(countryName == "Kuwait"){
    String[] kuwait = {
        "Al Asimah","Hawalli","Farwaniya",
        "Mubarak Al-Kabeer","Ahmadi","Jahra"
    };
    return kuwait;
}else if(countryName == "Liberia"){
    String[] liberia = {
        "Montserrado","Nimba",
        "Bong","Grand Bassa",
        "Lofa"
    };
    return liberia;
}else if(countryName == "Iran"){
    String[] iran = {
        "Tehran","Isfahan","Fars","Khorasan Razavi",
        "East Azerbaijan","West Azerbaijan","Khuzestan",
        "Mazandaran","Gilan","Qom",
        "Alborz","Kerman","Yazd",
        "Hamadan","Golestan"
    };
    return iran;
}else if(countryName == "Iraq"){
    String[] iraq = {
        "Baghdad","Basra","Nineveh","Erbil",
        "Sulaymaniyah","Kirkuk","Anbar",
        "Dhi Qar","Najaf","Karbala",
        "Diyala","Wasit","Maysan",
        "Babil","Saladin"
    };
    return iraq;
}else if(countryName == "Kazakhstan"){
    String[] kazakhstan = {
        "Almaty","Astana","Shymkent",
        "Akmola","Aktobe","Atyrau",
        "East Kazakhstan","Karaganda",
        "Kostanay","Kyzylorda",
        "Mangystau","Pavlodar",
        "North Kazakhstan","Turkistan",
        "West Kazakhstan"
    };
    return kazakhstan;
}else if(countryName == "Uzbekistan"){
    String[] uzbekistan = {
        "Tashkent","Samarkand","Bukhara",
        "Andijan","Fergana","Namangan",
        "Kashkadarya","Surkhandarya",
        "Khorezm","Jizzakh",
        "Sirdarya","Navoi",
        "Karakalpakstan"
    };
    return uzbekistan;
}else if(countryName == "Kenya"){
    String[] kenya = {
        "Nairobi","Mombasa","Kisumu",
        "Nakuru","Kiambu","Machakos",
        "Kajiado","Uasin Gishu",
        "Meru","Nyeri",
        "Embu","Garissa",
        "Turkana","Kilifi",
        "Bungoma"
    };
    return kenya;
}else if(countryName == "Ethiopia"){
    String[] ethiopia = {
        "Addis Ababa","Oromia","Amhara",
        "Tigray","Somali","Afar",
        "Sidama","Benishangul-Gumuz",
        "Gambela","Harari",
        "Dire Dawa"
    };
    return ethiopia;
}else if(countryName == "Tanzania"){
    String[] tanzania = {
        "Dodoma","Dar es Salaam","Arusha",
        "Mwanza","Mbeya","Morogoro",
        "Tanga","Kilimanjaro",
        "Zanzibar North","Zanzibar South",
        "Singida","Tabora",
        "Ruvuma","Shinyanga",
        "Geita"
    };
    return tanzania;
}else if(countryName == "Morocco"){
    String[] morocco = {
        "Casablanca-Settat","Rabat-Sale-Kenitra",
        "Marrakesh-Safi","Fes-Meknes",
        "Tangier-Tetouan-Al Hoceima",
        "Souss-Massa","Oriental",
        "Beni Mellal-Khenifra",
        "Draa-Tafilalet","Guelmim-Oued Noun",
        "Laayoune-Sakia El Hamra",
        "Dakhla-Oued Ed-Dahab"
    };
    return morocco;
}else if(countryName == "Algeria"){
    String[] algeria = {
        "Algiers","Oran","Constantine",
        "Annaba","Blida","Batna",
        "Setif","Tlemcen",
        "Bejaia","Tizi Ouzou",
        "Biskra","Ouargla",
        "Ghardaia","Adrar",
        "Laghouat"
    };
    return algeria;
}else if(countryName == "Tunisia"){
    String[] tunisia = {
        "Tunis","Sfax","Sousse","Ariana",
        "Kairouan","Bizerte","Gabes",
        "Nabeul","Gafsa","Monastir",
        "Ben Arous","Kasserine",
        "Medenine","Mahdia",
        "Zaghouan"
    };
    return tunisia;
}else if(countryName == "Libya"){
    String[] libya = {
        "Tripoli","Benghazi","Misrata",
        "Sabha","Zawiya","Derna",
        "Sirte","Tobruk",
        "Al Kufrah","Murzuq",
        "Nalut","Gharyan"
    };
    return libya;
}else if(countryName == "Sudan"){
    String[] sudan = {
        "Khartoum","Gezira","Kassala",
        "Red Sea","North Darfur",
        "South Darfur","Blue Nile",
        "White Nile","Sennar",
        "North Kordofan","South Kordofan",
        "River Nile","Northern"
    };
    return sudan;
}else if(countryName == "Sudan"){
    String[] sudan = {
        "Khartoum","Gezira","Kassala",
        "Red Sea","North Darfur",
        "South Darfur","Blue Nile",
        "White Nile","Sennar",
        "North Kordofan","South Kordofan",
        "River Nile","Northern"
    };
    return sudan;
}else if(countryName == "Sierra Leone"){
    String[] sierraLeone = {
        "Western Area","Northern Province",
        "Eastern Province","Southern Province",
        "North West Province"
    };
    return sierraLeone;
}else if(countryName == "Ghana"){
    String[] ghana = {
        "Greater Accra","Ashanti",
        "Western","Eastern",
        "Northern","Central",
        "Volta","Upper East",
        "Upper West","Bono",
        "Ahafo","North East",
        "Savannah","Western North"
    };
    return ghana;
}else if(countryName == "Senegal"){
    String[] senegal = {
        "Dakar","Thiès","Saint-Louis",
        "Kaolack","Ziguinchor",
        "Diourbel","Tambacounda",
        "Kolda","Fatick",
        "Kaffrine","Kedougou",
        "Louga","Matam",
        "Sedhiou"
    };
    return senegal;
}else if(countryName == "Ivory Coast"){
    String[] ivoryCoast = {
        "Abidjan","Yamoussoukro",
        "Bouake","Daloa",
        "San Pedro","Korhogo",
        "Man","Gagnoa",
        "Bondoukou","Odienne",
        "Dimbokro","Soubré"
    };
    return ivoryCoast;
}else if(countryName == "Cameroon"){
    String[] cameroon = {
        "Centre","Littoral","West",
        "North West","South West",
        "Far North","North",
        "East","South","Adamaoua"
    };
    return cameroon;
}else if(countryName == "Uganda"){
    String[] uganda = {
        "Central","Western",
        "Eastern","Northern",
        "Kampala","Gulu",
        "Mbarara","Jinja",
        "Mbale","Lira",
        "Arua","Fort Portal"
    };
    return uganda;
}else if(countryName == "Zimbabwe"){
    String[] zimbabwe = {
        "Harare","Bulawayo",
        "Manicaland","Mashonaland Central",
        "Mashonaland East","Mashonaland West",
        "Masvingo","Matabeleland North",
        "Matabeleland South","Midlands"
    };
    return zimbabwe;
}else if(countryName == "Mauritius"){
    String[] mauritius = {
        "Port Louis","Plaines Wilhems",
        "Pamplemousses","Flacq",
        "Grand Port","Savanne"
    };
    return mauritius;
}else if(countryName == "Angola"){
    String[] angola = {
        "Luanda","Benguela","Huambo",
        "Huila","Cabinda","Cunene",
        "Cuando Cubango","Lunda Norte",
        "Lunda Sul","Malanje",
        "Moxico","Namibe",
        "Uige","Zaire","Bie"
    };
    return angola;
}else if(countryName == "Mozambique"){
    String[] mozambique = {
        "Maputo","Gaza","Inhambane",
        "Sofala","Manica","Tete",
        "Zambezia","Nampula",
        "Cabo Delgado","Niassa"
    };
    return mozambique;
}else if(countryName == "Mozambique"){
    String[] mozambique = {
        "Maputo","Gaza","Inhambane",
        "Sofala","Manica","Tete",
        "Zambezia","Nampula",
        "Cabo Delgado","Niassa"
    };
    return mozambique;
}else if(countryName == "Andorra"){
    String[] andorra = {
        "Andorra la Vella","Canillo",
        "Encamp","Escaldes-Engordany",
        "La Massana","Ordino",
        "Sant Julia de Loria"
    };
    return andorra;
}else if(countryName == "Malawi"){
    String[] malawi = {
        "Central Region","Northern Region",
        "Southern Region","Lilongwe",
        "Blantyre","Mzuzu",
        "Zomba","Kasungu",
        "Mangochi","Salima"
    };
    return malawi;
}else if(countryName == "Madagascar"){
    String[] madagascar = {
        "Antananarivo","Antsiranana",
        "Fianarantsoa","Mahajanga",
        "Toamasina","Toliara"
    };
    return madagascar;
}else if(countryName == "Rwanda"){
    String[] rwanda = {
        "Kigali","Eastern",
        "Western","Northern",
        "Southern"
    };
    return rwanda;
}else if(countryName == "Burundi"){
    String[] burundi = {
        "Bujumbura","Gitega",
        "Ngozi","Muyinga",
        "Ruyigi","Cankuzo",
        "Kayanza","Kirundo",
        "Makamba","Rutana",
        "Mwaro","Muramvya"
    };
    return burundi;
}else if(countryName == "Somalia"){
    String[] somalia = {
        "Banadir","Bari","Bay",
        "Galguduud","Gedo",
        "Hiran","Lower Juba",
        "Middle Juba","Mudug",
        "Nugal","Sanaag",
        "Togdheer"
    };
    return somalia;
}else if(countryName == "Norway"){
    String[] norway = {
        "Oslo","Viken","Innlandet",
        "Vestfold og Telemark","Agder",
        "Rogaland","Vestland",
        "Møre og Romsdal","Trøndelag",
        "Nordland","Troms og Finnmark"
    };
    return norway;
}else if(countryName == "Sweden"){
    String[] sweden = {
        "Stockholm","Skane","Vastra Gotaland",
        "Uppsala","Sodermanland","Ostergotland",
        "Jonkoping","Kronoberg","Kalmar",
        "Gotland","Blekinge","Halland",
        "Varmland","Orebro","Vastmanland",
        "Dalarna","Gavleborg","Vasternorrland",
        "Jamtland","Vasterbotten","Norrbotten"
    };
    return sweden;
}else if(countryName == "Finland"){
    String[] finland = {
        "Uusimaa","Southwest Finland","Satakunta",
        "Kanta-Hame","Pirkanmaa","Paijat-Hame",
        "Kymenlaakso","South Karelia",
        "South Savo","North Savo",
        "North Karelia","Central Finland",
        "South Ostrobothnia","Ostrobothnia",
        "Central Ostrobothnia","North Ostrobothnia",
        "Kainuu","Lapland","Aland"
    };
    return finland;
}else if(countryName == "Denmark"){
    String[] denmark = {
        "Capital Region","Zealand",
        "Southern Denmark",
        "Central Denmark",
        "North Denmark"
    };
    return denmark;
}else if(countryName == "Netherlands"){
    String[] netherlands = {
        "North Holland","South Holland",
        "Utrecht","Gelderland",
        "North Brabant","Overijssel",
        "Limburg","Friesland",
        "Groningen","Drenthe",
        "Flevoland","Zeeland"
    };
    return netherlands;
}else if(countryName == "Belgium"){
    String[] belgium = {
        "Flanders","Wallonia","Brussels",
        "Antwerp","East Flanders",
        "West Flanders","Limburg",
        "Liege","Hainaut","Namur"
    };
    return belgium;
}else if(countryName == "Switzerland"){
    String[] switzerland = {
        "Zurich","Bern","Lucerne",
        "Uri","Schwyz","Obwalden",
        "Nidwalden","Glarus","Zug",
        "Fribourg","Solothurn","Basel-Stadt",
        "Basel-Landschaft","Schaffhausen",
        "Appenzell Ausserrhoden",
        "Appenzell Innerrhoden",
        "St. Gallen","Graubunden",
        "Aargau","Thurgau","Ticino",
        "Vaud","Valais","Neuchatel",
        "Geneva","Jura"
    };
    return switzerland;
}else if(countryName == "Austria"){
    String[] austria = {
        "Vienna","Lower Austria","Upper Austria",
        "Styria","Tyrol","Carinthia",
        "Salzburg","Vorarlberg","Burgenland"
    };
    return austria;
}else if(countryName == "Poland"){
    String[] poland = {
        "Mazowieckie","Malopolskie",
        "Slaskie","Wielkopolskie",
        "Dolnoslaskie","Lodzkie",
        "Pomorskie","Zachodniopomorskie",
        "Kujawsko-Pomorskie",
        "Lubelskie","Podlaskie",
        "Warminsko-Mazurskie",
        "Swietokrzyskie",
        "Lubuskie","Opolskie",
        "Podkarpackie"
    };
    return poland;
}else if(countryName == "Portugal"){
    String[] portugal = {
        "Lisbon","Porto","Braga",
        "Coimbra","Aveiro","Faro",
        "Setubal","Madeira","Azores"
    };
    return portugal;
}else if(countryName == "Greece"){
    String[] greece = {
        "Attica","Central Macedonia","Western Greece",
        "Thessaly","Crete","Peloponnese",
        "Epirus","Eastern Macedonia and Thrace",
        "Central Greece","Western Macedonia",
        "Ionian Islands","North Aegean",
        "South Aegean"
    };
    return greece;
}else if(countryName == "Hungary"){
    String[] hungary = {
        "Budapest","Bacs-Kiskun","Baranya",
        "Bekes","Borsod-Abauj-Zemplen",
        "Csongrad-Csanad","Fejer",
        "Gyor-Moson-Sopron","Hajdu-Bihar",
        "Heves","Jasz-Nagykun-Szolnok",
        "Komarom-Esztergom","Nograd",
        "Pest","Somogy","Szabolcs-Szatmar-Bereg",
        "Tolna","Vas","Veszprem",
        "Zala"
    };
    return hungary;
}else if(countryName == "Czech Republic"){
    String[] czech = {
        "Prague","Central Bohemian",
        "South Bohemian","Plzen",
        "Karlovy Vary","Usti nad Labem",
        "Liberec","Hradec Kralove",
        "Pardubice","Vysocina",
        "South Moravian","Olomouc",
        "Zlin","Moravian-Silesian"
    };
    return czech;
}else if(countryName == "Slovakia"){
    String[] slovakia = {
        "Bratislava","Trnava",
        "Trencin","Nitra",
        "Zilina","Banska Bystrica",
        "Presov","Kosice"
    };
    return slovakia;
}else if(countryName == "Romania"){
    String[] romania = {
        "Bucharest","Cluj","Timis",
        "Iasi","Constanta","Brasov",
        "Prahova","Dolj","Arad",
        "Bihor","Sibiu","Bacau",
        "Mures","Hunedoara","Suceava",
        "Neamt","Buzau","Galati",
        "Vrancea","Arges"
    };
    return romania;
}else if(countryName == "Bulgaria"){
    String[] bulgaria = {
        "Sofia","Plovdiv","Varna",
        "Burgas","Ruse","Stara Zagora",
        "Pleven","Sliven","Dobrich",
        "Shumen","Haskovo","Yambol",
        "Blagoevgrad","Vidin","Montana"
    };
    return bulgaria;
}else if(countryName == "Ukraine"){
    String[] ukraine = {
        "Kyiv","Kharkiv","Lviv",
        "Odessa","Dnipro","Zaporizhzhia",
        "Vinnytsia","Poltava","Chernihiv",
        "Sumy","Zhytomyr","Kherson",
        "Mykolaiv","Rivne","Ternopil",
        "Ivano-Frankivsk","Luhansk",
        "Donetsk","Zakarpattia",
        "Chernivtsi"
    };
    return ukraine;
}else if(countryName == "Belarus"){
    String[] belarus = {
        "Minsk","Brest","Grodno",
        "Gomel","Mogilev","Vitebsk"
    };
    return belarus;
}else if(countryName == "Lithuania"){
    String[] lithuania = {
        "Vilnius","Kaunas","Klaipeda",
        "Siauliai","Panevezys",
        "Alytus","Marijampole",
        "Taurage","Telsiai","Utena"
    };
    return lithuania;
}else if(countryName == "Latvia"){
    String[] latvia = {
        "Riga","Daugavpils",
        "Liepaja","Jelgava",
        "Jurmala","Ventspils",
        "Rezekne","Valmiera",
        "Cesis","Tukums"
    };
    return latvia;
}else if(countryName == "Estonia"){
    String[] estonia = {
        "Harju","Tartu","Ida-Viru",
        "Parnu","Lääne-Viru","Viljandi",
        "Rapla","Saare","Jõgeva",
        "Valga","Võru","Hiiu",
        "Lääne","Põlva"
    };
    return estonia;
}else if(countryName == "Ireland"){
    String[] ireland = {
        "Dublin","Cork","Galway",
        "Limerick","Waterford","Kerry",
        "Mayo","Donegal","Kildare",
        "Meath","Wexford","Clare",
        "Tipperary","Kilkenny","Sligo"
    };
    return ireland;
}else if(countryName == "Iceland"){
    String[] iceland = {
        "Capital Region","Southern Peninsula",
        "West","Westfjords",
        "Northwest","Northeast",
        "East","South"
    };
    return iceland;
}else if(countryName == "Serbia"){
    String[] serbia = {
        "Belgrade","Vojvodina",
        "Sumadija","Raska",
        "South Banat","North Banat",
        "Central Banat","South Backa",
        "North Backa","Zlatibor",
        "Moravica","Nisava",
        "Toplica","Pcinja"
    };
    return serbia;
}else if(countryName == "Croatia"){
    String[] croatia = {
        "Zagreb","Split-Dalmatia",
        "Osijek-Baranja","Istria",
        "Primorje-Gorski Kotar",
        "Zadar","Sibenik-Knin",
        "Dubrovnik-Neretva",
        "Karlovac","Varaždin",
        "Brod-Posavina","Vukovar-Syrmia"
    };
    return croatia;
}else if(countryName == "Slovenia"){
    String[] slovenia = {
        "Ljubljana","Maribor",
        "Celje","Kranj",
        "Koper","Novo Mesto",
        "Velenje","Ptuj",
        "Murska Sobota","Nova Gorica"
    };
    return slovenia;
}else if(countryName == "Bosnia and Herzegovina"){
    String[] bosnia = {
        "Federation of Bosnia and Herzegovina",
        "Republika Srpska",
        "Brcko District"
    };
    return bosnia;
}else if(countryName == "Albania"){
    String[] albania = {
        "Tirana","Durres",
        "Vlore","Shkoder",
        "Fier","Elbasan",
        "Korce","Gjirokaster",
        "Berat","Lezhe",
        "Kukes","Diber"
    };
    return albania;
}else if(countryName == "North Macedonia"){
    String[] macedonia = {
        "Skopje","Bitola",
        "Kumanovo","Tetovo",
        "Ohrid","Prilep",
        "Strumica","Veles"
    };
    return macedonia;
}else if(countryName == "Montenegro"){
    String[] montenegro = {
        "Podgorica","Niksic",
        "Herceg Novi","Budva",
        "Bar","Cetinje",
        "Pljevlja","Bijelo Polje",
        "Kotor","Ulcinj"
    };
    return montenegro;
}else if(countryName == "Georgia"){
    String[] georgia = {
        "Tbilisi","Adjara","Abkhazia",
        "Samegrelo-Zemo Svaneti",
        "Imereti","Kakheti",
        "Kvemo Kartli","Shida Kartli",
        "Mtskheta-Mtianeti",
        "Samtskhe-Javakheti",
        "Guria","Racha-Lechkhumi"
    };
    return georgia;
}else if(countryName == "Armenia"){
    String[] armenia = {
        "Yerevan","Aragatsotn",
        "Ararat","Armavir",
        "Gegharkunik","Kotayk",
        "Lori","Shirak",
        "Syunik","Tavush",
        "Vayots Dzor"
    };
    return armenia;
}else if(countryName == "Azerbaijan"){
    String[] azerbaijan = {
        "Baku","Ganja",
        "Sumqayit","Lankaran",
        "Mingachevir","Nakhchivan",
        "Shaki","Quba",
        "Shirvan","Yevlakh"
    };
    return azerbaijan;
}else if(countryName == "Lebanon"){
    String[] lebanon = {
        "Beirut","Mount Lebanon",
        "North","South",
        "Bekaa","Nabatieh",
        "Akkar","Baalbek-Hermel"
    };
    return lebanon;
}else if(countryName == "Jordan"){
    String[] jordan = {
        "Amman","Irbid",
        "Zarqa","Balqa",
        "Karak","Ma'an",
        "Tafilah","Ajloun",
        "Madaba","Jerash",
        "Mafraq","Aqaba"
    };
    return jordan;
}else if(countryName == "Syria"){
    String[] syria = {
        "Damascus","Aleppo",
        "Homs","Hama",
        "Latakia","Tartus",
        "Idlib","Raqqa",
        "Deir ez-Zor","Hasakah",
        "Daraa","Quneitra"
    };
    return syria;
}else if(countryName == "Yemen"){
    String[] yemen = {
        "Sana'a","Aden",
        "Taiz","Hadramaut",
        "Ibb","Al Hudaydah",
        "Marib","Dhamar",
        "Al Bayda","Saada",
        "Lahij","Shabwah"
    };
    return yemen;
}else if(countryName == "Bahrain"){
    String[] bahrain = {
        "Capital","Muharraq",
        "Northern","Southern"
    };
    return bahrain;
}else if(countryName == "Maldives"){
    String[] maldives = {
        "Malé","Addu",
        "Haa Alif","Haa Dhaalu",
        "Shaviyani","Noonu",
        "Raa","Baa",
        "Lhaviyani","Kaafu",
        "Alif Alif","Alif Dhaalu",
        "Vaavu","Meemu",
        "Faafu","Dhaalu",
        "Thaa","Laamu",
        "Gaafu Alif","Gaafu Dhaalu",
        "Gnaviyani","Seenu"
    };
    return maldives;
}else if(countryName == "Singapore"){
    String[] singapore = {
        "Central Region","North Region",
        "North-East Region","East Region",
        "West Region"
    };
    return singapore;
}else if(countryName == "Cambodia"){
    String[] cambodia = {
        "Phnom Penh","Siem Reap",
        "Battambang","Preah Sihanouk",
        "Kampong Cham","Kampot",
        "Takeo","Kandal",
        "Koh Kong","Pursat",
        "Svay Rieng","Prey Veng"
    };
    return cambodia;
}else if(countryName == "Laos"){
    String[] laos = {
        "Vientiane","Luang Prabang",
        "Savannakhet","Champasak",
        "Xieng Khouang","Bolikhamsai",
        "Khammouane","Bokeo",
        "Attapeu","Houaphanh",
        "Oudomxay","Sekong"
    };
    return laos;
}else if(countryName == "Myanmar"){
    String[] myanmar = {
        "Yangon","Mandalay",
        "Naypyidaw","Bago",
        "Shan","Kachin",
        "Kayah","Kayin",
        "Chin","Mon",
        "Rakhine","Sagaing",
        "Magway","Ayeyarwady"
    };
    return myanmar;
}else if(countryName == "Mongolia"){
    String[] mongolia = {
        "Ulaanbaatar","Arkhangai",
        "Bayan-Ulgii","Bayankhongor",
        "Bulgan","Darkhan-Uul",
        "Dornod","Dornogovi",
        "Dundgovi","Govi-Altai",
        "Khentii","Khovd",
        "Khuvsgul","Orkhon",
        "Selenge","Tov",
        "Umnugovi","Uvs",
        "Zavkhan"
    };
    return mongolia;
}else if(countryName == "North Korea"){
    String[] northKorea = {
        "Pyongyang","North Pyongan",
        "South Pyongan","North Hamgyong",
        "South Hamgyong","Ryanggang",
        "North Hwanghae","South Hwanghae",
        "Kangwon","Chagang"
    };
    return northKorea;
}else if(countryName == "Papua New Guinea"){
    String[] png = {
        "Port Moresby","Central",
        "Eastern Highlands","Western Highlands",
        "Morobe","Madang",
        "East Sepik","West Sepik",
        "New Ireland","East New Britain",
        "West New Britain","Bougainville"
    };
    return png;
}else if(countryName == "Fiji"){
    String[] fiji = {
        "Central","Western",
        "Northern","Eastern",
        "Rotuma"
    };
    return fiji;
}else if(countryName == "Solomon Islands"){
    String[] solomonIslands = {
        "Honiara","Central",
        "Choiseul","Guadalcanal",
        "Isabel","Makira-Ulawa",
        "Malaita","Rennell and Bellona",
        "Temotu","Western"
    };
    return solomonIslands;
}else if(countryName == "New Zealand"){
    String[] newZealand = {
        "Auckland","Wellington",
        "Canterbury","Waikato",
        "Otago","Bay of Plenty",
        "Manawatu-Wanganui",
        "Hawke's Bay","Northland",
        "Taranaki","Nelson",
        "Marlborough","Southland"
    };
    return newZealand;
}else if(countryName == "Chile"){
    String[] chile = {
        "Santiago Metropolitan","Valparaiso",
        "Biobio","Araucania",
        "Antofagasta","Coquimbo",
        "Maule","Los Lagos",
        "Los Rios","Tarapaca",
        "Atacama","Magallanes",
        "Aysen","Arica y Parinacota",
        "O'Higgins","Nuble"
    };
    return chile;
}else if(countryName == "Peru"){
    String[] peru = {
        "Lima","Cusco","Arequipa",
        "La Libertad","Piura",
        "Junin","Ancash",
        "Loreto","Puno",
        "Cajamarca","Ayacucho",
        "Huancavelica","Ica",
        "Madre de Dios","Tacna"
    };
    return peru;
}else if(countryName == "Colombia"){
    String[] colombia = {
        "Bogota","Antioquia",
        "Valle del Cauca","Cundinamarca",
        "Santander","Bolivar",
        "Atlantico","Boyaca",
        "Cordoba","Huila",
        "Meta","Nariño",
        "Tolima","Cesar",
        "Magdalena"
    };
    return colombia;
}else if(countryName == "Venezuela"){
    String[] venezuela = {
        "Caracas","Zulia",
        "Miranda","Carabobo",
        "Lara","Bolivar",
        "Aragua","Anzoategui",
        "Tachira","Merida",
        "Sucre","Monagas",
        "Portuguesa","Guarico",
        "Trujillo"
    };
    return venezuela;
}else if(countryName == "Uruguay"){
    String[] uruguay = {
        "Montevideo","Canelones",
        "Maldonado","Salto",
        "Paysandu","Colonia",
        "Rivera","San Jose",
        "Tacuarembo","Soriano"
    };
    return uruguay;
}else if(countryName == "Paraguay"){
    String[] paraguay = {
        "Asuncion","Central",
        "Alto Parana","Itapua",
        "Caaguazu","San Pedro",
        "Cordillera","Guaira",
        "Caazapa","Amambay",
        "Canindeyu","Misiones",
        "Presidente Hayes"
    };
    return paraguay;
}else if(countryName == "Bolivia"){
    String[] bolivia = {
        "La Paz","Santa Cruz",
        "Cochabamba","Potosi",
        "Oruro","Chuquisaca",
        "Tarija","Beni",
        "Pando"
    };
    return bolivia;
}else if(countryName == "Ecuador"){
    String[] ecuador = {
        "Pichincha","Guayas",
        "Azuay","Manabi",
        "El Oro","Loja",
        "Tungurahua","Imbabura",
        "Chimborazo","Esmeraldas",
        "Santa Elena","Los Rios",
        "Galapagos"
    };
    return ecuador;
}else if(countryName == "Panama"){
    String[] panama = {
        "Panama","Colon",
        "Chiriqui","Cocle",
        "Veraguas","Los Santos",
        "Herrera","Bocas del Toro",
        "Darien","Guna Yala"
    };
    return panama;
}else if(countryName == "Costa Rica"){
    String[] costaRica = {
        "San Jose","Alajuela",
        "Cartago","Heredia",
        "Guanacaste","Puntarenas",
        "Limon"
    };
    return costaRica;
}else if(countryName == "Guatemala"){
    String[] guatemala = {
        "Guatemala","Alta Verapaz","Baja Verapaz",
        "Chimaltenango","Chiquimula","El Progreso",
        "Escuintla","Huehuetenango","Izabal",
        "Jalapa","Jutiapa","Petén",
        "Quetzaltenango","Quiché","Retalhuleu",
        "Sacatepéquez","San Marcos","Santa Rosa",
        "Sololá","Suchitepéquez","Totonicapán",
        "Zacapa"
    };
    return guatemala;
}else if(countryName == "Honduras"){
    String[] honduras = {
        "Francisco Morazán","Cortés",
        "Atlántida","Colón",
        "Comayagua","Copán",
        "Choluteca","El Paraíso",
        "Intibucá","Lempira",
        "Ocotepeque","Olancho",
        "Santa Bárbara","Valle",
        "Yoro"
    };
    return honduras;
}else if(countryName == "El Salvador"){
    String[] elSalvador = {
        "San Salvador","Santa Ana",
        "San Miguel","La Libertad",
        "Sonsonate","Usulután",
        "Ahuachapán","Chalatenango",
        "Cuscatlán","La Paz",
        "La Unión","Morazán",
        "San Vicente","Cabañas"
    };
    return elSalvador;
}else if(countryName == "Nicaragua"){
    String[] nicaragua = {
        "Managua","Leon",
        "Granada","Masaya",
        "Chinandega","Matagalpa",
        "Esteli","Jinotega",
        "Rivas","Carazo",
        "Boaco","Chontales",
        "Nueva Segovia","Rio San Juan"
    };
    return nicaragua;
}else if(countryName == "Dominican Republic"){
    String[] dominicanRepublic = {
        "Santo Domingo","Santiago",
        "La Vega","San Cristobal",
        "Puerto Plata","San Pedro de Macoris",
        "La Romana","Duarte",
        "Monseñor Nouel","Espaillat",
        "Barahona","Peravia",
        "Azua","Valverde"
    };
    return dominicanRepublic;
}else if(countryName == "Cuba"){
    String[] cuba = {
        "Havana","Santiago de Cuba",
        "Camaguey","Holguin",
        "Granma","Villa Clara",
        "Matanzas","Pinar del Rio",
        "Ciego de Avila","Las Tunas",
        "Guantanamo","Artemisa",
        "Mayabeque"
    };
    return cuba;
}else if(countryName == "Haiti"){
    String[] haiti = {
        "Ouest","Artibonite",
        "Nord","Sud",
        "Nord-Est","Nord-Ouest",
        "Sud-Est","Nippes",
        "Centre","Grand'Anse"
    };
    return haiti;
}else if(countryName == "Jamaica"){
    String[] jamaica = {
        "Kingston","St. Andrew",
        "St. Catherine","St. James",
        "Manchester","Clarendon",
        "St. Ann","Trelawny",
        "Westmoreland","St. Mary",
        "St. Elizabeth","Hanover",
        "Portland","St. Thomas"
    };
    return jamaica;
}else if(countryName == "Trinidad and Tobago"){
    String[] trinidad = {
        "Port of Spain","San Fernando",
        "Chaguanas","Arima",
        "Point Fortin","Couva-Tabaquite-Talparo",
        "Diego Martin","Penal-Debe",
        "Princes Town","Sangre Grande",
        "Siparia","Tunapuna-Piarco",
        "Tobago"
    };
    return trinidad;
}else if(countryName == "Barbados"){
    String[] barbados = {
        "Christ Church","Saint Andrew",
        "Saint George","Saint James",
        "Saint John","Saint Joseph",
        "Saint Lucy","Saint Michael",
        "Saint Peter","Saint Philip",
        "Saint Thomas"
    };
    return barbados;
}else if(countryName == "Guyana"){
    String[] guyana = {
        "Demerara-Mahaica","Pomeroon-Supenaam",
        "Essequibo Islands-West Demerara",
        "Demerara-Berbice","Mahaica-Berbice",
        "East Berbice-Corentyne",
        "Cuyuni-Mazaruni",
        "Potaro-Siparuni",
        "Upper Takutu-Upper Essequibo",
        "Upper Demerara-Berbice"
    };
    return guyana;
}else if(countryName == "Belize"){
    String[] belize = {
        "Belize","Cayo",
        "Corozal","Orange Walk",
        "Stann Creek","Toledo"
    };
    return belize;
}else if(countryName == "Guyana"){
    String[] guyana = {
        "Demerara-Mahaica","Pomeroon-Supenaam",
        "Essequibo Islands-West Demerara",
        "Demerara-Berbice","Mahaica-Berbice",
        "East Berbice-Corentyne",
        "Cuyuni-Mazaruni",
        "Potaro-Siparuni",
        "Upper Takutu-Upper Essequibo",
        "Upper Demerara-Berbice"
    };
    return guyana;
}else if(countryName == "Suriname"){
    String[] suriname = {
        "Paramaribo","Wanica",
        "Nickerie","Commewijne",
        "Marowijne","Saramacca",
        "Para","Brokopondo",
        "Coronie","Sipaliwini"
    };
    return suriname;
}else if(countryName == "Malta"){
    String[] malta = {
        "Valletta","Birkirkara",
        "Mosta","Qormi",
        "Sliema","Zabbar",
        "San Gwann","Fgura",
        "Rabat","Victoria"
    };
    return malta;
}else if(countryName == "Cyprus"){
    String[] cyprus = {
        "Nicosia","Limassol",
        "Larnaca","Paphos",
        "Famagusta","Kyrenia"
    };
    return cyprus;
}else if(countryName == "Luxembourg"){
    String[] luxembourg = {
        "Luxembourg","Esch-sur-Alzette",
        "Differdange","Dudelange",
        "Ettelbruck","Diekirch",
        "Wiltz","Remich",
        "Clervaux","Grevenmacher"
    };
    return luxembourg;
}else if(countryName == "Monaco"){
    String[] monaco = {
        "Monte Carlo","La Condamine",
        "Fontvieille","Monaco-Ville"
    };
    return monaco;
}else if(countryName == "Liechtenstein"){
    String[] liechtenstein = {
        "Vaduz","Schaan",
        "Triesen","Balzers",
        "Eschen","Mauren",
        "Ruggell","Gamprin",
        "Schellenberg","Planken"
    };
    return liechtenstein;
}else if(countryName == "Seychelles"){
    String[] seychelles = {
        "Anse Boileau","Anse Royale",
        "Beau Vallon","Bel Air",
        "Cascade","Grand Anse Mahe",
        "La Digue","Mont Fleuri",
        "Takamaka"
    };
    return seychelles;
}else if(countryName == "San Marino"){
    String[] sanMarino = {
        "Acquaviva","Borgo Maggiore",
        "Chiesanuova","Domagnano",
        "Faetano","Fiorentino",
        "Montegiardino","Serravalle",
        "San Marino City"
    };
    return sanMarino;
}else if(countryName == "Vatican City"){
    String[] vatican = {
        "Vatican City"
    };
    return vatican;
}else if(countryName == "Brunei"){
    String[] brunei = {
        "Brunei-Muara","Belait",
        "Tutong","Temburong"
    };
    return brunei;
}else if(countryName == "Timor-Leste"){
    String[] timorLeste = {
        "Dili","Baucau",
        "Bobonaro","Cova Lima",
        "Ermera","Lautem",
        "Liquica","Manatuto",
        "Manufahi","Oecusse",
        "Viqueque"
    };
    return timorLeste;
}else if(countryName == "Bhutan"){
    String[] bhutan = {
        "Thimphu","Paro",
        "Punakha","Wangdue Phodrang",
        "Trongsa","Bumthang",
        "Trashigang","Mongar",
        "Samdrup Jongkhar","Sarpang",
        "Dagana","Tsirang",
        "Haa","Lhuentse",
        "Gasa","Zhemgang"
    };
    return bhutan;
}else if(countryName == "Nepal"){
    String[] nepal = {
        "Province 1","Madhesh",
        "Bagmati","Gandaki",
        "Lumbini","Karnali",
        "Sudurpashchim"
    };
    return nepal;
}else if(countryName == "Sri Lanka"){
    String[] sriLanka = {
        "Western","Central",
        "Southern","Northern",
        "Eastern","North Western",
        "North Central","Uva",
        "Sabaragamuwa"
    };
    return sriLanka;
}else if(countryName == "Afghanistan"){
    String[] afghanistan = {
        "Kabul","Kandahar",
        "Herat","Nangarhar",
        "Balkh","Kunduz",
        "Helmand","Badakhshan",
        "Baghlan","Ghazni",
        "Paktia","Takhar",
        "Kapisa","Zabul",
        "Parwan"
    };
    return afghanistan;
}else if(countryName == "Kazakhstan"){
    String[] kazakhstan = {
        "Astana","Almaty",
        "Shymkent","Akmola",
        "Aktobe","Atyrau",
        "Karaganda","Kostanay",
        "Kyzylorda","Mangystau",
        "Pavlodar","Turkistan",
        "East Kazakhstan","West Kazakhstan"
    };
    return kazakhstan;
}else if(countryName == "Uzbekistan"){
    String[] uzbekistan = {
        "Tashkent","Samarkand",
        "Bukhara","Fergana",
        "Andijan","Namangan",
        "Khorezm","Kashkadarya",
        "Surkhandarya","Navoi",
        "Jizzakh","Sirdarya",
        "Karakalpakstan"
    };
    return uzbekistan;
}else if(countryName == "Turkmenistan"){
    String[] turkmenistan = {
        "Ashgabat","Ahal",
        "Balkan","Dashoguz",
        "Lebap","Mary"
    };
    return turkmenistan;
}else if(countryName == "Kyrgyzstan"){
    String[] kyrgyzstan = {
        "Bishkek","Osh",
        "Batken","Chuy",
        "Jalal-Abad","Naryn",
        "Talas","Issyk-Kul"
    };
    return kyrgyzstan;
}else if(countryName == "Tajikistan"){
    String[] tajikistan = {
        "Dushanbe","Sughd",
        "Khatlon","Gorno-Badakhshan",
        "Districts of Republican Subordination"
    };
    return tajikistan;
}else if(countryName == "Iran"){
    String[] iran = {
        "Tehran","Isfahan",
        "Fars","Khorasan Razavi",
        "East Azerbaijan","West Azerbaijan",
        "Mazandaran","Gilan",
        "Khuzestan","Alborz",
        "Qom","Yazd",
        "Kerman","Kurdistan",
        "Hormozgan"
    };
    return iran;
}else if(countryName == "Iraq"){
    String[] iraq = {
        "Baghdad","Basra",
        "Nineveh","Erbil",
        "Sulaymaniyah","Duhok",
        "Karbala","Najaf",
        "Anbar","Diyala",
        "Kirkuk","Babil",
        "Wasit","Maysan"
    };
    return iraq;
}else if(countryName == "Kuwait"){
    String[] kuwait = {
        "Al Asimah","Hawalli",
        "Farwaniya","Ahmadi",
        "Jahra","Mubarak Al-Kabeer"
    };
    return kuwait;
}else if(countryName == "Oman"){
    String[] oman = {
        "Muscat","Dhofar",
        "Al Batinah North","Al Batinah South",
        "Al Dakhiliyah","Al Sharqiyah North",
        "Al Sharqiyah South","Al Dhahirah",
        "Al Buraimi","Al Wusta"
    };
    return oman;
}else if(countryName == "Qatar"){
    String[] qatar = {
        "Doha","Al Rayyan",
        "Al Wakrah","Al Khor",
        "Al Daayen","Umm Salal",
        "Al Shamal","Al Shahaniya"
    };
    return qatar;
}else if(countryName == "United Arab Emirates"){
    String[] uae = {
        "Abu Dhabi","Dubai",
        "Sharjah","Ajman",
        "Ras Al Khaimah","Fujairah",
        "Umm Al Quwain"
    };
    return uae;
}else if(countryName == "Saudi Arabia"){
    String[] saudiArabia = {
        "Riyadh","Makkah",
        "Madinah","Eastern Province",
        "Asir","Tabuk",
        "Qassim","Hail",
        "Jizan","Najran",
        "Al Bahah","Al Jawf",
        "Northern Borders"
    };
    return saudiArabia;
}else if(countryName == "Israel"){
    String[] israel = {
        "Jerusalem","Tel Aviv",
        "Haifa","Central",
        "Southern","Northern"
    };
    return israel;
}else if(countryName == "Palestine"){
    String[] palestine = {
        "Jerusalem","Gaza",
        "Hebron","Nablus",
        "Ramallah","Bethlehem",
        "Jenin","Jericho",
        "Tulkarm","Qalqilya"
    };
    return palestine;
}else if(countryName == "Tunisia"){
    String[] tunisia = {
        "Tunis","Sfax","Sousse",
        "Kairouan","Bizerte",
        "Gabes","Ariana",
        "Gafsa","Monastir",
        "Nabeul","Beja","Kasserine"
    };
    return tunisia;
}else if(countryName == "Algeria"){
    String[] algeria = {
        "Algiers","Oran","Constantine",
        "Annaba","Blida","Setif",
        "Tlemcen","Batna",
        "Bejaia","Tizi Ouzou",
        "Ouargla","Ghardaia"
    };
    return algeria;
}else if(countryName == "Morocco"){
    String[] morocco = {
        "Rabat","Casablanca",
        "Marrakesh","Fes",
        "Tangier","Agadir",
        "Oujda","Kenitra",
        "Tetouan","Safi",
        "Meknes","El Jadida"
    };
    return morocco;
}else if(countryName == "Libya"){
    String[] libya = {
        "Tripoli","Benghazi",
        "Misrata","Sabha",
        "Sirte","Zawiya",
        "Derna","Tobruk",
        "Gharyan","Zliten"
    };
    return libya;
}else if(countryName == "Sudan"){
    String[] sudan = {
        "Khartoum","Gezira",
        "Red Sea","Kassala",
        "North Darfur","South Darfur",
        "Blue Nile","White Nile",
        "Sennar","River Nile"
    };
    return sudan;
}else if(countryName == "South Sudan"){
    String[] southSudan = {
        "Central Equatoria","Eastern Equatoria",
        "Western Equatoria","Jonglei",
        "Upper Nile","Unity",
        "Lakes","Warrap",
        "Northern Bahr el Ghazal",
        "Western Bahr el Ghazal"
    };
    return southSudan;
}else if(countryName == "Ethiopia"){
    String[] ethiopia = {
        "Addis Ababa","Oromia",
        "Amhara","Tigray",
        "Somali","Afar",
        "Sidama","Benishangul-Gumuz",
        "Gambela","Harari",
        "Southern Nations"
    };
    return ethiopia;
}else if(countryName == "Kenya"){
    String[] kenya = {
        "Nairobi","Mombasa",
        "Kisumu","Nakuru",
        "Kiambu","Machakos",
        "Kajiado","Uasin Gishu",
        "Meru","Nyeri",
        "Kakamega","Kilifi"
    };
    return kenya;
}else if(countryName == "Tanzania"){
    String[] tanzania = {
        "Dar es Salaam","Dodoma",
        "Arusha","Mwanza",
        "Mbeya","Morogoro",
        "Tanga","Kilimanjaro",
        "Pwani","Iringa",
        "Shinyanga","Kagera"
    };
    return tanzania;
}else if(countryName == "Uganda"){
    String[] uganda = {
        "Kampala","Wakiso",
        "Gulu","Mbarara",
        "Jinja","Lira",
        "Mbale","Masaka",
        "Arua","Hoima",
        "Soroti","Fort Portal"
    };
    return uganda;
}else if(countryName == "Rwanda"){
    String[] rwanda = {
        "Kigali","Eastern",
        "Western","Northern",
        "Southern"
    };
    return rwanda;
}else if(countryName == "Burundi"){
    String[] burundi = {
        "Gitega","Bujumbura",
        "Ngozi","Kayanza",
        "Kirundo","Muyinga",
        "Ruyigi","Cankuzo",
        "Rutana","Makamba"
    };
    return burundi;
}else if(countryName == "Somalia"){
    String[] somalia = {
        "Mogadishu","Hargeisa",
        "Puntland","Galmudug",
        "Hirshabelle","Jubaland",
        "South West","Banadir"
    };
    return somalia;
}else if(countryName == "Nigeria"){
    String[] nigeria = {
        "Lagos","Kano",
        "Rivers","Kaduna",
        "Oyo","Katsina",
        "Delta","Anambra",
        "Enugu","Plateau",
        "Edo","Borno",
        "Kwara","Osun"
    };
    return nigeria;
}else if(countryName == "Ghana"){
    String[] ghana = {
        "Greater Accra","Ashanti",
        "Western","Eastern",
        "Northern","Volta",
        "Central","Upper East",
        "Upper West","Bono"
    };
    return ghana;
}else if(countryName == "Ivory Coast"){
    String[] ivoryCoast = {
        "Abidjan","Yamoussoukro",
        "Bouake","San Pedro",
        "Korhogo","Daloa",
        "Man","Gagnoa",
        "Bondoukou","Abengourou"
    };
    return ivoryCoast;
}else if(countryName == "Senegal"){
    String[] senegal = {
        "Dakar","Thiès",
        "Saint-Louis","Kaolack",
        "Ziguinchor","Diourbel",
        "Louga","Tambacounda",
        "Fatick","Kolda"
    };
    return senegal;
}else if(countryName == "Cameroon"){
    String[] cameroon = {
        "Yaounde","Douala",
        "Bamenda","Garoua",
        "Bafoussam","Maroua",
        "Ngaoundere","Ebolowa",
        "Bertoua","Kribi"
    };
    return cameroon;
}else if(countryName == "Madagascar"){
    String[] madagascar = {
        "Antananarivo","Toamasina",
        "Antsirabe","Mahajanga",
        "Fianarantsoa","Toliara"
    };
    return madagascar;
}else if(countryName == "Zambia"){
    String[] zambia = {
        "Lusaka","Copperbelt",
        "Central","Eastern",
        "Luapula","Muchinga",
        "Northern","North-Western",
        "Southern","Western"
    };
    return zambia;
}else if(countryName == "Zimbabwe"){
    String[] zimbabwe = {
        "Harare","Bulawayo",
        "Manicaland","Mashonaland East",
        "Mashonaland West","Masvingo",
        "Matabeleland North","Matabeleland South",
        "Midlands"
    };
    return zimbabwe;
}else if(countryName == "Mozambique"){
    String[] mozambique = {
        "Maputo","Gaza",
        "Inhambane","Sofala",
        "Manica","Tete",
        "Zambezia","Nampula",
        "Cabo Delgado","Niassa"
    };
    return mozambique;
}else if(countryName == "Angola"){
    String[] angola = {
        "Luanda","Benguela",
        "Huambo","Huila",
        "Malanje","Namibe",
        "Cabinda","Uige",
        "Zaire","Cunene"
    };
    return angola;
}else if(countryName == "Democratic Republic of the Congo"){
    String[] drc = {
        "Kinshasa","Kongo Central",
        "North Kivu","South Kivu",
        "Ituri","Katanga",
        "Kasai","Kasai Central",
        "Kasai Oriental","Tshopo"
    };
    return drc;
}else if(countryName == "Republic of the Congo"){
    String[] congo = {
        "Brazzaville","Pointe-Noire",
        "Kouilou","Niari",
        "Bouenza","Plateaux",
        "Cuvette","Likouala",
        "Sangha"
    };
    return congo;
}else if(countryName == "Gabon"){
    String[] gabon = {
        "Libreville","Estuaire",
        "Haut-Ogooue","Moyen-Ogooue",
        "Ngounie","Nyanga",
        "Ogooue-Ivindo","Ogooue-Lolo",
        "Woleu-Ntem"
    };
    return gabon;
}else if(countryName == "Namibia"){
    String[] namibia = {
        "Windhoek","Erongo",
        "Hardap","Karas",
        "Kavango East","Kavango West",
        "Khomas","Kunene",
        "Ohangwena","Omaheke",
        "Omusati","Oshana",
        "Oshikoto","Otjozondjupa",
        "Zambezi"
    };
    return namibia;
}else if(countryName == "Botswana"){
    String[] botswana = {
        "Gaborone","Francistown",
        "Central","Kgatleng",
        "Kweneng","North-East",
        "North-West","South-East",
        "Southern"
    };
    return botswana;
}else if(countryName == "Malawi"){
    String[] malawi = {
        "Lilongwe","Blantyre",
        "Mzuzu","Zomba",
        "Karonga","Mangochi",
        "Salima","Nkhotakota",
        "Dedza","Kasungu"
    };
    return malawi;
}
return null;
}

public static void displayStates(String[] countryNames){
	for(String countryName:countryNames){
		System.out.println(countryName);
	}
};
}