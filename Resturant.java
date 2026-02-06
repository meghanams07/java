class Resturant{
	public static void main(String[] res){
		String name  = "Udupi Resturant";
		String owner = "Alice";
		String address = "Majestic";
		String branches[] = {"RajajiNagar", "Jp Nagar", "BTM Layout"};
		String managers[] = {"Bob", "John", "Adithya", "Adarsh"};
		
		System.out.println("The Resturant information is:");
		System.out.println("The Name of the resturant is:"+name);
		System.out.println("Owner of the resturant :"+owner);
		System.out.println("Address of the resturant:"+address);
		for(String branch: branches){
				System.out.println("Branches of the resturantare:"+branch);
		}
		
		for(String manager: managers){
			System.out.println("Managers of the Resturant:"+manager);
		}
	}
}