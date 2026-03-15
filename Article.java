class Article {

    int articleId;
    String title;
    String author;
    String category;
    String language;
    int wordCount;
    String publishDate;
    String editor;
    String topic;
    String location;
    String newspaper;
    String source;
    String keywords;
    String description;
    String format;
    String section;
    String reference;
    String status;
    String rating;
    String type;

    public void getArticleDetails(){

        System.out.println("ArticleId: " + articleId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Language: " + language);
        System.out.println("WordCount: " + wordCount);
        System.out.println("PublishDate: " + publishDate);
        System.out.println("Editor: " + editor);
        System.out.println("Topic: " + topic);
        System.out.println("Location: " + location);
        System.out.println("Newspaper: " + newspaper);
        System.out.println("Source: " + source);
        System.out.println("Keywords: " + keywords);
        System.out.println("Description: " + description);
        System.out.println("Format: " + format);
        System.out.println("Section: " + section);
        System.out.println("Reference: " + reference);
        System.out.println("Status: " + status);
        System.out.println("Rating: " + rating);
        System.out.println("Type: " + type);
    }
}