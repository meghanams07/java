class File{
	private int fileId;
	private String fileName;
	private double size;
	
	public void setFileId(int fileId){
		this.fileId = fileId;
	}
	
	public void setFileName(String fileName){
		this.fileName = fileName;
	}
	
	public void setSize(double size){
		this.size = size;
	}
	
	public int getFileId(){
		return fileId;
	}
	
	public String getFileName(){
		return fileName;
	}
	
	public double getSize(){
		return size;
	}
}