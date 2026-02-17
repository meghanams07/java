class Contact{
	public static long getContactNumber(String name){
		long phoneNumber = 1234567894L;

		if(name == "amma"){
			phoneNumber = 9353696619L;
			return phoneNumber;
		}else if(name == "appa"){
			phoneNumber = 8147426469L;
			return phoneNumber;
		}else if(name == "abhina"){
			phoneNumber = 7904545135L;
			return phoneNumber;
		}else if(name == "cheta"){
			phoneNumber = 9087281243L;
			return phoneNumber;
		}else if(name == "shriya"){
			phoneNumber = 8904007423L;
			return phoneNumber;
		}else if(name == "angel sister"){
			phoneNumber = 8310653134L;
			return phoneNumber;
		}else if(name == "hemanth"){
			phoneNumber = 8310990063L;
			return phoneNumber;
		}else if(name == "prathima akka"){
			phoneNumber = 7026484248L;
			return phoneNumber;
		}else if(name == "teddy mama"){
			phoneNumber = 81486227122L;
			return phoneNumber;
		}else if(name == "sheethal"){
			phoneNumber = 8088070712L;
			return phoneNumber;
		}else if(name == "Lakshmi"){
			phoneNumber = 8088023977L;
			return phoneNumber;
		}else if(name == "Ravi"){
			phoneNumber = 9876543210L;
			return phoneNumber;
		}else if(name == "Divya"){
			phoneNumber = 9123456780L;
			return phoneNumber;
		}else if(name == "Arun"){
			phoneNumber = 9988776655L;
			return phoneNumber;

		}else{
			System.out.println("Contact Not Found...");
		}

		return phoneNumber;
	};
}
