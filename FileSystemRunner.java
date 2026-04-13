class FileSystemRunner{
	public static void main(String[] args){
		
		FileSystem fs = new FileSystem();

		File f1 = new File();
		f1.setFileId(1); f1.setFileName("File1"); f1.setSize(10);
		fs.addFile(f1);

		File f2 = new File();
		f2.setFileId(2); f2.setFileName("File2"); f2.setSize(20);
		fs.addFile(f2);

		File f3 = new File();
		f3.setFileId(3); f3.setFileName("File3"); f3.setSize(30);
		fs.addFile(f3);

		File f4 = new File();
		f4.setFileId(4); f4.setFileName("File4"); f4.setSize(40);
		fs.addFile(f4);

		File f5 = new File();
		f5.setFileId(5); f5.setFileName("File5"); f5.setSize(50);
		fs.addFile(f5);

		File f6 = new File();
		f6.setFileId(6); f6.setFileName("File6"); f6.setSize(60);
		fs.addFile(f6);

		File f7 = new File();
		f7.setFileId(7); f7.setFileName("File7"); f7.setSize(70);
		fs.addFile(f7);

		File f8 = new File();
		f8.setFileId(8); f8.setFileName("File8"); f8.setSize(80);
		fs.addFile(f8);

		File f9 = new File();
		f9.setFileId(9); f9.setFileName("File9"); f9.setSize(90);
		fs.addFile(f9);

		File f10 = new File();
		f10.setFileId(10); f10.setFileName("File10"); f10.setSize(100);
		fs.addFile(f10);

		File f11 = new File();
		f11.setFileId(11); f11.setFileName("File11"); f11.setSize(110);
		fs.addFile(f11);

		File f12 = new File();
		f12.setFileId(12); f12.setFileName("File12"); f12.setSize(120);
		fs.addFile(f12);

		File f13 = new File();
		f13.setFileId(13); f13.setFileName("File13"); f13.setSize(130);
		fs.addFile(f13);

		File f14 = new File();
		f14.setFileId(14); f14.setFileName("File14"); f14.setSize(140);
		fs.addFile(f14);

		File f15 = new File();
		f15.setFileId(15); f15.setFileName("File15"); f15.setSize(150);
		fs.addFile(f15);

		File f16 = new File();
		f16.setFileId(16); f16.setFileName("File16"); f16.setSize(160);
		fs.addFile(f16);

		File f17 = new File();
		f17.setFileId(17); f17.setFileName("File17"); f17.setSize(170);
		fs.addFile(f17);

		File f18 = new File();
		f18.setFileId(18); f18.setFileName("File18"); f18.setSize(180);
		fs.addFile(f18);

		File f19 = new File();
		f19.setFileId(19); f19.setFileName("File19"); f19.setSize(190);
		fs.addFile(f19);

		fs.getDetails();
	}
}