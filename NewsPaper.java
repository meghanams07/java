class NewsPaper {
    int paperId, establishedYear, pages, circulation;
    String paperName, language, country, city, publisher, category, website, 
           editor, printingType, colorTheme, frequency, contact, email, 
           price, status, distribution;
    Article article;

    public NewsPaper(int paperId, String paperName, String language, String country, 
                     String city, String publisher, int establishedYear, int pages,
                     int circulation, String category, String website, String editor,
                     String printingType, String colorTheme, String frequency,
                     String contact, String email, String price, String status,
                     String distribution, Article article) {
        this.paperId = paperId;
        this.paperName = paperName;
        this.language = language;
        this.country = country;
        this.city = city;
        this.publisher = publisher;
        this.establishedYear = establishedYear;
        this.pages = pages;
        this.circulation = circulation;
        this.category = category;
        this.website = website;
        this.editor = editor;
        this.printingType = printingType;
        this.colorTheme = colorTheme;
        this.frequency = frequency;
        this.contact = contact;
        this.email = email;
        this.price = price;
        this.status = status;
        this.distribution = distribution;
        this.article = article;
    }

    public void displayDetails() {
        System.out.println("PaperId: " + paperId);
        System.out.println("PaperName: " + paperName);
        System.out.println("Language: " + language);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Publisher: " + publisher);
        System.out.println("EstablishedYear: " + establishedYear);
        System.out.println("Pages: " + pages);
        System.out.println("Circulation: " + circulation);
        System.out.println("Category: " + category);
        System.out.println("Website: " + website);
        System.out.println("Editor: " + editor);
        System.out.println("PrintingType: " + printingType);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Frequency: " + frequency);
        System.out.println("Contact: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
        System.out.println("Distribution: " + distribution);
        System.out.println("\nFeatured Article Details:");
        this.article.displayDetails();
    }
}
