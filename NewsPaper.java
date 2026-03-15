class NewsPaper {

    int paperId;
    String paperName;
    String language;
    String country;
    String city;
    String publisher;
    int establishedYear;
    int pages;
    int circulation;
    String category;
    String website;
    String editor;
    String printingType;
    String colorTheme;
    String frequency;
    String contact;
    String email;
    String price;
    String status;
    String distribution;

    Article article;

    public void getNewsPaperDetails(){

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

        this.article.getArticleDetails();
    }
}