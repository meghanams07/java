class CombExecutor {
    public static void main(String[] args) {
        Comb c1 = new Comb();
        c1.display();

        Comb c2 = new Comb(2, "Vega");
        c2.display();

        Comb c3 = new Comb(3, "Nova", "Red", 120.5);
        c3.display();
    }
}