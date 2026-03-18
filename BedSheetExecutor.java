class BedSheetExecutor {
    public static void main(String[] args) {

        BedSheet b1 = new BedSheet();
        b1.display();

        System.out.println("----------------------");

        BedSheet b2 = new BedSheet(101, "SleepWell");
        b2.display();
    }
}