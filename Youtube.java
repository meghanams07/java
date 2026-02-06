class Youtube{
	public static void main(String[] youtube){
		String youtubeSongs[] = {"oh my baby girl", "maan kuttiye", "meghamai vandhu pogirai", "Innisai Padivarum", "Ohh Penne", "un perai Sollum bodhu",
		                         "erukanchedi ooram", "padha kolusu", "Thanjaooru", "Azagooril poothavale"};
								 
		String ohMyBabyDoll = youtubeSongs[0];
		String maanKuttiye = youtubeSongs[1];
		String meghamaiVandhu = youtubeSongs[2];
		String innisai = youtubeSongs[3];
		String ohhPenne = youtubeSongs[4];
		String unper= youtubeSongs[5];
		String erukanchedi = youtubeSongs[6];
		String padha = youtubeSongs[7];
		String thanjaooru = youtubeSongs[8];
		String azagooril = youtubeSongs[9];
		int length = youtubeSongs.length;
		
		System.out.println("The total number of youtube songs are:"+ length);
		//System.out.println(ohMyBabyDoll+" "+maanKuttiye+" "+meghamaiVandhu+" "+innisai+" "+ohhPenne+" "+unper+" "+erukanchedi+" "+padha+" "+
		//thanjaooru+" "+azagooril);
		
		for(String youtubeSong : youtubeSongs){
			System.out.println(youtubeSong);
		}
	}
}
		
		