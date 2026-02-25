class PlayStore{

    static String appName;
    static String developerName;
    static double appSizeMB;
    static double rating;
    static int downloads;
    static boolean isFree;
    static double price;
    static String category;
    static int version;

    public static boolean createApp(String name,String developer,double size,double ratings,int downloadCount,boolean free,double prices,
            String categories,int versions){

        boolean isAppCreated = false;
        boolean isnameValid = false;
        boolean isdeveloperValid = false;
        boolean issizeValid = false;
        boolean isratingsValid = false;
        boolean isdownloadValid = false;
        boolean isfreeValid = false;
        boolean ispriceValid = false;
        boolean iscategoryValid = false;
        boolean isversionValid = false;

        if(name != null && name.length() >= 3){
            appName = name;
            isnameValid = true;
        }else{
            System.out.println("App name is not valid");
        }

        if(developer != null && developer.length() >= 3){
            developerName = developer;
            isdeveloperValid = true;
        }else{
            System.out.println("Developer name is not valid");
        }

        if(size > 5 && size < 5000){
            appSizeMB = size;
            issizeValid = true;
        }else{
            System.out.println("App size is not valid");
        }

        if(ratings >= 1.0 && ratings <= 5.0){
            rating = ratings;
            isratingsValid = true;
        }else{
            System.out.println("Rating is not valid");
        }

        if(downloadCount >= 1000 && downloadCount <= 1000000000){
            downloads = downloadCount;
            isdownloadValid = true;
        }else{
            System.out.println("Downloads count is not valid");
        }

        if(free == true || free == false){
            isFree = free;
            isfreeValid = true;
        }

        if(prices >= 0 && prices < 50000){
            price = prices;
            ispriceValid = true;
        }else{
            System.out.println("Price is not valid");
        }

        if(categories != null && categories.length() >= 3){
            category = categories;
            iscategoryValid = true;
        }else{
            System.out.println("Category is not valid");
        }

        if(versions >= 1 && versions <= 50){
            version = versions;
            isversionValid = true;
        }else{
            System.out.println("Version is not valid");
        }

        if(isnameValid && isdeveloperValid && issizeValid && isratingsValid && isdownloadValid && isfreeValid && ispriceValid && iscategoryValid && isversionValid){
            isAppCreated = true;
        }

        return isAppCreated;
    };

    public static void getAppDetails(){

        System.out.println("App Details are :");
        System.out.println("App Name : " + appName);
        System.out.println("Developer : " + developerName);
        System.out.println("App Size (MB) : " + appSizeMB);
        System.out.println("Rating : " + rating);
        System.out.println("Downloads : " + downloads);
        System.out.println("Is Free : " + isFree);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
        System.out.println("Version : " + version);
    };
}