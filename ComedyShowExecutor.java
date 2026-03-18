class ComedyShowExecutor {
    public static void main(String[] args) {

        ComedyShow show1 = new ComedyShow();
        show1.displayDetails();

        ComedyShow show2 = new ComedyShow(2, "Fun Night");
        show2.displayDetails();

        ComedyShow show3 = new ComedyShow(3, "Comedy Blast", "Sunil Grover", "Delhi", 90);
        show3.displayDetails();
    }
}