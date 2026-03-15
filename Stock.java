class Stock {

    int stockId;
    String stockName;
    String company;
    String symbol;
    String exchange;
    double price;
    double marketCap;
    String sector;
    String industry;
    int volume;
    double openPrice;
    double closePrice;
    double highPrice;
    double lowPrice;
    String currency;
    String country;
    String listingYear;
    String category;
    String status;
    String description;

    public void getStockDetails(){

        System.out.println("StockId: " + stockId);
        System.out.println("StockName: " + stockName);
        System.out.println("Company: " + company);
        System.out.println("Symbol: " + symbol);
        System.out.println("Exchange: " + exchange);
        System.out.println("Price: " + price);
        System.out.println("MarketCap: " + marketCap);
        System.out.println("Sector: " + sector);
        System.out.println("Industry: " + industry);
        System.out.println("Volume: " + volume);
        System.out.println("OpenPrice: " + openPrice);
        System.out.println("ClosePrice: " + closePrice);
        System.out.println("HighPrice: " + highPrice);
        System.out.println("LowPrice: " + lowPrice);
        System.out.println("Currency: " + currency);
        System.out.println("Country: " + country);
        System.out.println("ListingYear: " + listingYear);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("Description: " + description);
    }
}