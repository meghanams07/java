class FileSystem{
	File files[] = new File[5];
	int index;
	
	public boolean addFile(File file){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isNameValid = false;
		boolean isSizeValid = false;
		
		int id = file.getFileId();
		if(id > 0){
			isIdValid = true;
		}
		
		String name = file.getFileName();
		if(name != null && !name.isEmpty()){
			isNameValid = true;
		}
		
		double size = file.getSize();
		if(size > 0){
			isSizeValid = true;
		}
		
		if(isIdValid && isNameValid && isSizeValid){
			if(index < files.length){
				this.files[index++] = file;
				isAdded = true;
			}else{
				System.out.println("FileSystem Full ");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(File f : files){
			if(f != null){
				System.out.println(f.getFileId()+" "+f.getFileName()+" "+f.getSize());
			}
		}
	}
}