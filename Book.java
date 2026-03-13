class Book {

    String title;
    String author;
    int pages;
    double price;
    String publisher;
    String language;
    int edition;
    String genre;
    boolean hardcover;
    boolean ebook;
    double weight;
    boolean bestseller;

    Book(String title){
        this.title = title;
        System.out.println("Title : " + title);
    }

    Book(String title, String author){
        this.author = author;
        System.out.println("Author : " + author);
    }

    Book(String title, String author, int pages){
        this.pages = pages;
        System.out.println("Pages : " + pages);
    }

    Book(String title, String author, int pages, double price){
        this.price = price;
        System.out.println("Price : " + price);
    }

    Book(String title, String author, int pages, double price, String publisher){
        this.publisher = publisher;
        System.out.println("Publisher : " + publisher);
    }

    Book(String title, String author, int pages, double price, String publisher, String language){
        this.language = language;
        System.out.println("Language : " + language);
    }

    Book(String title, String author, int pages, double price, String publisher, String language, int edition){
        this.edition = edition;
        System.out.println("Edition : " + edition);
    }

    Book(String title, String author, int pages, double price, String publisher, String language, int edition, String genre){
        this.genre = genre;
        System.out.println("Genre : " + genre);
    }

    Book(String title, String author, int pages, double price, String publisher, String language, int edition, String genre, boolean hardcover){
        this.hardcover = hardcover;
        System.out.println("Hardcover : " + hardcover);
    }

    Book(String title, String author, int pages, double price, String publisher, String language, int edition, String genre, boolean hardcover, boolean ebook){
        this.ebook = ebook;
        System.out.println("E-book : " + ebook);
    }

    Book(String title, String author, int pages, double price, String publisher, String language, int edition, String genre, boolean hardcover, boolean ebook, double weight){
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Book(String title, String author, int pages, double price, String publisher, String language, int edition, String genre, boolean hardcover, boolean ebook, double weight, boolean bestseller){
        this.bestseller = bestseller;
        System.out.println("Bestseller : " + bestseller);
    }
}