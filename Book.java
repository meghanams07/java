class Book{
	private int bookId;
	private String title;
	private String author;
	
	public void setBookId(int bookId){
		this.bookId = bookId;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public int getBookId(){
		return bookId;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
}