class Library{
	Book books[] = new Book[5];
	int index;
	
	public boolean addBook(Book book){
		
		boolean isAdded = false;
		boolean isIdValid = false;
		boolean isTitleValid = false;
		boolean isAuthorValid = false;
		
		int id = book.getBookId();
		if(id > 0){
			isIdValid = true;
		}
		
		String title = book.getTitle();
		if(title != null && !title.isEmpty()){
			isTitleValid = true;
		}
		
		String author = book.getAuthor();
		if(author != null && !author.isEmpty()){
			isAuthorValid = true;
		}
		
		if(isIdValid && isTitleValid && isAuthorValid){
			if(index < books.length){
				this.books[index++] = book;
				isAdded = true;
			}else{
				System.out.println("Library Full +");
			}
		}
		
		return isAdded;
	}
	
	public void getDetails(){
		for(Book b : books){
			if(b != null){
				System.out.println(b.getBookId()+" "+b.getTitle()+" "+b.getAuthor());
			}
		}
	}
}