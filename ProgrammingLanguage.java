class ProgrammingLanguage {
    int languageId;
    String languageName;
    String creator;
    int createdYear;
    String type;
    String paradigm;
    String typing;
    String platform;
    String compiler;
    String extension;
    String category;
    String popularity;
    String company;
    String version;
    String colorTheme;
    String usage;
    String documentation;
    String website;
    String status;
    String field;

    Syntax syntax;


    public ProgrammingLanguage(int languageId, String languageName, String creator, int createdYear,
                              String type, String paradigm, String typing, String platform,
                              String compiler, String extension, String category, String popularity,
                              String company, String version, String colorTheme, String usage,
                              String documentation, String website, String status, String field,
                              Syntax syntax) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.creator = creator;
        this.createdYear = createdYear;
        this.type = type;
        this.paradigm = paradigm;
        this.typing = typing;
        this.platform = platform;
        this.compiler = compiler;
        this.extension = extension;
        this.category = category;
        this.popularity = popularity;
        this.company = company;
        this.version = version;
        this.colorTheme = colorTheme;
        this.usage = usage;
        this.documentation = documentation;
        this.website = website;
        this.status = status;
        this.field = field;
        this.syntax = syntax;
    }

    public void getProgrammingLanguageDetails() {
        System.out.println("LanguageId: " + languageId);
        System.out.println("LanguageName: " + languageName);
        System.out.println("Creator: " + creator);
        System.out.println("CreatedYear: " + createdYear);
        System.out.println("Type: " + type);
        System.out.println("Paradigm: " + paradigm);
        System.out.println("Typing: " + typing);
        System.out.println("Platform: " + platform);
        System.out.println("Compiler: " + compiler);
        System.out.println("Extension: " + extension);
        System.out.println("Category: " + category);
        System.out.println("Popularity: " + popularity);
        System.out.println("Company: " + company);
        System.out.println("Version: " + version);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Usage: " + usage);
        System.out.println("Documentation: " + documentation);
        System.out.println("Website: " + website);
        System.out.println("Status: " + status);
        System.out.println("Field: " + field);
        System.out.println();
        this.syntax.getSyntaxDetails();
        System.out.println("=================================================");
    }
}