class UserManual {

    private int manualId;
    private String title;
    private String author;
    private String version;
    private String language;
    private int pages;
    private String publishedDate;

    public void setManualId(int manualId){
        this.manualId = manualId;
    }

    public int getManualId(){
        return this.manualId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getVersion(){
        return this.version;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return this.language;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public int getPages(){
        return this.pages;
    }

    public void setPublishedDate(String publishedDate){
        this.publishedDate = publishedDate;
    }

    public String getPublishedDate(){
        return this.publishedDate;
    }
}