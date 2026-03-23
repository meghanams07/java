class Library {
    String libraryName;
    int totalBooks;

    Library(String libraryName, int totalBooks) {
        System.out.println("Library constructor");
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
    }

    public void showLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
    }
}